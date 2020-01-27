package fr.unice.polytech.si5.dsl.generator;

import fr.unice.polytech.si5.dsl.App;
import fr.unice.polytech.si5.dsl.behavior.*;
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
        write("  Serial.begin(9600);\n" +
                "  while (! Serial); // Wait untilSerial is ready");
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

        // TODO code keyboard dynamic

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

             /*   else if (sensor instanceof KeyboardSensor){
        conditions.append("if(Serial.available() > 0) {");
        conditions.append("String ");
        conditions.append(sensor.getName());
        conditions.append(" = Serial.readString();");
        ch = Serial.read();");
        conditions.append("}");
    }

            conditions.append(condition.getOperator().value)
            .append(" digitalRead(")
                    .append(condition.getSensor().getPin())
            .append(") == ")
                    .append(condition.getSignal())
            .append(" ");
*/
    @Override
    public void visit(Transition transition) {
        StringBuilder conditions = new StringBuilder();
        //Sensor sensor = condition.getSensor();

        transition.getSensorType();

        for (Condition condition : transition.getConditions()) {
            Sensor sensor = condition.getSensor();
            if (condition.getSignal() instanceof DigitalSignal){
                conditions.append(condition.getOperator().value)
                        .append(" digitalRead(")
                        .append(((SimplePinSensor)sensor).getPin())
                        .append(") == ")
                        .append(condition.getSignal().toString())
                        .append(" ");
            }
            else {
                conditions.append(condition.getOperator().value)
                        .append(" Serial.readString()")
                        //.append(((KeyboardSensor)sensor))
                        .append(" == ")
                        .append("\"")
                        .append(condition.getSignal().toString())
                        .append("\"")
                        .append(" ");
            }
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
    public void visit(SimplePinSensor sensor) {
        write(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", ((SimplePinSensor)sensor).getPin(), sensor.getName()));
    }

    @Override
    public void visit(KeyboardSensor sensor) {
        //TODO//write(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", ((KeyboardSensor)sensor).getPin(), sensor.getName()));
    }


}
