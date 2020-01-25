package borduinoml.dsl

import fr.unice.polytech.si5.dsl.behavior.*
import fr.unice.polytech.si5.dsl.structure.Actuator
import fr.unice.polytech.si5.dsl.structure.SIGNAL
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

    def actuator(String name, int number, int number2,int number3,int number4,int number5,int number6, int number7) {
        if (this.defining == DEFINING.BRICKS) {
            ((BorduinoMLBinding) this.getBinding()).getModel().createActuator(name, number, number2, number3, number4, number5,number6, number7)
        }
    }

    // initial "state"
    def initial(state) {
        ((BorduinoMLBinding) this.getBinding()).getModel().setInitialState(state instanceof String ? (State) ((BorduinoMLBinding) this.getBinding()).getVariable(state) : (State) state)
    }

    // sensor "name", number
    def sensor(String name, int number) {
        if (this.defining == DEFINING.BRICKS) {
            ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, number)
        }
        //[pin  : { n -> ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, n) },
        // onPin: { n -> ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, n) }]
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
        Action action = new Action()
                .setActuator(actuator instanceof String ? (Actuator) ((BorduinoMLBinding) this.getBinding()).getVariable(actuator) : (Actuator) actuator)
                .setValue(SIGNAL.valueOf(signal))
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
        Transition transition = new Transition()
                .setNext(new State().setName(conditions[conditions.length - 1]))
                .setSensor((Sensor) binding.getVariable(conditions[0]))
                .setSignal(SIGNAL.valueOf(conditions[1]))
        for (int i = 2; i < conditions.length - 2; i += 2) {
            transition.getReactions().put(
                    new Reaction()
                            .setSensor((Sensor) binding.getVariable(conditions[i + 1]))
                            .setSignal(SIGNAL.valueOf(conditions[i + 2])),
                    Operator.valueOf(conditions[i])
            )
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
