package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.structure.Sensor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Condition {

    private OPERATOR operator = OPERATOR.NONE;
    private Sensor sensor;
    private Signal signal;

    public Condition(Sensor sensor, Signal signal) {
        this.sensor = sensor;
        this.signal = signal;
    }

    public Condition(Sensor sensor, Signal signal, OPERATOR operator) {
        this(sensor, signal);
        this.operator = operator;
    }

}
