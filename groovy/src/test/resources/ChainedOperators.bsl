app "RedButton", {
    bricks
        actuator "buzzer", 9
        sensor "button", 12
        sensor "keyboard"
    states
    state "off", {
        action "buzzer", "LOW"
        transition "keyboard", "SWITCH", "AND", "button", "HIGH", "on"
    }
    state "on", {
            action "buzzer", "HIGH"
            transition "keyboard", "SWITCH", "AND", "button", "LOW", "off"
        }
    initial "off"
}
