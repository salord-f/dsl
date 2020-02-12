/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.dsl.rhythm.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RhythmGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RhythmElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.Rhythm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRhythmKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTempoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBPMAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBPMEIntParserRuleCall_3_0 = (RuleCall)cBPMAssignment_3.eContents().get(0);
		private final Keyword cBPMKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cResolutionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cResolutionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cResolutionEIntParserRuleCall_6_0 = (RuleCall)cResolutionAssignment_6.eContents().get(0);
		private final Keyword cOffsetKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cOffsetAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOffsetEFloatParserRuleCall_8_0 = (RuleCall)cOffsetAssignment_8.eContents().get(0);
		private final Keyword cTickKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTracksAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTracksTrackParserRuleCall_10_0 = (RuleCall)cTracksAssignment_10.eContents().get(0);
		private final Assignment cTracksAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cTracksTrackParserRuleCall_11_0 = (RuleCall)cTracksAssignment_11.eContents().get(0);
		
		//Rhythm:
		//	'rhythm' name=EString 'tempo' BPM=EInt 'BPM'
		//	'resolution:' resolution=EInt
		//	'offset:' offset=EFloat 'tick'
		//	tracks+=Track
		//	tracks+=Track*;
		@Override public ParserRule getRule() { return rule; }
		
		//'rhythm' name=EString 'tempo' BPM=EInt 'BPM' 'resolution:' resolution=EInt 'offset:' offset=EFloat 'tick' tracks+=Track
		//tracks+=Track*
		public Group getGroup() { return cGroup; }
		
		//'rhythm'
		public Keyword getRhythmKeyword_0() { return cRhythmKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'tempo'
		public Keyword getTempoKeyword_2() { return cTempoKeyword_2; }
		
		//BPM=EInt
		public Assignment getBPMAssignment_3() { return cBPMAssignment_3; }
		
		//EInt
		public RuleCall getBPMEIntParserRuleCall_3_0() { return cBPMEIntParserRuleCall_3_0; }
		
		//'BPM'
		public Keyword getBPMKeyword_4() { return cBPMKeyword_4; }
		
		//'resolution:'
		public Keyword getResolutionKeyword_5() { return cResolutionKeyword_5; }
		
		//resolution=EInt
		public Assignment getResolutionAssignment_6() { return cResolutionAssignment_6; }
		
		//EInt
		public RuleCall getResolutionEIntParserRuleCall_6_0() { return cResolutionEIntParserRuleCall_6_0; }
		
		//'offset:'
		public Keyword getOffsetKeyword_7() { return cOffsetKeyword_7; }
		
		//offset=EFloat
		public Assignment getOffsetAssignment_8() { return cOffsetAssignment_8; }
		
		//EFloat
		public RuleCall getOffsetEFloatParserRuleCall_8_0() { return cOffsetEFloatParserRuleCall_8_0; }
		
		//'tick'
		public Keyword getTickKeyword_9() { return cTickKeyword_9; }
		
		//tracks+=Track
		public Assignment getTracksAssignment_10() { return cTracksAssignment_10; }
		
		//Track
		public RuleCall getTracksTrackParserRuleCall_10_0() { return cTracksTrackParserRuleCall_10_0; }
		
		//tracks+=Track*
		public Assignment getTracksAssignment_11() { return cTracksAssignment_11; }
		
		//Track
		public RuleCall getTracksTrackParserRuleCall_11_0() { return cTracksTrackParserRuleCall_11_0; }
	}
	public class TrackElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.Track");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTrackKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPatternsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPatternsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPatternsPatternParserRuleCall_3_1_0 = (RuleCall)cPatternsAssignment_3_1.eContents().get(0);
		private final Assignment cPatternsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cPatternsPatternParserRuleCall_3_2_0 = (RuleCall)cPatternsAssignment_3_2.eContents().get(0);
		private final Keyword cSectionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSectionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSectionsSectionParserRuleCall_5_0 = (RuleCall)cSectionsAssignment_5.eContents().get(0);
		private final Assignment cSectionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSectionsSectionParserRuleCall_6_0 = (RuleCall)cSectionsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Track:
		//	'track' name=EString
		//	'{' ('patterns:'
		//	patterns+=Pattern
		//	patterns+=Pattern*)?
		//	'sections:'
		//	sections+=Section
		//	sections+=Section*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'track' name=EString '{' ('patterns:' patterns+=Pattern patterns+=Pattern*)? 'sections:' sections+=Section
		//sections+=Section* '}'
		public Group getGroup() { return cGroup; }
		
		//'track'
		public Keyword getTrackKeyword_0() { return cTrackKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('patterns:' patterns+=Pattern patterns+=Pattern*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'patterns:'
		public Keyword getPatternsKeyword_3_0() { return cPatternsKeyword_3_0; }
		
		//patterns+=Pattern
		public Assignment getPatternsAssignment_3_1() { return cPatternsAssignment_3_1; }
		
		//Pattern
		public RuleCall getPatternsPatternParserRuleCall_3_1_0() { return cPatternsPatternParserRuleCall_3_1_0; }
		
		//patterns+=Pattern*
		public Assignment getPatternsAssignment_3_2() { return cPatternsAssignment_3_2; }
		
		//Pattern
		public RuleCall getPatternsPatternParserRuleCall_3_2_0() { return cPatternsPatternParserRuleCall_3_2_0; }
		
		//'sections:'
		public Keyword getSectionsKeyword_4() { return cSectionsKeyword_4; }
		
		//sections+=Section
		public Assignment getSectionsAssignment_5() { return cSectionsAssignment_5; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_5_0() { return cSectionsSectionParserRuleCall_5_0; }
		
		//sections+=Section*
		public Assignment getSectionsAssignment_6() { return cSectionsAssignment_6; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_6_0() { return cSectionsSectionParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class PatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.Pattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBeatKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBeatsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBeatsBeatParserRuleCall_3_0 = (RuleCall)cBeatsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBeatKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBeatsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBeatsBeatParserRuleCall_4_1_0 = (RuleCall)cBeatsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Pattern:
		//	name=EString
		//	'{'
		//	'beat:' beats+=Beat ('beat:' beats+=Beat)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString '{' 'beat:' beats+=Beat ('beat:' beats+=Beat)* '}'
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'beat:'
		public Keyword getBeatKeyword_2() { return cBeatKeyword_2; }
		
		//beats+=Beat
		public Assignment getBeatsAssignment_3() { return cBeatsAssignment_3; }
		
		//Beat
		public RuleCall getBeatsBeatParserRuleCall_3_0() { return cBeatsBeatParserRuleCall_3_0; }
		
		//('beat:' beats+=Beat)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'beat:'
		public Keyword getBeatKeyword_4_0() { return cBeatKeyword_4_0; }
		
		//beats+=Beat
		public Assignment getBeatsAssignment_4_1() { return cBeatsAssignment_4_1; }
		
		//Beat
		public RuleCall getBeatsBeatParserRuleCall_4_1_0() { return cBeatsBeatParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class BeatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTicksAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTicksNoteEnumRuleCall_0_0 = (RuleCall)cTicksAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTicksAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTicksNoteEnumRuleCall_1_1_0 = (RuleCall)cTicksAssignment_1_1.eContents().get(0);
		
		//Beat:
		//	ticks+=Note (',' ticks+=Note)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ticks+=Note (',' ticks+=Note)*
		public Group getGroup() { return cGroup; }
		
		//ticks+=Note
		public Assignment getTicksAssignment_0() { return cTicksAssignment_0; }
		
		//Note
		public RuleCall getTicksNoteEnumRuleCall_0_0() { return cTicksNoteEnumRuleCall_0_0; }
		
		//(',' ticks+=Note)*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//ticks+=Note
		public Assignment getTicksAssignment_1_1() { return cTicksAssignment_1_1; }
		
		//Note
		public RuleCall getTicksNoteEnumRuleCall_1_1_0() { return cTicksNoteEnumRuleCall_1_1_0; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPatternKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPatternLoopsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPatternLoopsPatternLoopParserRuleCall_3_0 = (RuleCall)cPatternLoopsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPatternLoopsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPatternLoopsPatternLoopParserRuleCall_4_1_0 = (RuleCall)cPatternLoopsAssignment_4_1.eContents().get(0);
		private final Assignment cPatternModificationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPatternModificationsPatternModificationParserRuleCall_5_0 = (RuleCall)cPatternModificationsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Section:
		//	name=EString
		//	'{'
		//	'pattern:' patternLoops+=PatternLoop (',' patternLoops+=PatternLoop)*
		//	patternModifications+=PatternModification*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString '{' 'pattern:' patternLoops+=PatternLoop (',' patternLoops+=PatternLoop)*
		//patternModifications+=PatternModification* '}'
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'pattern:'
		public Keyword getPatternKeyword_2() { return cPatternKeyword_2; }
		
		//patternLoops+=PatternLoop
		public Assignment getPatternLoopsAssignment_3() { return cPatternLoopsAssignment_3; }
		
		//PatternLoop
		public RuleCall getPatternLoopsPatternLoopParserRuleCall_3_0() { return cPatternLoopsPatternLoopParserRuleCall_3_0; }
		
		//(',' patternLoops+=PatternLoop)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//patternLoops+=PatternLoop
		public Assignment getPatternLoopsAssignment_4_1() { return cPatternLoopsAssignment_4_1; }
		
		//PatternLoop
		public RuleCall getPatternLoopsPatternLoopParserRuleCall_4_1_0() { return cPatternLoopsPatternLoopParserRuleCall_4_1_0; }
		
		//patternModifications+=PatternModification*
		public Assignment getPatternModificationsAssignment_5() { return cPatternModificationsAssignment_5; }
		
		//PatternModification
		public RuleCall getPatternModificationsPatternModificationParserRuleCall_5_0() { return cPatternModificationsPatternModificationParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class PatternLoopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternLoop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPatternAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPatternPatternCrossReference_0_0 = (CrossReference)cPatternAssignment_0.eContents().get(0);
		private final RuleCall cPatternPatternEStringParserRuleCall_0_0_1 = (RuleCall)cPatternPatternCrossReference_0_0.eContents().get(1);
		private final Assignment cLoopNumberAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLoopNumberEIntParserRuleCall_1_0 = (RuleCall)cLoopNumberAssignment_1.eContents().get(0);
		private final Keyword cTimesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PatternLoop:
		//	pattern=[Pattern|EString] loopNumber=EInt 'times';
		@Override public ParserRule getRule() { return rule; }
		
		//pattern=[Pattern|EString] loopNumber=EInt 'times'
		public Group getGroup() { return cGroup; }
		
		//pattern=[Pattern|EString]
		public Assignment getPatternAssignment_0() { return cPatternAssignment_0; }
		
		//[Pattern|EString]
		public CrossReference getPatternPatternCrossReference_0_0() { return cPatternPatternCrossReference_0_0; }
		
		//EString
		public RuleCall getPatternPatternEStringParserRuleCall_0_0_1() { return cPatternPatternEStringParserRuleCall_0_0_1; }
		
		//loopNumber=EInt
		public Assignment getLoopNumberAssignment_1() { return cLoopNumberAssignment_1; }
		
		//EInt
		public RuleCall getLoopNumberEIntParserRuleCall_1_0() { return cLoopNumberEIntParserRuleCall_1_0; }
		
		//'times'
		public Keyword getTimesKeyword_2() { return cTimesKeyword_2; }
	}
	public class PatternModificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternModification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPatternAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPatternPatternCrossReference_0_0 = (CrossReference)cPatternAssignment_0.eContents().get(0);
		private final RuleCall cPatternPatternEStringParserRuleCall_0_0_1 = (RuleCall)cPatternPatternCrossReference_0_0.eContents().get(1);
		private final Keyword cIterationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIterationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIterationEIntParserRuleCall_2_0 = (RuleCall)cIterationAssignment_2.eContents().get(0);
		private final Keyword cBeatKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBeatNumberAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBeatNumberEIntParserRuleCall_4_0 = (RuleCall)cBeatNumberAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBeatAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBeatBeatParserRuleCall_6_0 = (RuleCall)cBeatAssignment_6.eContents().get(0);
		
		//PatternModification:
		//	pattern=[Pattern|EString] '(iteration:' iteration=EInt ',beat:' beatNumber=EInt '):' beat=Beat;
		@Override public ParserRule getRule() { return rule; }
		
		//pattern=[Pattern|EString] '(iteration:' iteration=EInt ',beat:' beatNumber=EInt '):' beat=Beat
		public Group getGroup() { return cGroup; }
		
		//pattern=[Pattern|EString]
		public Assignment getPatternAssignment_0() { return cPatternAssignment_0; }
		
		//[Pattern|EString]
		public CrossReference getPatternPatternCrossReference_0_0() { return cPatternPatternCrossReference_0_0; }
		
		//EString
		public RuleCall getPatternPatternEStringParserRuleCall_0_0_1() { return cPatternPatternEStringParserRuleCall_0_0_1; }
		
		//'(iteration:'
		public Keyword getIterationKeyword_1() { return cIterationKeyword_1; }
		
		//iteration=EInt
		public Assignment getIterationAssignment_2() { return cIterationAssignment_2; }
		
		//EInt
		public RuleCall getIterationEIntParserRuleCall_2_0() { return cIterationEIntParserRuleCall_2_0; }
		
		//',beat:'
		public Keyword getBeatKeyword_3() { return cBeatKeyword_3; }
		
		//beatNumber=EInt
		public Assignment getBeatNumberAssignment_4() { return cBeatNumberAssignment_4; }
		
		//EInt
		public RuleCall getBeatNumberEIntParserRuleCall_4_0() { return cBeatNumberEIntParserRuleCall_4_0; }
		
		//'):'
		public Keyword getRightParenthesisColonKeyword_5() { return cRightParenthesisColonKeyword_5; }
		
		//beat=Beat
		public Assignment getBeatAssignment_6() { return cBeatAssignment_6; }
		
		//Beat
		public RuleCall getBeatBeatParserRuleCall_6_0() { return cBeatBeatParserRuleCall_6_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EInt ecore::EInt:
		//	INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class EFloatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.EFloat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//EFloat ecore::EFloat:
		//	INT '.' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT '.' INT
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	
	public class NoteElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.dsl.rhythm.Rhythm.Note");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBDBdKeyword_0_0 = (Keyword)cBDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSDSdKeyword_1_0 = (Keyword)cSDEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBLANKEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBLANK_Keyword_2_0 = (Keyword)cBLANKEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCHEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCHChKeyword_3_0 = (Keyword)cCHEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cOHEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cOHOhKeyword_4_0 = (Keyword)cOHEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cCCEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cCCCcKeyword_5_0 = (Keyword)cCCEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cRCEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cRCRcKeyword_6_0 = (Keyword)cRCEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum Note returns DRUM_NOTES:
		//	BD="bd" | SD="sd" | BLANK="_" | CH="ch" | OH="oh" | CC="cc" | RC="rc";
		public EnumRule getRule() { return rule; }
		
		//BD="bd" | SD="sd" | BLANK="_" | CH="ch" | OH="oh" | CC="cc" | RC="rc"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BD="bd"
		public EnumLiteralDeclaration getBDEnumLiteralDeclaration_0() { return cBDEnumLiteralDeclaration_0; }
		
		//"bd"
		public Keyword getBDBdKeyword_0_0() { return cBDBdKeyword_0_0; }
		
		//SD="sd"
		public EnumLiteralDeclaration getSDEnumLiteralDeclaration_1() { return cSDEnumLiteralDeclaration_1; }
		
		//"sd"
		public Keyword getSDSdKeyword_1_0() { return cSDSdKeyword_1_0; }
		
		//BLANK="_"
		public EnumLiteralDeclaration getBLANKEnumLiteralDeclaration_2() { return cBLANKEnumLiteralDeclaration_2; }
		
		//"_"
		public Keyword getBLANK_Keyword_2_0() { return cBLANK_Keyword_2_0; }
		
		//CH="ch"
		public EnumLiteralDeclaration getCHEnumLiteralDeclaration_3() { return cCHEnumLiteralDeclaration_3; }
		
		//"ch"
		public Keyword getCHChKeyword_3_0() { return cCHChKeyword_3_0; }
		
		//OH="oh"
		public EnumLiteralDeclaration getOHEnumLiteralDeclaration_4() { return cOHEnumLiteralDeclaration_4; }
		
		//"oh"
		public Keyword getOHOhKeyword_4_0() { return cOHOhKeyword_4_0; }
		
		//CC="cc"
		public EnumLiteralDeclaration getCCEnumLiteralDeclaration_5() { return cCCEnumLiteralDeclaration_5; }
		
		//"cc"
		public Keyword getCCCcKeyword_5_0() { return cCCCcKeyword_5_0; }
		
		//RC="rc"
		public EnumLiteralDeclaration getRCEnumLiteralDeclaration_6() { return cRCEnumLiteralDeclaration_6; }
		
		//"rc"
		public Keyword getRCRcKeyword_6_0() { return cRCRcKeyword_6_0; }
	}
	
	private final RhythmElements pRhythm;
	private final TrackElements pTrack;
	private final PatternElements pPattern;
	private final BeatElements pBeat;
	private final SectionElements pSection;
	private final PatternLoopElements pPatternLoop;
	private final PatternModificationElements pPatternModification;
	private final NoteElements eNote;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final EFloatElements pEFloat;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RhythmGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRhythm = new RhythmElements();
		this.pTrack = new TrackElements();
		this.pPattern = new PatternElements();
		this.pBeat = new BeatElements();
		this.pSection = new SectionElements();
		this.pPatternLoop = new PatternLoopElements();
		this.pPatternModification = new PatternModificationElements();
		this.eNote = new NoteElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pEFloat = new EFloatElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.polytech.si5.dsl.rhythm.Rhythm".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Rhythm:
	//	'rhythm' name=EString 'tempo' BPM=EInt 'BPM'
	//	'resolution:' resolution=EInt
	//	'offset:' offset=EFloat 'tick'
	//	tracks+=Track
	//	tracks+=Track*;
	public RhythmElements getRhythmAccess() {
		return pRhythm;
	}
	
	public ParserRule getRhythmRule() {
		return getRhythmAccess().getRule();
	}
	
	//Track:
	//	'track' name=EString
	//	'{' ('patterns:'
	//	patterns+=Pattern
	//	patterns+=Pattern*)?
	//	'sections:'
	//	sections+=Section
	//	sections+=Section*
	//	'}';
	public TrackElements getTrackAccess() {
		return pTrack;
	}
	
	public ParserRule getTrackRule() {
		return getTrackAccess().getRule();
	}
	
	//Pattern:
	//	name=EString
	//	'{'
	//	'beat:' beats+=Beat ('beat:' beats+=Beat)*
	//	'}';
	public PatternElements getPatternAccess() {
		return pPattern;
	}
	
	public ParserRule getPatternRule() {
		return getPatternAccess().getRule();
	}
	
	//Beat:
	//	ticks+=Note (',' ticks+=Note)*;
	public BeatElements getBeatAccess() {
		return pBeat;
	}
	
	public ParserRule getBeatRule() {
		return getBeatAccess().getRule();
	}
	
	//Section:
	//	name=EString
	//	'{'
	//	'pattern:' patternLoops+=PatternLoop (',' patternLoops+=PatternLoop)*
	//	patternModifications+=PatternModification*
	//	'}';
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//PatternLoop:
	//	pattern=[Pattern|EString] loopNumber=EInt 'times';
	public PatternLoopElements getPatternLoopAccess() {
		return pPatternLoop;
	}
	
	public ParserRule getPatternLoopRule() {
		return getPatternLoopAccess().getRule();
	}
	
	//PatternModification:
	//	pattern=[Pattern|EString] '(iteration:' iteration=EInt ',beat:' beatNumber=EInt '):' beat=Beat;
	public PatternModificationElements getPatternModificationAccess() {
		return pPatternModification;
	}
	
	public ParserRule getPatternModificationRule() {
		return getPatternModificationAccess().getRule();
	}
	
	//enum Note returns DRUM_NOTES:
	//	BD="bd" | SD="sd" | BLANK="_" | CH="ch" | OH="oh" | CC="cc" | RC="rc";
	public NoteElements getNoteAccess() {
		return eNote;
	}
	
	public EnumRule getNoteRule() {
		return getNoteAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EFloat ecore::EFloat:
	//	INT '.' INT;
	public EFloatElements getEFloatAccess() {
		return pEFloat;
	}
	
	public ParserRule getEFloatRule() {
		return getEFloatAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
