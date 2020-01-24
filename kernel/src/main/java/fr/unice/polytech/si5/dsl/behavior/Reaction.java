package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.structure.SIGNAL;
import fr.unice.polytech.si5.dsl.structure.Sensor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Reaction {

    private Sensor sensor;
    private SIGNAL signal;

}
