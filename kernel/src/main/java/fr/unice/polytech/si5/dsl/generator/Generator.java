package fr.unice.polytech.si5.dsl.generator;

import fr.unice.polytech.si5.dsl.App;
import fr.unice.polytech.si5.dsl.behavior.Action;
import fr.unice.polytech.si5.dsl.behavior.Condition;
import fr.unice.polytech.si5.dsl.behavior.State;
import fr.unice.polytech.si5.dsl.behavior.Transition;
import fr.unice.polytech.si5.dsl.structure.*;

import java.util.stream.Collectors;

public class Generator extends Visitor<StringBuilder> {

    private String CURRENT_STATE = "current_state";

    public Generator() {
        super.result = new StringBuilder();
    }

    private void write(String s) {
        result.append(String.format("%s\n", s));
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void visit(App app) {
        write("// Wiring code generated from an ArduinoML model");
        write(String.format("// Application name: %s\n", app.getName()));
        write("#include <LiquidCrystal.h>\n");


        for (Brick brick : app.getBricks()) {
            if (brick instanceof LCDScreenActuator) {
                LCDScreenActuator lcd = (LCDScreenActuator) brick;
                write("LiquidCrystal" + " " + lcd.getName()
                        + "("
                        + lcd.getPins()
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(", "))
                        + ");");
                write("");
            }
        }

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
        StringBuilder conditions = new StringBuilder();
        for (Condition condition : transition.getConditions()) {
            conditions.append(condition.getOperator().value)
                    .append(" digitalRead(")
                    .append(condition.getSensor().getPin())
                    .append(") == ")
                    .append(condition.getSignal())
                    .append(" ");
        }

        write(String.format("  if( (%s) && guard ) {", conditions.toString()));
        write("    time = millis();");
        write(String.format("    state_%s();", transition.getNext().getName()));
        write("  } else {");
        write(String.format("    state_%s();", CURRENT_STATE));
        write("  }");
    }


    @Override
    public void visit(Action action) {
        Actuator actuator = action.getActuator();
        if (actuator instanceof SimplePinActuator) {
            write(String.format("  digitalWrite(%d,%s);", ((SimplePinActuator) actuator).getPin(), action.getValue()));
        } else if (actuator instanceof LCDScreenActuator) {
            write("  " + actuator.getName() + ".clear();");
            write(String.format("  %s.print(\"%s\");", actuator.getName(), action.getValue()));
        }
    }

    @Override
    public void visit(SimplePinActuator actuator) {
        write(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]", actuator.getPin(), actuator.getName()));

    }

    @Override
    public void visit(LCDScreenActuator actuator) {
        write(String.format("  %s.begin(16,2); // %s [Actuator]", actuator.getName(), actuator.getName()));
    }

    @Override
    public void visit(Sensor sensor) {
        write(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", sensor.getPin(), sensor.getName()));
    }


}
