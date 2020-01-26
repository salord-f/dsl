app RedButton initial state off {
	bricks
		actuator red_led : 12
		sensor button : 8
		sensor button2 : 9
		sensor button3 : 10
		screenActuator screen : 1 2 3 
		
	states
		off{ 
			red_led : LOW
			button is HIGH and button3 is LOW : on
		}
		
		on {
			red_led : HIGH
			button is HIGH or button2 is LOW : off
		}
}