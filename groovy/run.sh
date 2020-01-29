mkdir -p output/alarm
mkdir -p output/dual-alarm
mkdir -p output/multi-state-alarm
mkdir -p output/state-based-alarm
mkdir -p output/button-control-screen
mkdir -p output/keyboard-alarm

java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/Alarm.bsl > output/alarm/alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/DualAlarm.bsl > output/dual-alarm/dual-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/MultiStateAlarm.bsl > output/multi-state-alarm/multi-state-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/StateBasedAlarm.bsl > output/state-based-alarm/state-based-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/ButtonControlScreen.bsl > output/button-control-screen/button-control-screen.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/KeyboardAlarm.bsl > output/keyboard-alarm/keyboard-alarm.ino
