/*
 * generated by Xtext 2.14.0
 */
package com.polytech.unice.borduino.concretesyntax.ui;

import com.google.inject.Injector;
import com.polytech.unice.borduino.concretesyntax.ui.internal.ConcretesyntaxActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BorduinoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ConcretesyntaxActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ConcretesyntaxActivator activator = ConcretesyntaxActivator.getInstance();
		return activator != null ? activator.getInjector(ConcretesyntaxActivator.COM_POLYTECH_UNICE_BORDUINO_CONCRETESYNTAX_BORDUINO) : null;
	}

}
