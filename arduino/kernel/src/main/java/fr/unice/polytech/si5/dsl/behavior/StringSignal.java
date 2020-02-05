package fr.unice.polytech.si5.dsl.behavior;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class StringSignal extends Signal<StringSignal> {
    private String value;

    @Override
    public String toString() {
        return value;
    }
}
