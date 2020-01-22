app "RedButton", {
    bricks
        actuator "red_led", 11
        actuator "buzzer", 9
        sensor "button", 12

    states
        state "off", {
            action "red_led", "LOW"
            action "buzzer", "LOW"
            transition "button", "HIGH", "on"
        }
        state "on", {
            action "red_led", "HIGH"
            action "buzzer", "HIGH"
            transition "button", "HIGH", "off"
        }

    initial "off"
}
