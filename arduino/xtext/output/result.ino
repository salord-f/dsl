// Wiring code generated from an ArduinoML model
// Application name: Alarm

void setup(){
  pinMode(9, OUTPUT); // red_led [Actuator]
  pinMode(11, OUTPUT); // buzzer [Actuator]
  pinMode(10, INPUT);  // button [Sensor]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  digitalWrite(11,LOW);
  boolean guard = millis() - time > debounce;
  if( ( digitalRead(10) == HIGH ) && guard ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(9,HIGH);
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( ( digitalRead(10) == LOW ) && guard ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}

