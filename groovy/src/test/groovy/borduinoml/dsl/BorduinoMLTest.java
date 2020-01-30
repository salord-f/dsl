package borduinoml.dsl;


import org.junit.Test;

import java.io.File;

public class BorduinoMLTest {

    private void runScript(String name) {
        String[] args = new String[1];
        args[0] = this.getClass().getClassLoader().getResource(name).getFile();
        BorduinoMLDSL dsl = new BorduinoMLDSL();
        dsl.eval(new File(args[0]));
    }


    @Test
    public void alarm() {
        runScript("Alarm.groovy");
    }

    @Test
    public void buttonControlScreen() {
        runScript("ButtonControlScreen.groovy");
    }

    @Test
    public void chainedOperators() {
        runScript("ChainedOperators.groovy");
    }

    @Test
    public void dualAlarm() {
        runScript("DualAlarm.groovy");
    }

    @Test
    public void keyboardAlarm() {
        runScript("KeyboardAlarm.groovy");
    }

    @Test
    public void keyboardControlScreen() {
        runScript("KeyboardControlScreen.groovy");
    }

    @Test
    public void multiStateAlarm() {
        runScript("MultiStateAlarm.groovy");
    }

    @Test
    public void stateBasedAlarm() {
        runScript("StateBasedAlarm.groovy");
    }


}