/*
 * generated by Xtext 2.14.0
 */
grammar InternalBorduino;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.polytech.unice.borduino.concretesyntax.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.polytech.unice.borduino.concretesyntax.parser.antlr.internal;

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
import com.polytech.unice.borduino.concretesyntax.services.BorduinoGrammarAccess;

}

@parser::members {

 	private BorduinoGrammarAccess grammarAccess;

    public InternalBorduinoParser(TokenStream input, BorduinoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "App";
   	}

   	@Override
   	protected BorduinoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleApp
entryRuleApp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppRule()); }
	iv_ruleApp=ruleApp
	{ $current=$iv_ruleApp.current; }
	EOF;

// Rule App
ruleApp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='app'
		{
			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='initial state'
		{
			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialStateKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAppRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4());
		}
		otherlv_5='bricks'
		{
			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0());
				}
				lv_bricks_6_0=ruleBrick
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_6_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Brick");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0());
				}
				lv_bricks_7_0=ruleBrick
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_7_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Brick");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='states'
		{
			newLeafNode(otherlv_8, grammarAccess.getAppAccess().getStatesKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0());
				}
				lv_states_9_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"states",
						lv_states_9_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0());
				}
				lv_states_10_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"states",
						lv_states_10_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleBrick
entryRuleBrick returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBrickRule()); }
	iv_ruleBrick=ruleBrick
	{ $current=$iv_ruleBrick.current; }
	EOF;

// Rule Brick
ruleBrick returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0());
				}
				this_Actuator_0=ruleActuator
				{
					$current = $this_Actuator_0.current;
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0_1());
				}
				this_Sensor_1=ruleSensor
				{
					$current = $this_Sensor_1.current;
					afterParserOrEnumRuleCall();
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0());
					}
					lv_name_2_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						set(
							$current,
							"name",
							lv_name_2_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_3_0());
					}
					lv_pins_4_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						add(
							$current,
							"pins",
							lv_pins_4_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_4_0());
					}
					lv_pins_5_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						add(
							$current,
							"pins",
							lv_pins_5_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			{
				newCompositeNode(grammarAccess.getBrickAccess().getLCDScreenActuatorParserRuleCall_1_0());
			}
			this_LCDScreenActuator_6=ruleLCDScreenActuator
			{
				$current = $this_LCDScreenActuator_6.current;
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0());
					}
					lv_name_7_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						set(
							$current,
							"name",
							lv_name_7_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_8=':'
			{
				newLeafNode(otherlv_8, grammarAccess.getBrickAccess().getColonKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_3_0());
					}
					lv_pins_9_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						add(
							$current,
							"pins",
							lv_pins_9_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_4_0());
					}
					lv_pins_10_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						add(
							$current,
							"pins",
							lv_pins_10_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			{
				newCompositeNode(grammarAccess.getBrickAccess().getKeyboardSensorParserRuleCall_2_0());
			}
			this_KeyboardSensor_11=ruleKeyboardSensor
			{
				$current = $this_KeyboardSensor_11.current;
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_1_0());
					}
					lv_name_12_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBrickRule());
						}
						set(
							$current,
							"name",
							lv_name_12_0,
							"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	iv_ruleActuator=ruleActuator
	{ $current=$iv_ruleActuator.current; }
	EOF;

// Rule Actuator
ruleActuator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActuatorAccess().getActuatorAction_0(),
					$current);
			}
		)
		otherlv_1='actuator'
		{
			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
		}
	)
;

// Entry rule entryRuleLCDScreenActuator
entryRuleLCDScreenActuator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLCDScreenActuatorRule()); }
	iv_ruleLCDScreenActuator=ruleLCDScreenActuator
	{ $current=$iv_ruleLCDScreenActuator.current; }
	EOF;

// Rule LCDScreenActuator
ruleLCDScreenActuator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLCDScreenActuatorAccess().getLCDScreenActuatorAction_0(),
					$current);
			}
		)
		otherlv_1='screenActuator'
		{
			newLeafNode(otherlv_1, grammarAccess.getLCDScreenActuatorAccess().getScreenActuatorKeyword_1());
		}
	)
;

