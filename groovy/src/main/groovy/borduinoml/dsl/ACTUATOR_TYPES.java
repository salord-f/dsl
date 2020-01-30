package borduinoml.dsl;

public enum ACTUATOR_TYPES {
    DIGITAL("digital"), LCD("lcd");

    String type;

    ACTUATOR_TYPES(String type) {
        this.type = type;
    }
}
