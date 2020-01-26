package arduinoML.modelDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.unice.polytech.si5.dsl.App;
import fr.unice.polytech.si5.dsl.behavior.*;
import fr.unice.polytech.si5.dsl.structure.*;

public class AppDTO {
	
	public fr.unice.polytech.si5.dsl.App buildKernelApp(arduinoML.App app){
		App kernelApp = new fr.unice.polytech.si5.dsl.App();
		kernelApp.setName(app.getName());
		
		addBricks(app, kernelApp);
		
		addStates(app, kernelApp);
		
		State initialState = new State();
		initialState.setName(app.getInitial().getName());
		addActions(app.getInitial(),initialState);
		addTransition(app.getInitial(),initialState);
		
		kernelApp.setInitial(initialState);		
		
		return kernelApp;
	}

	private void addStates(arduinoML.App app, App kernelApp) {
		
		List<State> kernelStates = new ArrayList<>();
		
		for(arduinoML.State state : app.getStates()) {
			State kernelState = new State();
			kernelState.setName(state.getName());
			
			addActions(state, kernelState);

			addTransition(state, kernelState);
			
			kernelStates.add(kernelState);
			
		}
		kernelApp.setStates(kernelStates);
	}

	private void addTransition(arduinoML.State state, State kernelState) {
		
		Transition transition = new Transition();
		
		
		
		State nextState = new State();
		nextState.setName(state.getTransition().getNext().getName());

		addActions(state.getTransition().getNext(), nextState);
	
		//TODO check if this is necessary but unsure
		//if(!state.getName().equals(state.getTransition().getNext())) {
		//	addTransition(state.getTransition().getNext(),nextState);
		//}
		
		addConditions(state, transition);
		
		transition.setNext(nextState);
		
		kernelState.setTransition(transition);
	}

	private void addConditions(arduinoML.State state, Transition transition) {
		
		List<Condition> conditions = new ArrayList<>();
		for(arduinoML.Condition condition : state.getTransition().getConditions()) {
			
			Sensor sensor = new Sensor();
			sensor.setName(condition.getSensor().getName());
			sensor.setPin(condition.getSensor().getPin());
		
			
			OPERATOR operator = addOperator(condition.getOperator());
			arduinoML.Signal signal = condition.getSignal();
			
			if(signal instanceof arduinoML.DigitalSignal) {
				conditions.add(new Condition(sensor,  new DigitalSignal(addSignal((arduinoML.DigitalSignal)signal)) , operator));
				
			}else if (signal instanceof arduinoML.StringSignal) {
				StringSignal stringSignal = new StringSignal();
				stringSignal.setValue(((arduinoML.StringSignal) signal).getValue());
				conditions.add(new Condition(sensor, stringSignal , operator));

			} 
			
		}
		
		transition.setConditions(conditions);
	}

	

	private void addActions(arduinoML.State state, State kernelState) {
		List<Action> kernelActions = new ArrayList<>();
		
		for(arduinoML.Action action : state.getActions()) {
			Action kernelAction = new Action();
			
			arduinoML.Signal signal = action.getValue();
			
			if( signal instanceof arduinoML.DigitalSignal) {
				kernelAction.setValue(new DigitalSignal(addSignal((arduinoML.DigitalSignal)signal)));
			}else if (signal instanceof arduinoML.StringSignal) {
				StringSignal stringSignal = new StringSignal();
				stringSignal.setValue(((arduinoML.StringSignal) signal).getValue());
				kernelAction.setValue(stringSignal);
			}
			
			
			arduinoML.Actuator actuator = action.getActuator();
			
			if(actuator instanceof arduinoML.LCDScreenActuator) {
				LCDScreenActuator screenActuator = new LCDScreenActuator();
				screenActuator.setName(actuator.getName());
				screenActuator.setPins(((arduinoML.LCDScreenActuator) actuator).getPins());
				kernelAction.setActuator(screenActuator);
				
			}
			else {
				SimplePinActuator simplePinActuator = new SimplePinActuator();
				simplePinActuator.setName(actuator.getName());
				simplePinActuator.setPin(actuator.getPin());
				kernelAction.setActuator(simplePinActuator);
			}
			
			kernelActions.add(kernelAction);
			
		}
		kernelState.setActions(kernelActions);
	}
	
	private DigitalSignalEnum addSignal(arduinoML.DigitalSignal signal) {
		switch(signal.getValue()) {
			case HIGH :
				return(DigitalSignalEnum.HIGH);
			case LOW :
				return(DigitalSignalEnum.LOW);
			default : 
				return null;
		}
	}
	
	private OPERATOR addOperator(arduinoML.Operator operator) {
		switch(operator) {
			case AND :
				return(OPERATOR.AND);
			case OR :
				return(OPERATOR.OR);
			case NONE :
				return(OPERATOR.NONE);
			default : 
				return OPERATOR.NONE;
		}
	}

	private void addBricks(arduinoML.App app, App kernelApp) {
		
		List<Brick> kernelBricks = new ArrayList<>();
		for(arduinoML.Brick brick : app.getBricks()) {
			
			if(brick instanceof arduinoML.Actuator) {
				
				if(brick instanceof arduinoML.LCDScreenActuator) {
					LCDScreenActuator screenActuator = new LCDScreenActuator();
					screenActuator.setName(brick.getName());
					screenActuator.setPins(((arduinoML.LCDScreenActuator) brick).getPins());
					kernelBricks.add(screenActuator);
					
				}else {
					SimplePinActuator actuator = new SimplePinActuator();
					actuator.setPin(brick.getPin());
					actuator.setName(brick.getName());
					kernelBricks.add(actuator);
				}

			}
			
			if(brick instanceof arduinoML.Sensor) {
				Sensor sensor = new Sensor();
				sensor.setName(brick.getName());
				sensor.setPin(brick.getPin());
				kernelBricks.add(sensor);
			}
		}
		kernelApp.setBricks(kernelBricks);
		
	}

}
