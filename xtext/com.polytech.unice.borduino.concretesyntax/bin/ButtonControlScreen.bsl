app ButtonControlScreen initial state off {
	bricks
		actuator red_led : 11
		actuator buzzer : 9
		screenActuator screen : 2 3 4 5 6 7 8
		sensor button : 12
		
	states
		off{ 
			red_led : LOW
			screen : "I AM OFF"
			button is HIGH : on
		}
		
		on {
			red_led : HIGH
			screen : "I AM HIGH"
			button is LOW : off
		}
}