package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.utils.NamedElement;
import lombok.Getter;


@Getter
public class DigitalSignal extends Signal<DigitalSignal> {
    private DigitalSignalEnum digitalSignalEnum;

    public DigitalSignal(DigitalSignalEnum digitalSignalEnum) {
        this.digitalSignalEnum = digitalSignalEnum;
    }

    @Override
    public String toString() {
        return digitalSignalEnum.toString();
    }
}
