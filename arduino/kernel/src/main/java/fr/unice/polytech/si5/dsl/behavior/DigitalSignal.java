package fr.unice.polytech.si5.dsl.behavior;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class DigitalSignal extends Signal<DigitalSignal> {

    private DigitalSignalEnum digitalSignalEnum;

    @Override
    public String toString() {
        return digitalSignalEnum.toString();
    }
}
