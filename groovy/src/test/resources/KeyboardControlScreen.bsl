app "RedButton", {
    bricks
        actuator "screen", 2, 3, 4, 5, 6, 7, 8
        sensor "keyboard"
    states
    state "on", {
        action "screen", "keyboard"
        transition "keyboard", "", "on"
    }
    initial "on"
}