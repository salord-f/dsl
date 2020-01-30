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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBorduinoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'actuator'", "'screenActuator'", "'keyboardSensor'", "'sensor'", "'-'", "'is'", "'and'", "'or'", "'HIGH'", "'LOW'"
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




    // $ANTLR start "entryRuleApp"
    // InternalBorduino.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalBorduino.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalBorduino.g:66:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalBorduino.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_10_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:78:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' ) )
            // InternalBorduino.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' )
            {
            // InternalBorduino.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' )
            // InternalBorduino.g:80:3: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            // InternalBorduino.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBorduino.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalBorduino.g:85:4: (lv_name_1_0= ruleEString )
            // InternalBorduino.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialStateKeyword_2());
            		
            // InternalBorduino.g:107:3: ( ( ruleEString ) )
            // InternalBorduino.g:108:4: ( ruleEString )
            {
            // InternalBorduino.g:108:4: ( ruleEString )
            // InternalBorduino.g:109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
            		
            // InternalBorduino.g:131:3: ( (lv_bricks_6_0= ruleBrick ) )
            // InternalBorduino.g:132:4: (lv_bricks_6_0= ruleBrick )
            {
            // InternalBorduino.g:132:4: (lv_bricks_6_0= ruleBrick )
            // InternalBorduino.g:133:5: lv_bricks_6_0= ruleBrick
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_bricks_6_0=ruleBrick();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_6_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Brick");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBorduino.g:150:3: ( (lv_bricks_7_0= ruleBrick ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=18 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBorduino.g:151:4: (lv_bricks_7_0= ruleBrick )
            	    {
            	    // InternalBorduino.g:151:4: (lv_bricks_7_0= ruleBrick )
            	    // InternalBorduino.g:152:5: lv_bricks_7_0= ruleBrick
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_bricks_7_0=ruleBrick();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bricks",
            	    						lv_bricks_7_0,
            	    						"com.polytech.unice.borduino.concretesyntax.Borduino.Brick");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAppAccess().getStatesKeyword_8());
            		
            // InternalBorduino.g:173:3: ( (lv_states_9_0= ruleState ) )
            // InternalBorduino.g:174:4: (lv_states_9_0= ruleState )
            {
            // InternalBorduino.g:174:4: (lv_states_9_0= ruleState )
            // InternalBorduino.g:175:5: lv_states_9_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_states_9_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_9_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBorduino.g:192:3: ( (lv_states_10_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBorduino.g:193:4: (lv_states_10_0= ruleState )
            	    {
            	    // InternalBorduino.g:193:4: (lv_states_10_0= ruleState )
            	    // InternalBorduino.g:194:5: lv_states_10_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_10_0,
            	    						"com.polytech.unice.borduino.concretesyntax.Borduino.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalBorduino.g:219:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalBorduino.g:219:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalBorduino.g:220:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalBorduino.g:226:1: ruleBrick returns [EObject current=null] : ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )* ) | (this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )* ) | (this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pins_4_0 = null;

        AntlrDatatypeRuleToken lv_pins_5_0 = null;

        EObject this_LCDScreenActuator_6 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_pins_9_0 = null;

        AntlrDatatypeRuleToken lv_pins_10_0 = null;

        EObject this_KeyboardSensor_11 = null;

        AntlrDatatypeRuleToken lv_name_12_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:232:2: ( ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )* ) | (this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )* ) | (this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) ) ) ) )
            // InternalBorduino.g:233:2: ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )* ) | (this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )* ) | (this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) ) ) )
            {
            // InternalBorduino.g:233:2: ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )* ) | (this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )* ) | (this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
            case 21:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBorduino.g:234:3: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )* )
                    {
                    // InternalBorduino.g:234:3: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )* )
                    // InternalBorduino.g:235:4: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pins_4_0= ruleEInt ) ) ( (lv_pins_5_0= ruleEInt ) )*
                    {
                    // InternalBorduino.g:235:4: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==18) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==21) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalBorduino.g:236:5: this_Actuator_0= ruleActuator
                            {

                            					newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_3);
                            this_Actuator_0=ruleActuator();

                            state._fsp--;


                            					current = this_Actuator_0;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalBorduino.g:245:5: this_Sensor_1= ruleSensor
                            {

                            					newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_3);
                            this_Sensor_1=ruleSensor();

                            state._fsp--;


                            					current = this_Sensor_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalBorduino.g:254:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalBorduino.g:255:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalBorduino.g:255:5: (lv_name_2_0= ruleEString )
                    // InternalBorduino.g:256:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_0_2());
                    			
                    // InternalBorduino.g:277:4: ( (lv_pins_4_0= ruleEInt ) )
                    // InternalBorduino.g:278:5: (lv_pins_4_0= ruleEInt )
                    {
                    // InternalBorduino.g:278:5: (lv_pins_4_0= ruleEInt )
                    // InternalBorduino.g:279:6: lv_pins_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_pins_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						add(
                    							current,
                    							"pins",
                    							lv_pins_4_0,
                    							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBorduino.g:296:4: ( (lv_pins_5_0= ruleEInt ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_INT||LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBorduino.g:297:5: (lv_pins_5_0= ruleEInt )
                    	    {
                    	    // InternalBorduino.g:297:5: (lv_pins_5_0= ruleEInt )
                    	    // InternalBorduino.g:298:6: lv_pins_5_0= ruleEInt
                    	    {

                    	    						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_0_4_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_pins_5_0=ruleEInt();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"pins",
                    	    							lv_pins_5_0,
                    	    							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:317:3: (this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )* )
                    {
                    // InternalBorduino.g:317:3: (this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )* )
                    // InternalBorduino.g:318:4: this_LCDScreenActuator_6= ruleLCDScreenActuator ( (lv_name_7_0= ruleEString ) ) otherlv_8= ':' ( (lv_pins_9_0= ruleEInt ) ) ( (lv_pins_10_0= ruleEInt ) )*
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getLCDScreenActuatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_LCDScreenActuator_6=ruleLCDScreenActuator();

                    state._fsp--;


                    				current = this_LCDScreenActuator_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalBorduino.g:326:4: ( (lv_name_7_0= ruleEString ) )
                    // InternalBorduino.g:327:5: (lv_name_7_0= ruleEString )
                    {
                    // InternalBorduino.g:327:5: (lv_name_7_0= ruleEString )
                    // InternalBorduino.g:328:6: lv_name_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getBrickAccess().getColonKeyword_1_2());
                    			
                    // InternalBorduino.g:349:4: ( (lv_pins_9_0= ruleEInt ) )
                    // InternalBorduino.g:350:5: (lv_pins_9_0= ruleEInt )
                    {
                    // InternalBorduino.g:350:5: (lv_pins_9_0= ruleEInt )
                    // InternalBorduino.g:351:6: lv_pins_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_pins_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						add(
                    							current,
                    							"pins",
                    							lv_pins_9_0,
                    							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBorduino.g:368:4: ( (lv_pins_10_0= ruleEInt ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT||LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBorduino.g:369:5: (lv_pins_10_0= ruleEInt )
                    	    {
                    	    // InternalBorduino.g:369:5: (lv_pins_10_0= ruleEInt )
                    	    // InternalBorduino.g:370:6: lv_pins_10_0= ruleEInt
                    	    {

                    	    						newCompositeNode(grammarAccess.getBrickAccess().getPinsEIntParserRuleCall_1_4_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_pins_10_0=ruleEInt();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"pins",
                    	    							lv_pins_10_0,
                    	    							"com.polytech.unice.borduino.concretesyntax.Borduino.EInt");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalBorduino.g:389:3: (this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) ) )
                    {
                    // InternalBorduino.g:389:3: (this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) ) )
                    // InternalBorduino.g:390:4: this_KeyboardSensor_11= ruleKeyboardSensor ( (lv_name_12_0= ruleEString ) )
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getKeyboardSensorParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_KeyboardSensor_11=ruleKeyboardSensor();

                    state._fsp--;


                    				current = this_KeyboardSensor_11;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalBorduino.g:398:4: ( (lv_name_12_0= ruleEString ) )
                    // InternalBorduino.g:399:5: (lv_name_12_0= ruleEString )
                    {
                    // InternalBorduino.g:399:5: (lv_name_12_0= ruleEString )
                    // InternalBorduino.g:400:6: lv_name_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_12_0,
                    							"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleActuator"
    // InternalBorduino.g:422:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalBorduino.g:422:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalBorduino.g:423:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalBorduino.g:429:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:435:2: ( ( () otherlv_1= 'actuator' ) )
            // InternalBorduino.g:436:2: ( () otherlv_1= 'actuator' )
            {
            // InternalBorduino.g:436:2: ( () otherlv_1= 'actuator' )
            // InternalBorduino.g:437:3: () otherlv_1= 'actuator'
            {
            // InternalBorduino.g:437:3: ()
            // InternalBorduino.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleLCDScreenActuator"
    // InternalBorduino.g:452:1: entryRuleLCDScreenActuator returns [EObject current=null] : iv_ruleLCDScreenActuator= ruleLCDScreenActuator EOF ;
    public final EObject entryRuleLCDScreenActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLCDScreenActuator = null;


        try {
            // InternalBorduino.g:452:58: (iv_ruleLCDScreenActuator= ruleLCDScreenActuator EOF )
            // InternalBorduino.g:453:2: iv_ruleLCDScreenActuator= ruleLCDScreenActuator EOF
            {
             newCompositeNode(grammarAccess.getLCDScreenActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLCDScreenActuator=ruleLCDScreenActuator();

            state._fsp--;

             current =iv_ruleLCDScreenActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLCDScreenActuator"


    // $ANTLR start "ruleLCDScreenActuator"
    // InternalBorduino.g:459:1: ruleLCDScreenActuator returns [EObject current=null] : ( () otherlv_1= 'screenActuator' ) ;
    public final EObject ruleLCDScreenActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:465:2: ( ( () otherlv_1= 'screenActuator' ) )
            // InternalBorduino.g:466:2: ( () otherlv_1= 'screenActuator' )
            {
            // InternalBorduino.g:466:2: ( () otherlv_1= 'screenActuator' )
            // InternalBorduino.g:467:3: () otherlv_1= 'screenActuator'
            {
            // InternalBorduino.g:467:3: ()
            // InternalBorduino.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLCDScreenActuatorAccess().getLCDScreenActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLCDScreenActuatorAccess().getScreenActuatorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLCDScreenActuator"


    // $ANTLR start "entryRuleKeyboardSensor"
    // InternalBorduino.g:482:1: entryRuleKeyboardSensor returns [EObject current=null] : iv_ruleKeyboardSensor= ruleKeyboardSensor EOF ;
    public final EObject entryRuleKeyboardSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyboardSensor = null;


        try {
            // InternalBorduino.g:482:55: (iv_ruleKeyboardSensor= ruleKeyboardSensor EOF )
            // InternalBorduino.g:483:2: iv_ruleKeyboardSensor= ruleKeyboardSensor EOF
            {
             newCompositeNode(grammarAccess.getKeyboardSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyboardSensor=ruleKeyboardSensor();

            state._fsp--;

             current =iv_ruleKeyboardSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyboardSensor"


    // $ANTLR start "ruleKeyboardSensor"
    // InternalBorduino.g:489:1: ruleKeyboardSensor returns [EObject current=null] : ( () otherlv_1= 'keyboardSensor' ) ;
    public final EObject ruleKeyboardSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:495:2: ( ( () otherlv_1= 'keyboardSensor' ) )
            // InternalBorduino.g:496:2: ( () otherlv_1= 'keyboardSensor' )
            {
            // InternalBorduino.g:496:2: ( () otherlv_1= 'keyboardSensor' )
            // InternalBorduino.g:497:3: () otherlv_1= 'keyboardSensor'
            {
            // InternalBorduino.g:497:3: ()
            // InternalBorduino.g:498:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyboardSensorAccess().getKeyboardSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyboardSensorAccess().getKeyboardSensorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyboardSensor"


    // $ANTLR start "entryRuleSensor"
    // InternalBorduino.g:512:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalBorduino.g:512:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalBorduino.g:513:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalBorduino.g:519:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:525:2: ( ( () otherlv_1= 'sensor' ) )
            // InternalBorduino.g:526:2: ( () otherlv_1= 'sensor' )
            {
            // InternalBorduino.g:526:2: ( () otherlv_1= 'sensor' )
            // InternalBorduino.g:527:3: () otherlv_1= 'sensor'
            {
            // InternalBorduino.g:527:3: ()
            // InternalBorduino.g:528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEString"
    // InternalBorduino.g:542:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBorduino.g:542:47: (iv_ruleEString= ruleEString EOF )
            // InternalBorduino.g:543:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBorduino.g:549:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:555:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBorduino.g:556:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBorduino.g:556:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBorduino.g:557:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBorduino.g:565:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalBorduino.g:576:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBorduino.g:576:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBorduino.g:577:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBorduino.g:583:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:589:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBorduino.g:590:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBorduino.g:590:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBorduino.g:591:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBorduino.g:591:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBorduino.g:592:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleState"
    // InternalBorduino.g:609:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalBorduino.g:609:46: (iv_ruleState= ruleState EOF )
            // InternalBorduino.g:610:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalBorduino.g:616:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:622:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' ) )
            // InternalBorduino.g:623:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' )
            {
            // InternalBorduino.g:623:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' )
            // InternalBorduino.g:624:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}'
            {
            // InternalBorduino.g:624:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBorduino.g:625:4: (lv_name_0_0= ruleEString )
            {
            // InternalBorduino.g:625:4: (lv_name_0_0= ruleEString )
            // InternalBorduino.g:626:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBorduino.g:647:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalBorduino.g:648:4: (lv_actions_2_0= ruleAction )
            {
            // InternalBorduino.g:648:4: (lv_actions_2_0= ruleAction )
            // InternalBorduino.g:649:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBorduino.g:666:3: ( (lv_actions_3_0= ruleAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==17) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==17) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalBorduino.g:667:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalBorduino.g:667:4: (lv_actions_3_0= ruleAction )
            	    // InternalBorduino.g:668:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"com.polytech.unice.borduino.concretesyntax.Borduino.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalBorduino.g:685:3: ( (lv_transition_4_0= ruleTransition ) )
            // InternalBorduino.g:686:4: (lv_transition_4_0= ruleTransition )
            {
            // InternalBorduino.g:686:4: (lv_transition_4_0= ruleTransition )
            // InternalBorduino.g:687:5: lv_transition_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_transition_4_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_4_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalBorduino.g:712:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBorduino.g:712:47: (iv_ruleAction= ruleAction EOF )
            // InternalBorduino.g:713:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBorduino.g:719:1: ruleAction returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:725:2: ( ( ( ( ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSignal ) ) ) )
            // InternalBorduino.g:726:2: ( ( ( ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSignal ) ) )
            {
            // InternalBorduino.g:726:2: ( ( ( ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSignal ) ) )
            // InternalBorduino.g:727:3: ( ( ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSignal ) )
            {
            // InternalBorduino.g:727:3: ( ( ruleEString ) )
            // InternalBorduino.g:728:4: ( ruleEString )
            {
            // InternalBorduino.g:728:4: ( ruleEString )
            // InternalBorduino.g:729:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getColonKeyword_1());
            		
            // InternalBorduino.g:747:3: ( (lv_value_2_0= ruleSignal ) )
            // InternalBorduino.g:748:4: (lv_value_2_0= ruleSignal )
            {
            // InternalBorduino.g:748:4: (lv_value_2_0= ruleSignal )
            // InternalBorduino.g:749:5: lv_value_2_0= ruleSignal
            {

            					newCompositeNode(grammarAccess.getActionAccess().getValueSignalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleSignal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Signal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalBorduino.g:770:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalBorduino.g:770:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalBorduino.g:771:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalBorduino.g:777:1: ruleTransition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleInitialCondition ) ) ( (lv_conditions_1_0= ruleCondition ) )* otherlv_2= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_conditions_0_0 = null;

        EObject lv_conditions_1_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:783:2: ( ( ( (lv_conditions_0_0= ruleInitialCondition ) ) ( (lv_conditions_1_0= ruleCondition ) )* otherlv_2= ':' ( ( ruleEString ) ) ) )
            // InternalBorduino.g:784:2: ( ( (lv_conditions_0_0= ruleInitialCondition ) ) ( (lv_conditions_1_0= ruleCondition ) )* otherlv_2= ':' ( ( ruleEString ) ) )
            {
            // InternalBorduino.g:784:2: ( ( (lv_conditions_0_0= ruleInitialCondition ) ) ( (lv_conditions_1_0= ruleCondition ) )* otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalBorduino.g:785:3: ( (lv_conditions_0_0= ruleInitialCondition ) ) ( (lv_conditions_1_0= ruleCondition ) )* otherlv_2= ':' ( ( ruleEString ) )
            {
            // InternalBorduino.g:785:3: ( (lv_conditions_0_0= ruleInitialCondition ) )
            // InternalBorduino.g:786:4: (lv_conditions_0_0= ruleInitialCondition )
            {
            // InternalBorduino.g:786:4: (lv_conditions_0_0= ruleInitialCondition )
            // InternalBorduino.g:787:5: lv_conditions_0_0= ruleInitialCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionsInitialConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_conditions_0_0=ruleInitialCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_0_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.InitialCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBorduino.g:804:3: ( (lv_conditions_1_0= ruleCondition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBorduino.g:805:4: (lv_conditions_1_0= ruleCondition )
            	    {
            	    // InternalBorduino.g:805:4: (lv_conditions_1_0= ruleCondition )
            	    // InternalBorduino.g:806:5: lv_conditions_1_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_conditions_1_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_1_0,
            	    						"com.polytech.unice.borduino.concretesyntax.Borduino.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
            		
            // InternalBorduino.g:827:3: ( ( ruleEString ) )
            // InternalBorduino.g:828:4: ( ruleEString )
            {
            // InternalBorduino.g:828:4: ( ruleEString )
            // InternalBorduino.g:829:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCondition"
    // InternalBorduino.g:847:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBorduino.g:847:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBorduino.g:848:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalBorduino.g:854:1: ruleCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleOperator ) ) ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_signal_3_0= ruleSignal ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_signal_3_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:860:2: ( ( ( (lv_operator_0_0= ruleOperator ) ) ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_signal_3_0= ruleSignal ) ) ) )
            // InternalBorduino.g:861:2: ( ( (lv_operator_0_0= ruleOperator ) ) ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_signal_3_0= ruleSignal ) ) )
            {
            // InternalBorduino.g:861:2: ( ( (lv_operator_0_0= ruleOperator ) ) ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_signal_3_0= ruleSignal ) ) )
            // InternalBorduino.g:862:3: ( (lv_operator_0_0= ruleOperator ) ) ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_signal_3_0= ruleSignal ) )
            {
            // InternalBorduino.g:862:3: ( (lv_operator_0_0= ruleOperator ) )
            // InternalBorduino.g:863:4: (lv_operator_0_0= ruleOperator )
            {
            // InternalBorduino.g:863:4: (lv_operator_0_0= ruleOperator )
            // InternalBorduino.g:864:5: lv_operator_0_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_operator_0_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBorduino.g:881:3: ( ( ruleEString ) )
            // InternalBorduino.g:882:4: ( ruleEString )
            {
            // InternalBorduino.g:882:4: ( ruleEString )
            // InternalBorduino.g:883:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getSensorSensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getIsKeyword_2());
            		
            // InternalBorduino.g:901:3: ( (lv_signal_3_0= ruleSignal ) )
            // InternalBorduino.g:902:4: (lv_signal_3_0= ruleSignal )
            {
            // InternalBorduino.g:902:4: (lv_signal_3_0= ruleSignal )
            // InternalBorduino.g:903:5: lv_signal_3_0= ruleSignal
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getSignalSignalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_signal_3_0=ruleSignal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"signal",
            						lv_signal_3_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Signal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleInitialCondition"
    // InternalBorduino.g:924:1: entryRuleInitialCondition returns [EObject current=null] : iv_ruleInitialCondition= ruleInitialCondition EOF ;
    public final EObject entryRuleInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialCondition = null;


        try {
            // InternalBorduino.g:924:57: (iv_ruleInitialCondition= ruleInitialCondition EOF )
            // InternalBorduino.g:925:2: iv_ruleInitialCondition= ruleInitialCondition EOF
            {
             newCompositeNode(grammarAccess.getInitialConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialCondition=ruleInitialCondition();

            state._fsp--;

             current =iv_ruleInitialCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialCondition"


    // $ANTLR start "ruleInitialCondition"
    // InternalBorduino.g:931:1: ruleInitialCondition returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_signal_2_0= ruleSignal ) ) ) ;
    public final EObject ruleInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_signal_2_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:937:2: ( ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_signal_2_0= ruleSignal ) ) ) )
            // InternalBorduino.g:938:2: ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_signal_2_0= ruleSignal ) ) )
            {
            // InternalBorduino.g:938:2: ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_signal_2_0= ruleSignal ) ) )
            // InternalBorduino.g:939:3: ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_signal_2_0= ruleSignal ) )
            {
            // InternalBorduino.g:939:3: ( ( ruleEString ) )
            // InternalBorduino.g:940:4: ( ruleEString )
            {
            // InternalBorduino.g:940:4: ( ruleEString )
            // InternalBorduino.g:941:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInitialConditionAccess().getSensorSensorCrossReference_0_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialConditionAccess().getIsKeyword_1());
            		
            // InternalBorduino.g:959:3: ( (lv_signal_2_0= ruleSignal ) )
            // InternalBorduino.g:960:4: (lv_signal_2_0= ruleSignal )
            {
            // InternalBorduino.g:960:4: (lv_signal_2_0= ruleSignal )
            // InternalBorduino.g:961:5: lv_signal_2_0= ruleSignal
            {

            					newCompositeNode(grammarAccess.getInitialConditionAccess().getSignalSignalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_signal_2_0=ruleSignal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialConditionRule());
            					}
            					set(
            						current,
            						"signal",
            						lv_signal_2_0,
            						"com.polytech.unice.borduino.concretesyntax.Borduino.Signal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialCondition"


    // $ANTLR start "entryRuleSignal"
    // InternalBorduino.g:982:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalBorduino.g:982:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalBorduino.g:983:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalBorduino.g:989:1: ruleSignal returns [EObject current=null] : (this_DigitalSignal_0= ruleDigitalSignal | this_StringSignal_1= ruleStringSignal ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        EObject this_DigitalSignal_0 = null;

        EObject this_StringSignal_1 = null;



        	enterRule();

        try {
            // InternalBorduino.g:995:2: ( (this_DigitalSignal_0= ruleDigitalSignal | this_StringSignal_1= ruleStringSignal ) )
            // InternalBorduino.g:996:2: (this_DigitalSignal_0= ruleDigitalSignal | this_StringSignal_1= ruleStringSignal )
            {
            // InternalBorduino.g:996:2: (this_DigitalSignal_0= ruleDigitalSignal | this_StringSignal_1= ruleStringSignal )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBorduino.g:997:3: this_DigitalSignal_0= ruleDigitalSignal
                    {

                    			newCompositeNode(grammarAccess.getSignalAccess().getDigitalSignalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DigitalSignal_0=ruleDigitalSignal();

                    state._fsp--;


                    			current = this_DigitalSignal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBorduino.g:1006:3: this_StringSignal_1= ruleStringSignal
                    {

                    			newCompositeNode(grammarAccess.getSignalAccess().getStringSignalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringSignal_1=ruleStringSignal();

                    state._fsp--;


                    			current = this_StringSignal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleDigitalSignal"
    // InternalBorduino.g:1018:1: entryRuleDigitalSignal returns [EObject current=null] : iv_ruleDigitalSignal= ruleDigitalSignal EOF ;
    public final EObject entryRuleDigitalSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalSignal = null;


        try {
            // InternalBorduino.g:1018:54: (iv_ruleDigitalSignal= ruleDigitalSignal EOF )
            // InternalBorduino.g:1019:2: iv_ruleDigitalSignal= ruleDigitalSignal EOF
            {
             newCompositeNode(grammarAccess.getDigitalSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalSignal=ruleDigitalSignal();

            state._fsp--;

             current =iv_ruleDigitalSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalSignal"


    // $ANTLR start "ruleDigitalSignal"
    // InternalBorduino.g:1025:1: ruleDigitalSignal returns [EObject current=null] : ( (lv_value_0_0= ruleDigitalSignalEnum ) ) ;
    public final EObject ruleDigitalSignal() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:1031:2: ( ( (lv_value_0_0= ruleDigitalSignalEnum ) ) )
            // InternalBorduino.g:1032:2: ( (lv_value_0_0= ruleDigitalSignalEnum ) )
            {
            // InternalBorduino.g:1032:2: ( (lv_value_0_0= ruleDigitalSignalEnum ) )
            // InternalBorduino.g:1033:3: (lv_value_0_0= ruleDigitalSignalEnum )
            {
            // InternalBorduino.g:1033:3: (lv_value_0_0= ruleDigitalSignalEnum )
            // InternalBorduino.g:1034:4: lv_value_0_0= ruleDigitalSignalEnum
            {

            				newCompositeNode(grammarAccess.getDigitalSignalAccess().getValueDigitalSignalEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDigitalSignalEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDigitalSignalRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.polytech.unice.borduino.concretesyntax.Borduino.DigitalSignalEnum");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalSignal"


    // $ANTLR start "entryRuleStringSignal"
    // InternalBorduino.g:1054:1: entryRuleStringSignal returns [EObject current=null] : iv_ruleStringSignal= ruleStringSignal EOF ;
    public final EObject entryRuleStringSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringSignal = null;


        try {
            // InternalBorduino.g:1054:53: (iv_ruleStringSignal= ruleStringSignal EOF )
            // InternalBorduino.g:1055:2: iv_ruleStringSignal= ruleStringSignal EOF
            {
             newCompositeNode(grammarAccess.getStringSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringSignal=ruleStringSignal();

            state._fsp--;

             current =iv_ruleStringSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringSignal"


    // $ANTLR start "ruleStringSignal"
    // InternalBorduino.g:1061:1: ruleStringSignal returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringSignal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalBorduino.g:1067:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalBorduino.g:1068:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalBorduino.g:1068:2: ( (lv_value_0_0= ruleEString ) )
            // InternalBorduino.g:1069:3: (lv_value_0_0= ruleEString )
            {
            // InternalBorduino.g:1069:3: (lv_value_0_0= ruleEString )
            // InternalBorduino.g:1070:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringSignalAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringSignalRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"com.polytech.unice.borduino.concretesyntax.Borduino.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringSignal"


    // $ANTLR start "ruleOperator"
    // InternalBorduino.g:1090:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:1096:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalBorduino.g:1097:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalBorduino.g:1097:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBorduino.g:1098:3: (enumLiteral_0= 'and' )
                    {
                    // InternalBorduino.g:1098:3: (enumLiteral_0= 'and' )
                    // InternalBorduino.g:1099:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:1106:3: (enumLiteral_1= 'or' )
                    {
                    // InternalBorduino.g:1106:3: (enumLiteral_1= 'or' )
                    // InternalBorduino.g:1107:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleDigitalSignalEnum"
    // InternalBorduino.g:1117:1: ruleDigitalSignalEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleDigitalSignalEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBorduino.g:1123:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalBorduino.g:1124:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalBorduino.g:1124:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBorduino.g:1125:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalBorduino.g:1125:3: (enumLiteral_0= 'HIGH' )
                    // InternalBorduino.g:1126:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDigitalSignalEnumAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDigitalSignalEnumAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBorduino.g:1133:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalBorduino.g:1133:3: (enumLiteral_1= 'LOW' )
                    // InternalBorduino.g:1134:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDigitalSignalEnumAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDigitalSignalEnumAccess().getLOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalSignalEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});

}