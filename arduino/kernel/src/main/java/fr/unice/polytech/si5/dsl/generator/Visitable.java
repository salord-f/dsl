package fr.unice.polytech.si5.dsl.generator;

public interface Visitable {

    @SuppressWarnings("rawtypes")
    void accept(Visitor visitor);
}