// Entry rule entryRuleKeyboardSensor
entryRuleKeyboardSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeyboardSensorRule()); }
	iv_ruleKeyboardSensor=ruleKeyboardSensor
	{ $current=$iv_ruleKeyboardSensor.current; }
	EOF;

// Rule KeyboardSensor
ruleKeyboardSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getKeyboardSensorAccess().getKeyboardSensorAction_0(),
					$current);
			}
		)
		otherlv_1='keyboardSensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getKeyboardSensorAccess().getKeyboardSensorKeyword_1());
		}
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSensorAccess().getSensorAction_0(),
					$current);
			}
		)
		otherlv_1='sensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
		}
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
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
				}
				lv_actions_3_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_3_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0());
				}
				lv_transition_4_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"transition",
						lv_transition_4_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getActionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAccess().getValueSignalParserRuleCall_2_0());
				}
				lv_value_2_0=ruleSignal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Signal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getTransitionAccess().getConditionsInitialConditionParserRuleCall_0_0());
				}
				lv_conditions_0_0=ruleInitialCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					add(
						$current,
						"conditions",
						lv_conditions_0_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.InitialCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0());
				}
				lv_conditions_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					add(
						$current,
						"conditions",
						lv_conditions_1_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorEnumRuleCall_0_0());
				}
				lv_operator_0_0=ruleOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"operator",
						lv_operator_0_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Operator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConditionAccess().getSensorSensorCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getSignalSignalParserRuleCall_3_0());
				}
				lv_signal_3_0=ruleSignal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"signal",
						lv_signal_3_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Signal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInitialCondition
entryRuleInitialCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitialConditionRule()); }
	iv_ruleInitialCondition=ruleInitialCondition
	{ $current=$iv_ruleInitialCondition.current; }
	EOF;

// Rule InitialCondition
ruleInitialCondition returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getInitialConditionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInitialConditionAccess().getSensorSensorCrossReference_0_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getInitialConditionAccess().getIsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialConditionAccess().getSignalSignalParserRuleCall_2_0());
				}
				lv_signal_2_0=ruleSignal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialConditionRule());
					}
					set(
						$current,
						"signal",
						lv_signal_2_0,
						"com.polytech.unice.borduino.concretesyntax.Borduino.Signal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSignal
entryRuleSignal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSignalRule()); }
	iv_ruleSignal=ruleSignal
	{ $current=$iv_ruleSignal.current; }
	EOF;

// Rule Signal
ruleSignal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSignalAccess().getDigitalSignalParserRuleCall_0());
		}
		this_DigitalSignal_0=ruleDigitalSignal
		{
			$current = $this_DigitalSignal_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSignalAccess().getStringSignalParserRuleCall_1());
		}
		this_StringSignal_1=ruleStringSignal
		{
			$current = $this_StringSignal_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDigitalSignal
entryRuleDigitalSignal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDigitalSignalRule()); }
	iv_ruleDigitalSignal=ruleDigitalSignal
	{ $current=$iv_ruleDigitalSignal.current; }
	EOF;

// Rule DigitalSignal
ruleDigitalSignal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDigitalSignalAccess().getValueDigitalSignalEnumEnumRuleCall_0());
			}
			lv_value_0_0=ruleDigitalSignalEnum
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDigitalSignalRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"com.polytech.unice.borduino.concretesyntax.Borduino.DigitalSignalEnum");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleStringSignal
entryRuleStringSignal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringSignalRule()); }
	iv_ruleStringSignal=ruleStringSignal
	{ $current=$iv_ruleStringSignal.current; }
	EOF;

// Rule StringSignal
ruleStringSignal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStringSignalAccess().getValueEStringParserRuleCall_0());
			}
			lv_value_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStringSignalRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Rule Operator
ruleOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='and'
			{
				$current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='or'
			{
				$current = grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule DigitalSignalEnum
ruleDigitalSignalEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='HIGH'
			{
				$current = grammarAccess.getDigitalSignalEnumAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDigitalSignalEnumAccess().getHIGHEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LOW'
			{
				$current = grammarAccess.getDigitalSignalEnumAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDigitalSignalEnumAccess().getLOWEnumLiteralDeclaration_1());
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