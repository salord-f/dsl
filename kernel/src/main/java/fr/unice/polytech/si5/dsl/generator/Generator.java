package fr.unice.polytech.si5.dsl.generator;

import fr.unice.polytech.si5.dsl.App;
import fr.unice.polytech.si5.dsl.behavior.*;
import fr.unice.polytech.si5.dsl.structure.Actuator;
import fr.unice.polytech.si5.dsl.structure.Brick;
import fr.unice.polytech.si5.dsl.structure.Sensor;

import java.util.Map;

public class Generator extends Visitor<StringBuilder> {

    private String CURRENT_STATE = "current_state";

    public Generator() {
        super.result = new StringBuilder();
    }

    private void write(String s) {
        result.append(String.format("%s\n", s));
    }

    @Override
    public void visit(App app) {
        write("// Wiring code generated from an ArduinoML model");
        write(String.format("// Application name: %s\n", app.getName()));

        write("void setup(){");
        for (Brick brick : app.getBricks()) {
            brick.accept(this);
        }
        write("}\n");

        write("long time = 0; long debounce = 200;\n");

        for (State state : app.getStates()) {
            state.accept(this);
        }

        if (app.getInitial() != null) {
            write("void loop() {");
            write(String.format("  state_%s();", app.getInitial().getName()));
            write("}");
        }
    }

    @Override
    public void visit(State state) {
        write(String.format("void state_%s() {", state.getName()));
        for (Action action : state.getActions()) {
            action.accept(this);
        }

        if (state.getTransition() != null) {
            write("  boolean guard = millis() - time > debounce;");
            CURRENT_STATE = state.getName();
            state.getTransition().accept(this);
            write("}\n");
        }

    }

    @Override
    public void visit(Transition transition) {
        StringBuilder condition = new StringBuilder();
        for (Map.Entry<Reaction, Operator> entry : transition.getReactions().entrySet()) {
            condition.append(" ")
                    .append(entry.getValue().value)
                    .append(" digitalRead(")
                    .append(entry.getKey().getSensor().getPin())
                    .append(") == ")
                    .append(entry.getKey().getSignal());
        }
        write(String.format("  if( ( digitalRead(%d) == %s%s ) && guard ) {", transition.getSensor().getPin(), transition.getSignal(), condition.toString()));
        write("    time = millis();");
        write(String.format("    state_%s();", transition.getNext().getName()));
        write("  } else {");
        write(String.format("    state_%s();", CURRENT_STATE));
        write("  }");
    }


    @Override
    public void visit(Action action) {
        write(String.format("  digitalWrite(%d,%s);", action.getActuator().getPin(), action.getValue()));
    }

    @Override
    public void visit(Actuator actuator) {
        write(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]", actuator.getPin(), actuator.getName()));
    }

    @Override
    public void visit(Sensor sensor) {
        write(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", sensor.getPin(), sensor.getName()));
    }


}
