/*
 * generated by Xtext 2.14.0
 */
package com.polytech.unice.borduino.concretesyntax.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.polytech.unice.borduino.concretesyntax.ide.contentassist.antlr.internal.InternalBorduinoParser;
import com.polytech.unice.borduino.concretesyntax.services.BorduinoGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class BorduinoParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BorduinoGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BorduinoGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBrickAccess().getAlternatives(), "rule__Brick__Alternatives");
			builder.put(grammarAccess.getBrickAccess().getAlternatives_0_0(), "rule__Brick__Alternatives_0_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getSignalAccess().getAlternatives(), "rule__Signal__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getDigitalSignalEnumAccess().getAlternatives(), "rule__DigitalSignalEnum__Alternatives");
			builder.put(grammarAccess.getAppAccess().getGroup(), "rule__App__Group__0");
			builder.put(grammarAccess.getBrickAccess().getGroup_0(), "rule__Brick__Group_0__0");
			builder.put(grammarAccess.getBrickAccess().getGroup_1(), "rule__Brick__Group_1__0");
			builder.put(grammarAccess.getBrickAccess().getGroup_2(), "rule__Brick__Group_2__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup(), "rule__Actuator__Group__0");
			builder.put(grammarAccess.getLCDScreenActuatorAccess().getGroup(), "rule__LCDScreenActuator__Group__0");
			builder.put(grammarAccess.getKeyboardSensorAccess().getGroup(), "rule__KeyboardSensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getInitialConditionAccess().getGroup(), "rule__InitialCondition__Group__0");
			builder.put(grammarAccess.getAppAccess().getNameAssignment_1(), "rule__App__NameAssignment_1");
			builder.put(grammarAccess.getAppAccess().getInitialAssignment_3(), "rule__App__InitialAssignment_3");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_6(), "rule__App__BricksAssignment_6");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_7(), "rule__App__BricksAssignment_7");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_9(), "rule__App__StatesAssignment_9");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_10(), "rule__App__StatesAssignment_10");
			builder.put(grammarAccess.getBrickAccess().getNameAssignment_0_1(), "rule__Brick__NameAssignment_0_1");
			builder.put(grammarAccess.getBrickAccess().getPinsAssignment_0_3(), "rule__Brick__PinsAssignment_0_3");
			builder.put(grammarAccess.getBrickAccess().getPinsAssignment_0_4(), "rule__Brick__PinsAssignment_0_4");
			builder.put(grammarAccess.getBrickAccess().getNameAssignment_1_1(), "rule__Brick__NameAssignment_1_1");
			builder.put(grammarAccess.getBrickAccess().getPinsAssignment_1_3(), "rule__Brick__PinsAssignment_1_3");
			builder.put(grammarAccess.getBrickAccess().getPinsAssignment_1_4(), "rule__Brick__PinsAssignment_1_4");
			builder.put(grammarAccess.getBrickAccess().getNameAssignment_2_1(), "rule__Brick__NameAssignment_2_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0(), "rule__State__NameAssignment_0");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_2(), "rule__State__ActionsAssignment_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_3(), "rule__State__ActionsAssignment_3");
			builder.put(grammarAccess.getStateAccess().getTransitionAssignment_4(), "rule__State__TransitionAssignment_4");
			builder.put(grammarAccess.getActionAccess().getActuatorAssignment_0(), "rule__Action__ActuatorAssignment_0");
			builder.put(grammarAccess.getActionAccess().getValueAssignment_2(), "rule__Action__ValueAssignment_2");
			builder.put(grammarAccess.getTransitionAccess().getConditionsAssignment_0(), "rule__Transition__ConditionsAssignment_0");
			builder.put(grammarAccess.getTransitionAccess().getConditionsAssignment_1(), "rule__Transition__ConditionsAssignment_1");
			builder.put(grammarAccess.getTransitionAccess().getNextAssignment_3(), "rule__Transition__NextAssignment_3");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_0(), "rule__Condition__OperatorAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getSensorAssignment_1(), "rule__Condition__SensorAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getSignalAssignment_3(), "rule__Condition__SignalAssignment_3");
			builder.put(grammarAccess.getInitialConditionAccess().getSensorAssignment_0(), "rule__InitialCondition__SensorAssignment_0");
			builder.put(grammarAccess.getInitialConditionAccess().getSignalAssignment_2(), "rule__InitialCondition__SignalAssignment_2");
			builder.put(grammarAccess.getDigitalSignalAccess().getValueAssignment(), "rule__DigitalSignal__ValueAssignment");
			builder.put(grammarAccess.getStringSignalAccess().getValueAssignment(), "rule__StringSignal__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BorduinoGrammarAccess grammarAccess;

	@Override
	protected InternalBorduinoParser createParser() {
		InternalBorduinoParser result = new InternalBorduinoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BorduinoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BorduinoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
