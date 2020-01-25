package fr.unice.polytech.si5.dsl.behavior;

import lombok.Getter;

@Getter
public class StringSignal extends Signal<StringSignal> {
    private String value;

    public StringSignal(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
