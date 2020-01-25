package borduinoml.dsl;

import fr.unice.polytech.si5.dsl.App;
import fr.unice.polytech.si5.dsl.behavior.*;
import fr.unice.polytech.si5.dsl.generator.Generator;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import fr.unice.polytech.si5.dsl.structure.*;
import groovy.lang.Binding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BorduinoMLModel {
    private List<Brick> bricks;
    private List<State> states;
    private State initialState;
    private String name;

    private Binding binding;

    public BorduinoMLModel(Binding binding) {
        this.bricks = new ArrayList<>();
        this.states = new ArrayList<>();
        this.binding = binding;
    }

    public void setAppName(String name) {
        this.name = name;
    }

    public void createSensor(String name, Integer pinNumber) {
        Sensor sensor = new Sensor()
                .setPin(pinNumber)
                .setName(name);
        this.bricks.add(sensor);
        this.binding.setVariable(name, sensor);
    }

    public void createActuator(String name, Integer pinNumber) {
        SimplePinActuator actuator = new SimplePinActuator()
                .setPin(pinNumber)
                .setName(name);
        this.bricks.add(actuator);
        this.binding.setVariable(name, actuator);
    }

    public void createActuator(String name, Integer... pins) {
        LCDScreenActuator actuator = new LCDScreenActuator()
                .setPins(Arrays.asList(pins))
                .setName(name);
        this.bricks.add(actuator);
        this.binding.setVariable(name, actuator);
    }

    public State createState(String name, List<Action> actions) {
        State state = new State();
        state.setName(name).setActions(actions);
        this.states.add(state);
        this.binding.setVariable(name, state);
        return state;
    }

    public Action createAtion(Actuator actuator, DigitalSignalEnum digitalSignalEnum) {
        return new Action().setActuator(actuator).setValue( new DigitalSignal(digitalSignalEnum));
    }

    public Action createAtion(Actuator actuator, String stringSignal) {
        return new Action().setActuator(actuator).setValue( new StringSignal(stringSignal));
    }


    public void createTransition(State from, Transition transition) {
        from.setTransition(transition);
    }

    public void setInitialState(State state) {
        this.initialState = state;
    }

    @SuppressWarnings("rawtypes")
    public Object generateCode() {
        App app = new App()
                .setName(this.name)
                .setBricks(this.bricks)
                .setStates(this.states)
                .setInitial(this.initialState);

        Visitor codeGenerator = new Generator();
        app.accept(codeGenerator);
        return codeGenerator.getResult();
    }
}
