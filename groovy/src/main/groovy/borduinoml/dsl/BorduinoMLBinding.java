package borduinoml.dsl;

import groovy.lang.Binding;
import groovy.lang.Script;
import lombok.Getter;
import lombok.Setter;

public class BorduinoMLBinding extends Binding {
    // can be useful to return the script in case of syntax trick
    @Setter
    private Script script;

    @Getter
    @Setter
    private BorduinoMLModel model;

    public BorduinoMLBinding() {
        super();
    }

    public Object getVariable(String name) {
        if ("bricks".equals(name)) {
            ((BorduinoMLBasescript) this.script).bricks();
            return script;
        }
        if ("states".equals(name)) {
            ((BorduinoMLBasescript) this.script).states();
            return script;
        }
        return super.getVariable(name);
    }

    public void setVariable(String name, Object value) {
        super.setVariable(name, value);
    }
}
