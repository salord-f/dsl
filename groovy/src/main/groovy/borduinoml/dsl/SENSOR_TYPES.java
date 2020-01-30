package borduinoml.dsl;

public enum SENSOR_TYPES {
    DIGITAL("digital", true), KEYBOARD("keyboard", false);

    String type;
    boolean hasPins;

    SENSOR_TYPES(String type, boolean hasPins) {
        this.type = type;
        this.hasPins = hasPins;
    }
}
