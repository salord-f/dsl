/*
 * generated by Xtext 2.14.0
 */
grammar InternalRhythm;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.unice.polytech.si5.dsl.rhythm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.unice.polytech.si5.dsl.rhythm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.si5.dsl.rhythm.services.RhythmGrammarAccess;

}

@parser::members {

 	private RhythmGrammarAccess grammarAccess;

    public InternalRhythmParser(TokenStream input, RhythmGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Rhythm";
   	}

   	@Override
   	protected RhythmGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRhythm
entryRuleRhythm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRhythmRule()); }
	iv_ruleRhythm=ruleRhythm
	{ $current=$iv_ruleRhythm.current; }
	EOF;

// Rule Rhythm
ruleRhythm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rhythm'
		{
			newLeafNode(otherlv_0, grammarAccess.getRhythmAccess().getRhythmKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRhythmAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRhythmRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='tempo'
		{
			newLeafNode(otherlv_2, grammarAccess.getRhythmAccess().getTempoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRhythmAccess().getBPMEIntParserRuleCall_3_0());
				}
				lv_BPM_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRhythmRule());
					}
					set(
						$current,
						"BPM",
						lv_BPM_3_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='BPM'
		{
			newLeafNode(otherlv_4, grammarAccess.getRhythmAccess().getBPMKeyword_4());
		}
		otherlv_5='resolution:'
		{
			newLeafNode(otherlv_5, grammarAccess.getRhythmAccess().getResolutionKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRhythmAccess().getResolutionEIntParserRuleCall_6_0());
				}
				lv_resolution_6_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRhythmRule());
					}
					set(
						$current,
						"resolution",
						lv_resolution_6_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='offset:'
		{
			newLeafNode(otherlv_7, grammarAccess.getRhythmAccess().getOffsetKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRhythmAccess().getOffsetEFloatParserRuleCall_8_0());
				}
				lv_offset_8_0=ruleEFloat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRhythmRule());
					}
					set(
						$current,
						"offset",
						lv_offset_8_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EFloat");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='tick'
		{
			newLeafNode(otherlv_9, grammarAccess.getRhythmAccess().getTickKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_10_0());
				}
				lv_tracks_10_0=ruleTrack
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRhythmRule());
					}
					add(
						$current,
						"tracks",
						lv_tracks_10_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Track");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_11_0());
				}
				lv_tracks_11_0=ruleTrack
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRhythmRule());
					}
					add(
						$current,
						"tracks",
						lv_tracks_11_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Track");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTrack
entryRuleTrack returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrackRule()); }
	iv_ruleTrack=ruleTrack
	{ $current=$iv_ruleTrack.current; }
	EOF;

// Rule Track
ruleTrack returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='track'
		{
			newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTrackKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrackRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='patterns:'
			{
				newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getPatternsKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_1_0());
					}
					lv_patterns_4_0=rulePattern
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrackRule());
						}
						add(
							$current,
							"patterns",
							lv_patterns_4_0,
							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Pattern");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_2_0());
					}
					lv_patterns_5_0=rulePattern
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrackRule());
						}
						add(
							$current,
							"patterns",
							lv_patterns_5_0,
							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Pattern");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_6='sections:'
		{
			newLeafNode(otherlv_6, grammarAccess.getTrackAccess().getSectionsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_5_0());
				}
				lv_sections_7_0=ruleSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrackRule());
					}
					add(
						$current,
						"sections",
						lv_sections_7_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Section");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_6_0());
				}
				lv_sections_8_0=ruleSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrackRule());
					}
					add(
						$current,
						"sections",
						lv_sections_8_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Section");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	iv_rulePattern=rulePattern
	{ $current=$iv_rulePattern.current; }
	EOF;

// Rule Pattern
rulePattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='beat:'
		{
			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getBeatKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getBeatsBeatParserRuleCall_3_0());
				}
				lv_beats_3_0=ruleBeat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					add(
						$current,
						"beats",
						lv_beats_3_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='beat:'
			{
				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getBeatKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPatternAccess().getBeatsBeatParserRuleCall_4_1_0());
					}
					lv_beats_5_0=ruleBeat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPatternRule());
						}
						add(
							$current,
							"beats",
							lv_beats_5_0,
							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleBeat
entryRuleBeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBeatRule()); }
	iv_ruleBeat=ruleBeat
	{ $current=$iv_ruleBeat.current; }
	EOF;

