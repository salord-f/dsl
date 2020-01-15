package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;
import lombok.Getter;

@Getter
public class Sensor extends Brick {

    private final TYPE type = TYPE.SENSOR;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
