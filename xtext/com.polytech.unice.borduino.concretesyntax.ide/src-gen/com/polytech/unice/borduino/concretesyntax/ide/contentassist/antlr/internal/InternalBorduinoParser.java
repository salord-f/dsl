package com.polytech.unice.borduino.concretesyntax.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.polytech.unice.borduino.concretesyntax.services.BorduinoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBorduinoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'HIGH'", "'LOW'", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'actuator'", "'screenActuator'", "'keyboardSensor'", "'sensor'", "'-'", "'is'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBorduinoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBorduinoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBorduinoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBorduino.g"; }


    	private BorduinoGrammarAccess grammarAccess;

    	public void setGrammarAccess(BorduinoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApp"
    // InternalBorduino.g:53:1: entryRuleApp : ruleApp EOF ;
    public final void entryRuleApp() throws RecognitionException {
        try {
            // InternalBorduino.g:54:1: ( ruleApp EOF )
            // InternalBorduino.g:55:1: ruleApp EOF
            {
             before(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            ruleApp();

            state._fsp--;

             after(grammarAccess.getAppRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalBorduino.g:62:1: ruleApp : ( ( rule__App__Group__0 ) ) ;
    public final void ruleApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:66:2: ( ( ( rule__App__Group__0 ) ) )
            // InternalBorduino.g:67:2: ( ( rule__App__Group__0 ) )
            {
            // InternalBorduino.g:67:2: ( ( rule__App__Group__0 ) )
            // InternalBorduino.g:68:3: ( rule__App__Group__0 )
            {
             before(grammarAccess.getAppAccess().getGroup()); 
            // InternalBorduino.g:69:3: ( rule__App__Group__0 )
            // InternalBorduino.g:69:4: rule__App__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalBorduino.g:78:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // InternalBorduino.g:79:1: ( ruleBrick EOF )
            // InternalBorduino.g:80:1: ruleBrick EOF
            {
             before(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getBrickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalBorduino.g:87:1: ruleBrick : ( ( rule__Brick__Alternatives ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:91:2: ( ( ( rule__Brick__Alternatives ) ) )
            // InternalBorduino.g:92:2: ( ( rule__Brick__Alternatives ) )
            {
            // InternalBorduino.g:92:2: ( ( rule__Brick__Alternatives ) )
            // InternalBorduino.g:93:3: ( rule__Brick__Alternatives )
            {
             before(grammarAccess.getBrickAccess().getAlternatives()); 
            // InternalBorduino.g:94:3: ( rule__Brick__Alternatives )
            // InternalBorduino.g:94:4: rule__Brick__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleActuator"
    // InternalBorduino.g:103:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalBorduino.g:104:1: ( ruleActuator EOF )
            // InternalBorduino.g:105:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalBorduino.g:112:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:116:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalBorduino.g:117:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalBorduino.g:117:2: ( ( rule__Actuator__Group__0 ) )
            // InternalBorduino.g:118:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalBorduino.g:119:3: ( rule__Actuator__Group__0 )
            // InternalBorduino.g:119:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleLCDScreenActuator"
    // InternalBorduino.g:128:1: entryRuleLCDScreenActuator : ruleLCDScreenActuator EOF ;
    public final void entryRuleLCDScreenActuator() throws RecognitionException {
        try {
            // InternalBorduino.g:129:1: ( ruleLCDScreenActuator EOF )
            // InternalBorduino.g:130:1: ruleLCDScreenActuator EOF
            {
             before(grammarAccess.getLCDScreenActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleLCDScreenActuator();

            state._fsp--;

             after(grammarAccess.getLCDScreenActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLCDScreenActuator"


    // $ANTLR start "ruleLCDScreenActuator"
    // InternalBorduino.g:137:1: ruleLCDScreenActuator : ( ( rule__LCDScreenActuator__Group__0 ) ) ;
    public final void ruleLCDScreenActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:141:2: ( ( ( rule__LCDScreenActuator__Group__0 ) ) )
            // InternalBorduino.g:142:2: ( ( rule__LCDScreenActuator__Group__0 ) )
            {
            // InternalBorduino.g:142:2: ( ( rule__LCDScreenActuator__Group__0 ) )
            // InternalBorduino.g:143:3: ( rule__LCDScreenActuator__Group__0 )
            {
             before(grammarAccess.getLCDScreenActuatorAccess().getGroup()); 
            // InternalBorduino.g:144:3: ( rule__LCDScreenActuator__Group__0 )
            // InternalBorduino.g:144:4: rule__LCDScreenActuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LCDScreenActuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLCDScreenActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLCDScreenActuator"


    // $ANTLR start "entryRuleKeyboardSensor"
    // InternalBorduino.g:153:1: entryRuleKeyboardSensor : ruleKeyboardSensor EOF ;
    public final void entryRuleKeyboardSensor() throws RecognitionException {
        try {
            // InternalBorduino.g:154:1: ( ruleKeyboardSensor EOF )
            // InternalBorduino.g:155:1: ruleKeyboardSensor EOF
            {
             before(grammarAccess.getKeyboardSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyboardSensor();

            state._fsp--;

             after(grammarAccess.getKeyboardSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyboardSensor"


    // $ANTLR start "ruleKeyboardSensor"
    // InternalBorduino.g:162:1: ruleKeyboardSensor : ( ( rule__KeyboardSensor__Group__0 ) ) ;
    public final void ruleKeyboardSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:166:2: ( ( ( rule__KeyboardSensor__Group__0 ) ) )
            // InternalBorduino.g:167:2: ( ( rule__KeyboardSensor__Group__0 ) )
            {
            // InternalBorduino.g:167:2: ( ( rule__KeyboardSensor__Group__0 ) )
            // InternalBorduino.g:168:3: ( rule__KeyboardSensor__Group__0 )
            {
             before(grammarAccess.getKeyboardSensorAccess().getGroup()); 
            // InternalBorduino.g:169:3: ( rule__KeyboardSensor__Group__0 )
            // InternalBorduino.g:169:4: rule__KeyboardSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyboardSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyboardSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyboardSensor"


    // $ANTLR start "entryRuleSensor"
    // InternalBorduino.g:178:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalBorduino.g:179:1: ( ruleSensor EOF )
            // InternalBorduino.g:180:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalBorduino.g:187:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:191:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalBorduino.g:192:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalBorduino.g:192:2: ( ( rule__Sensor__Group__0 ) )
            // InternalBorduino.g:193:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalBorduino.g:194:3: ( rule__Sensor__Group__0 )
            // InternalBorduino.g:194:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEString"
    // InternalBorduino.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBorduino.g:204:1: ( ruleEString EOF )
            // InternalBorduino.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBorduino.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBorduino.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBorduino.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalBorduino.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBorduino.g:219:3: ( rule__EString__Alternatives )
            // InternalBorduino.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalBorduino.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBorduino.g:229:1: ( ruleEInt EOF )
            // InternalBorduino.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBorduino.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBorduino.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBorduino.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalBorduino.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBorduino.g:244:3: ( rule__EInt__Group__0 )
            // InternalBorduino.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleState"
    // InternalBorduino.g:253:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalBorduino.g:254:1: ( ruleState EOF )
            // InternalBorduino.g:255:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalBorduino.g:262:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:266:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalBorduino.g:267:2: ( ( rule__State__Group__0 ) )
            {
            // InternalBorduino.g:267:2: ( ( rule__State__Group__0 ) )
            // InternalBorduino.g:268:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalBorduino.g:269:3: ( rule__State__Group__0 )
            // InternalBorduino.g:269:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalBorduino.g:278:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBorduino.g:279:1: ( ruleAction EOF )
            // InternalBorduino.g:280:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBorduino.g:287:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:291:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalBorduino.g:292:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalBorduino.g:292:2: ( ( rule__Action__Group__0 ) )
            // InternalBorduino.g:293:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalBorduino.g:294:3: ( rule__Action__Group__0 )
            // InternalBorduino.g:294:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalBorduino.g:303:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalBorduino.g:304:1: ( ruleTransition EOF )
            // InternalBorduino.g:305:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalBorduino.g:312:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:316:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalBorduino.g:317:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalBorduino.g:317:2: ( ( rule__Transition__Group__0 ) )
            // InternalBorduino.g:318:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalBorduino.g:319:3: ( rule__Transition__Group__0 )
            // InternalBorduino.g:319:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCondition"
    // InternalBorduino.g:328:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalBorduino.g:329:1: ( ruleCondition EOF )
            // InternalBorduino.g:330:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalBorduino.g:337:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:341:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalBorduino.g:342:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalBorduino.g:342:2: ( ( rule__Condition__Group__0 ) )
            // InternalBorduino.g:343:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalBorduino.g:344:3: ( rule__Condition__Group__0 )
            // InternalBorduino.g:344:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleInitialCondition"
    // InternalBorduino.g:353:1: entryRuleInitialCondition : ruleInitialCondition EOF ;
    public final void entryRuleInitialCondition() throws RecognitionException {
        try {
            // InternalBorduino.g:354:1: ( ruleInitialCondition EOF )
            // InternalBorduino.g:355:1: ruleInitialCondition EOF
            {
             before(grammarAccess.getInitialConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialCondition();

            state._fsp--;

             after(grammarAccess.getInitialConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialCondition"


    // $ANTLR start "ruleInitialCondition"
    // InternalBorduino.g:362:1: ruleInitialCondition : ( ( rule__InitialCondition__Group__0 ) ) ;
    public final void ruleInitialCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:366:2: ( ( ( rule__InitialCondition__Group__0 ) ) )
            // InternalBorduino.g:367:2: ( ( rule__InitialCondition__Group__0 ) )
            {
            // InternalBorduino.g:367:2: ( ( rule__InitialCondition__Group__0 ) )
            // InternalBorduino.g:368:3: ( rule__InitialCondition__Group__0 )
            {
             before(grammarAccess.getInitialConditionAccess().getGroup()); 
            // InternalBorduino.g:369:3: ( rule__InitialCondition__Group__0 )
            // InternalBorduino.g:369:4: rule__InitialCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialCondition"


    // $ANTLR start "entryRuleSignal"
    // InternalBorduino.g:378:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalBorduino.g:379:1: ( ruleSignal EOF )
            // InternalBorduino.g:380:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalBorduino.g:387:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:391:2: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalBorduino.g:392:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalBorduino.g:392:2: ( ( rule__Signal__Alternatives ) )
            // InternalBorduino.g:393:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalBorduino.g:394:3: ( rule__Signal__Alternatives )
            // InternalBorduino.g:394:4: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleDigitalSignal"
    // InternalBorduino.g:403:1: entryRuleDigitalSignal : ruleDigitalSignal EOF ;
    public final void entryRuleDigitalSignal() throws RecognitionException {
        try {
            // InternalBorduino.g:404:1: ( ruleDigitalSignal EOF )
            // InternalBorduino.g:405:1: ruleDigitalSignal EOF
            {
             before(grammarAccess.getDigitalSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleDigitalSignal();

            state._fsp--;

             after(grammarAccess.getDigitalSignalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDigitalSignal"


    // $ANTLR start "ruleDigitalSignal"
    // InternalBorduino.g:412:1: ruleDigitalSignal : ( ( rule__DigitalSignal__ValueAssignment ) ) ;
    public final void ruleDigitalSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:416:2: ( ( ( rule__DigitalSignal__ValueAssignment ) ) )
            // InternalBorduino.g:417:2: ( ( rule__DigitalSignal__ValueAssignment ) )
            {
            // InternalBorduino.g:417:2: ( ( rule__DigitalSignal__ValueAssignment ) )
            // InternalBorduino.g:418:3: ( rule__DigitalSignal__ValueAssignment )
            {
             before(grammarAccess.getDigitalSignalAccess().getValueAssignment()); 
            // InternalBorduino.g:419:3: ( rule__DigitalSignal__ValueAssignment )
            // InternalBorduino.g:419:4: rule__DigitalSignal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSignal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSignalAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDigitalSignal"


    // $ANTLR start "entryRuleStringSignal"
    // InternalBorduino.g:428:1: entryRuleStringSignal : ruleStringSignal EOF ;
    public final void entryRuleStringSignal() throws RecognitionException {
        try {
            // InternalBorduino.g:429:1: ( ruleStringSignal EOF )
            // InternalBorduino.g:430:1: ruleStringSignal EOF
            {
             before(grammarAccess.getStringSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleStringSignal();

            state._fsp--;

             after(grammarAccess.getStringSignalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringSignal"


    // $ANTLR start "ruleStringSignal"
    // InternalBorduino.g:437:1: ruleStringSignal : ( ( rule__StringSignal__ValueAssignment ) ) ;
    public final void ruleStringSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:441:2: ( ( ( rule__StringSignal__ValueAssignment ) ) )
            // InternalBorduino.g:442:2: ( ( rule__StringSignal__ValueAssignment ) )
            {
            // InternalBorduino.g:442:2: ( ( rule__StringSignal__ValueAssignment ) )
            // InternalBorduino.g:443:3: ( rule__StringSignal__ValueAssignment )
            {
             before(grammarAccess.getStringSignalAccess().getValueAssignment()); 
            // InternalBorduino.g:444:3: ( rule__StringSignal__ValueAssignment )
            // InternalBorduino.g:444:4: rule__StringSignal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringSignal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringSignalAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringSignal"


    // $ANTLR start "ruleOperator"
    // InternalBorduino.g:453:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:457:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalBorduino.g:458:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalBorduino.g:458:2: ( ( rule__Operator__Alternatives ) )
            // InternalBorduino.g:459:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalBorduino.g:460:3: ( rule__Operator__Alternatives )
            // InternalBorduino.g:460:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleDigitalSignalEnum"
    // InternalBorduino.g:469:1: ruleDigitalSignalEnum : ( ( rule__DigitalSignalEnum__Alternatives ) ) ;
    public final void ruleDigitalSignalEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:473:1: ( ( ( rule__DigitalSignalEnum__Alternatives ) ) )
            // InternalBorduino.g:474:2: ( ( rule__DigitalSignalEnum__Alternatives ) )
            {
            // InternalBorduino.g:474:2: ( ( rule__DigitalSignalEnum__Alternatives ) )
            // InternalBorduino.g:475:3: ( rule__DigitalSignalEnum__Alternatives )
            {
             before(grammarAccess.getDigitalSignalEnumAccess().getAlternatives()); 
            // InternalBorduino.g:476:3: ( rule__DigitalSignalEnum__Alternatives )
            // InternalBorduino.g:476:4: rule__DigitalSignalEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DigitalSignalEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDigitalSignalEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDigitalSignalEnum"


    // $ANTLR start "rule__Brick__Alternatives"
    // InternalBorduino.g:484:1: rule__Brick__Alternatives : ( ( ( rule__Brick__Group_0__0 ) ) | ( ( rule__Brick__Group_1__0 ) ) | ( ( rule__Brick__Group_2__0 ) ) );
    public final void rule__Brick__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:488:1: ( ( ( rule__Brick__Group_0__0 ) ) | ( ( rule__Brick__Group_1__0 ) ) | ( ( rule__Brick__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
            case 25:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBorduino.g:489:2: ( ( rule__Brick__Group_0__0 ) )
                    {
                    // InternalBorduino.g:489:2: ( ( rule__Brick__Group_0__0 ) )
                    // InternalBorduino.g:490:3: ( rule__Brick__Group_0__0 )
                    {
                     before(grammarAccess.getBrickAccess().getGroup_0()); 
                    // InternalBorduino.g:491:3: ( rule__Brick__Group_0__0 )
                    // InternalBorduino.g:491:4: rule__Brick__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBrickAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:495:2: ( ( rule__Brick__Group_1__0 ) )
                    {
                    // InternalBorduino.g:495:2: ( ( rule__Brick__Group_1__0 ) )
                    // InternalBorduino.g:496:3: ( rule__Brick__Group_1__0 )
                    {
                     before(grammarAccess.getBrickAccess().getGroup_1()); 
                    // InternalBorduino.g:497:3: ( rule__Brick__Group_1__0 )
                    // InternalBorduino.g:497:4: rule__Brick__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBrickAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBorduino.g:501:2: ( ( rule__Brick__Group_2__0 ) )
                    {
                    // InternalBorduino.g:501:2: ( ( rule__Brick__Group_2__0 ) )
                    // InternalBorduino.g:502:3: ( rule__Brick__Group_2__0 )
                    {
                     before(grammarAccess.getBrickAccess().getGroup_2()); 
                    // InternalBorduino.g:503:3: ( rule__Brick__Group_2__0 )
                    // InternalBorduino.g:503:4: rule__Brick__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBrickAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Alternatives"


    // $ANTLR start "rule__Brick__Alternatives_0_0"
    // InternalBorduino.g:511:1: rule__Brick__Alternatives_0_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__Brick__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:515:1: ( ( ruleActuator ) | ( ruleSensor ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBorduino.g:516:2: ( ruleActuator )
                    {
                    // InternalBorduino.g:516:2: ( ruleActuator )
                    // InternalBorduino.g:517:3: ruleActuator
                    {
                     before(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:522:2: ( ruleSensor )
                    {
                    // InternalBorduino.g:522:2: ( ruleSensor )
                    // InternalBorduino.g:523:3: ruleSensor
                    {
                     before(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Alternatives_0_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBorduino.g:532:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:536:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBorduino.g:537:2: ( RULE_STRING )
                    {
                    // InternalBorduino.g:537:2: ( RULE_STRING )
                    // InternalBorduino.g:538:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:543:2: ( RULE_ID )
                    {
                    // InternalBorduino.g:543:2: ( RULE_ID )
                    // InternalBorduino.g:544:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Signal__Alternatives"
    // InternalBorduino.g:553:1: rule__Signal__Alternatives : ( ( ruleDigitalSignal ) | ( ruleStringSignal ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:557:1: ( ( ruleDigitalSignal ) | ( ruleStringSignal ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBorduino.g:558:2: ( ruleDigitalSignal )
                    {
                    // InternalBorduino.g:558:2: ( ruleDigitalSignal )
                    // InternalBorduino.g:559:3: ruleDigitalSignal
                    {
                     before(grammarAccess.getSignalAccess().getDigitalSignalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDigitalSignal();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getDigitalSignalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:564:2: ( ruleStringSignal )
                    {
                    // InternalBorduino.g:564:2: ( ruleStringSignal )
                    // InternalBorduino.g:565:3: ruleStringSignal
                    {
                     before(grammarAccess.getSignalAccess().getStringSignalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringSignal();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getStringSignalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalBorduino.g:574:1: rule__Operator__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:578:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBorduino.g:579:2: ( ( 'and' ) )
                    {
                    // InternalBorduino.g:579:2: ( ( 'and' ) )
                    // InternalBorduino.g:580:3: ( 'and' )
                    {
                     before(grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalBorduino.g:581:3: ( 'and' )
                    // InternalBorduino.g:581:4: 'and'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:585:2: ( ( 'or' ) )
                    {
                    // InternalBorduino.g:585:2: ( ( 'or' ) )
                    // InternalBorduino.g:586:3: ( 'or' )
                    {
                     before(grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalBorduino.g:587:3: ( 'or' )
                    // InternalBorduino.g:587:4: 'or'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__DigitalSignalEnum__Alternatives"
    // InternalBorduino.g:595:1: rule__DigitalSignalEnum__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__DigitalSignalEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:599:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBorduino.g:600:2: ( ( 'HIGH' ) )
                    {
                    // InternalBorduino.g:600:2: ( ( 'HIGH' ) )
                    // InternalBorduino.g:601:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getDigitalSignalEnumAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalBorduino.g:602:3: ( 'HIGH' )
                    // InternalBorduino.g:602:4: 'HIGH'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDigitalSignalEnumAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:606:2: ( ( 'LOW' ) )
                    {
                    // InternalBorduino.g:606:2: ( ( 'LOW' ) )
                    // InternalBorduino.g:607:3: ( 'LOW' )
                    {
                     before(grammarAccess.getDigitalSignalEnumAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalBorduino.g:608:3: ( 'LOW' )
                    // InternalBorduino.g:608:4: 'LOW'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDigitalSignalEnumAccess().getLOWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSignalEnum__Alternatives"


    // $ANTLR start "rule__App__Group__0"
    // InternalBorduino.g:616:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:620:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalBorduino.g:621:2: rule__App__Group__0__Impl rule__App__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0"


    // $ANTLR start "rule__App__Group__0__Impl"
    // InternalBorduino.g:628:1: rule__App__Group__0__Impl : ( 'app' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:632:1: ( ( 'app' ) )
            // InternalBorduino.g:633:1: ( 'app' )
            {
            // InternalBorduino.g:633:1: ( 'app' )
            // InternalBorduino.g:634:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0__Impl"


    // $ANTLR start "rule__App__Group__1"
    // InternalBorduino.g:643:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:647:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalBorduino.g:648:2: rule__App__Group__1__Impl rule__App__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__App__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1"


    // $ANTLR start "rule__App__Group__1__Impl"
    // InternalBorduino.g:655:1: rule__App__Group__1__Impl : ( ( rule__App__NameAssignment_1 ) ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:659:1: ( ( ( rule__App__NameAssignment_1 ) ) )
            // InternalBorduino.g:660:1: ( ( rule__App__NameAssignment_1 ) )
            {
            // InternalBorduino.g:660:1: ( ( rule__App__NameAssignment_1 ) )
            // InternalBorduino.g:661:2: ( rule__App__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1()); 
            // InternalBorduino.g:662:2: ( rule__App__NameAssignment_1 )
            // InternalBorduino.g:662:3: rule__App__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__App__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1__Impl"


    // $ANTLR start "rule__App__Group__2"
    // InternalBorduino.g:670:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:674:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalBorduino.g:675:2: rule__App__Group__2__Impl rule__App__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2"


    // $ANTLR start "rule__App__Group__2__Impl"
    // InternalBorduino.g:682:1: rule__App__Group__2__Impl : ( 'initial state' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:686:1: ( ( 'initial state' ) )
            // InternalBorduino.g:687:1: ( 'initial state' )
            {
            // InternalBorduino.g:687:1: ( 'initial state' )
            // InternalBorduino.g:688:2: 'initial state'
            {
             before(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2__Impl"


    // $ANTLR start "rule__App__Group__3"
    // InternalBorduino.g:697:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:701:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalBorduino.g:702:2: rule__App__Group__3__Impl rule__App__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__App__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3"


    // $ANTLR start "rule__App__Group__3__Impl"
    // InternalBorduino.g:709:1: rule__App__Group__3__Impl : ( ( rule__App__InitialAssignment_3 ) ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:713:1: ( ( ( rule__App__InitialAssignment_3 ) ) )
            // InternalBorduino.g:714:1: ( ( rule__App__InitialAssignment_3 ) )
            {
            // InternalBorduino.g:714:1: ( ( rule__App__InitialAssignment_3 ) )
            // InternalBorduino.g:715:2: ( rule__App__InitialAssignment_3 )
            {
             before(grammarAccess.getAppAccess().getInitialAssignment_3()); 
            // InternalBorduino.g:716:2: ( rule__App__InitialAssignment_3 )
            // InternalBorduino.g:716:3: rule__App__InitialAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__App__InitialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getInitialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3__Impl"


    // $ANTLR start "rule__App__Group__4"
    // InternalBorduino.g:724:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:728:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalBorduino.g:729:2: rule__App__Group__4__Impl rule__App__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__App__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4"


    // $ANTLR start "rule__App__Group__4__Impl"
    // InternalBorduino.g:736:1: rule__App__Group__4__Impl : ( '{' ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:740:1: ( ( '{' ) )
            // InternalBorduino.g:741:1: ( '{' )
            {
            // InternalBorduino.g:741:1: ( '{' )
            // InternalBorduino.g:742:2: '{'
            {
             before(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4__Impl"


    // $ANTLR start "rule__App__Group__5"
    // InternalBorduino.g:751:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:755:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalBorduino.g:756:2: rule__App__Group__5__Impl rule__App__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__App__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5"


    // $ANTLR start "rule__App__Group__5__Impl"
    // InternalBorduino.g:763:1: rule__App__Group__5__Impl : ( 'bricks' ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:767:1: ( ( 'bricks' ) )
            // InternalBorduino.g:768:1: ( 'bricks' )
            {
            // InternalBorduino.g:768:1: ( 'bricks' )
            // InternalBorduino.g:769:2: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getBricksKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5__Impl"


    // $ANTLR start "rule__App__Group__6"
    // InternalBorduino.g:778:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:782:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalBorduino.g:783:2: rule__App__Group__6__Impl rule__App__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6"


    // $ANTLR start "rule__App__Group__6__Impl"
    // InternalBorduino.g:790:1: rule__App__Group__6__Impl : ( ( rule__App__BricksAssignment_6 ) ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:794:1: ( ( ( rule__App__BricksAssignment_6 ) ) )
            // InternalBorduino.g:795:1: ( ( rule__App__BricksAssignment_6 ) )
            {
            // InternalBorduino.g:795:1: ( ( rule__App__BricksAssignment_6 ) )
            // InternalBorduino.g:796:2: ( rule__App__BricksAssignment_6 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_6()); 
            // InternalBorduino.g:797:2: ( rule__App__BricksAssignment_6 )
            // InternalBorduino.g:797:3: rule__App__BricksAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__App__BricksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getBricksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6__Impl"


    // $ANTLR start "rule__App__Group__7"
    // InternalBorduino.g:805:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:809:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalBorduino.g:810:2: rule__App__Group__7__Impl rule__App__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7"


    // $ANTLR start "rule__App__Group__7__Impl"
    // InternalBorduino.g:817:1: rule__App__Group__7__Impl : ( ( rule__App__BricksAssignment_7 )* ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:821:1: ( ( ( rule__App__BricksAssignment_7 )* ) )
            // InternalBorduino.g:822:1: ( ( rule__App__BricksAssignment_7 )* )
            {
            // InternalBorduino.g:822:1: ( ( rule__App__BricksAssignment_7 )* )
            // InternalBorduino.g:823:2: ( rule__App__BricksAssignment_7 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_7()); 
            // InternalBorduino.g:824:2: ( rule__App__BricksAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBorduino.g:824:3: rule__App__BricksAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__BricksAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getBricksAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7__Impl"


    // $ANTLR start "rule__App__Group__8"
    // InternalBorduino.g:832:1: rule__App__Group__8 : rule__App__Group__8__Impl rule__App__Group__9 ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:836:1: ( rule__App__Group__8__Impl rule__App__Group__9 )
            // InternalBorduino.g:837:2: rule__App__Group__8__Impl rule__App__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8"


    // $ANTLR start "rule__App__Group__8__Impl"
    // InternalBorduino.g:844:1: rule__App__Group__8__Impl : ( 'states' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:848:1: ( ( 'states' ) )
            // InternalBorduino.g:849:1: ( 'states' )
            {
            // InternalBorduino.g:849:1: ( 'states' )
            // InternalBorduino.g:850:2: 'states'
            {
             before(grammarAccess.getAppAccess().getStatesKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getStatesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8__Impl"


    // $ANTLR start "rule__App__Group__9"
    // InternalBorduino.g:859:1: rule__App__Group__9 : rule__App__Group__9__Impl rule__App__Group__10 ;
    public final void rule__App__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:863:1: ( rule__App__Group__9__Impl rule__App__Group__10 )
            // InternalBorduino.g:864:2: rule__App__Group__9__Impl rule__App__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__App__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__9"


    // $ANTLR start "rule__App__Group__9__Impl"
    // InternalBorduino.g:871:1: rule__App__Group__9__Impl : ( ( rule__App__StatesAssignment_9 ) ) ;
    public final void rule__App__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:875:1: ( ( ( rule__App__StatesAssignment_9 ) ) )
            // InternalBorduino.g:876:1: ( ( rule__App__StatesAssignment_9 ) )
            {
            // InternalBorduino.g:876:1: ( ( rule__App__StatesAssignment_9 ) )
            // InternalBorduino.g:877:2: ( rule__App__StatesAssignment_9 )
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_9()); 
            // InternalBorduino.g:878:2: ( rule__App__StatesAssignment_9 )
            // InternalBorduino.g:878:3: rule__App__StatesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__App__StatesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getStatesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__9__Impl"


    // $ANTLR start "rule__App__Group__10"
    // InternalBorduino.g:886:1: rule__App__Group__10 : rule__App__Group__10__Impl rule__App__Group__11 ;
    public final void rule__App__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:890:1: ( rule__App__Group__10__Impl rule__App__Group__11 )
            // InternalBorduino.g:891:2: rule__App__Group__10__Impl rule__App__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__App__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__10"


    // $ANTLR start "rule__App__Group__10__Impl"
    // InternalBorduino.g:898:1: rule__App__Group__10__Impl : ( ( rule__App__StatesAssignment_10 )* ) ;
    public final void rule__App__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:902:1: ( ( ( rule__App__StatesAssignment_10 )* ) )
            // InternalBorduino.g:903:1: ( ( rule__App__StatesAssignment_10 )* )
            {
            // InternalBorduino.g:903:1: ( ( rule__App__StatesAssignment_10 )* )
            // InternalBorduino.g:904:2: ( rule__App__StatesAssignment_10 )*
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_10()); 
            // InternalBorduino.g:905:2: ( rule__App__StatesAssignment_10 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBorduino.g:905:3: rule__App__StatesAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__StatesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getStatesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__10__Impl"


    // $ANTLR start "rule__App__Group__11"
    // InternalBorduino.g:913:1: rule__App__Group__11 : rule__App__Group__11__Impl ;
    public final void rule__App__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:917:1: ( rule__App__Group__11__Impl )
            // InternalBorduino.g:918:2: rule__App__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__11"


    // $ANTLR start "rule__App__Group__11__Impl"
    // InternalBorduino.g:924:1: rule__App__Group__11__Impl : ( '}' ) ;
    public final void rule__App__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:928:1: ( ( '}' ) )
            // InternalBorduino.g:929:1: ( '}' )
            {
            // InternalBorduino.g:929:1: ( '}' )
            // InternalBorduino.g:930:2: '}'
            {
             before(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__11__Impl"


    // $ANTLR start "rule__Brick__Group_0__0"
    // InternalBorduino.g:940:1: rule__Brick__Group_0__0 : rule__Brick__Group_0__0__Impl rule__Brick__Group_0__1 ;
    public final void rule__Brick__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:944:1: ( rule__Brick__Group_0__0__Impl rule__Brick__Group_0__1 )
            // InternalBorduino.g:945:2: rule__Brick__Group_0__0__Impl rule__Brick__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Brick__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__0"


    // $ANTLR start "rule__Brick__Group_0__0__Impl"
    // InternalBorduino.g:952:1: rule__Brick__Group_0__0__Impl : ( ( rule__Brick__Alternatives_0_0 ) ) ;
    public final void rule__Brick__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:956:1: ( ( ( rule__Brick__Alternatives_0_0 ) ) )
            // InternalBorduino.g:957:1: ( ( rule__Brick__Alternatives_0_0 ) )
            {
            // InternalBorduino.g:957:1: ( ( rule__Brick__Alternatives_0_0 ) )
            // InternalBorduino.g:958:2: ( rule__Brick__Alternatives_0_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0_0()); 
            // InternalBorduino.g:959:2: ( rule__Brick__Alternatives_0_0 )
            // InternalBorduino.g:959:3: rule__Brick__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__0__Impl"


    // $ANTLR start "rule__Brick__Group_0__1"
    // InternalBorduino.g:967:1: rule__Brick__Group_0__1 : rule__Brick__Group_0__1__Impl rule__Brick__Group_0__2 ;
    public final void rule__Brick__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:971:1: ( rule__Brick__Group_0__1__Impl rule__Brick__Group_0__2 )
            // InternalBorduino.g:972:2: rule__Brick__Group_0__1__Impl rule__Brick__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Brick__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__1"


    // $ANTLR start "rule__Brick__Group_0__1__Impl"
    // InternalBorduino.g:979:1: rule__Brick__Group_0__1__Impl : ( ( rule__Brick__NameAssignment_0_1 ) ) ;
    public final void rule__Brick__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:983:1: ( ( ( rule__Brick__NameAssignment_0_1 ) ) )
            // InternalBorduino.g:984:1: ( ( rule__Brick__NameAssignment_0_1 ) )
            {
            // InternalBorduino.g:984:1: ( ( rule__Brick__NameAssignment_0_1 ) )
            // InternalBorduino.g:985:2: ( rule__Brick__NameAssignment_0_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_0_1()); 
            // InternalBorduino.g:986:2: ( rule__Brick__NameAssignment_0_1 )
            // InternalBorduino.g:986:3: rule__Brick__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__1__Impl"


    // $ANTLR start "rule__Brick__Group_0__2"
    // InternalBorduino.g:994:1: rule__Brick__Group_0__2 : rule__Brick__Group_0__2__Impl rule__Brick__Group_0__3 ;
    public final void rule__Brick__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:998:1: ( rule__Brick__Group_0__2__Impl rule__Brick__Group_0__3 )
            // InternalBorduino.g:999:2: rule__Brick__Group_0__2__Impl rule__Brick__Group_0__3
            {
            pushFollow(FOLLOW_13);
            rule__Brick__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__2"


    // $ANTLR start "rule__Brick__Group_0__2__Impl"
    // InternalBorduino.g:1006:1: rule__Brick__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1010:1: ( ( ':' ) )
            // InternalBorduino.g:1011:1: ( ':' )
            {
            // InternalBorduino.g:1011:1: ( ':' )
            // InternalBorduino.g:1012:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__2__Impl"


    // $ANTLR start "rule__Brick__Group_0__3"
    // InternalBorduino.g:1021:1: rule__Brick__Group_0__3 : rule__Brick__Group_0__3__Impl rule__Brick__Group_0__4 ;
    public final void rule__Brick__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1025:1: ( rule__Brick__Group_0__3__Impl rule__Brick__Group_0__4 )
            // InternalBorduino.g:1026:2: rule__Brick__Group_0__3__Impl rule__Brick__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__Brick__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__3"


    // $ANTLR start "rule__Brick__Group_0__3__Impl"
    // InternalBorduino.g:1033:1: rule__Brick__Group_0__3__Impl : ( ( rule__Brick__PinsAssignment_0_3 ) ) ;
    public final void rule__Brick__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1037:1: ( ( ( rule__Brick__PinsAssignment_0_3 ) ) )
            // InternalBorduino.g:1038:1: ( ( rule__Brick__PinsAssignment_0_3 ) )
            {
            // InternalBorduino.g:1038:1: ( ( rule__Brick__PinsAssignment_0_3 ) )
            // InternalBorduino.g:1039:2: ( rule__Brick__PinsAssignment_0_3 )
            {
             before(grammarAccess.getBrickAccess().getPinsAssignment_0_3()); 
            // InternalBorduino.g:1040:2: ( rule__Brick__PinsAssignment_0_3 )
            // InternalBorduino.g:1040:3: rule__Brick__PinsAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__PinsAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinsAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__3__Impl"


    // $ANTLR start "rule__Brick__Group_0__4"
    // InternalBorduino.g:1048:1: rule__Brick__Group_0__4 : rule__Brick__Group_0__4__Impl ;
    public final void rule__Brick__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1052:1: ( rule__Brick__Group_0__4__Impl )
            // InternalBorduino.g:1053:2: rule__Brick__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__4"


    // $ANTLR start "rule__Brick__Group_0__4__Impl"
    // InternalBorduino.g:1059:1: rule__Brick__Group_0__4__Impl : ( ( rule__Brick__PinsAssignment_0_4 )* ) ;
    public final void rule__Brick__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1063:1: ( ( ( rule__Brick__PinsAssignment_0_4 )* ) )
            // InternalBorduino.g:1064:1: ( ( rule__Brick__PinsAssignment_0_4 )* )
            {
            // InternalBorduino.g:1064:1: ( ( rule__Brick__PinsAssignment_0_4 )* )
            // InternalBorduino.g:1065:2: ( rule__Brick__PinsAssignment_0_4 )*
            {
             before(grammarAccess.getBrickAccess().getPinsAssignment_0_4()); 
            // InternalBorduino.g:1066:2: ( rule__Brick__PinsAssignment_0_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBorduino.g:1066:3: rule__Brick__PinsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Brick__PinsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBrickAccess().getPinsAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__4__Impl"


    // $ANTLR start "rule__Brick__Group_1__0"
    // InternalBorduino.g:1075:1: rule__Brick__Group_1__0 : rule__Brick__Group_1__0__Impl rule__Brick__Group_1__1 ;
    public final void rule__Brick__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1079:1: ( rule__Brick__Group_1__0__Impl rule__Brick__Group_1__1 )
            // InternalBorduino.g:1080:2: rule__Brick__Group_1__0__Impl rule__Brick__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Brick__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__0"


    // $ANTLR start "rule__Brick__Group_1__0__Impl"
    // InternalBorduino.g:1087:1: rule__Brick__Group_1__0__Impl : ( ruleLCDScreenActuator ) ;
    public final void rule__Brick__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1091:1: ( ( ruleLCDScreenActuator ) )
            // InternalBorduino.g:1092:1: ( ruleLCDScreenActuator )
            {
            // InternalBorduino.g:1092:1: ( ruleLCDScreenActuator )
            // InternalBorduino.g:1093:2: ruleLCDScreenActuator
            {
             before(grammarAccess.getBrickAccess().getLCDScreenActuatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLCDScreenActuator();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getLCDScreenActuatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__0__Impl"


    // $ANTLR start "rule__Brick__Group_1__1"
    // InternalBorduino.g:1102:1: rule__Brick__Group_1__1 : rule__Brick__Group_1__1__Impl rule__Brick__Group_1__2 ;
    public final void rule__Brick__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1106:1: ( rule__Brick__Group_1__1__Impl rule__Brick__Group_1__2 )
            // InternalBorduino.g:1107:2: rule__Brick__Group_1__1__Impl rule__Brick__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Brick__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__1"


    // $ANTLR start "rule__Brick__Group_1__1__Impl"
    // InternalBorduino.g:1114:1: rule__Brick__Group_1__1__Impl : ( ( rule__Brick__NameAssignment_1_1 ) ) ;
    public final void rule__Brick__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1118:1: ( ( ( rule__Brick__NameAssignment_1_1 ) ) )
            // InternalBorduino.g:1119:1: ( ( rule__Brick__NameAssignment_1_1 ) )
            {
            // InternalBorduino.g:1119:1: ( ( rule__Brick__NameAssignment_1_1 ) )
            // InternalBorduino.g:1120:2: ( rule__Brick__NameAssignment_1_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1_1()); 
            // InternalBorduino.g:1121:2: ( rule__Brick__NameAssignment_1_1 )
            // InternalBorduino.g:1121:3: rule__Brick__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__1__Impl"


    // $ANTLR start "rule__Brick__Group_1__2"
    // InternalBorduino.g:1129:1: rule__Brick__Group_1__2 : rule__Brick__Group_1__2__Impl rule__Brick__Group_1__3 ;
    public final void rule__Brick__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1133:1: ( rule__Brick__Group_1__2__Impl rule__Brick__Group_1__3 )
            // InternalBorduino.g:1134:2: rule__Brick__Group_1__2__Impl rule__Brick__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__Brick__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__2"


    // $ANTLR start "rule__Brick__Group_1__2__Impl"
    // InternalBorduino.g:1141:1: rule__Brick__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1145:1: ( ( ':' ) )
            // InternalBorduino.g:1146:1: ( ':' )
            {
            // InternalBorduino.g:1146:1: ( ':' )
            // InternalBorduino.g:1147:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__2__Impl"


    // $ANTLR start "rule__Brick__Group_1__3"
    // InternalBorduino.g:1156:1: rule__Brick__Group_1__3 : rule__Brick__Group_1__3__Impl rule__Brick__Group_1__4 ;
    public final void rule__Brick__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1160:1: ( rule__Brick__Group_1__3__Impl rule__Brick__Group_1__4 )
            // InternalBorduino.g:1161:2: rule__Brick__Group_1__3__Impl rule__Brick__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Brick__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__3"


    // $ANTLR start "rule__Brick__Group_1__3__Impl"
    // InternalBorduino.g:1168:1: rule__Brick__Group_1__3__Impl : ( ( rule__Brick__PinsAssignment_1_3 ) ) ;
    public final void rule__Brick__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1172:1: ( ( ( rule__Brick__PinsAssignment_1_3 ) ) )
            // InternalBorduino.g:1173:1: ( ( rule__Brick__PinsAssignment_1_3 ) )
            {
            // InternalBorduino.g:1173:1: ( ( rule__Brick__PinsAssignment_1_3 ) )
            // InternalBorduino.g:1174:2: ( rule__Brick__PinsAssignment_1_3 )
            {
             before(grammarAccess.getBrickAccess().getPinsAssignment_1_3()); 
            // InternalBorduino.g:1175:2: ( rule__Brick__PinsAssignment_1_3 )
            // InternalBorduino.g:1175:3: rule__Brick__PinsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__PinsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__3__Impl"


    // $ANTLR start "rule__Brick__Group_1__4"
    // InternalBorduino.g:1183:1: rule__Brick__Group_1__4 : rule__Brick__Group_1__4__Impl ;
    public final void rule__Brick__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1187:1: ( rule__Brick__Group_1__4__Impl )
            // InternalBorduino.g:1188:2: rule__Brick__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__4"


    // $ANTLR start "rule__Brick__Group_1__4__Impl"
    // InternalBorduino.g:1194:1: rule__Brick__Group_1__4__Impl : ( ( rule__Brick__PinsAssignment_1_4 )* ) ;
    public final void rule__Brick__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1198:1: ( ( ( rule__Brick__PinsAssignment_1_4 )* ) )
            // InternalBorduino.g:1199:1: ( ( rule__Brick__PinsAssignment_1_4 )* )
            {
            // InternalBorduino.g:1199:1: ( ( rule__Brick__PinsAssignment_1_4 )* )
            // InternalBorduino.g:1200:2: ( rule__Brick__PinsAssignment_1_4 )*
            {
             before(grammarAccess.getBrickAccess().getPinsAssignment_1_4()); 
            // InternalBorduino.g:1201:2: ( rule__Brick__PinsAssignment_1_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT||LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBorduino.g:1201:3: rule__Brick__PinsAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Brick__PinsAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBrickAccess().getPinsAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__4__Impl"


    // $ANTLR start "rule__Brick__Group_2__0"
    // InternalBorduino.g:1210:1: rule__Brick__Group_2__0 : rule__Brick__Group_2__0__Impl rule__Brick__Group_2__1 ;
    public final void rule__Brick__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1214:1: ( rule__Brick__Group_2__0__Impl rule__Brick__Group_2__1 )
            // InternalBorduino.g:1215:2: rule__Brick__Group_2__0__Impl rule__Brick__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Brick__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_2__0"


    // $ANTLR start "rule__Brick__Group_2__0__Impl"
    // InternalBorduino.g:1222:1: rule__Brick__Group_2__0__Impl : ( ruleKeyboardSensor ) ;
    public final void rule__Brick__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1226:1: ( ( ruleKeyboardSensor ) )
            // InternalBorduino.g:1227:1: ( ruleKeyboardSensor )
            {
            // InternalBorduino.g:1227:1: ( ruleKeyboardSensor )
            // InternalBorduino.g:1228:2: ruleKeyboardSensor
            {
             before(grammarAccess.getBrickAccess().getKeyboardSensorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyboardSensor();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getKeyboardSensorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_2__0__Impl"


    // $ANTLR start "rule__Brick__Group_2__1"
    // InternalBorduino.g:1237:1: rule__Brick__Group_2__1 : rule__Brick__Group_2__1__Impl ;
    public final void rule__Brick__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1241:1: ( rule__Brick__Group_2__1__Impl )
            // InternalBorduino.g:1242:2: rule__Brick__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_2__1"


    // $ANTLR start "rule__Brick__Group_2__1__Impl"
    // InternalBorduino.g:1248:1: rule__Brick__Group_2__1__Impl : ( ( rule__Brick__NameAssignment_2_1 ) ) ;
    public final void rule__Brick__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1252:1: ( ( ( rule__Brick__NameAssignment_2_1 ) ) )
            // InternalBorduino.g:1253:1: ( ( rule__Brick__NameAssignment_2_1 ) )
            {
            // InternalBorduino.g:1253:1: ( ( rule__Brick__NameAssignment_2_1 ) )
            // InternalBorduino.g:1254:2: ( rule__Brick__NameAssignment_2_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_2_1()); 
            // InternalBorduino.g:1255:2: ( rule__Brick__NameAssignment_2_1 )
            // InternalBorduino.g:1255:3: rule__Brick__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_2__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalBorduino.g:1264:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1268:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalBorduino.g:1269:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalBorduino.g:1276:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1280:1: ( ( () ) )
            // InternalBorduino.g:1281:1: ( () )
            {
            // InternalBorduino.g:1281:1: ( () )
            // InternalBorduino.g:1282:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalBorduino.g:1283:2: ()
            // InternalBorduino.g:1283:3: 
            {
            }

             after(grammarAccess.getActuatorAccess().getActuatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalBorduino.g:1291:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1295:1: ( rule__Actuator__Group__1__Impl )
            // InternalBorduino.g:1296:2: rule__Actuator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalBorduino.g:1302:1: rule__Actuator__Group__1__Impl : ( 'actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1306:1: ( ( 'actuator' ) )
            // InternalBorduino.g:1307:1: ( 'actuator' )
            {
            // InternalBorduino.g:1307:1: ( 'actuator' )
            // InternalBorduino.g:1308:2: 'actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__LCDScreenActuator__Group__0"
    // InternalBorduino.g:1318:1: rule__LCDScreenActuator__Group__0 : rule__LCDScreenActuator__Group__0__Impl rule__LCDScreenActuator__Group__1 ;
    public final void rule__LCDScreenActuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1322:1: ( rule__LCDScreenActuator__Group__0__Impl rule__LCDScreenActuator__Group__1 )
            // InternalBorduino.g:1323:2: rule__LCDScreenActuator__Group__0__Impl rule__LCDScreenActuator__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LCDScreenActuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LCDScreenActuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCDScreenActuator__Group__0"


    // $ANTLR start "rule__LCDScreenActuator__Group__0__Impl"
    // InternalBorduino.g:1330:1: rule__LCDScreenActuator__Group__0__Impl : ( () ) ;
    public final void rule__LCDScreenActuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1334:1: ( ( () ) )
            // InternalBorduino.g:1335:1: ( () )
            {
            // InternalBorduino.g:1335:1: ( () )
            // InternalBorduino.g:1336:2: ()
            {
             before(grammarAccess.getLCDScreenActuatorAccess().getLCDScreenActuatorAction_0()); 
            // InternalBorduino.g:1337:2: ()
            // InternalBorduino.g:1337:3: 
            {
            }

             after(grammarAccess.getLCDScreenActuatorAccess().getLCDScreenActuatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCDScreenActuator__Group__0__Impl"


    // $ANTLR start "rule__LCDScreenActuator__Group__1"
    // InternalBorduino.g:1345:1: rule__LCDScreenActuator__Group__1 : rule__LCDScreenActuator__Group__1__Impl ;
    public final void rule__LCDScreenActuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1349:1: ( rule__LCDScreenActuator__Group__1__Impl )
            // InternalBorduino.g:1350:2: rule__LCDScreenActuator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LCDScreenActuator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCDScreenActuator__Group__1"


    // $ANTLR start "rule__LCDScreenActuator__Group__1__Impl"
    // InternalBorduino.g:1356:1: rule__LCDScreenActuator__Group__1__Impl : ( 'screenActuator' ) ;
    public final void rule__LCDScreenActuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1360:1: ( ( 'screenActuator' ) )
            // InternalBorduino.g:1361:1: ( 'screenActuator' )
            {
            // InternalBorduino.g:1361:1: ( 'screenActuator' )
            // InternalBorduino.g:1362:2: 'screenActuator'
            {
             before(grammarAccess.getLCDScreenActuatorAccess().getScreenActuatorKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLCDScreenActuatorAccess().getScreenActuatorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LCDScreenActuator__Group__1__Impl"


    // $ANTLR start "rule__KeyboardSensor__Group__0"
    // InternalBorduino.g:1372:1: rule__KeyboardSensor__Group__0 : rule__KeyboardSensor__Group__0__Impl rule__KeyboardSensor__Group__1 ;
    public final void rule__KeyboardSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1376:1: ( rule__KeyboardSensor__Group__0__Impl rule__KeyboardSensor__Group__1 )
            // InternalBorduino.g:1377:2: rule__KeyboardSensor__Group__0__Impl rule__KeyboardSensor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__KeyboardSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyboardSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyboardSensor__Group__0"


    // $ANTLR start "rule__KeyboardSensor__Group__0__Impl"
    // InternalBorduino.g:1384:1: rule__KeyboardSensor__Group__0__Impl : ( () ) ;
    public final void rule__KeyboardSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1388:1: ( ( () ) )
            // InternalBorduino.g:1389:1: ( () )
            {
            // InternalBorduino.g:1389:1: ( () )
            // InternalBorduino.g:1390:2: ()
            {
             before(grammarAccess.getKeyboardSensorAccess().getKeyboardSensorAction_0()); 
            // InternalBorduino.g:1391:2: ()
            // InternalBorduino.g:1391:3: 
            {
            }

             after(grammarAccess.getKeyboardSensorAccess().getKeyboardSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyboardSensor__Group__0__Impl"


    // $ANTLR start "rule__KeyboardSensor__Group__1"
    // InternalBorduino.g:1399:1: rule__KeyboardSensor__Group__1 : rule__KeyboardSensor__Group__1__Impl ;
    public final void rule__KeyboardSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1403:1: ( rule__KeyboardSensor__Group__1__Impl )
            // InternalBorduino.g:1404:2: rule__KeyboardSensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyboardSensor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyboardSensor__Group__1"


    // $ANTLR start "rule__KeyboardSensor__Group__1__Impl"
    // InternalBorduino.g:1410:1: rule__KeyboardSensor__Group__1__Impl : ( 'keyboardSensor' ) ;
    public final void rule__KeyboardSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1414:1: ( ( 'keyboardSensor' ) )
            // InternalBorduino.g:1415:1: ( 'keyboardSensor' )
            {
            // InternalBorduino.g:1415:1: ( 'keyboardSensor' )
            // InternalBorduino.g:1416:2: 'keyboardSensor'
            {
             before(grammarAccess.getKeyboardSensorAccess().getKeyboardSensorKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getKeyboardSensorAccess().getKeyboardSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyboardSensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalBorduino.g:1426:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1430:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalBorduino.g:1431:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalBorduino.g:1438:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1442:1: ( ( () ) )
            // InternalBorduino.g:1443:1: ( () )
            {
            // InternalBorduino.g:1443:1: ( () )
            // InternalBorduino.g:1444:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalBorduino.g:1445:2: ()
            // InternalBorduino.g:1445:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalBorduino.g:1453:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1457:1: ( rule__Sensor__Group__1__Impl )
            // InternalBorduino.g:1458:2: rule__Sensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalBorduino.g:1464:1: rule__Sensor__Group__1__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1468:1: ( ( 'sensor' ) )
            // InternalBorduino.g:1469:1: ( 'sensor' )
            {
            // InternalBorduino.g:1469:1: ( 'sensor' )
            // InternalBorduino.g:1470:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBorduino.g:1480:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1484:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBorduino.g:1485:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBorduino.g:1492:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1496:1: ( ( ( '-' )? ) )
            // InternalBorduino.g:1497:1: ( ( '-' )? )
            {
            // InternalBorduino.g:1497:1: ( ( '-' )? )
            // InternalBorduino.g:1498:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBorduino.g:1499:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBorduino.g:1499:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBorduino.g:1507:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1511:1: ( rule__EInt__Group__1__Impl )
            // InternalBorduino.g:1512:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBorduino.g:1518:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1522:1: ( ( RULE_INT ) )
            // InternalBorduino.g:1523:1: ( RULE_INT )
            {
            // InternalBorduino.g:1523:1: ( RULE_INT )
            // InternalBorduino.g:1524:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalBorduino.g:1534:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1538:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBorduino.g:1539:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalBorduino.g:1546:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1550:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalBorduino.g:1551:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalBorduino.g:1551:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalBorduino.g:1552:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalBorduino.g:1553:2: ( rule__State__NameAssignment_0 )
            // InternalBorduino.g:1553:3: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalBorduino.g:1561:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1565:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBorduino.g:1566:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalBorduino.g:1573:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1577:1: ( ( '{' ) )
            // InternalBorduino.g:1578:1: ( '{' )
            {
            // InternalBorduino.g:1578:1: ( '{' )
            // InternalBorduino.g:1579:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalBorduino.g:1588:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1592:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBorduino.g:1593:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalBorduino.g:1600:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1604:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalBorduino.g:1605:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalBorduino.g:1605:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalBorduino.g:1606:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalBorduino.g:1607:2: ( rule__State__ActionsAssignment_2 )
            // InternalBorduino.g:1607:3: rule__State__ActionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalBorduino.g:1615:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1619:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBorduino.g:1620:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalBorduino.g:1627:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1631:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalBorduino.g:1632:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalBorduino.g:1632:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalBorduino.g:1633:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalBorduino.g:1634:2: ( rule__State__ActionsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==21) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==21) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalBorduino.g:1634:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalBorduino.g:1642:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1646:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBorduino.g:1647:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalBorduino.g:1654:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1658:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalBorduino.g:1659:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalBorduino.g:1659:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalBorduino.g:1660:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalBorduino.g:1661:2: ( rule__State__TransitionAssignment_4 )
            // InternalBorduino.g:1661:3: rule__State__TransitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalBorduino.g:1669:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1673:1: ( rule__State__Group__5__Impl )
            // InternalBorduino.g:1674:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalBorduino.g:1680:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1684:1: ( ( '}' ) )
            // InternalBorduino.g:1685:1: ( '}' )
            {
            // InternalBorduino.g:1685:1: ( '}' )
            // InternalBorduino.g:1686:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalBorduino.g:1696:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1700:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalBorduino.g:1701:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalBorduino.g:1708:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1712:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalBorduino.g:1713:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalBorduino.g:1713:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalBorduino.g:1714:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalBorduino.g:1715:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalBorduino.g:1715:3: rule__Action__ActuatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActuatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActuatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalBorduino.g:1723:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1727:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalBorduino.g:1728:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalBorduino.g:1735:1: rule__Action__Group__1__Impl : ( ':' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1739:1: ( ( ':' ) )
            // InternalBorduino.g:1740:1: ( ':' )
            {
            // InternalBorduino.g:1740:1: ( ':' )
            // InternalBorduino.g:1741:2: ':'
            {
             before(grammarAccess.getActionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalBorduino.g:1750:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1754:1: ( rule__Action__Group__2__Impl )
            // InternalBorduino.g:1755:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalBorduino.g:1761:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1765:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalBorduino.g:1766:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalBorduino.g:1766:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalBorduino.g:1767:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalBorduino.g:1768:2: ( rule__Action__ValueAssignment_2 )
            // InternalBorduino.g:1768:3: rule__Action__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalBorduino.g:1777:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1781:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBorduino.g:1782:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalBorduino.g:1789:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__ConditionsAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1793:1: ( ( ( rule__Transition__ConditionsAssignment_0 ) ) )
            // InternalBorduino.g:1794:1: ( ( rule__Transition__ConditionsAssignment_0 ) )
            {
            // InternalBorduino.g:1794:1: ( ( rule__Transition__ConditionsAssignment_0 ) )
            // InternalBorduino.g:1795:2: ( rule__Transition__ConditionsAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0()); 
            // InternalBorduino.g:1796:2: ( rule__Transition__ConditionsAssignment_0 )
            // InternalBorduino.g:1796:3: rule__Transition__ConditionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalBorduino.g:1804:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1808:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBorduino.g:1809:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalBorduino.g:1816:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ConditionsAssignment_1 )* ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1820:1: ( ( ( rule__Transition__ConditionsAssignment_1 )* ) )
            // InternalBorduino.g:1821:1: ( ( rule__Transition__ConditionsAssignment_1 )* )
            {
            // InternalBorduino.g:1821:1: ( ( rule__Transition__ConditionsAssignment_1 )* )
            // InternalBorduino.g:1822:2: ( rule__Transition__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1()); 
            // InternalBorduino.g:1823:2: ( rule__Transition__ConditionsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBorduino.g:1823:3: rule__Transition__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transition__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalBorduino.g:1831:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1835:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBorduino.g:1836:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalBorduino.g:1843:1: rule__Transition__Group__2__Impl : ( ':' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1847:1: ( ( ':' ) )
            // InternalBorduino.g:1848:1: ( ':' )
            {
            // InternalBorduino.g:1848:1: ( ':' )
            // InternalBorduino.g:1849:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalBorduino.g:1858:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1862:1: ( rule__Transition__Group__3__Impl )
            // InternalBorduino.g:1863:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalBorduino.g:1869:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__NextAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1873:1: ( ( ( rule__Transition__NextAssignment_3 ) ) )
            // InternalBorduino.g:1874:1: ( ( rule__Transition__NextAssignment_3 ) )
            {
            // InternalBorduino.g:1874:1: ( ( rule__Transition__NextAssignment_3 ) )
            // InternalBorduino.g:1875:2: ( rule__Transition__NextAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_3()); 
            // InternalBorduino.g:1876:2: ( rule__Transition__NextAssignment_3 )
            // InternalBorduino.g:1876:3: rule__Transition__NextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalBorduino.g:1885:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1889:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalBorduino.g:1890:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalBorduino.g:1897:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__OperatorAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1901:1: ( ( ( rule__Condition__OperatorAssignment_0 ) ) )
            // InternalBorduino.g:1902:1: ( ( rule__Condition__OperatorAssignment_0 ) )
            {
            // InternalBorduino.g:1902:1: ( ( rule__Condition__OperatorAssignment_0 ) )
            // InternalBorduino.g:1903:2: ( rule__Condition__OperatorAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_0()); 
            // InternalBorduino.g:1904:2: ( rule__Condition__OperatorAssignment_0 )
            // InternalBorduino.g:1904:3: rule__Condition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalBorduino.g:1912:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1916:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalBorduino.g:1917:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalBorduino.g:1924:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__SensorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1928:1: ( ( ( rule__Condition__SensorAssignment_1 ) ) )
            // InternalBorduino.g:1929:1: ( ( rule__Condition__SensorAssignment_1 ) )
            {
            // InternalBorduino.g:1929:1: ( ( rule__Condition__SensorAssignment_1 ) )
            // InternalBorduino.g:1930:2: ( rule__Condition__SensorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getSensorAssignment_1()); 
            // InternalBorduino.g:1931:2: ( rule__Condition__SensorAssignment_1 )
            // InternalBorduino.g:1931:3: rule__Condition__SensorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__SensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSensorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalBorduino.g:1939:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1943:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalBorduino.g:1944:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalBorduino.g:1951:1: rule__Condition__Group__2__Impl : ( 'is' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1955:1: ( ( 'is' ) )
            // InternalBorduino.g:1956:1: ( 'is' )
            {
            // InternalBorduino.g:1956:1: ( 'is' )
            // InternalBorduino.g:1957:2: 'is'
            {
             before(grammarAccess.getConditionAccess().getIsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalBorduino.g:1966:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1970:1: ( rule__Condition__Group__3__Impl )
            // InternalBorduino.g:1971:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalBorduino.g:1977:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__SignalAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1981:1: ( ( ( rule__Condition__SignalAssignment_3 ) ) )
            // InternalBorduino.g:1982:1: ( ( rule__Condition__SignalAssignment_3 ) )
            {
            // InternalBorduino.g:1982:1: ( ( rule__Condition__SignalAssignment_3 ) )
            // InternalBorduino.g:1983:2: ( rule__Condition__SignalAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getSignalAssignment_3()); 
            // InternalBorduino.g:1984:2: ( rule__Condition__SignalAssignment_3 )
            // InternalBorduino.g:1984:3: rule__Condition__SignalAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__SignalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSignalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__InitialCondition__Group__0"
    // InternalBorduino.g:1993:1: rule__InitialCondition__Group__0 : rule__InitialCondition__Group__0__Impl rule__InitialCondition__Group__1 ;
    public final void rule__InitialCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1997:1: ( rule__InitialCondition__Group__0__Impl rule__InitialCondition__Group__1 )
            // InternalBorduino.g:1998:2: rule__InitialCondition__Group__0__Impl rule__InitialCondition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__InitialCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__Group__0"


    // $ANTLR start "rule__InitialCondition__Group__0__Impl"
    // InternalBorduino.g:2005:1: rule__InitialCondition__Group__0__Impl : ( ( rule__InitialCondition__SensorAssignment_0 ) ) ;
    public final void rule__InitialCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2009:1: ( ( ( rule__InitialCondition__SensorAssignment_0 ) ) )
            // InternalBorduino.g:2010:1: ( ( rule__InitialCondition__SensorAssignment_0 ) )
            {
            // InternalBorduino.g:2010:1: ( ( rule__InitialCondition__SensorAssignment_0 ) )
            // InternalBorduino.g:2011:2: ( rule__InitialCondition__SensorAssignment_0 )
            {
             before(grammarAccess.getInitialConditionAccess().getSensorAssignment_0()); 
            // InternalBorduino.g:2012:2: ( rule__InitialCondition__SensorAssignment_0 )
            // InternalBorduino.g:2012:3: rule__InitialCondition__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InitialCondition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialConditionAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__Group__0__Impl"


    // $ANTLR start "rule__InitialCondition__Group__1"
    // InternalBorduino.g:2020:1: rule__InitialCondition__Group__1 : rule__InitialCondition__Group__1__Impl rule__InitialCondition__Group__2 ;
    public final void rule__InitialCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2024:1: ( rule__InitialCondition__Group__1__Impl rule__InitialCondition__Group__2 )
            // InternalBorduino.g:2025:2: rule__InitialCondition__Group__1__Impl rule__InitialCondition__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__InitialCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__Group__1"


    // $ANTLR start "rule__InitialCondition__Group__1__Impl"
    // InternalBorduino.g:2032:1: rule__InitialCondition__Group__1__Impl : ( 'is' ) ;
    public final void rule__InitialCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2036:1: ( ( 'is' ) )
            // InternalBorduino.g:2037:1: ( 'is' )
            {
            // InternalBorduino.g:2037:1: ( 'is' )
            // InternalBorduino.g:2038:2: 'is'
            {
             before(grammarAccess.getInitialConditionAccess().getIsKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInitialConditionAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__Group__1__Impl"


    // $ANTLR start "rule__InitialCondition__Group__2"
    // InternalBorduino.g:2047:1: rule__InitialCondition__Group__2 : rule__InitialCondition__Group__2__Impl ;
    public final void rule__InitialCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2051:1: ( rule__InitialCondition__Group__2__Impl )
            // InternalBorduino.g:2052:2: rule__InitialCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialCondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__Group__2"


    // $ANTLR start "rule__InitialCondition__Group__2__Impl"
    // InternalBorduino.g:2058:1: rule__InitialCondition__Group__2__Impl : ( ( rule__InitialCondition__SignalAssignment_2 ) ) ;
    public final void rule__InitialCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2062:1: ( ( ( rule__InitialCondition__SignalAssignment_2 ) ) )
            // InternalBorduino.g:2063:1: ( ( rule__InitialCondition__SignalAssignment_2 ) )
            {
            // InternalBorduino.g:2063:1: ( ( rule__InitialCondition__SignalAssignment_2 ) )
            // InternalBorduino.g:2064:2: ( rule__InitialCondition__SignalAssignment_2 )
            {
             before(grammarAccess.getInitialConditionAccess().getSignalAssignment_2()); 
            // InternalBorduino.g:2065:2: ( rule__InitialCondition__SignalAssignment_2 )
            // InternalBorduino.g:2065:3: rule__InitialCondition__SignalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialCondition__SignalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialConditionAccess().getSignalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__Group__2__Impl"


    // $ANTLR start "rule__App__NameAssignment_1"
    // InternalBorduino.g:2074:1: rule__App__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2078:1: ( ( ruleEString ) )
            // InternalBorduino.g:2079:2: ( ruleEString )
            {
            // InternalBorduino.g:2079:2: ( ruleEString )
            // InternalBorduino.g:2080:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__NameAssignment_1"


    // $ANTLR start "rule__App__InitialAssignment_3"
    // InternalBorduino.g:2089:1: rule__App__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__App__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2093:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:2094:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:2094:2: ( ( ruleEString ) )
            // InternalBorduino.g:2095:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
            // InternalBorduino.g:2096:3: ( ruleEString )
            // InternalBorduino.g:2097:4: ruleEString
            {
             before(grammarAccess.getAppAccess().getInitialStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getInitialStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__InitialAssignment_3"


    // $ANTLR start "rule__App__BricksAssignment_6"
    // InternalBorduino.g:2108:1: rule__App__BricksAssignment_6 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2112:1: ( ( ruleBrick ) )
            // InternalBorduino.g:2113:2: ( ruleBrick )
            {
            // InternalBorduino.g:2113:2: ( ruleBrick )
            // InternalBorduino.g:2114:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__BricksAssignment_6"


    // $ANTLR start "rule__App__BricksAssignment_7"
    // InternalBorduino.g:2123:1: rule__App__BricksAssignment_7 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2127:1: ( ( ruleBrick ) )
            // InternalBorduino.g:2128:2: ( ruleBrick )
            {
            // InternalBorduino.g:2128:2: ( ruleBrick )
            // InternalBorduino.g:2129:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__BricksAssignment_7"


    // $ANTLR start "rule__App__StatesAssignment_9"
    // InternalBorduino.g:2138:1: rule__App__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2142:1: ( ( ruleState ) )
            // InternalBorduino.g:2143:2: ( ruleState )
            {
            // InternalBorduino.g:2143:2: ( ruleState )
            // InternalBorduino.g:2144:3: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__StatesAssignment_9"


    // $ANTLR start "rule__App__StatesAssignment_10"
    // InternalBorduino.g:2153:1: rule__App__StatesAssignment_10 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2157:1: ( ( ruleState ) )
            // InternalBorduino.g:2158:2: ( ruleState )
            {
            // InternalBorduino.g:2158:2: ( ruleState )
            // InternalBorduino.g:2159:3: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__StatesAssignment_10"


    // $ANTLR start "rule__Brick__NameAssignment_0_1"
    // InternalBorduino.g:2168:1: rule__Brick__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2172:1: ( ( ruleEString ) )
            // InternalBorduino.g:2173:2: ( ruleEString )
            {
            // InternalBorduino.g:2173:2: ( ruleEString )
            // InternalBorduino.g:2174:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__NameAssignment_0_1"


    // $ANTLR start "rule__Brick__PinsAssignment_0_3"
    // InternalBorduino.g:2183:1: rule__Brick__PinsAssignment_0_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2187:1: ( ( ruleEInt ) )
            // InternalBorduino.g:2188:2: ( ruleEInt )
            {
            // InternalBorduino.g:2188:2: ( ruleEInt )
            // InternalBorduino.g:2189:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinsAssignment_0_3"


    // $ANTLR start "rule__Brick__PinsAssignment_0_4"
    // InternalBorduino.g:2198:1: rule__Brick__PinsAssignment_0_4 : ( ruleEInt ) ;
    public final void rule__Brick__PinsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2202:1: ( ( ruleEInt ) )
            // InternalBorduino.g:2203:2: ( ruleEInt )
            {
            // InternalBorduino.g:2203:2: ( ruleEInt )
            // InternalBorduino.g:2204:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinsAssignment_0_4"


    // $ANTLR start "rule__Brick__NameAssignment_1_1"
    // InternalBorduino.g:2213:1: rule__Brick__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2217:1: ( ( ruleEString ) )
            // InternalBorduino.g:2218:2: ( ruleEString )
            {
            // InternalBorduino.g:2218:2: ( ruleEString )
            // InternalBorduino.g:2219:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__NameAssignment_1_1"


    // $ANTLR start "rule__Brick__PinsAssignment_1_3"
    // InternalBorduino.g:2228:1: rule__Brick__PinsAssignment_1_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2232:1: ( ( ruleEInt ) )
            // InternalBorduino.g:2233:2: ( ruleEInt )
            {
            // InternalBorduino.g:2233:2: ( ruleEInt )
            // InternalBorduino.g:2234:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinsAssignment_1_3"


    // $ANTLR start "rule__Brick__PinsAssignment_1_4"
    // InternalBorduino.g:2243:1: rule__Brick__PinsAssignment_1_4 : ( ruleEInt ) ;
    public final void rule__Brick__PinsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2247:1: ( ( ruleEInt ) )
            // InternalBorduino.g:2248:2: ( ruleEInt )
            {
            // InternalBorduino.g:2248:2: ( ruleEInt )
            // InternalBorduino.g:2249:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinsAssignment_1_4"


    // $ANTLR start "rule__Brick__NameAssignment_2_1"
    // InternalBorduino.g:2258:1: rule__Brick__NameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2262:1: ( ( ruleEString ) )
            // InternalBorduino.g:2263:2: ( ruleEString )
            {
            // InternalBorduino.g:2263:2: ( ruleEString )
            // InternalBorduino.g:2264:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__NameAssignment_2_1"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalBorduino.g:2273:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2277:1: ( ( ruleEString ) )
            // InternalBorduino.g:2278:2: ( ruleEString )
            {
            // InternalBorduino.g:2278:2: ( ruleEString )
            // InternalBorduino.g:2279:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__ActionsAssignment_2"
    // InternalBorduino.g:2288:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2292:1: ( ( ruleAction ) )
            // InternalBorduino.g:2293:2: ( ruleAction )
            {
            // InternalBorduino.g:2293:2: ( ruleAction )
            // InternalBorduino.g:2294:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_2"


    // $ANTLR start "rule__State__ActionsAssignment_3"
    // InternalBorduino.g:2303:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2307:1: ( ( ruleAction ) )
            // InternalBorduino.g:2308:2: ( ruleAction )
            {
            // InternalBorduino.g:2308:2: ( ruleAction )
            // InternalBorduino.g:2309:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_3"


    // $ANTLR start "rule__State__TransitionAssignment_4"
    // InternalBorduino.g:2318:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2322:1: ( ( ruleTransition ) )
            // InternalBorduino.g:2323:2: ( ruleTransition )
            {
            // InternalBorduino.g:2323:2: ( ruleTransition )
            // InternalBorduino.g:2324:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionAssignment_4"


    // $ANTLR start "rule__Action__ActuatorAssignment_0"
    // InternalBorduino.g:2333:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2337:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:2338:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:2338:2: ( ( ruleEString ) )
            // InternalBorduino.g:2339:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalBorduino.g:2340:3: ( ruleEString )
            // InternalBorduino.g:2341:4: ruleEString
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActuatorAssignment_0"


    // $ANTLR start "rule__Action__ValueAssignment_2"
    // InternalBorduino.g:2352:1: rule__Action__ValueAssignment_2 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2356:1: ( ( ruleSignal ) )
            // InternalBorduino.g:2357:2: ( ruleSignal )
            {
            // InternalBorduino.g:2357:2: ( ruleSignal )
            // InternalBorduino.g:2358:3: ruleSignal
            {
             before(grammarAccess.getActionAccess().getValueSignalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getActionAccess().getValueSignalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ValueAssignment_2"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0"
    // InternalBorduino.g:2367:1: rule__Transition__ConditionsAssignment_0 : ( ruleInitialCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2371:1: ( ( ruleInitialCondition ) )
            // InternalBorduino.g:2372:2: ( ruleInitialCondition )
            {
            // InternalBorduino.g:2372:2: ( ruleInitialCondition )
            // InternalBorduino.g:2373:3: ruleInitialCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsInitialConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsInitialConditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_1"
    // InternalBorduino.g:2382:1: rule__Transition__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2386:1: ( ( ruleCondition ) )
            // InternalBorduino.g:2387:2: ( ruleCondition )
            {
            // InternalBorduino.g:2387:2: ( ruleCondition )
            // InternalBorduino.g:2388:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_1"


    // $ANTLR start "rule__Transition__NextAssignment_3"
    // InternalBorduino.g:2397:1: rule__Transition__NextAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2401:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:2402:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:2402:2: ( ( ruleEString ) )
            // InternalBorduino.g:2403:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_3_0()); 
            // InternalBorduino.g:2404:3: ( ruleEString )
            // InternalBorduino.g:2405:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NextAssignment_3"


    // $ANTLR start "rule__Condition__OperatorAssignment_0"
    // InternalBorduino.g:2416:1: rule__Condition__OperatorAssignment_0 : ( ruleOperator ) ;
    public final void rule__Condition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2420:1: ( ( ruleOperator ) )
            // InternalBorduino.g:2421:2: ( ruleOperator )
            {
            // InternalBorduino.g:2421:2: ( ruleOperator )
            // InternalBorduino.g:2422:3: ruleOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_0"


    // $ANTLR start "rule__Condition__SensorAssignment_1"
    // InternalBorduino.g:2431:1: rule__Condition__SensorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Condition__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2435:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:2436:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:2436:2: ( ( ruleEString ) )
            // InternalBorduino.g:2437:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getSensorSensorCrossReference_1_0()); 
            // InternalBorduino.g:2438:3: ( ruleEString )
            // InternalBorduino.g:2439:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getSensorSensorEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSensorSensorEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getSensorSensorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SensorAssignment_1"


    // $ANTLR start "rule__Condition__SignalAssignment_3"
    // InternalBorduino.g:2450:1: rule__Condition__SignalAssignment_3 : ( ruleSignal ) ;
    public final void rule__Condition__SignalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2454:1: ( ( ruleSignal ) )
            // InternalBorduino.g:2455:2: ( ruleSignal )
            {
            // InternalBorduino.g:2455:2: ( ruleSignal )
            // InternalBorduino.g:2456:3: ruleSignal
            {
             before(grammarAccess.getConditionAccess().getSignalSignalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSignalSignalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SignalAssignment_3"


    // $ANTLR start "rule__InitialCondition__SensorAssignment_0"
    // InternalBorduino.g:2465:1: rule__InitialCondition__SensorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__InitialCondition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2469:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:2470:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:2470:2: ( ( ruleEString ) )
            // InternalBorduino.g:2471:3: ( ruleEString )
            {
             before(grammarAccess.getInitialConditionAccess().getSensorSensorCrossReference_0_0()); 
            // InternalBorduino.g:2472:3: ( ruleEString )
            // InternalBorduino.g:2473:4: ruleEString
            {
             before(grammarAccess.getInitialConditionAccess().getSensorSensorEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialConditionAccess().getSensorSensorEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInitialConditionAccess().getSensorSensorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__SensorAssignment_0"


    // $ANTLR start "rule__InitialCondition__SignalAssignment_2"
    // InternalBorduino.g:2484:1: rule__InitialCondition__SignalAssignment_2 : ( ruleSignal ) ;
    public final void rule__InitialCondition__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2488:1: ( ( ruleSignal ) )
            // InternalBorduino.g:2489:2: ( ruleSignal )
            {
            // InternalBorduino.g:2489:2: ( ruleSignal )
            // InternalBorduino.g:2490:3: ruleSignal
            {
             before(grammarAccess.getInitialConditionAccess().getSignalSignalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getInitialConditionAccess().getSignalSignalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialCondition__SignalAssignment_2"


    // $ANTLR start "rule__DigitalSignal__ValueAssignment"
    // InternalBorduino.g:2499:1: rule__DigitalSignal__ValueAssignment : ( ruleDigitalSignalEnum ) ;
    public final void rule__DigitalSignal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2503:1: ( ( ruleDigitalSignalEnum ) )
            // InternalBorduino.g:2504:2: ( ruleDigitalSignalEnum )
            {
            // InternalBorduino.g:2504:2: ( ruleDigitalSignalEnum )
            // InternalBorduino.g:2505:3: ruleDigitalSignalEnum
            {
             before(grammarAccess.getDigitalSignalAccess().getValueDigitalSignalEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDigitalSignalEnum();

            state._fsp--;

             after(grammarAccess.getDigitalSignalAccess().getValueDigitalSignalEnumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DigitalSignal__ValueAssignment"


    // $ANTLR start "rule__StringSignal__ValueAssignment"
    // InternalBorduino.g:2514:1: rule__StringSignal__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringSignal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:2518:1: ( ( ruleEString ) )
            // InternalBorduino.g:2519:2: ( ruleEString )
            {
            // InternalBorduino.g:2519:2: ( ruleEString )
            // InternalBorduino.g:2520:3: ruleEString
            {
             before(grammarAccess.getStringSignalAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringSignalAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringSignal__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C80000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000201800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});

}