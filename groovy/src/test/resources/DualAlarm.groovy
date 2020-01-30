app "DualAlarm", {
    bricks
        actuator "buzzer" type "digital" pin 9
        sensor "button_1" type "digital" pin 10
        sensor "button_2" type "digital" pin 12

    states
    state "off"
        action "buzzer" to "LOW"
        transition "on" when "button_1" becomes "HIGH" and "button_2" becomes "HIGH"

    state "on"
        action "buzzer" to "HIGH"
        transition "off" when "button_1" becomes "LOW" or "button_2" becomes "LOW"

    initial "off"
}