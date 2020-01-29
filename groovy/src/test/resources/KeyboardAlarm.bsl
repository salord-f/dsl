app "RedButton", {
    bricks
        actuator "buzzer", 9
        sensor "keyboard"
    states
    state "off", {
        action "buzzer", "LOW"
        transition "keyboard", "SWITCH", "on"
    }
    state "on", {
            action "buzzer", "HIGH"
            transition "keyboard", "SWITCH", "off"
        }
    initial "off"
}
