package fr.unice.polytech.si5.dsl.generator;

import fr.unice.polytech.si5.dsl.App;
import fr.unice.polytech.si5.dsl.behavior.Action;
import fr.unice.polytech.si5.dsl.behavior.State;
import fr.unice.polytech.si5.dsl.behavior.Transition;
import fr.unice.polytech.si5.dsl.structure.Actuator;
import fr.unice.polytech.si5.dsl.structure.Sensor;
import lombok.Getter;

public abstract class Visitor<T> {

    @Getter
    protected T result;

    public abstract void visit(App app);

    public abstract void visit(State state);

    public abstract void visit(Transition transition);

    public abstract void visit(Action action);

    public abstract void visit(Actuator actuator);

    public abstract void visit(Sensor sensor);

}
