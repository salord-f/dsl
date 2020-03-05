# RhythmML


## Requirements

- Gemoc Studio : https://ci.eclipse.org/gemoc/job/gemoc-studio-integration/job/master/lastSuccessfulBuild/artifact/gemoc-studio/gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.updatesite/target/products/

## Importer le projet

Lancer Gemoc Studio sur sa machine, et importer le dossier Xtext dans Gemoc :
- File > Open Projects from File System
- Cliquer sur Directory et selectionner le dossier Xtext
- Inclure les projets suivants : `rythm`, `fr.unice.polytech.si5.dsl.rhythm`, `fr.unice.polytech.si5.dsl.rhythm.ide`, `fr.unice.polytech.si5.dsl.rhythm.ui	`   

## Exécution

* Pour éditer du code Rhythm :
  * Clic doit sur `fr.unice.polytech.si5.dsl.rhythm` puis `Run As > Eclipse Application`
  * Une nouvelle Fenetre Gemoc apparaîtra, et vous pourrez créer des fichier `.rhythm` pour les éditer avec l'auto-complétion.

* Pour générer du son en midi : 
  * Dans la racine du dossier, lancer le fichier `./run.sh <nom_du_fichier_rhythm>`. Le résultat sonore sera automatiquement généré. Attention, l'extension du fichier d'entrée doit systématiquement être `.rhythm`
  
  Exemple : `./run.sh fr.unice.polytech.si5.dsl.rhythm/resources/Billie_Jean.rhythm`  
  
  Note : Le dossier `fr.unice.polytech.si5.dsl.rhythm/resources` contient de nombreux fichiers rhythm sur lesquels il est possible de réaliser des tests.

## Exemple de script

```
rhythm Mickael_Jackson tempo 50 BPM

drum track Billie_Jean_Drum {


	patterns:
		main {
			beat: ch bd, ch, ch sd, ch
		}
		
	sections:
		beat {
			pattern: main 34 times
		}
		 
	composition:beat 
}

piano track Billie_Jean_Piano {

	
	patterns:
		empty {
			beat: _, _, _, _
		}
		main_piano {
			beat: mi(5) sol(5) si(5), _, _
			beat: re(5) la(5), _, _
		}
		
	sections:
		empty_section {
			pattern: empty 10 times
		}
		refrain {
			pattern: main_piano 8 times
		}
		 
	composition: empty_section,refrain
}
```
