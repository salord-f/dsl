/*
 * generated by Xtext 2.14.0
 */
package com.polytech.unice.borduino.concretesyntax.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BorduinoAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/polytech/unice/borduino/concretesyntax/parser/antlr/internal/InternalBorduino.tokens");
	}
}