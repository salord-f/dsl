package fr.unice.polytech.si5.dsl;


import fr.unice.polytech.si5.dsl.behavior.*;
import fr.unice.polytech.si5.dsl.generator.Generator;
import fr.unice.polytech.si5.dsl.generator.Visitor;
import fr.unice.polytech.si5.dsl.structure.SimplePinActuator;
import fr.unice.polytech.si5.dsl.structure.Sensor;
import fr.unice.polytech.si5.dsl.structure.SimplePinSensor;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BasicTest {

    @Test
    public void basicTest() {

        SimplePinSensor button = new SimplePinSensor();
        button.setPin(9).setName("button");

        SimplePinActuator led = new SimplePinActuator();
        led.setPin(12).setName("LED");

        // Creating actions
        Action switchTheLightOn = new Action()
                .setActuator(led)
                .setValue(new DigitalSignal(DigitalSignalEnum.HIGH));

        Action switchTheLightOff = new Action()
                .setActuator(led)
                .setValue(new DigitalSignal(DigitalSignalEnum.LOW));

        // Declaring states
        State on = new State().setName("on");

        State off = new State().setName("off");

        // Binding actions to states
        on.setActions(Arrays.asList(switchTheLightOn));
        off.setActions(Arrays.asList(switchTheLightOff));

        // Creating transitions
        Transition on2off = new Transition()
                .setNext(off)
                .addCondition(button, new DigitalSignal(DigitalSignalEnum.HIGH));

        Transition off2on = new Transition()
                .setNext(on)
                .addCondition(button, new DigitalSignal(DigitalSignalEnum.HIGH));

        // Binding transitions to states
        on.setTransition(on2off);
        off.setTransition(off2on);

        // Building the App
        App app = new App()
                .setName("Switch!")
                .setBricks(Arrays.asList(button, led))
                .setStates(Arrays.asList(on, off))
                .setInitial(off);

        // Generating Code
        Visitor generator = new Generator();
        app.accept(generator);

        List expected = Arrays.asList(("// Wiring code generated from an ArduinoML model\n" +
                "// Application name: Switch!\n" +
                "\n" +
                "void setup(){\n" +
                "  pinMode(9, INPUT);  // button [Sensor]\n" +
                "  pinMode(12, OUTPUT); // LED [Actuator]\n" +
                "}\n" +
                "\n" +
                "long time = 0; long debounce = 200;\n" +
                "\n" +
                "void state_on() {\n" +
                "  digitalWrite(12,HIGH);\n" +
                "  boolean guard = millis() - time > debounce;\n" +
                "  if( ( digitalRead(9) == HIGH ) && guard ) {\n" +
                "    time = millis();\n" +
                "    state_off();\n" +
                "  } else {\n" +
                "    state_on();\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "void state_off() {\n" +
                "  digitalWrite(12,LOW);\n" +
                "  boolean guard = millis() - time > debounce;\n" +
                "  if( ( digitalRead(9) == HIGH ) && guard ) {\n" +
                "    time = millis();\n" +
                "    state_on();\n" +
                "  } else {\n" +
                "    state_off();\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "void loop() {\n" +
                "  state_off();\n" +
                "}" +
                "\n").split("\n"));

        List has = Arrays.asList(generator.getResult().toString().split("\n"));

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), has.get(i));
        }
    }
}
