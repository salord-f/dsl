app MultiStateAlarm initial state off {
	bricks
		actuator red_led : 11
		actuator buzzer : 9
		sensor button : 12
		
	states
	
		off{ 
			red_led : LOW
			buzzer : LOW
			button is HIGH : on_buzzer
		}
		
		on_buzzer {
			buzzer : HIGH
			button is HIGH : on_led
		}
		
		on_led {
			buzzer : LOW
			red_led : HIGH
			button is HIGH : off
		}
}