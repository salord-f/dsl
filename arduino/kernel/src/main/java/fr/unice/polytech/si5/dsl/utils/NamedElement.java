package fr.unice.polytech.si5.dsl.utils;

import lombok.Getter;

@Getter
public abstract class NamedElement<T> {

    protected String name;

    @SuppressWarnings("unchecked")
    public T setName(String name) {
        this.name = name;
        return (T) this;
    }
}
