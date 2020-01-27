package fr.unice.polytech.si5.dsl.behavior;

import fr.unice.polytech.si5.dsl.generator.Visitable;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import fr.unice.polytech.si5.dsl.structure.Sensor;
import fr.unice.polytech.si5.dsl.structure.SimplePinSensor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Transition implements Visitable {

    private boolean sensorType;
    private State next;
    private List<Condition> conditions = new ArrayList<>();

    @Override
    @SuppressWarnings("rawtypes")
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Transition addCondition(Sensor sensor, Signal signal, OPERATOR operator) {
        this.conditions.add(new Condition(sensor, signal, operator));
        return this;
    }

    public Transition addCondition(Sensor sensor, Signal signal) {
        sensorType = sensor instanceof SimplePinSensor;
        return addCondition(sensor, signal, OPERATOR.NONE);
    }

    public boolean getSensorType(){
        return sensorType;
    }
}
