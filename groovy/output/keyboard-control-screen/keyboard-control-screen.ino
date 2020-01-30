// Wiring code generated from an ArduinoML model
// Application name: KeyboardControlScreen

#include <LiquidCrystal.h>

LiquidCrystal screen(2, 3, 4, 5, 6, 7, 8);

void setup(){
  screen.begin(16,2); // screen [Actuator]
  Serial.begin(9600);
  while (! Serial); // Wait until Serial is ready
}

long time = 0; long debounce = 200;

void state_on() {
  screen.clear();
  screen.print("keyboard");
  boolean guard = millis() - time > debounce;
  if( ( Serial.readString() == "on" ) && guard ) {
    time = millis();
    state_on();
  } else {
    state_on();
  }
}

void loop() {
  state_on();
}

