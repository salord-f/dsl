app "RedButton", {
    bricks
        actuator "buzzer" type "digital" pin 9
        sensor "button" type "digital" pin 12
        sensor "keyboard" type "keyboard"
    states
        state "off"
            action "buzzer" to "LOW"
            transition "on" when "keyboard" becomes "SWITCH" and "button" becomes "HIGH"

        state "on"
            action "buzzer" to "HIGH"
            transition "off" when "keyboard" becomes "SWITCH" and "button" becomes "LOW"

    initial "off"
}
