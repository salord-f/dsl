app "Alarm", {
    bricks
    actuator "red_led" type "digital" pin 11
    actuator "buzzer" type "digital" pin 9
    sensor "button" type "digital" pin 12

    states
    state "off"
        action "red_led" to "LOW"
        action "buzzer" to "LOW"
        transition "on" when "button" becomes "HIGH"

    state "on"
        action "red_led" to "HIGH"
        action "buzzer" to "HIGH"
        transition "off" when "button" becomes "LOW"

    initial "off"
}