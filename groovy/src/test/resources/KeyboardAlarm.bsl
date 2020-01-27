app "RedButton", {
    bricks
        actuator "buzzer", 9
        sensor "keyboard"
    states
    state "onoff", {
        action "buzzer", "LOW"
        transition "keyboard", "SWITCH", "onoff"
    }
    initial "onoff"
}