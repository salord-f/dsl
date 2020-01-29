app "RedButton", {
    bricks
        actuator "buzzer", 9
        sensor "button_1", 10
        sensor "button_2", 12
    states
    state "off", {
        action "buzzer", "LOW"
        transition "button_1", "HIGH", "AND", "button_2", "HIGH", "on"
    }
    state "on", {
        action "buzzer", "HIGH"
        transition "button_1", "LOW", "OR", "button_2", "LOW", "off"
    }

    initial "off"
}