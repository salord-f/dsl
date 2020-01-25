package fr.unice.polytech.si5.dsl.structure;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class LcdScreenActuator extends Actuator{
    private List<Integer> pins;

}
