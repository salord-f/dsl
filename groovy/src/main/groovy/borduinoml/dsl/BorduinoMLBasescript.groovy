package borduinoml.dsl

import fr.unice.polytech.si5.dsl.behavior.*
import fr.unice.polytech.si5.dsl.structure.Actuator
import fr.unice.polytech.si5.dsl.structure.Sensor

abstract class BorduinoMLBasescript extends Script {

    private DEFINING defining = DEFINING.NONE
    private State currentState

    // app "name", { }
    def app(String name, Closure<?> closure) {
        ((BorduinoMLBinding) this.getBinding()).getModel().setAppName(name)
        closure.call()
        // prints the result after the app closure
        println(((BorduinoMLBinding) this.getBinding()).getModel().generateCode().toString())
    }

    // bricks
    def bricks() {
        this.defining = DEFINING.BRICKS
    }

    // actuator "name", number
    def actuator(String name, int number) {
        if (this.defining == DEFINING.BRICKS) {
            ((BorduinoMLBinding) this.getBinding()).getModel().createActuator(name, number)
        }
    }

    def actuator(String name, Integer... pins) {
        if (this.defining == DEFINING.BRICKS) {
            assert pins.length == 7
            ((BorduinoMLBinding) this.getBinding()).getModel().createActuator(name, pins)
        }
    }

    // initial "state"
    def initial(state) {
        ((BorduinoMLBinding) this.getBinding()).getModel().setInitialState((State) ((BorduinoMLBinding) this.getBinding()).getVariable(state))
    }

    // sensor "name", number
    def sensor(String name, int number) {
        if (this.defining == DEFINING.BRICKS) {
            ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, number)
        }
        //[pin  : { n -> ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, n) },
        // onPin: { n -> ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, n) }]
    }

    def sensor(String name, Integer... pins) {
        if (this.defining == DEFINING.BRICKS) {
            assert pins.length == 0
            ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name)
        }
    }

    // states
    def states() {
        this.defining = DEFINING.STATES
    }

    // state "name", {}
    def state(String name, Closure closure) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        List<Action> actions = new ArrayList<Action>()
        currentState = ((BorduinoMLBinding) this.getBinding()).getModel().createState(name, actions)

        closure.call()
    }

    // action "actuator", "signal"
    def action(actuator, signal) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        Action action
        try {
            DigitalSignal digitalSignal = new DigitalSignal(DigitalSignalEnum.valueOf(signal))
            action = ((BorduinoMLBinding) this.getBinding())
                    .getModel()
                    .createAction((Actuator) ((BorduinoMLBinding) this.getBinding()).getVariable(actuator), digitalSignal)
        } catch (IllegalArgumentException e) {
            // ignore exception, it's expected
            StringSignal stringSignal = new StringSignal().setValue(signal)
            action = ((BorduinoMLBinding) this.getBinding())
                    .getModel()
                    .createAction((Actuator) ((BorduinoMLBinding) this.getBinding()).getVariable(actuator), stringSignal);
        }
        this.currentState.actions.add(action)
    }

    /*def action(actuator, String signal) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        Action action = new Action()
                .setActuator(actuator instanceof String ? (Actuator) ((BorduinoMLBinding) this.getBinding()).getVariable(actuator) : (Actuator) actuator)
                .setValue(signal)
        this.currentState.actions.add(action)
    }*/

    // transition "sensor", "signal", "state"
    def transition(String... conditions) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        Transition transition;
        try{
            DigitalSignal digitalSignal = new DigitalSignal(DigitalSignalEnum.valueOf(conditions[1]))
            transition = new Transition()
                    .setNext(new State().setName(conditions[conditions.length - 1]))
                    .addCondition((Sensor) binding.getVariable(conditions[0]), digitalSignal)
        }
        catch (IllegalArgumentException e){
            StringSignal stringSignal = new StringSignal().setValue(conditions[1])
            transition = new Transition()
                    .setNext(new State().setName(conditions[conditions.length - 1]))
                    .addCondition((Sensor) binding.getVariable(conditions[0]), stringSignal)
        }

        for (int i = 2; i < conditions.length - 2; i += 2) {
            try{
                DigitalSignal digitalSignal = new DigitalSignal(DigitalSignalEnum.valueOf(conditions[i + 2]))
                transition.addCondition((Sensor) binding.getVariable(conditions[i + 1]), digitalSignal, OPERATOR.valueOf(conditions[i]))
            }
            catch (IllegalArgumentException e){
                StringSignal stringSignal = new StringSignal().setValue(conditions[i + 2])
                transition.addCondition((Sensor) binding.getVariable(conditions[i + 1]), stringSignal, OPERATOR.valueOf(conditions[i]))
            }
        }
        ((BorduinoMLBinding) this.getBinding()).getModel().createTransition(this.currentState, transition)
    }

    // disable run method while running
    int count = 0

    abstract void scriptBody()

    def run() {
        if (count == 0) {
            count++
            scriptBody()
        } else {
            println "Run method is disabled"
        }
    }
}
