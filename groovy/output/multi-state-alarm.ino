// Wiring code generated from an ArduinoML model
// Application name: RedButton

void setup(){
  pinMode(11, OUTPUT); // red_led [Actuator]
  pinMode(9, OUTPUT); // buzzer [Actuator]
  pinMode(12, INPUT);  // button [Sensor]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(11,LOW);
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH && guard ) {
    time = millis();
    state_on_buzzer();
  } else {
    state_off();
  }
}

void state_on_buzzer() {
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH && guard ) {
    time = millis();
    state_on_led();
  } else {
    state_on_buzzer();
  }
}

void state_on_led() {
  digitalWrite(9,LOW);
  digitalWrite(11,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(12) == HIGH && guard ) {
    time = millis();
    state_off();
  } else {
    state_on_led();
  }
}

void loop() {
  state_off();
}

