app ChainedOperators initial state off {
	bricks
		actuator buzzer : 9
		keyboardSensor keyboard
		sensor button : 12
		
	states
		off{ 
			buzzer : LOW
			keyboard is "SWITCH" and button is HIGH : on
		}
		
		on {
			buzzer : HIGH
			keyboard is "SWITCH" or button is LOW : off
		}
}
