app RedButton initial state off {

	bricks
		actuator red_led : 12
		sensor button : 8
		
	states
		off
		{
			red_led : LOW
			button is HIGH : on
		}
		
		on
		{
			red_led : HIGH
			button is HIGH : off
		}
}