app "RedButton", {
    bricks
        actuator "red_led", 11
        actuator "buzzer", 9
        actuator "screen", 2, 3, 4, 5, 6, 7, 8
        sensor "button", 12
        sensor "keyboard"
    states
        state "off", {
            action "screen", "yo"
            transition "button", "HIGH", "AND", "keyboard", "BONJOUR", "on"
        }
        state "on", {
            action "screen", "HIGH"
            transition "button", "LOW", "off"
        }
    initial "off"
}