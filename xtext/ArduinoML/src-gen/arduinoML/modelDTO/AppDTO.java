package arduinoML.modelDTO;
import java.util.ArrayList;
import java.util.List;

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
		
		Sensor transitionSensor = new Sensor();
		transitionSensor.setName(state.getTransition().getSensor().getName());
		transitionSensor.setPin(state.getTransition().getSensor().getPin());
		
		transition.setValue(addSignal(state.getTransition().getValue()));
		transition.setNext(nextState);
		transition.setSensor(transitionSensor);
		
		kernelState.setTransition(transition);
	}

	private void addActions(arduinoML.State state, State kernelState) {
		List<Action> kernelActions = new ArrayList<>();
		
		for(arduinoML.Action action : state.getActions()) {
			Action kernelAction = new Action();
			
			kernelAction.setValue(addSignal(action.getValue()));
			
			Actuator actuator = new Actuator();
			actuator.setName(action.getActuator().getName());
			actuator.setPin(action.getActuator().getPin());
			kernelAction.setActuator(actuator);
			
			kernelActions.add(kernelAction);
			
		}
		kernelState.setActions(kernelActions);
	}
	
	private SIGNAL addSignal(arduinoML.Signal signal) {
		switch(signal) {
			case HIGH :
				return(SIGNAL.HIGH);
			case LOW :
				return(SIGNAL.LOW);
			default : 
				return null;
		}
	}

	private void addBricks(arduinoML.App app, App kernelApp) {
		
		List<Brick> kernelBricks = new ArrayList<>();
		for(arduinoML.Brick brick : app.getBricks()) {
			
			if(brick instanceof arduinoML.Actuator) {
				Actuator actuator = new Actuator();
				actuator.setName(brick.getName());
				actuator.setPin(brick.getPin());
				kernelBricks.add(actuator);
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
