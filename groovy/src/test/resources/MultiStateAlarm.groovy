app "MultiStateAlarm", {
    bricks
        actuator "red_led" type "digital" pin 11
        actuator "buzzer" type "digital" pin 9
        sensor "button" type "digital" pin 12
    states
    state "off"
        action "red_led" to "LOW"
        action "buzzer" to "LOW"
        transition "on_buzzer" when "button" becomes "HIGH"

    state "on_buzzer"
        action "buzzer" to "HIGH"
        transition "on_led" when "button" becomes "HIGH"

    state "on_led"
        action "buzzer" to "LOW"
        action "red_led" to "HIGH"
        transition "off" when "button" becomes "HIGH"

    initial "off"
}