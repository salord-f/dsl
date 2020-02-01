# Borduino - Groovy

Implémentation de Borduino en Groovy.

## Requirements

- Java 8
- Maven

## Compilation

S'assurer que le kernel ait bien été installé localement :  
`cd kernel && mvn clean install`

Pour compiler Borduino - groovy :  
`sh build.sh`

## Exécution
`sh run.sh`

Le résultat de l'exécution se situe dans le dossier `output`

## Exemple de script

```
app "DualAlarm", {
    bricks
        actuator "buzzer" type "digital" pin 9
        sensor "button_1" type "digital" pin 10
        sensor "button_2" type "digital" pin 12

    states
    state "off"
        action "buzzer" to "LOW"
        transition "on" when "button_1" becomes "HIGH" and "button_2" becomes "HIGH"

    state "on"
        action "buzzer" to "HIGH"
        transition "off" when "button_1" becomes "LOW" or "button_2" becomes "LOW"

    initial "off"
}
```