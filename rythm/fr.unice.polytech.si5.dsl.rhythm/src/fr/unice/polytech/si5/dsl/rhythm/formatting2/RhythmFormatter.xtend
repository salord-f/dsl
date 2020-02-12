/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.dsl.rhythm.formatting2


import fr.unice.polytech.si5.dsl.rhythm.services.RhythmGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import rhythmML.Rhythm
import rhythmML.Track

class RhythmFormatter extends AbstractFormatter2 {
	

	def dispatch void format(Rhythm rhythm, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (track : rhythm.tracks) {
			track.format
		}
	}

	def dispatch void format(Track track, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (pattern : track.patterns) {
			pattern.format
		}
		for (section : track.sections) {
			section.format
		}
	}
	
	// TODO: implement for Pattern, Bar, Section, PatternModification
}
