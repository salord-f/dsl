// Wiring code generated from an ArduinoML model
// Application name: ButtonControlScreen

#include <LiquidCrystal.h>

LiquidCrystal screen(2, 3, 4, 5, 6, 7, 8);

void setup(){
  pinMode(11, OUTPUT); // red_led [Actuator]
  screen.begin(16,2); // screen [Actuator]
  pinMode(12, INPUT);  // button [Sensor]
  Serial.begin(9600);
  while (! Serial); // Wait untilSerial is ready
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(11,LOW);
  screen.clear();
  screen.print("I A OFF");
  boolean guard = millis() - time > debounce;
  if( ( digitalRead(12) == HIGH ) && guard ) {
    time = millis();
    state_on();
  } else {
    state_off();
  }
}

void state_on() {
  digitalWrite(11,HIGH);
  screen.clear();
  screen.print("I AM HIGH");
  boolean guard = millis() - time > debounce;
  if( ( digitalRead(12) == LOW ) && guard ) {
    time = millis();
    state_off();
  } else {
    state_on();
  }
}

void loop() {
  state_off();
}

