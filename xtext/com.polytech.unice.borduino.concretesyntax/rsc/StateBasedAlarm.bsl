app StateBasedAlarm initial state off {
	bricks
		actuator red_led : 11
		actuator buzzer : 9
		sensor button : 12
		
	states
	
		off{ 
			red_led : LOW
			buzzer : LOW
			button is HIGH : on
		}
		
		on {
			buzzer : HIGH
			red_led : HIGH
			button is HIGH : off
		}
		

}