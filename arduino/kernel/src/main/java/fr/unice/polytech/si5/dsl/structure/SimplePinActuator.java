package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;

public class SimplePinActuator extends Actuator<SimplePinActuator> {

    public int getPin() {
        return super.pins.get(0);
    }

    public SimplePinActuator setPin(int pin) {
        super.pins.add(pin);
        return this;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
