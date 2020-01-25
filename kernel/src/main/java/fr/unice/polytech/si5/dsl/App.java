package fr.unice.polytech.si5.dsl;

import fr.unice.polytech.si5.dsl.behavior.State;
import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import fr.unice.polytech.si5.dsl.structure.Brick;
import fr.unice.polytech.si5.dsl.utils.NamedElement;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class App extends NamedElement<App> implements Visitable {

    private List<Brick> bricks = new ArrayList<>();
    private List<State> states = new ArrayList<>();
    private State initial;

    @Override
    public App setName(String name) {
        super.name = name;
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
