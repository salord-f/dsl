# Borduino - Xtext

Implémentation de Borduino en Xtext.

## Requirements

- Gemoc Studio : https://ci.eclipse.org/gemoc/job/gemoc-studio-integration/job/master/lastSuccessfulBuild/artifact/gemoc-studio/gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.updatesite/target/products/

## Importer le projet

Lancer Gemoc Studio sur sa machine, et importer le dossier Xtext dans Gemoc :
- File > Open Projects from File System
- Cliquer sur Directory et selectionner le dossier Xtext
- Inclure les projets suivants : `ArduinoML`, `com.polytech.unice.borduino.concretesyntax`, `com.polytech.unice.borduino.concretesyntax.ide`, `com.polytech.unice.borduino.concretesyntax.ui`
- Une fois les projets importés, il vous faut ajouter la dépendence vers le kernel du projet :  
   * Clic droit sur le projet `ArduinoML`, puis `Build Path > Configure Build Path`
   * Dans l'onglet `Libraries`, editer le chemin vers `borduino-kernel-1.0.jar` vers le jar qui se situe dans `dsl/xtext/lib/borduino-kernel-1.0.jar`
   
   

## Exécution

* Pour éditer du code Borduino :
  * Clic doit sur `com.polytech.unice.borduino.concretesyntax` puis `Run As > Eclipse Application`
  * Une nouvelle Fenetre Gemoc apparaîtra, et vous pourrez créer des fichier `.bsl` pour les éditer avec l'auto-complétion.

* Pour générer un fichier ino : 
  * Dans `dsl/xtext` lancer le fichier `./run.sh <nom_du_fichier_bsl>`. Le résultat sortira dans le fichier `output/result.ino`
  
  Exemple : `./run.sh com.polytech.unice.borduino.concretesyntax/rsc/Alarm.bsl`  
  
  Note : Le dossier `com.polytech.unice.borduino.concretesyntax/rsc` contient de nombreux fichiers bsl sur lesquels il est possible de réaliser des tests 

## Exemple de script

```
app ButtonControlScreen initial state off {
	bricks
		actuator red_led : 11
		actuator buzzer : 9
		screenActuator screen : 2 3 4 5 6 7 8
		sensor button : 12
		
	states
		off{ 
			red_led : LOW
			screen : "I AM OFF"
			button is HIGH : on
		}
		
		on {
			red_led : HIGH
			screen : "I AM HIGH"
			button is LOW : off
		}
}
```
