package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.NamedElement;
import fr.unice.polytech.si5.dsl.generator.Visitable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public abstract class Brick implements NamedElement, Visitable {

    private String name;
    private int pin;

}
