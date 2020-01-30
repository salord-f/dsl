mkdir -p output/alarm
mkdir -p output/dual-alarm
mkdir -p output/multi-state-alarm
mkdir -p output/state-based-alarm
mkdir -p output/button-control-screen
mkdir -p output/keyboard-alarm
mkdir -p output/keyboard-control-screen
mkdir -p output/chained-operators

java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/Alarm.groovy > output/alarm/alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/DualAlarm.groovy > output/dual-alarm/dual-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/MultiStateAlarm.groovy > output/multi-state-alarm/multi-state-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/StateBasedAlarm.groovy > output/state-based-alarm/state-based-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/ButtonControlScreen.groovy > output/button-control-screen/button-control-screen.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/KeyboardAlarm.groovy > output/keyboard-alarm/keyboard-alarm.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/KeyboardControlScreen.groovy > output/keyboard-control-screen/keyboard-control-screen.ino
java -jar target/borduino-1.0-jar-with-dependencies.jar src/test/resources/ChainedOperators.groovy > output/chained-operators/chained-operators.ino
