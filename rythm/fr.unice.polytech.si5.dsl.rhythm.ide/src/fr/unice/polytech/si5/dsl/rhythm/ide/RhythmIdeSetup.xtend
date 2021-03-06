/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.dsl.rhythm.ide

import com.google.inject.Guice
import fr.unice.polytech.si5.dsl.rhythm.RhythmRuntimeModule
import fr.unice.polytech.si5.dsl.rhythm.RhythmStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RhythmIdeSetup extends RhythmStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RhythmRuntimeModule, new RhythmIdeModule))
	}
	
}
