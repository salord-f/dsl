app "RedButton", {
    bricks
        actuator "red_led", 11
        actuator "buzzer", 9
        actuator "screen", 2, 3, 4, 5, 6, 7, 8
        sensor "button", 12
    states
        state "off", {
            action "red_led", "LOW"
            action "screen", "I A OFF"
            transition "button", "HIGH", "on"
        }
        state "on", {
            action "red_led", "HIGH"
            action "screen", "I AM HIGH"
            transition "button", "LOW", "off"
        }
    initial "off"
}