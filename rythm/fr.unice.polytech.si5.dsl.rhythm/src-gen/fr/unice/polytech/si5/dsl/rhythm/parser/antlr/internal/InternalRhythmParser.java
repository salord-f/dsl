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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRhythmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rhythm'", "'tempo'", "'BPM'", "'resolution:'", "'offset:'", "'tick'", "'track'", "'{'", "'patterns:'", "'sections:'", "'}'", "','", "'beat:'", "'pattern:'", "'times'", "'(iteration:'", "',beat:'", "'):'", "'.'", "'bd'", "'sd'", "'_'", "'ch'", "'oh'", "'cc'", "'rc'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRhythmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRhythmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRhythmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRhythm.g"; }



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




    // $ANTLR start "entryRuleRhythm"
    // InternalRhythm.g:65:1: entryRuleRhythm returns [EObject current=null] : iv_ruleRhythm= ruleRhythm EOF ;
    public final EObject entryRuleRhythm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRhythm = null;


        try {
            // InternalRhythm.g:65:47: (iv_ruleRhythm= ruleRhythm EOF )
            // InternalRhythm.g:66:2: iv_ruleRhythm= ruleRhythm EOF
            {
             newCompositeNode(grammarAccess.getRhythmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRhythm=ruleRhythm();

            state._fsp--;

             current =iv_ruleRhythm; 
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
    // $ANTLR end "entryRuleRhythm"


    // $ANTLR start "ruleRhythm"
    // InternalRhythm.g:72:1: ruleRhythm returns [EObject current=null] : (otherlv_0= 'rhythm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'tempo' ( (lv_BPM_3_0= ruleEInt ) ) otherlv_4= 'BPM' otherlv_5= 'resolution:' ( (lv_resolution_6_0= ruleEInt ) ) otherlv_7= 'offset:' ( (lv_offset_8_0= ruleEFloat ) ) otherlv_9= 'tick' ( (lv_tracks_10_0= ruleTrack ) ) ( (lv_tracks_11_0= ruleTrack ) )* ) ;
    public final EObject ruleRhythm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_BPM_3_0 = null;

        AntlrDatatypeRuleToken lv_resolution_6_0 = null;

        AntlrDatatypeRuleToken lv_offset_8_0 = null;

        EObject lv_tracks_10_0 = null;

        EObject lv_tracks_11_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:78:2: ( (otherlv_0= 'rhythm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'tempo' ( (lv_BPM_3_0= ruleEInt ) ) otherlv_4= 'BPM' otherlv_5= 'resolution:' ( (lv_resolution_6_0= ruleEInt ) ) otherlv_7= 'offset:' ( (lv_offset_8_0= ruleEFloat ) ) otherlv_9= 'tick' ( (lv_tracks_10_0= ruleTrack ) ) ( (lv_tracks_11_0= ruleTrack ) )* ) )
            // InternalRhythm.g:79:2: (otherlv_0= 'rhythm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'tempo' ( (lv_BPM_3_0= ruleEInt ) ) otherlv_4= 'BPM' otherlv_5= 'resolution:' ( (lv_resolution_6_0= ruleEInt ) ) otherlv_7= 'offset:' ( (lv_offset_8_0= ruleEFloat ) ) otherlv_9= 'tick' ( (lv_tracks_10_0= ruleTrack ) ) ( (lv_tracks_11_0= ruleTrack ) )* )
            {
            // InternalRhythm.g:79:2: (otherlv_0= 'rhythm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'tempo' ( (lv_BPM_3_0= ruleEInt ) ) otherlv_4= 'BPM' otherlv_5= 'resolution:' ( (lv_resolution_6_0= ruleEInt ) ) otherlv_7= 'offset:' ( (lv_offset_8_0= ruleEFloat ) ) otherlv_9= 'tick' ( (lv_tracks_10_0= ruleTrack ) ) ( (lv_tracks_11_0= ruleTrack ) )* )
            // InternalRhythm.g:80:3: otherlv_0= 'rhythm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'tempo' ( (lv_BPM_3_0= ruleEInt ) ) otherlv_4= 'BPM' otherlv_5= 'resolution:' ( (lv_resolution_6_0= ruleEInt ) ) otherlv_7= 'offset:' ( (lv_offset_8_0= ruleEFloat ) ) otherlv_9= 'tick' ( (lv_tracks_10_0= ruleTrack ) ) ( (lv_tracks_11_0= ruleTrack ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRhythmAccess().getRhythmKeyword_0());
            		
            // InternalRhythm.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRhythm.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalRhythm.g:85:4: (lv_name_1_0= ruleEString )
            // InternalRhythm.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRhythmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRhythmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRhythmAccess().getTempoKeyword_2());
            		
            // InternalRhythm.g:107:3: ( (lv_BPM_3_0= ruleEInt ) )
            // InternalRhythm.g:108:4: (lv_BPM_3_0= ruleEInt )
            {
            // InternalRhythm.g:108:4: (lv_BPM_3_0= ruleEInt )
            // InternalRhythm.g:109:5: lv_BPM_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRhythmAccess().getBPMEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_BPM_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRhythmRule());
            					}
            					set(
            						current,
            						"BPM",
            						lv_BPM_3_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRhythmAccess().getBPMKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRhythmAccess().getResolutionKeyword_5());
            		
            // InternalRhythm.g:134:3: ( (lv_resolution_6_0= ruleEInt ) )
            // InternalRhythm.g:135:4: (lv_resolution_6_0= ruleEInt )
            {
            // InternalRhythm.g:135:4: (lv_resolution_6_0= ruleEInt )
            // InternalRhythm.g:136:5: lv_resolution_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRhythmAccess().getResolutionEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_resolution_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRhythmRule());
            					}
            					set(
            						current,
            						"resolution",
            						lv_resolution_6_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getRhythmAccess().getOffsetKeyword_7());
            		
            // InternalRhythm.g:157:3: ( (lv_offset_8_0= ruleEFloat ) )
            // InternalRhythm.g:158:4: (lv_offset_8_0= ruleEFloat )
            {
            // InternalRhythm.g:158:4: (lv_offset_8_0= ruleEFloat )
            // InternalRhythm.g:159:5: lv_offset_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRhythmAccess().getOffsetEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_offset_8_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRhythmRule());
            					}
            					set(
            						current,
            						"offset",
            						lv_offset_8_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getRhythmAccess().getTickKeyword_9());
            		
            // InternalRhythm.g:180:3: ( (lv_tracks_10_0= ruleTrack ) )
            // InternalRhythm.g:181:4: (lv_tracks_10_0= ruleTrack )
            {
            // InternalRhythm.g:181:4: (lv_tracks_10_0= ruleTrack )
            // InternalRhythm.g:182:5: lv_tracks_10_0= ruleTrack
            {

            					newCompositeNode(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_tracks_10_0=ruleTrack();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRhythmRule());
            					}
            					add(
            						current,
            						"tracks",
            						lv_tracks_10_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Track");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhythm.g:199:3: ( (lv_tracks_11_0= ruleTrack ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRhythm.g:200:4: (lv_tracks_11_0= ruleTrack )
            	    {
            	    // InternalRhythm.g:200:4: (lv_tracks_11_0= ruleTrack )
            	    // InternalRhythm.g:201:5: lv_tracks_11_0= ruleTrack
            	    {

            	    					newCompositeNode(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_tracks_11_0=ruleTrack();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRhythmRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tracks",
            	    						lv_tracks_11_0,
            	    						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Track");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleRhythm"


    // $ANTLR start "entryRuleTrack"
    // InternalRhythm.g:222:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalRhythm.g:222:46: (iv_ruleTrack= ruleTrack EOF )
            // InternalRhythm.g:223:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
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
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalRhythm.g:229:1: ruleTrack returns [EObject current=null] : (otherlv_0= 'track' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )* )? otherlv_6= 'sections:' ( (lv_sections_7_0= ruleSection ) ) ( (lv_sections_8_0= ruleSection ) )* otherlv_9= '}' ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_patterns_4_0 = null;

        EObject lv_patterns_5_0 = null;

        EObject lv_sections_7_0 = null;

        EObject lv_sections_8_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:235:2: ( (otherlv_0= 'track' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )* )? otherlv_6= 'sections:' ( (lv_sections_7_0= ruleSection ) ) ( (lv_sections_8_0= ruleSection ) )* otherlv_9= '}' ) )
            // InternalRhythm.g:236:2: (otherlv_0= 'track' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )* )? otherlv_6= 'sections:' ( (lv_sections_7_0= ruleSection ) ) ( (lv_sections_8_0= ruleSection ) )* otherlv_9= '}' )
            {
            // InternalRhythm.g:236:2: (otherlv_0= 'track' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )* )? otherlv_6= 'sections:' ( (lv_sections_7_0= ruleSection ) ) ( (lv_sections_8_0= ruleSection ) )* otherlv_9= '}' )
            // InternalRhythm.g:237:3: otherlv_0= 'track' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )* )? otherlv_6= 'sections:' ( (lv_sections_7_0= ruleSection ) ) ( (lv_sections_8_0= ruleSection ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTrackKeyword_0());
            		
            // InternalRhythm.g:241:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRhythm.g:242:4: (lv_name_1_0= ruleEString )
            {
            // InternalRhythm.g:242:4: (lv_name_1_0= ruleEString )
            // InternalRhythm.g:243:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrackRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRhythm.g:264:3: (otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRhythm.g:265:4: otherlv_3= 'patterns:' ( (lv_patterns_4_0= rulePattern ) ) ( (lv_patterns_5_0= rulePattern ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getPatternsKeyword_3_0());
                    			
                    // InternalRhythm.g:269:4: ( (lv_patterns_4_0= rulePattern ) )
                    // InternalRhythm.g:270:5: (lv_patterns_4_0= rulePattern )
                    {
                    // InternalRhythm.g:270:5: (lv_patterns_4_0= rulePattern )
                    // InternalRhythm.g:271:6: lv_patterns_4_0= rulePattern
                    {

                    						newCompositeNode(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_patterns_4_0=rulePattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrackRule());
                    						}
                    						add(
                    							current,
                    							"patterns",
                    							lv_patterns_4_0,
                    							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Pattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRhythm.g:288:4: ( (lv_patterns_5_0= rulePattern ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRhythm.g:289:5: (lv_patterns_5_0= rulePattern )
                    	    {
                    	    // InternalRhythm.g:289:5: (lv_patterns_5_0= rulePattern )
                    	    // InternalRhythm.g:290:6: lv_patterns_5_0= rulePattern
                    	    {

                    	    						newCompositeNode(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_patterns_5_0=rulePattern();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTrackRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"patterns",
                    	    							lv_patterns_5_0,
                    	    							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Pattern");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTrackAccess().getSectionsKeyword_4());
            		
            // InternalRhythm.g:312:3: ( (lv_sections_7_0= ruleSection ) )
            // InternalRhythm.g:313:4: (lv_sections_7_0= ruleSection )
            {
            // InternalRhythm.g:313:4: (lv_sections_7_0= ruleSection )
            // InternalRhythm.g:314:5: lv_sections_7_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_sections_7_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrackRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_7_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhythm.g:331:3: ( (lv_sections_8_0= ruleSection ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRhythm.g:332:4: (lv_sections_8_0= ruleSection )
            	    {
            	    // InternalRhythm.g:332:4: (lv_sections_8_0= ruleSection )
            	    // InternalRhythm.g:333:5: lv_sections_8_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_sections_8_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTrackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_8_0,
            	    						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRulePattern"
    // InternalRhythm.g:358:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalRhythm.g:358:48: (iv_rulePattern= rulePattern EOF )
            // InternalRhythm.g:359:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalRhythm.g:365:1: rulePattern returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_bar_2_0= rulePatternBar ) ) otherlv_3= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_bar_2_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:371:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_bar_2_0= rulePatternBar ) ) otherlv_3= '}' ) )
            // InternalRhythm.g:372:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_bar_2_0= rulePatternBar ) ) otherlv_3= '}' )
            {
            // InternalRhythm.g:372:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_bar_2_0= rulePatternBar ) ) otherlv_3= '}' )
            // InternalRhythm.g:373:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_bar_2_0= rulePatternBar ) ) otherlv_3= '}'
            {
            // InternalRhythm.g:373:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRhythm.g:374:4: (lv_name_0_0= ruleEString )
            {
            // InternalRhythm.g:374:4: (lv_name_0_0= ruleEString )
            // InternalRhythm.g:375:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRhythm.g:396:3: ( (lv_bar_2_0= rulePatternBar ) )
            // InternalRhythm.g:397:4: (lv_bar_2_0= rulePatternBar )
            {
            // InternalRhythm.g:397:4: (lv_bar_2_0= rulePatternBar )
            // InternalRhythm.g:398:5: lv_bar_2_0= rulePatternBar
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getBarPatternBarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_bar_2_0=rulePatternBar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"bar",
            						lv_bar_2_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternBar");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBeat"
    // InternalRhythm.g:423:1: entryRuleBeat returns [EObject current=null] : iv_ruleBeat= ruleBeat EOF ;
    public final EObject entryRuleBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeat = null;


        try {
            // InternalRhythm.g:423:45: (iv_ruleBeat= ruleBeat EOF )
            // InternalRhythm.g:424:2: iv_ruleBeat= ruleBeat EOF
            {
             newCompositeNode(grammarAccess.getBeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeat=ruleBeat();

            state._fsp--;

             current =iv_ruleBeat; 
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
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalRhythm.g:430:1: ruleBeat returns [EObject current=null] : ( ( (lv_ticks_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) ) )* ) ;
    public final EObject ruleBeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_ticks_0_0 = null;

        Enumerator lv_ticks_2_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:436:2: ( ( ( (lv_ticks_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) ) )* ) )
            // InternalRhythm.g:437:2: ( ( (lv_ticks_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) ) )* )
            {
            // InternalRhythm.g:437:2: ( ( (lv_ticks_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) ) )* )
            // InternalRhythm.g:438:3: ( (lv_ticks_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) ) )*
            {
            // InternalRhythm.g:438:3: ( (lv_ticks_0_0= ruleNote ) )
            // InternalRhythm.g:439:4: (lv_ticks_0_0= ruleNote )
            {
            // InternalRhythm.g:439:4: (lv_ticks_0_0= ruleNote )
            // InternalRhythm.g:440:5: lv_ticks_0_0= ruleNote
            {

            					newCompositeNode(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_ticks_0_0=ruleNote();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeatRule());
            					}
            					add(
            						current,
            						"ticks",
            						lv_ticks_0_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Note");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhythm.g:457:3: (otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRhythm.g:458:4: otherlv_1= ',' ( (lv_ticks_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBeatAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRhythm.g:462:4: ( (lv_ticks_2_0= ruleNote ) )
            	    // InternalRhythm.g:463:5: (lv_ticks_2_0= ruleNote )
            	    {
            	    // InternalRhythm.g:463:5: (lv_ticks_2_0= ruleNote )
            	    // InternalRhythm.g:464:6: lv_ticks_2_0= ruleNote
            	    {

            	    						newCompositeNode(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_ticks_2_0=ruleNote();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBeatRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ticks",
            	    							lv_ticks_2_0,
            	    							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Note");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRulePatternBar"
    // InternalRhythm.g:486:1: entryRulePatternBar returns [EObject current=null] : iv_rulePatternBar= rulePatternBar EOF ;
    public final EObject entryRulePatternBar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternBar = null;


        try {
            // InternalRhythm.g:486:51: (iv_rulePatternBar= rulePatternBar EOF )
            // InternalRhythm.g:487:2: iv_rulePatternBar= rulePatternBar EOF
            {
             newCompositeNode(grammarAccess.getPatternBarRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternBar=rulePatternBar();

            state._fsp--;

             current =iv_rulePatternBar; 
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
    // $ANTLR end "entryRulePatternBar"


    // $ANTLR start "rulePatternBar"
    // InternalRhythm.g:493:1: rulePatternBar returns [EObject current=null] : (otherlv_0= 'beat:' ( (lv_beats_1_0= ruleBeat ) ) (otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) ) )* ) ;
    public final EObject rulePatternBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_beats_1_0 = null;

        EObject lv_beats_3_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:499:2: ( (otherlv_0= 'beat:' ( (lv_beats_1_0= ruleBeat ) ) (otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) ) )* ) )
            // InternalRhythm.g:500:2: (otherlv_0= 'beat:' ( (lv_beats_1_0= ruleBeat ) ) (otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) ) )* )
            {
            // InternalRhythm.g:500:2: (otherlv_0= 'beat:' ( (lv_beats_1_0= ruleBeat ) ) (otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) ) )* )
            // InternalRhythm.g:501:3: otherlv_0= 'beat:' ( (lv_beats_1_0= ruleBeat ) ) (otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternBarAccess().getBeatKeyword_0());
            		
            // InternalRhythm.g:505:3: ( (lv_beats_1_0= ruleBeat ) )
            // InternalRhythm.g:506:4: (lv_beats_1_0= ruleBeat )
            {
            // InternalRhythm.g:506:4: (lv_beats_1_0= ruleBeat )
            // InternalRhythm.g:507:5: lv_beats_1_0= ruleBeat
            {

            					newCompositeNode(grammarAccess.getPatternBarAccess().getBeatsBeatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_beats_1_0=ruleBeat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternBarRule());
            					}
            					add(
            						current,
            						"beats",
            						lv_beats_1_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhythm.g:524:3: (otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRhythm.g:525:4: otherlv_2= 'beat:' ( (lv_beats_3_0= ruleBeat ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_19); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPatternBarAccess().getBeatKeyword_2_0());
            	    			
            	    // InternalRhythm.g:529:4: ( (lv_beats_3_0= ruleBeat ) )
            	    // InternalRhythm.g:530:5: (lv_beats_3_0= ruleBeat )
            	    {
            	    // InternalRhythm.g:530:5: (lv_beats_3_0= ruleBeat )
            	    // InternalRhythm.g:531:6: lv_beats_3_0= ruleBeat
            	    {

            	    						newCompositeNode(grammarAccess.getPatternBarAccess().getBeatsBeatParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_beats_3_0=ruleBeat();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternBarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"beats",
            	    							lv_beats_3_0,
            	    							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "rulePatternBar"


    // $ANTLR start "entryRuleSection"
    // InternalRhythm.g:553:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalRhythm.g:553:48: (iv_ruleSection= ruleSection EOF )
            // InternalRhythm.g:554:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalRhythm.g:560:1: ruleSection returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'pattern:' ( (lv_patternLoops_3_0= rulePatternLoop ) ) (otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) ) )* ( (lv_patternModifications_6_0= rulePatternModification ) )* otherlv_7= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_patternLoops_3_0 = null;

        EObject lv_patternLoops_5_0 = null;

        EObject lv_patternModifications_6_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:566:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'pattern:' ( (lv_patternLoops_3_0= rulePatternLoop ) ) (otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) ) )* ( (lv_patternModifications_6_0= rulePatternModification ) )* otherlv_7= '}' ) )
            // InternalRhythm.g:567:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'pattern:' ( (lv_patternLoops_3_0= rulePatternLoop ) ) (otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) ) )* ( (lv_patternModifications_6_0= rulePatternModification ) )* otherlv_7= '}' )
            {
            // InternalRhythm.g:567:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'pattern:' ( (lv_patternLoops_3_0= rulePatternLoop ) ) (otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) ) )* ( (lv_patternModifications_6_0= rulePatternModification ) )* otherlv_7= '}' )
            // InternalRhythm.g:568:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'pattern:' ( (lv_patternLoops_3_0= rulePatternLoop ) ) (otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) ) )* ( (lv_patternModifications_6_0= rulePatternModification ) )* otherlv_7= '}'
            {
            // InternalRhythm.g:568:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRhythm.g:569:4: (lv_name_0_0= ruleEString )
            {
            // InternalRhythm.g:569:4: (lv_name_0_0= ruleEString )
            // InternalRhythm.g:570:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getPatternKeyword_2());
            		
            // InternalRhythm.g:595:3: ( (lv_patternLoops_3_0= rulePatternLoop ) )
            // InternalRhythm.g:596:4: (lv_patternLoops_3_0= rulePatternLoop )
            {
            // InternalRhythm.g:596:4: (lv_patternLoops_3_0= rulePatternLoop )
            // InternalRhythm.g:597:5: lv_patternLoops_3_0= rulePatternLoop
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_patternLoops_3_0=rulePatternLoop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					add(
            						current,
            						"patternLoops",
            						lv_patternLoops_3_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternLoop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhythm.g:614:3: (otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRhythm.g:615:4: otherlv_4= ',' ( (lv_patternLoops_5_0= rulePatternLoop ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRhythm.g:619:4: ( (lv_patternLoops_5_0= rulePatternLoop ) )
            	    // InternalRhythm.g:620:5: (lv_patternLoops_5_0= rulePatternLoop )
            	    {
            	    // InternalRhythm.g:620:5: (lv_patternLoops_5_0= rulePatternLoop )
            	    // InternalRhythm.g:621:6: lv_patternLoops_5_0= rulePatternLoop
            	    {

            	    						newCompositeNode(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_patternLoops_5_0=rulePatternLoop();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"patternLoops",
            	    							lv_patternLoops_5_0,
            	    							"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternLoop");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalRhythm.g:639:3: ( (lv_patternModifications_6_0= rulePatternModification ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRhythm.g:640:4: (lv_patternModifications_6_0= rulePatternModification )
            	    {
            	    // InternalRhythm.g:640:4: (lv_patternModifications_6_0= rulePatternModification )
            	    // InternalRhythm.g:641:5: lv_patternModifications_6_0= rulePatternModification
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getPatternModificationsPatternModificationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_patternModifications_6_0=rulePatternModification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"patternModifications",
            	    						lv_patternModifications_6_0,
            	    						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.PatternModification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRulePatternLoop"
    // InternalRhythm.g:666:1: entryRulePatternLoop returns [EObject current=null] : iv_rulePatternLoop= rulePatternLoop EOF ;
    public final EObject entryRulePatternLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternLoop = null;


        try {
            // InternalRhythm.g:666:52: (iv_rulePatternLoop= rulePatternLoop EOF )
            // InternalRhythm.g:667:2: iv_rulePatternLoop= rulePatternLoop EOF
            {
             newCompositeNode(grammarAccess.getPatternLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternLoop=rulePatternLoop();

            state._fsp--;

             current =iv_rulePatternLoop; 
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
    // $ANTLR end "entryRulePatternLoop"


    // $ANTLR start "rulePatternLoop"
    // InternalRhythm.g:673:1: rulePatternLoop returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_loopNumber_1_0= ruleEInt ) ) otherlv_2= 'times' ) ;
    public final EObject rulePatternLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_loopNumber_1_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:679:2: ( ( ( ( ruleEString ) ) ( (lv_loopNumber_1_0= ruleEInt ) ) otherlv_2= 'times' ) )
            // InternalRhythm.g:680:2: ( ( ( ruleEString ) ) ( (lv_loopNumber_1_0= ruleEInt ) ) otherlv_2= 'times' )
            {
            // InternalRhythm.g:680:2: ( ( ( ruleEString ) ) ( (lv_loopNumber_1_0= ruleEInt ) ) otherlv_2= 'times' )
            // InternalRhythm.g:681:3: ( ( ruleEString ) ) ( (lv_loopNumber_1_0= ruleEInt ) ) otherlv_2= 'times'
            {
            // InternalRhythm.g:681:3: ( ( ruleEString ) )
            // InternalRhythm.g:682:4: ( ruleEString )
            {
            // InternalRhythm.g:682:4: ( ruleEString )
            // InternalRhythm.g:683:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternLoopRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPatternLoopAccess().getPatternPatternCrossReference_0_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhythm.g:697:3: ( (lv_loopNumber_1_0= ruleEInt ) )
            // InternalRhythm.g:698:4: (lv_loopNumber_1_0= ruleEInt )
            {
            // InternalRhythm.g:698:4: (lv_loopNumber_1_0= ruleEInt )
            // InternalRhythm.g:699:5: lv_loopNumber_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPatternLoopAccess().getLoopNumberEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_loopNumber_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternLoopRule());
            					}
            					set(
            						current,
            						"loopNumber",
            						lv_loopNumber_1_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternLoopAccess().getTimesKeyword_2());
            		

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
    // $ANTLR end "rulePatternLoop"


    // $ANTLR start "entryRulePatternModification"
    // InternalRhythm.g:724:1: entryRulePatternModification returns [EObject current=null] : iv_rulePatternModification= rulePatternModification EOF ;
    public final EObject entryRulePatternModification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternModification = null;


        try {
            // InternalRhythm.g:724:60: (iv_rulePatternModification= rulePatternModification EOF )
            // InternalRhythm.g:725:2: iv_rulePatternModification= rulePatternModification EOF
            {
             newCompositeNode(grammarAccess.getPatternModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternModification=rulePatternModification();

            state._fsp--;

             current =iv_rulePatternModification; 
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
    // $ANTLR end "entryRulePatternModification"


    // $ANTLR start "rulePatternModification"
    // InternalRhythm.g:731:1: rulePatternModification returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(iteration:' ( (lv_iteration_2_0= ruleEInt ) ) otherlv_3= ',beat:' ( (lv_beatNumber_4_0= ruleEInt ) ) otherlv_5= '):' ( (lv_beat_6_0= ruleBeat ) ) ) ;
    public final EObject rulePatternModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_iteration_2_0 = null;

        AntlrDatatypeRuleToken lv_beatNumber_4_0 = null;

        EObject lv_beat_6_0 = null;



        	enterRule();

        try {
            // InternalRhythm.g:737:2: ( ( ( ( ruleEString ) ) otherlv_1= '(iteration:' ( (lv_iteration_2_0= ruleEInt ) ) otherlv_3= ',beat:' ( (lv_beatNumber_4_0= ruleEInt ) ) otherlv_5= '):' ( (lv_beat_6_0= ruleBeat ) ) ) )
            // InternalRhythm.g:738:2: ( ( ( ruleEString ) ) otherlv_1= '(iteration:' ( (lv_iteration_2_0= ruleEInt ) ) otherlv_3= ',beat:' ( (lv_beatNumber_4_0= ruleEInt ) ) otherlv_5= '):' ( (lv_beat_6_0= ruleBeat ) ) )
            {
            // InternalRhythm.g:738:2: ( ( ( ruleEString ) ) otherlv_1= '(iteration:' ( (lv_iteration_2_0= ruleEInt ) ) otherlv_3= ',beat:' ( (lv_beatNumber_4_0= ruleEInt ) ) otherlv_5= '):' ( (lv_beat_6_0= ruleBeat ) ) )
            // InternalRhythm.g:739:3: ( ( ruleEString ) ) otherlv_1= '(iteration:' ( (lv_iteration_2_0= ruleEInt ) ) otherlv_3= ',beat:' ( (lv_beatNumber_4_0= ruleEInt ) ) otherlv_5= '):' ( (lv_beat_6_0= ruleBeat ) )
            {
            // InternalRhythm.g:739:3: ( ( ruleEString ) )
            // InternalRhythm.g:740:4: ( ruleEString )
            {
            // InternalRhythm.g:740:4: ( ruleEString )
            // InternalRhythm.g:741:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternModificationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPatternModificationAccess().getPatternPatternCrossReference_0_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternModificationAccess().getIterationKeyword_1());
            		
            // InternalRhythm.g:759:3: ( (lv_iteration_2_0= ruleEInt ) )
            // InternalRhythm.g:760:4: (lv_iteration_2_0= ruleEInt )
            {
            // InternalRhythm.g:760:4: (lv_iteration_2_0= ruleEInt )
            // InternalRhythm.g:761:5: lv_iteration_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPatternModificationAccess().getIterationEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_iteration_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternModificationRule());
            					}
            					set(
            						current,
            						"iteration",
            						lv_iteration_2_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternModificationAccess().getBeatKeyword_3());
            		
            // InternalRhythm.g:782:3: ( (lv_beatNumber_4_0= ruleEInt ) )
            // InternalRhythm.g:783:4: (lv_beatNumber_4_0= ruleEInt )
            {
            // InternalRhythm.g:783:4: (lv_beatNumber_4_0= ruleEInt )
            // InternalRhythm.g:784:5: lv_beatNumber_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPatternModificationAccess().getBeatNumberEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_beatNumber_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternModificationRule());
            					}
            					set(
            						current,
            						"beatNumber",
            						lv_beatNumber_4_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternModificationAccess().getRightParenthesisColonKeyword_5());
            		
            // InternalRhythm.g:805:3: ( (lv_beat_6_0= ruleBeat ) )
            // InternalRhythm.g:806:4: (lv_beat_6_0= ruleBeat )
            {
            // InternalRhythm.g:806:4: (lv_beat_6_0= ruleBeat )
            // InternalRhythm.g:807:5: lv_beat_6_0= ruleBeat
            {

            					newCompositeNode(grammarAccess.getPatternModificationAccess().getBeatBeatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_beat_6_0=ruleBeat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternModificationRule());
            					}
            					set(
            						current,
            						"beat",
            						lv_beat_6_0,
            						"fr.unice.polytech.si5.dsl.rhythm.Rhythm.Beat");
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
    // $ANTLR end "rulePatternModification"


    // $ANTLR start "entryRuleEString"
    // InternalRhythm.g:828:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRhythm.g:828:47: (iv_ruleEString= ruleEString EOF )
            // InternalRhythm.g:829:2: iv_ruleEString= ruleEString EOF
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
    // InternalRhythm.g:835:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRhythm.g:841:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRhythm.g:842:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRhythm.g:842:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRhythm.g:843:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRhythm.g:851:3: this_ID_1= RULE_ID
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
    // InternalRhythm.g:862:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRhythm.g:862:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRhythm.g:863:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRhythm.g:869:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalRhythm.g:875:2: (this_INT_0= RULE_INT )
            // InternalRhythm.g:876:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleEFloat"
    // InternalRhythm.g:886:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRhythm.g:886:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRhythm.g:887:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRhythm.g:893:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRhythm.g:899:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalRhythm.g:900:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalRhythm.g:900:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalRhythm.g:901:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,29,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "ruleNote"
    // InternalRhythm.g:924:1: ruleNote returns [Enumerator current=null] : ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'sd' ) | (enumLiteral_2= '_' ) | (enumLiteral_3= 'ch' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'cc' ) | (enumLiteral_6= 'rc' ) ) ;
    public final Enumerator ruleNote() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalRhythm.g:930:2: ( ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'sd' ) | (enumLiteral_2= '_' ) | (enumLiteral_3= 'ch' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'cc' ) | (enumLiteral_6= 'rc' ) ) )
            // InternalRhythm.g:931:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'sd' ) | (enumLiteral_2= '_' ) | (enumLiteral_3= 'ch' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'cc' ) | (enumLiteral_6= 'rc' ) )
            {
            // InternalRhythm.g:931:2: ( (enumLiteral_0= 'bd' ) | (enumLiteral_1= 'sd' ) | (enumLiteral_2= '_' ) | (enumLiteral_3= 'ch' ) | (enumLiteral_4= 'oh' ) | (enumLiteral_5= 'cc' ) | (enumLiteral_6= 'rc' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            case 35:
                {
                alt10=6;
                }
                break;
            case 36:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRhythm.g:932:3: (enumLiteral_0= 'bd' )
                    {
                    // InternalRhythm.g:932:3: (enumLiteral_0= 'bd' )
                    // InternalRhythm.g:933:4: enumLiteral_0= 'bd'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRhythm.g:940:3: (enumLiteral_1= 'sd' )
                    {
                    // InternalRhythm.g:940:3: (enumLiteral_1= 'sd' )
                    // InternalRhythm.g:941:4: enumLiteral_1= 'sd'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRhythm.g:948:3: (enumLiteral_2= '_' )
                    {
                    // InternalRhythm.g:948:3: (enumLiteral_2= '_' )
                    // InternalRhythm.g:949:4: enumLiteral_2= '_'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRhythm.g:956:3: (enumLiteral_3= 'ch' )
                    {
                    // InternalRhythm.g:956:3: (enumLiteral_3= 'ch' )
                    // InternalRhythm.g:957:4: enumLiteral_3= 'ch'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRhythm.g:964:3: (enumLiteral_4= 'oh' )
                    {
                    // InternalRhythm.g:964:3: (enumLiteral_4= 'oh' )
                    // InternalRhythm.g:965:4: enumLiteral_4= 'oh'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRhythm.g:972:3: (enumLiteral_5= 'cc' )
                    {
                    // InternalRhythm.g:972:3: (enumLiteral_5= 'cc' )
                    // InternalRhythm.g:973:4: enumLiteral_5= 'cc'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRhythm.g:980:3: (enumLiteral_6= 'rc' )
                    {
                    // InternalRhythm.g:980:3: (enumLiteral_6= 'rc' )
                    // InternalRhythm.g:981:4: enumLiteral_6= 'rc'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleNote"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});

}