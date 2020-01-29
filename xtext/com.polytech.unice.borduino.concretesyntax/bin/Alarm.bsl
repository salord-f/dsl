app Alarm initial state off {
	bricks
		actuator red_led : 9
		actuator buzzer :11
		sensor button : 10
		
	states
		off{ 
			red_led : LOW
			buzzer : LOW
			button is HIGH : on
		}
		
		on {
			red_led : HIGH
			buzzer : HIGH
			button is LOW : off
		}
}