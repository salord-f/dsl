package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import fr.unice.polytech.si5.dsl.structure.Actuator;
import fr.unice.polytech.si5.dsl.structure.SIGNAL;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Action implements Visitable {

    private SIGNAL value;
    private Actuator actuator;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
