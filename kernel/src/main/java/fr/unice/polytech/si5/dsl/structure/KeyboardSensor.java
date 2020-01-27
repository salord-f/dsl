package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;

public class KeyboardSensor extends Sensor<KeyboardSensor> {
    @Override
    @SuppressWarnings("rawtypes")
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
