package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;
import lombok.Getter;

@Getter
public class Actuator extends Brick {

    private final TYPE type = TYPE.ACTUATOR;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
