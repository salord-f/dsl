package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;

import java.util.List;

public class LCDScreenActuator extends Actuator<LCDScreenActuator> {

    public LCDScreenActuator setPins(List<Integer> pins) {
        super.pins = pins;
        return this;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
