// Wiring code generated from an ArduinoML model
// Application name: RedButton

#include <LiquidCrystal.h>

void setup(){
  pinMode(9, OUTPUT); // buzzer [Actuator]
  pinMode(8, INPUT);  // button_1 [Sensor]
  pinMode(10, INPUT);  // button_2 [Sensor]
  Serial.begin(9600);
  while (! Serial); // Wait untilSerial is ready
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( ( digitalRead(8) == HIGH && digitalRead(10) == HIGH ) && guard ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(9,HIGH);
  boolean guard = millis() - time > debounce;
  if( ( digitalRead(8) == LOW || digitalRead(10) == LOW ) && guard ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}
