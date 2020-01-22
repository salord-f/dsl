app "RedButton", {
    bricks
        actuator "buzzer", 9
        sensor "button_1", 8
        sensor "button_2", 9
    states
    state "off" {
        action "buzzer", LOW
        transition "button_1", "HIGH" and button_2 is HIGH : on
    }
    on {
        buzzer : HIGH
        button_1 is LOW or button_2 is LOW : off
    }
}