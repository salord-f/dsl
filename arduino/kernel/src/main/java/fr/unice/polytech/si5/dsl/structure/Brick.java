package fr.unice.polytech.si5.dsl.structure;

import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.utils.NamedElement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Brick<T> extends NamedElement<T> implements Visitable {

    protected List<Integer> pins = new ArrayList<>();

}
