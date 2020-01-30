app "KeyboardControlScreen", {
    bricks
        actuator "screen" type "lcd" pins 2, 3, 4, 5, 6, 7, 8
        sensor "keyboard" type "keyboard"
    states
    state "on"
        action "screen" to "keyboard"
        transition "on" when "keyboard" becomes "on"

    initial "on"
}