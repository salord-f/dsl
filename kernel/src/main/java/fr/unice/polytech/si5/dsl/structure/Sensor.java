package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Sensor extends Brick<Sensor> {

    private int pin;

    @Override
    @SuppressWarnings("rawtypes")
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