// Rule Beat
ruleBeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_0_0());
				}
				lv_ticks_0_0=ruleNote
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBeatRule());
					}
					add(
						$current,
						"ticks",
						lv_ticks_0_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Note");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getBeatAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_1_1_0());
					}
					lv_ticks_2_0=ruleNote
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBeatRule());
						}
						add(
							$current,
							"ticks",
							lv_ticks_2_0,
							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Note");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	iv_ruleSection=ruleSection
	{ $current=$iv_ruleSection.current; }
	EOF;

// Rule Section
ruleSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='pattern:'
		{
			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getPatternKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_3_0());
				}
				lv_patternLoops_3_0=rulePatternLoop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionRule());
					}
					add(
						$current,
						"patternLoops",
						lv_patternLoops_3_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternLoop");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_4_1_0());
					}
					lv_patternLoops_5_0=rulePatternLoop
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSectionRule());
						}
						add(
							$current,
							"patternLoops",
							lv_patternLoops_5_0,
							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternLoop");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionAccess().getPatternModificationsPatternModificationParserRuleCall_5_0());
				}
				lv_patternModifications_6_0=rulePatternModification
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionRule());
					}
					add(
						$current,
						"patternModifications",
						lv_patternModifications_6_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternModification");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRulePatternLoop
entryRulePatternLoop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternLoopRule()); }
	iv_rulePatternLoop=rulePatternLoop
	{ $current=$iv_rulePatternLoop.current; }
	EOF;

// Rule PatternLoop
rulePatternLoop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPatternLoopRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPatternLoopAccess().getPatternPatternCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternLoopAccess().getLoopNumberEIntParserRuleCall_1_0());
				}
				lv_loopNumber_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternLoopRule());
					}
					set(
						$current,
						"loopNumber",
						lv_loopNumber_1_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='times'
		{
			newLeafNode(otherlv_2, grammarAccess.getPatternLoopAccess().getTimesKeyword_2());
		}
	)
;

// Entry rule entryRulePatternModification
entryRulePatternModification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternModificationRule()); }
	iv_rulePatternModification=rulePatternModification
	{ $current=$iv_rulePatternModification.current; }
	EOF;

// Rule PatternModification
rulePatternModification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPatternModificationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPatternModificationAccess().getPatternPatternCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='(iteration:'
		{
			newLeafNode(otherlv_1, grammarAccess.getPatternModificationAccess().getIterationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternModificationAccess().getIterationEIntParserRuleCall_2_0());
				}
				lv_iteration_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternModificationRule());
					}
					set(
						$current,
						"iteration",
						lv_iteration_2_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=',beat:'
		{
			newLeafNode(otherlv_3, grammarAccess.getPatternModificationAccess().getBeatKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternModificationAccess().getBeatNumberEIntParserRuleCall_4_0());
				}
				lv_beatNumber_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternModificationRule());
					}
					set(
						$current,
						"beatNumber",
						lv_beatNumber_4_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='):'
		{
			newLeafNode(otherlv_5, grammarAccess.getPatternModificationAccess().getRightParenthesisColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternModificationAccess().getBeatBeatParserRuleCall_6_0());
				}
				lv_beat_6_0=ruleBeat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternModificationRule());
					}
					set(
						$current,
						"beat",
						lv_beat_6_0,
						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
	}
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Rule Note
ruleNote returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='bd'
			{
				$current = grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sd'
			{
				$current = grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='_'
			{
				$current = grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='ch'
			{
				$current = grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='oh'
			{
				$current = grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='cc'
			{
				$current = grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='rc'
			{
				$current = grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
