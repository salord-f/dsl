app DualAlarm initial state off {
	bricks
		actuator buzzer : 9
		sensor button_1 : 10
		sensor button_2 : 12
		
	states
		off{ 
			buzzer : LOW
			button_1 is HIGH and button_2 is HIGH : on
		}
		
		on {
			buzzer : HIGH
			button_1 is LOW and button_2 is LOW : off
		}
}