// Wiring code generated from an ArduinoML model
// Application name: RedButton

#include <LiquidCrystal.h>

void setup(){
  pinMode(9, OUTPUT); // buzzer [Actuator]
  Serial.begin(9600);
  while (! Serial); // Wait untilSerial is ready
}

long time = 0; long debounce = 200;

void state_onoff() {
  digitalWrite(9,LOW);
  boolean guard = millis() - time > debounce;
  if( ( Serial.readString() == "SWITCH" ) && guard ) {
    time = millis();
    state_onoff();
  } else {
    state_onoff();
  }
}

void loop() {
  state_onoff();
}

