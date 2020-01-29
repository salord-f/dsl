app DualAlarm initial state off {
	bricks
		actuator buzzer : 9
		keyboardSensor keyboard
		
	states
	
		off{ 
			
			buzzer : LOW
			keyboard is "SWITCH" : on
		}
		
		on {
			buzzer : HIGH
			keyboard is "SWITCH" : off
		}
}