/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.dsl.rhythm.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.unice.polytech.si5.dsl.rhythm.RhythmRuntimeModule;
import fr.unice.polytech.si5.dsl.rhythm.RhythmStandaloneSetup;
import fr.unice.polytech.si5.dsl.rhythm.ide.RhythmIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RhythmIdeSetup extends RhythmStandaloneSetup {
  @Override
  public Injector createInjector() {
    RhythmRuntimeModule _rhythmRuntimeModule = new RhythmRuntimeModule();
    RhythmIdeModule _rhythmIdeModule = new RhythmIdeModule();
    return Guice.createInjector(Modules2.mixin(_rhythmRuntimeModule, _rhythmIdeModule));
  }
}
