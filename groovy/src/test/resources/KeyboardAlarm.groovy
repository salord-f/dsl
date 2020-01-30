app "KeyboardAlarm", {
    bricks
        actuator "buzzer" type "digital" pin 9
        sensor "keyboard" type "keyboard"

    states
    state "off"
        action "buzzer" to "LOW"
        transition "on" when "keyboard" becomes "SWITCH"

    state "on"
            action "buzzer" to "HIGH"
            transition "off" when "keyboard" becomes "SWITCH"

    initial "off"
}