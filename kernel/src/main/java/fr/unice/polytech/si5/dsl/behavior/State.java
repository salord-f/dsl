package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.NamedElement;
import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class State implements NamedElement, Visitable {

    private String name;
    private List<Action> actions = new ArrayList<>();
    private Transition transition;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
