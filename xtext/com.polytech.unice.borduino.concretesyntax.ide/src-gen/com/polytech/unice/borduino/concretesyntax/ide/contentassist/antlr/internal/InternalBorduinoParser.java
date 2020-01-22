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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HIGH'", "'LOW'", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'actuator'", "'sensor'", "'-'", "'is'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalBorduino.g:87:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:91:2: ( ( ( rule__Brick__Group__0 ) ) )
            // InternalBorduino.g:92:2: ( ( rule__Brick__Group__0 ) )
            {
            // InternalBorduino.g:92:2: ( ( rule__Brick__Group__0 ) )
            // InternalBorduino.g:93:3: ( rule__Brick__Group__0 )
            {
             before(grammarAccess.getBrickAccess().getGroup()); 
            // InternalBorduino.g:94:3: ( rule__Brick__Group__0 )
            // InternalBorduino.g:94:4: rule__Brick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getGroup()); 

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


    // $ANTLR start "entryRuleSensor"
    // InternalBorduino.g:128:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalBorduino.g:129:1: ( ruleSensor EOF )
            // InternalBorduino.g:130:1: ruleSensor EOF
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
    // InternalBorduino.g:137:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:141:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalBorduino.g:142:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalBorduino.g:142:2: ( ( rule__Sensor__Group__0 ) )
            // InternalBorduino.g:143:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalBorduino.g:144:3: ( rule__Sensor__Group__0 )
            // InternalBorduino.g:144:4: rule__Sensor__Group__0
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
    // InternalBorduino.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBorduino.g:154:1: ( ruleEString EOF )
            // InternalBorduino.g:155:1: ruleEString EOF
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
    // InternalBorduino.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBorduino.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBorduino.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalBorduino.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBorduino.g:169:3: ( rule__EString__Alternatives )
            // InternalBorduino.g:169:4: rule__EString__Alternatives
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
    // InternalBorduino.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBorduino.g:179:1: ( ruleEInt EOF )
            // InternalBorduino.g:180:1: ruleEInt EOF
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
    // InternalBorduino.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBorduino.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBorduino.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalBorduino.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBorduino.g:194:3: ( rule__EInt__Group__0 )
            // InternalBorduino.g:194:4: rule__EInt__Group__0
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
    // InternalBorduino.g:203:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalBorduino.g:204:1: ( ruleState EOF )
            // InternalBorduino.g:205:1: ruleState EOF
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
    // InternalBorduino.g:212:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:216:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalBorduino.g:217:2: ( ( rule__State__Group__0 ) )
            {
            // InternalBorduino.g:217:2: ( ( rule__State__Group__0 ) )
            // InternalBorduino.g:218:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalBorduino.g:219:3: ( rule__State__Group__0 )
            // InternalBorduino.g:219:4: rule__State__Group__0
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
    // InternalBorduino.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBorduino.g:229:1: ( ruleAction EOF )
            // InternalBorduino.g:230:1: ruleAction EOF
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
    // InternalBorduino.g:237:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:241:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalBorduino.g:242:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalBorduino.g:242:2: ( ( rule__Action__Group__0 ) )
            // InternalBorduino.g:243:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalBorduino.g:244:3: ( rule__Action__Group__0 )
            // InternalBorduino.g:244:4: rule__Action__Group__0
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
    // InternalBorduino.g:253:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalBorduino.g:254:1: ( ruleTransition EOF )
            // InternalBorduino.g:255:1: ruleTransition EOF
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
    // InternalBorduino.g:262:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:266:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalBorduino.g:267:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalBorduino.g:267:2: ( ( rule__Transition__Group__0 ) )
            // InternalBorduino.g:268:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalBorduino.g:269:3: ( rule__Transition__Group__0 )
            // InternalBorduino.g:269:4: rule__Transition__Group__0
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


    // $ANTLR start "ruleSignal"
    // InternalBorduino.g:278:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:282:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalBorduino.g:283:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalBorduino.g:283:2: ( ( rule__Signal__Alternatives ) )
            // InternalBorduino.g:284:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalBorduino.g:285:3: ( rule__Signal__Alternatives )
            // InternalBorduino.g:285:4: rule__Signal__Alternatives
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


    // $ANTLR start "rule__Brick__Alternatives_0"
    // InternalBorduino.g:293:1: rule__Brick__Alternatives_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__Brick__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:297:1: ( ( ruleActuator ) | ( ruleSensor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBorduino.g:298:2: ( ruleActuator )
                    {
                    // InternalBorduino.g:298:2: ( ruleActuator )
                    // InternalBorduino.g:299:3: ruleActuator
                    {
                     before(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:304:2: ( ruleSensor )
                    {
                    // InternalBorduino.g:304:2: ( ruleSensor )
                    // InternalBorduino.g:305:3: ruleSensor
                    {
                     before(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Brick__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBorduino.g:314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBorduino.g:319:2: ( RULE_STRING )
                    {
                    // InternalBorduino.g:319:2: ( RULE_STRING )
                    // InternalBorduino.g:320:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:325:2: ( RULE_ID )
                    {
                    // InternalBorduino.g:325:2: ( RULE_ID )
                    // InternalBorduino.g:326:3: RULE_ID
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
    // InternalBorduino.g:335:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:339:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBorduino.g:340:2: ( ( 'HIGH' ) )
                    {
                    // InternalBorduino.g:340:2: ( ( 'HIGH' ) )
                    // InternalBorduino.g:341:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalBorduino.g:342:3: ( 'HIGH' )
                    // InternalBorduino.g:342:4: 'HIGH'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:346:2: ( ( 'LOW' ) )
                    {
                    // InternalBorduino.g:346:2: ( ( 'LOW' ) )
                    // InternalBorduino.g:347:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalBorduino.g:348:3: ( 'LOW' )
                    // InternalBorduino.g:348:4: 'LOW'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__App__Group__0"
    // InternalBorduino.g:356:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:360:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalBorduino.g:361:2: rule__App__Group__0__Impl rule__App__Group__1
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
    // InternalBorduino.g:368:1: rule__App__Group__0__Impl : ( 'app' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:372:1: ( ( 'app' ) )
            // InternalBorduino.g:373:1: ( 'app' )
            {
            // InternalBorduino.g:373:1: ( 'app' )
            // InternalBorduino.g:374:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBorduino.g:383:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:387:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalBorduino.g:388:2: rule__App__Group__1__Impl rule__App__Group__2
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
    // InternalBorduino.g:395:1: rule__App__Group__1__Impl : ( ( rule__App__NameAssignment_1 ) ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:399:1: ( ( ( rule__App__NameAssignment_1 ) ) )
            // InternalBorduino.g:400:1: ( ( rule__App__NameAssignment_1 ) )
            {
            // InternalBorduino.g:400:1: ( ( rule__App__NameAssignment_1 ) )
            // InternalBorduino.g:401:2: ( rule__App__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1()); 
            // InternalBorduino.g:402:2: ( rule__App__NameAssignment_1 )
            // InternalBorduino.g:402:3: rule__App__NameAssignment_1
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
    // InternalBorduino.g:410:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:414:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalBorduino.g:415:2: rule__App__Group__2__Impl rule__App__Group__3
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
    // InternalBorduino.g:422:1: rule__App__Group__2__Impl : ( 'initial state' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:426:1: ( ( 'initial state' ) )
            // InternalBorduino.g:427:1: ( 'initial state' )
            {
            // InternalBorduino.g:427:1: ( 'initial state' )
            // InternalBorduino.g:428:2: 'initial state'
            {
             before(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBorduino.g:437:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:441:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalBorduino.g:442:2: rule__App__Group__3__Impl rule__App__Group__4
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
    // InternalBorduino.g:449:1: rule__App__Group__3__Impl : ( ( rule__App__InitialAssignment_3 ) ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:453:1: ( ( ( rule__App__InitialAssignment_3 ) ) )
            // InternalBorduino.g:454:1: ( ( rule__App__InitialAssignment_3 ) )
            {
            // InternalBorduino.g:454:1: ( ( rule__App__InitialAssignment_3 ) )
            // InternalBorduino.g:455:2: ( rule__App__InitialAssignment_3 )
            {
             before(grammarAccess.getAppAccess().getInitialAssignment_3()); 
            // InternalBorduino.g:456:2: ( rule__App__InitialAssignment_3 )
            // InternalBorduino.g:456:3: rule__App__InitialAssignment_3
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
    // InternalBorduino.g:464:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:468:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalBorduino.g:469:2: rule__App__Group__4__Impl rule__App__Group__5
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
    // InternalBorduino.g:476:1: rule__App__Group__4__Impl : ( '{' ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:480:1: ( ( '{' ) )
            // InternalBorduino.g:481:1: ( '{' )
            {
            // InternalBorduino.g:481:1: ( '{' )
            // InternalBorduino.g:482:2: '{'
            {
             before(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBorduino.g:491:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:495:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalBorduino.g:496:2: rule__App__Group__5__Impl rule__App__Group__6
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
    // InternalBorduino.g:503:1: rule__App__Group__5__Impl : ( 'bricks' ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:507:1: ( ( 'bricks' ) )
            // InternalBorduino.g:508:1: ( 'bricks' )
            {
            // InternalBorduino.g:508:1: ( 'bricks' )
            // InternalBorduino.g:509:2: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBorduino.g:518:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:522:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalBorduino.g:523:2: rule__App__Group__6__Impl rule__App__Group__7
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
    // InternalBorduino.g:530:1: rule__App__Group__6__Impl : ( ( rule__App__BricksAssignment_6 ) ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:534:1: ( ( ( rule__App__BricksAssignment_6 ) ) )
            // InternalBorduino.g:535:1: ( ( rule__App__BricksAssignment_6 ) )
            {
            // InternalBorduino.g:535:1: ( ( rule__App__BricksAssignment_6 ) )
            // InternalBorduino.g:536:2: ( rule__App__BricksAssignment_6 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_6()); 
            // InternalBorduino.g:537:2: ( rule__App__BricksAssignment_6 )
            // InternalBorduino.g:537:3: rule__App__BricksAssignment_6
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
    // InternalBorduino.g:545:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:549:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalBorduino.g:550:2: rule__App__Group__7__Impl rule__App__Group__8
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
    // InternalBorduino.g:557:1: rule__App__Group__7__Impl : ( ( rule__App__BricksAssignment_7 )* ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:561:1: ( ( ( rule__App__BricksAssignment_7 )* ) )
            // InternalBorduino.g:562:1: ( ( rule__App__BricksAssignment_7 )* )
            {
            // InternalBorduino.g:562:1: ( ( rule__App__BricksAssignment_7 )* )
            // InternalBorduino.g:563:2: ( rule__App__BricksAssignment_7 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_7()); 
            // InternalBorduino.g:564:2: ( rule__App__BricksAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBorduino.g:564:3: rule__App__BricksAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__BricksAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalBorduino.g:572:1: rule__App__Group__8 : rule__App__Group__8__Impl rule__App__Group__9 ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:576:1: ( rule__App__Group__8__Impl rule__App__Group__9 )
            // InternalBorduino.g:577:2: rule__App__Group__8__Impl rule__App__Group__9
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
    // InternalBorduino.g:584:1: rule__App__Group__8__Impl : ( 'states' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:588:1: ( ( 'states' ) )
            // InternalBorduino.g:589:1: ( 'states' )
            {
            // InternalBorduino.g:589:1: ( 'states' )
            // InternalBorduino.g:590:2: 'states'
            {
             before(grammarAccess.getAppAccess().getStatesKeyword_8()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBorduino.g:599:1: rule__App__Group__9 : rule__App__Group__9__Impl rule__App__Group__10 ;
    public final void rule__App__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:603:1: ( rule__App__Group__9__Impl rule__App__Group__10 )
            // InternalBorduino.g:604:2: rule__App__Group__9__Impl rule__App__Group__10
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
    // InternalBorduino.g:611:1: rule__App__Group__9__Impl : ( ( rule__App__StatesAssignment_9 ) ) ;
    public final void rule__App__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:615:1: ( ( ( rule__App__StatesAssignment_9 ) ) )
            // InternalBorduino.g:616:1: ( ( rule__App__StatesAssignment_9 ) )
            {
            // InternalBorduino.g:616:1: ( ( rule__App__StatesAssignment_9 ) )
            // InternalBorduino.g:617:2: ( rule__App__StatesAssignment_9 )
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_9()); 
            // InternalBorduino.g:618:2: ( rule__App__StatesAssignment_9 )
            // InternalBorduino.g:618:3: rule__App__StatesAssignment_9
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
    // InternalBorduino.g:626:1: rule__App__Group__10 : rule__App__Group__10__Impl rule__App__Group__11 ;
    public final void rule__App__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:630:1: ( rule__App__Group__10__Impl rule__App__Group__11 )
            // InternalBorduino.g:631:2: rule__App__Group__10__Impl rule__App__Group__11
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
    // InternalBorduino.g:638:1: rule__App__Group__10__Impl : ( ( rule__App__StatesAssignment_10 )* ) ;
    public final void rule__App__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:642:1: ( ( ( rule__App__StatesAssignment_10 )* ) )
            // InternalBorduino.g:643:1: ( ( rule__App__StatesAssignment_10 )* )
            {
            // InternalBorduino.g:643:1: ( ( rule__App__StatesAssignment_10 )* )
            // InternalBorduino.g:644:2: ( rule__App__StatesAssignment_10 )*
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_10()); 
            // InternalBorduino.g:645:2: ( rule__App__StatesAssignment_10 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBorduino.g:645:3: rule__App__StatesAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__StatesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalBorduino.g:653:1: rule__App__Group__11 : rule__App__Group__11__Impl ;
    public final void rule__App__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:657:1: ( rule__App__Group__11__Impl )
            // InternalBorduino.g:658:2: rule__App__Group__11__Impl
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
    // InternalBorduino.g:664:1: rule__App__Group__11__Impl : ( '}' ) ;
    public final void rule__App__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:668:1: ( ( '}' ) )
            // InternalBorduino.g:669:1: ( '}' )
            {
            // InternalBorduino.g:669:1: ( '}' )
            // InternalBorduino.g:670:2: '}'
            {
             before(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__Brick__Group__0"
    // InternalBorduino.g:680:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:684:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalBorduino.g:685:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Brick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__1();

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
    // $ANTLR end "rule__Brick__Group__0"


    // $ANTLR start "rule__Brick__Group__0__Impl"
    // InternalBorduino.g:692:1: rule__Brick__Group__0__Impl : ( ( rule__Brick__Alternatives_0 ) ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:696:1: ( ( ( rule__Brick__Alternatives_0 ) ) )
            // InternalBorduino.g:697:1: ( ( rule__Brick__Alternatives_0 ) )
            {
            // InternalBorduino.g:697:1: ( ( rule__Brick__Alternatives_0 ) )
            // InternalBorduino.g:698:2: ( rule__Brick__Alternatives_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0()); 
            // InternalBorduino.g:699:2: ( rule__Brick__Alternatives_0 )
            // InternalBorduino.g:699:3: rule__Brick__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Brick__Group__0__Impl"


    // $ANTLR start "rule__Brick__Group__1"
    // InternalBorduino.g:707:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:711:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalBorduino.g:712:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Brick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__2();

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
    // $ANTLR end "rule__Brick__Group__1"


    // $ANTLR start "rule__Brick__Group__1__Impl"
    // InternalBorduino.g:719:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:723:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // InternalBorduino.g:724:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // InternalBorduino.g:724:1: ( ( rule__Brick__NameAssignment_1 ) )
            // InternalBorduino.g:725:2: ( rule__Brick__NameAssignment_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            // InternalBorduino.g:726:2: ( rule__Brick__NameAssignment_1 )
            // InternalBorduino.g:726:3: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Brick__Group__1__Impl"


    // $ANTLR start "rule__Brick__Group__2"
    // InternalBorduino.g:734:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:738:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalBorduino.g:739:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Brick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__3();

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
    // $ANTLR end "rule__Brick__Group__2"


    // $ANTLR start "rule__Brick__Group__2__Impl"
    // InternalBorduino.g:746:1: rule__Brick__Group__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:750:1: ( ( ':' ) )
            // InternalBorduino.g:751:1: ( ':' )
            {
            // InternalBorduino.g:751:1: ( ':' )
            // InternalBorduino.g:752:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Brick__Group__2__Impl"


    // $ANTLR start "rule__Brick__Group__3"
    // InternalBorduino.g:761:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:765:1: ( rule__Brick__Group__3__Impl )
            // InternalBorduino.g:766:2: rule__Brick__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group__3__Impl();

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
    // $ANTLR end "rule__Brick__Group__3"


    // $ANTLR start "rule__Brick__Group__3__Impl"
    // InternalBorduino.g:772:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__PinAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:776:1: ( ( ( rule__Brick__PinAssignment_3 ) ) )
            // InternalBorduino.g:777:1: ( ( rule__Brick__PinAssignment_3 ) )
            {
            // InternalBorduino.g:777:1: ( ( rule__Brick__PinAssignment_3 ) )
            // InternalBorduino.g:778:2: ( rule__Brick__PinAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_3()); 
            // InternalBorduino.g:779:2: ( rule__Brick__PinAssignment_3 )
            // InternalBorduino.g:779:3: rule__Brick__PinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinAssignment_3()); 

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
    // $ANTLR end "rule__Brick__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalBorduino.g:788:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:792:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalBorduino.g:793:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBorduino.g:800:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:804:1: ( ( () ) )
            // InternalBorduino.g:805:1: ( () )
            {
            // InternalBorduino.g:805:1: ( () )
            // InternalBorduino.g:806:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalBorduino.g:807:2: ()
            // InternalBorduino.g:807:3: 
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
    // InternalBorduino.g:815:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:819:1: ( rule__Actuator__Group__1__Impl )
            // InternalBorduino.g:820:2: rule__Actuator__Group__1__Impl
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
    // InternalBorduino.g:826:1: rule__Actuator__Group__1__Impl : ( 'actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:830:1: ( ( 'actuator' ) )
            // InternalBorduino.g:831:1: ( 'actuator' )
            {
            // InternalBorduino.g:831:1: ( 'actuator' )
            // InternalBorduino.g:832:2: 'actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalBorduino.g:842:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:846:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalBorduino.g:847:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBorduino.g:854:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:858:1: ( ( () ) )
            // InternalBorduino.g:859:1: ( () )
            {
            // InternalBorduino.g:859:1: ( () )
            // InternalBorduino.g:860:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalBorduino.g:861:2: ()
            // InternalBorduino.g:861:3: 
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
    // InternalBorduino.g:869:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:873:1: ( rule__Sensor__Group__1__Impl )
            // InternalBorduino.g:874:2: rule__Sensor__Group__1__Impl
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
    // InternalBorduino.g:880:1: rule__Sensor__Group__1__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:884:1: ( ( 'sensor' ) )
            // InternalBorduino.g:885:1: ( 'sensor' )
            {
            // InternalBorduino.g:885:1: ( 'sensor' )
            // InternalBorduino.g:886:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBorduino.g:896:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:900:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBorduino.g:901:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalBorduino.g:908:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:912:1: ( ( ( '-' )? ) )
            // InternalBorduino.g:913:1: ( ( '-' )? )
            {
            // InternalBorduino.g:913:1: ( ( '-' )? )
            // InternalBorduino.g:914:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBorduino.g:915:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBorduino.g:915:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalBorduino.g:923:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:927:1: ( rule__EInt__Group__1__Impl )
            // InternalBorduino.g:928:2: rule__EInt__Group__1__Impl
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
    // InternalBorduino.g:934:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:938:1: ( ( RULE_INT ) )
            // InternalBorduino.g:939:1: ( RULE_INT )
            {
            // InternalBorduino.g:939:1: ( RULE_INT )
            // InternalBorduino.g:940:2: RULE_INT
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
    // InternalBorduino.g:950:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:954:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalBorduino.g:955:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalBorduino.g:962:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:966:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalBorduino.g:967:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalBorduino.g:967:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalBorduino.g:968:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalBorduino.g:969:2: ( rule__State__NameAssignment_0 )
            // InternalBorduino.g:969:3: rule__State__NameAssignment_0
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
    // InternalBorduino.g:977:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:981:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalBorduino.g:982:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalBorduino.g:989:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:993:1: ( ( '{' ) )
            // InternalBorduino.g:994:1: ( '{' )
            {
            // InternalBorduino.g:994:1: ( '{' )
            // InternalBorduino.g:995:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBorduino.g:1004:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1008:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalBorduino.g:1009:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalBorduino.g:1016:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1020:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalBorduino.g:1021:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalBorduino.g:1021:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalBorduino.g:1022:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalBorduino.g:1023:2: ( rule__State__ActionsAssignment_2 )
            // InternalBorduino.g:1023:3: rule__State__ActionsAssignment_2
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
    // InternalBorduino.g:1031:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1035:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalBorduino.g:1036:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalBorduino.g:1043:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1047:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalBorduino.g:1048:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalBorduino.g:1048:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalBorduino.g:1049:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalBorduino.g:1050:2: ( rule__State__ActionsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==19) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==RULE_ID) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==19) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalBorduino.g:1050:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBorduino.g:1058:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1062:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalBorduino.g:1063:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBorduino.g:1070:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1074:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalBorduino.g:1075:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalBorduino.g:1075:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalBorduino.g:1076:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalBorduino.g:1077:2: ( rule__State__TransitionAssignment_4 )
            // InternalBorduino.g:1077:3: rule__State__TransitionAssignment_4
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
    // InternalBorduino.g:1085:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1089:1: ( rule__State__Group__5__Impl )
            // InternalBorduino.g:1090:2: rule__State__Group__5__Impl
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
    // InternalBorduino.g:1096:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1100:1: ( ( '}' ) )
            // InternalBorduino.g:1101:1: ( '}' )
            {
            // InternalBorduino.g:1101:1: ( '}' )
            // InternalBorduino.g:1102:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBorduino.g:1112:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1116:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalBorduino.g:1117:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalBorduino.g:1124:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1128:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalBorduino.g:1129:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalBorduino.g:1129:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalBorduino.g:1130:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalBorduino.g:1131:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalBorduino.g:1131:3: rule__Action__ActuatorAssignment_0
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
    // InternalBorduino.g:1139:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1143:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalBorduino.g:1144:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBorduino.g:1151:1: rule__Action__Group__1__Impl : ( ':' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1155:1: ( ( ':' ) )
            // InternalBorduino.g:1156:1: ( ':' )
            {
            // InternalBorduino.g:1156:1: ( ':' )
            // InternalBorduino.g:1157:2: ':'
            {
             before(grammarAccess.getActionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBorduino.g:1166:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1170:1: ( rule__Action__Group__2__Impl )
            // InternalBorduino.g:1171:2: rule__Action__Group__2__Impl
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
    // InternalBorduino.g:1177:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1181:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalBorduino.g:1182:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalBorduino.g:1182:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalBorduino.g:1183:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalBorduino.g:1184:2: ( rule__Action__ValueAssignment_2 )
            // InternalBorduino.g:1184:3: rule__Action__ValueAssignment_2
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
    // InternalBorduino.g:1193:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1197:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalBorduino.g:1198:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBorduino.g:1205:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SensorAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1209:1: ( ( ( rule__Transition__SensorAssignment_0 ) ) )
            // InternalBorduino.g:1210:1: ( ( rule__Transition__SensorAssignment_0 ) )
            {
            // InternalBorduino.g:1210:1: ( ( rule__Transition__SensorAssignment_0 ) )
            // InternalBorduino.g:1211:2: ( rule__Transition__SensorAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSensorAssignment_0()); 
            // InternalBorduino.g:1212:2: ( rule__Transition__SensorAssignment_0 )
            // InternalBorduino.g:1212:3: rule__Transition__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSensorAssignment_0()); 

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
    // InternalBorduino.g:1220:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1224:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalBorduino.g:1225:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBorduino.g:1232:1: rule__Transition__Group__1__Impl : ( 'is' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1236:1: ( ( 'is' ) )
            // InternalBorduino.g:1237:1: ( 'is' )
            {
            // InternalBorduino.g:1237:1: ( 'is' )
            // InternalBorduino.g:1238:2: 'is'
            {
             before(grammarAccess.getTransitionAccess().getIsKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIsKeyword_1()); 

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
    // InternalBorduino.g:1247:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1251:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalBorduino.g:1252:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBorduino.g:1259:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__ValueAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1263:1: ( ( ( rule__Transition__ValueAssignment_2 ) ) )
            // InternalBorduino.g:1264:1: ( ( rule__Transition__ValueAssignment_2 ) )
            {
            // InternalBorduino.g:1264:1: ( ( rule__Transition__ValueAssignment_2 ) )
            // InternalBorduino.g:1265:2: ( rule__Transition__ValueAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getValueAssignment_2()); 
            // InternalBorduino.g:1266:2: ( rule__Transition__ValueAssignment_2 )
            // InternalBorduino.g:1266:3: rule__Transition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getValueAssignment_2()); 

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
    // InternalBorduino.g:1274:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1278:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalBorduino.g:1279:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

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
    // InternalBorduino.g:1286:1: rule__Transition__Group__3__Impl : ( ':' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1290:1: ( ( ':' ) )
            // InternalBorduino.g:1291:1: ( ':' )
            {
            // InternalBorduino.g:1291:1: ( ':' )
            // InternalBorduino.g:1292:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3()); 

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


    // $ANTLR start "rule__Transition__Group__4"
    // InternalBorduino.g:1301:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1305:1: ( rule__Transition__Group__4__Impl )
            // InternalBorduino.g:1306:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalBorduino.g:1312:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__NextAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1316:1: ( ( ( rule__Transition__NextAssignment_4 ) ) )
            // InternalBorduino.g:1317:1: ( ( rule__Transition__NextAssignment_4 ) )
            {
            // InternalBorduino.g:1317:1: ( ( rule__Transition__NextAssignment_4 ) )
            // InternalBorduino.g:1318:2: ( rule__Transition__NextAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_4()); 
            // InternalBorduino.g:1319:2: ( rule__Transition__NextAssignment_4 )
            // InternalBorduino.g:1319:3: rule__Transition__NextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__App__NameAssignment_1"
    // InternalBorduino.g:1328:1: rule__App__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1332:1: ( ( ruleEString ) )
            // InternalBorduino.g:1333:2: ( ruleEString )
            {
            // InternalBorduino.g:1333:2: ( ruleEString )
            // InternalBorduino.g:1334:3: ruleEString
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
    // InternalBorduino.g:1343:1: rule__App__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__App__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1347:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:1348:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:1348:2: ( ( ruleEString ) )
            // InternalBorduino.g:1349:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
            // InternalBorduino.g:1350:3: ( ruleEString )
            // InternalBorduino.g:1351:4: ruleEString
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
    // InternalBorduino.g:1362:1: rule__App__BricksAssignment_6 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1366:1: ( ( ruleBrick ) )
            // InternalBorduino.g:1367:2: ( ruleBrick )
            {
            // InternalBorduino.g:1367:2: ( ruleBrick )
            // InternalBorduino.g:1368:3: ruleBrick
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
    // InternalBorduino.g:1377:1: rule__App__BricksAssignment_7 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1381:1: ( ( ruleBrick ) )
            // InternalBorduino.g:1382:2: ( ruleBrick )
            {
            // InternalBorduino.g:1382:2: ( ruleBrick )
            // InternalBorduino.g:1383:3: ruleBrick
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
    // InternalBorduino.g:1392:1: rule__App__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1396:1: ( ( ruleState ) )
            // InternalBorduino.g:1397:2: ( ruleState )
            {
            // InternalBorduino.g:1397:2: ( ruleState )
            // InternalBorduino.g:1398:3: ruleState
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
    // InternalBorduino.g:1407:1: rule__App__StatesAssignment_10 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1411:1: ( ( ruleState ) )
            // InternalBorduino.g:1412:2: ( ruleState )
            {
            // InternalBorduino.g:1412:2: ( ruleState )
            // InternalBorduino.g:1413:3: ruleState
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


    // $ANTLR start "rule__Brick__NameAssignment_1"
    // InternalBorduino.g:1422:1: rule__Brick__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1426:1: ( ( ruleEString ) )
            // InternalBorduino.g:1427:2: ( ruleEString )
            {
            // InternalBorduino.g:1427:2: ( ruleEString )
            // InternalBorduino.g:1428:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Brick__NameAssignment_1"


    // $ANTLR start "rule__Brick__PinAssignment_3"
    // InternalBorduino.g:1437:1: rule__Brick__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1441:1: ( ( ruleEInt ) )
            // InternalBorduino.g:1442:2: ( ruleEInt )
            {
            // InternalBorduino.g:1442:2: ( ruleEInt )
            // InternalBorduino.g:1443:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Brick__PinAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalBorduino.g:1452:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1456:1: ( ( ruleEString ) )
            // InternalBorduino.g:1457:2: ( ruleEString )
            {
            // InternalBorduino.g:1457:2: ( ruleEString )
            // InternalBorduino.g:1458:3: ruleEString
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
    // InternalBorduino.g:1467:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1471:1: ( ( ruleAction ) )
            // InternalBorduino.g:1472:2: ( ruleAction )
            {
            // InternalBorduino.g:1472:2: ( ruleAction )
            // InternalBorduino.g:1473:3: ruleAction
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
    // InternalBorduino.g:1482:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1486:1: ( ( ruleAction ) )
            // InternalBorduino.g:1487:2: ( ruleAction )
            {
            // InternalBorduino.g:1487:2: ( ruleAction )
            // InternalBorduino.g:1488:3: ruleAction
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
    // InternalBorduino.g:1497:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1501:1: ( ( ruleTransition ) )
            // InternalBorduino.g:1502:2: ( ruleTransition )
            {
            // InternalBorduino.g:1502:2: ( ruleTransition )
            // InternalBorduino.g:1503:3: ruleTransition
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
    // InternalBorduino.g:1512:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1516:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:1517:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:1517:2: ( ( ruleEString ) )
            // InternalBorduino.g:1518:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalBorduino.g:1519:3: ( ruleEString )
            // InternalBorduino.g:1520:4: ruleEString
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
    // InternalBorduino.g:1531:1: rule__Action__ValueAssignment_2 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1535:1: ( ( ruleSignal ) )
            // InternalBorduino.g:1536:2: ( ruleSignal )
            {
            // InternalBorduino.g:1536:2: ( ruleSignal )
            // InternalBorduino.g:1537:3: ruleSignal
            {
             before(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0()); 

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


    // $ANTLR start "rule__Transition__SensorAssignment_0"
    // InternalBorduino.g:1546:1: rule__Transition__SensorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1550:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:1551:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:1551:2: ( ( ruleEString ) )
            // InternalBorduino.g:1552:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_0_0()); 
            // InternalBorduino.g:1553:3: ( ruleEString )
            // InternalBorduino.g:1554:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSensorSensorEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSensorSensorEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_0_0()); 

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
    // $ANTLR end "rule__Transition__SensorAssignment_0"


    // $ANTLR start "rule__Transition__ValueAssignment_2"
    // InternalBorduino.g:1565:1: rule__Transition__ValueAssignment_2 : ( ruleSignal ) ;
    public final void rule__Transition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1569:1: ( ( ruleSignal ) )
            // InternalBorduino.g:1570:2: ( ruleSignal )
            {
            // InternalBorduino.g:1570:2: ( ruleSignal )
            // InternalBorduino.g:1571:3: ruleSignal
            {
             before(grammarAccess.getTransitionAccess().getValueSignalEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getValueSignalEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Transition__ValueAssignment_2"


    // $ANTLR start "rule__Transition__NextAssignment_4"
    // InternalBorduino.g:1580:1: rule__Transition__NextAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBorduino.g:1584:1: ( ( ( ruleEString ) ) )
            // InternalBorduino.g:1585:2: ( ( ruleEString ) )
            {
            // InternalBorduino.g:1585:2: ( ( ruleEString ) )
            // InternalBorduino.g:1586:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0()); 
            // InternalBorduino.g:1587:3: ( ruleEString )
            // InternalBorduino.g:1588:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0()); 

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
    // $ANTLR end "rule__Transition__NextAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});

}