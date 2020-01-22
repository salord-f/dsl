package borduinoml.dsl

import fr.unice.polytech.si5.dsl.behavior.Action
import fr.unice.polytech.si5.dsl.behavior.State
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

    // transition "sensor", "signal", "state"
    def transition(sensor, signal, state) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        ((BorduinoMLBinding) this.getBinding()).getModel().createTransition(
                currentState,
                new State().setName(state),
                sensor instanceof String ? (Sensor) ((BorduinoMLBinding) this.getBinding()).getVariable(sensor) : (Sensor) sensor,
                SIGNAL.valueOf(signal))
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
