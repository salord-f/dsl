app "ButtonControlScreen", {
    bricks
        actuator "red_led" type "digital" pin 11
        actuator "screen" type "lcd" pins 2, 3, 4, 5, 6, 7, 8
        sensor "button" type "digital" pin 12
    states
        state "off"
            action "red_led" to "LOW"
            action "screen" to "I A OFF"
            transition "on" when "button" becomes "HIGH"

        state "on"
            action "red_led" to "HIGH"
            action "screen" to "I AM HIGH"
            transition "off" when "button" becomes "LOW"

    initial "off"
}