package fr.unice.polytech.si5.dsl.structure;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class BasicActuator extends Actuator{
    private int pin;
}
