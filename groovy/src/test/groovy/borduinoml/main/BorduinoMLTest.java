package borduinoml.main;


import borduinoml.dsl.BorduinoMLDSL;
import org.junit.Test;

import java.io.File;

public class BorduinoMLTest {

    @Test
    public void alarm() {
        String[] args = new String[1];
        args[0] = this.getClass().getClassLoader().getResource("Alarm.bsl").getFile();

        BorduinoMLDSL dsl = new BorduinoMLDSL();
        dsl.eval(new File(args[0]));

    }

    @Test
    public void stateBasedAlarm() {
        String[] args = new String[1];
        args[0] = this.getClass().getClassLoader().getResource("StateBasedAlarm.bsl").getFile();

        BorduinoMLDSL dsl = new BorduinoMLDSL();
        dsl.eval(new File(args[0]));

    }

    @Test
    public void multiStateAlarm() {
        String[] args = new String[1];
        args[0] = this.getClass().getClassLoader().getResource("MultiStateAlarm.bsl").getFile();

        BorduinoMLDSL dsl = new BorduinoMLDSL();
        dsl.eval(new File(args[0]));

    }
}