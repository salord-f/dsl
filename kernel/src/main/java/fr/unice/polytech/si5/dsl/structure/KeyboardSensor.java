package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;

import java.util.List;

public class KeyboardSensor extends Sensor<KeyboardSensor> {

    public KeyboardSensor setPins(List<Integer> pins) {
        super.pins = pins;
        return this;
    }
    @Override
    @SuppressWarnings("rawtypes")
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
