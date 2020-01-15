package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import fr.unice.polytech.si5.dsl.structure.SIGNAL;
import fr.unice.polytech.si5.dsl.structure.Sensor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Transition implements Visitable {

    private State next;
    private Sensor sensor;
    private SIGNAL value;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
