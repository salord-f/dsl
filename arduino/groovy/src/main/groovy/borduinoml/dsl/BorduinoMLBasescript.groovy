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

    // actuator "name" type "type" pin number
    def actuator(String name) {
        if (this.defining == DEFINING.BRICKS) {
            [type: { String type ->
                [pins: { Integer[] numbers -> ((BorduinoMLBinding) this.getBinding()).getModel().createActuator(name, ACTUATOR_TYPES.valueOf(type.toUpperCase()), numbers) },
                 pin : { Integer number -> ((BorduinoMLBinding) this.getBinding()).getModel().createActuator(name, ACTUATOR_TYPES.valueOf(type.toUpperCase()), number) },
                 ""  : { ((BorduinoMLBinding) this.getBinding()).getModel().createActuator(name, ACTUATOR_TYPES.valueOf(type.toUpperCase())) }]
            }]
        }
    }

    // initial "state"
    def initial(state) {
        ((BorduinoMLBinding) this.getBinding()).getModel().setInitialState((State) ((BorduinoMLBinding) this.getBinding()).getVariable(state))
    }

    // sensor "name" type "type" pin int
    def sensor(String name) {
        if (this.defining == DEFINING.BRICKS) {
            [type: { String type ->
                SENSOR_TYPES sensorType = SENSOR_TYPES.valueOf(type.toUpperCase())
                if (sensorType.hasPins) {
                    [pin: { int number -> ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, sensorType, number) }]
                } else {
                    ((BorduinoMLBinding) this.getBinding()).getModel().createSensor(name, sensorType)
                }
            }]
        }
    }

    // states
    def states() {
        this.defining = DEFINING.STATES
    }

    // state "name"
    def state(String name) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        List<Action> actions = new ArrayList<Action>()
        currentState = ((BorduinoMLBinding) this.getBinding()).getModel().createState(name, actions)
    }

    // action "actuator" to "signal"
    def action(String actuator) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        State state = currentState
        [to: { String signal ->
            try {
                DigitalSignal digitalSignal = new DigitalSignal(DigitalSignalEnum.valueOf(signal))
                state.actions.add(((BorduinoMLBinding) this.getBinding())
                        .getModel()
                        .createAction((Actuator) ((BorduinoMLBinding) this.getBinding()).getVariable(actuator), digitalSignal))
            } catch (IllegalArgumentException e) {
                // ignore exception, it's expected
                StringSignal stringSignal = new StringSignal().setValue(signal)
                state.actions.add(((BorduinoMLBinding) this.getBinding())
                        .getModel()
                        .createAction((Actuator) ((BorduinoMLBinding) this.getBinding()).getVariable(actuator), stringSignal));
            }
        }]
    }

    // transition "state" when "sensor" becomes "signal" [and|or "sensor" becomes "signal"]*
    def transition(String state) {
        if (this.defining != DEFINING.STATES) {
            return;
        }
        Transition transition = new Transition().setNext(new State().setName(state))
        ((BorduinoMLBinding) this.getBinding()).getModel().createTransition(this.currentState, transition)
        def closure
        closure = { String sensor, OPERATOR operator = OPERATOR.NONE ->
            [becomes: { String action ->
                Signal signal
                try {
                    signal = new DigitalSignal(DigitalSignalEnum.valueOf(action))
                }
                catch (IllegalArgumentException e) {
                    signal = new StringSignal().setValue(action)
                }
                transition.addCondition((Sensor) binding.getVariable(sensor), signal, operator)
                [and: { String sens -> closure(sens, OPERATOR.AND) },
                 or : { String sens -> closure(sens, OPERATOR.OR) }]
            }]
        }
        [when: closure]
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
