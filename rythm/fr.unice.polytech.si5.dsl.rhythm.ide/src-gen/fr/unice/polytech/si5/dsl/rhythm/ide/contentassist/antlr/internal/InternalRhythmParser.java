package fr.unice.polytech.si5.dsl.rhythm.ide.contentassist.antlr.internal;

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
import fr.unice.polytech.si5.dsl.rhythm.services.RhythmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRhythmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bd'", "'sd'", "'_'", "'ch'", "'oh'", "'cc'", "'rc'", "'rhythm'", "'tempo'", "'BPM'", "'resolution:'", "'offset:'", "'tick'", "'track'", "'{'", "'sections:'", "'}'", "'patterns:'", "','", "'beat:'", "'pattern:'", "'times'", "'(iteration:'", "',beat:'", "'):'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(RhythmGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRhythm"
    // InternalRhythm.g:53:1: entryRuleRhythm : ruleRhythm EOF ;
    public final void entryRuleRhythm() throws RecognitionException {
        try {
            // InternalRhythm.g:54:1: ( ruleRhythm EOF )
            // InternalRhythm.g:55:1: ruleRhythm EOF
            {
             before(grammarAccess.getRhythmRule()); 
            pushFollow(FOLLOW_1);
            ruleRhythm();

            state._fsp--;

             after(grammarAccess.getRhythmRule()); 
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
    // $ANTLR end "entryRuleRhythm"


    // $ANTLR start "ruleRhythm"
    // InternalRhythm.g:62:1: ruleRhythm : ( ( rule__Rhythm__Group__0 ) ) ;
    public final void ruleRhythm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:66:2: ( ( ( rule__Rhythm__Group__0 ) ) )
            // InternalRhythm.g:67:2: ( ( rule__Rhythm__Group__0 ) )
            {
            // InternalRhythm.g:67:2: ( ( rule__Rhythm__Group__0 ) )
            // InternalRhythm.g:68:3: ( rule__Rhythm__Group__0 )
            {
             before(grammarAccess.getRhythmAccess().getGroup()); 
            // InternalRhythm.g:69:3: ( rule__Rhythm__Group__0 )
            // InternalRhythm.g:69:4: rule__Rhythm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRhythmAccess().getGroup()); 

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
    // $ANTLR end "ruleRhythm"


    // $ANTLR start "entryRuleTrack"
    // InternalRhythm.g:78:1: entryRuleTrack : ruleTrack EOF ;
    public final void entryRuleTrack() throws RecognitionException {
        try {
            // InternalRhythm.g:79:1: ( ruleTrack EOF )
            // InternalRhythm.g:80:1: ruleTrack EOF
            {
             before(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_1);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getTrackRule()); 
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
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalRhythm.g:87:1: ruleTrack : ( ( rule__Track__Group__0 ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:91:2: ( ( ( rule__Track__Group__0 ) ) )
            // InternalRhythm.g:92:2: ( ( rule__Track__Group__0 ) )
            {
            // InternalRhythm.g:92:2: ( ( rule__Track__Group__0 ) )
            // InternalRhythm.g:93:3: ( rule__Track__Group__0 )
            {
             before(grammarAccess.getTrackAccess().getGroup()); 
            // InternalRhythm.g:94:3: ( rule__Track__Group__0 )
            // InternalRhythm.g:94:4: rule__Track__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getGroup()); 

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
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRulePattern"
    // InternalRhythm.g:103:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalRhythm.g:104:1: ( rulePattern EOF )
            // InternalRhythm.g:105:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalRhythm.g:112:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:116:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalRhythm.g:117:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalRhythm.g:117:2: ( ( rule__Pattern__Group__0 ) )
            // InternalRhythm.g:118:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalRhythm.g:119:3: ( rule__Pattern__Group__0 )
            // InternalRhythm.g:119:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBeat"
    // InternalRhythm.g:128:1: entryRuleBeat : ruleBeat EOF ;
    public final void entryRuleBeat() throws RecognitionException {
        try {
            // InternalRhythm.g:129:1: ( ruleBeat EOF )
            // InternalRhythm.g:130:1: ruleBeat EOF
            {
             before(grammarAccess.getBeatRule()); 
            pushFollow(FOLLOW_1);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getBeatRule()); 
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
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalRhythm.g:137:1: ruleBeat : ( ( rule__Beat__Group__0 ) ) ;
    public final void ruleBeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:141:2: ( ( ( rule__Beat__Group__0 ) ) )
            // InternalRhythm.g:142:2: ( ( rule__Beat__Group__0 ) )
            {
            // InternalRhythm.g:142:2: ( ( rule__Beat__Group__0 ) )
            // InternalRhythm.g:143:3: ( rule__Beat__Group__0 )
            {
             before(grammarAccess.getBeatAccess().getGroup()); 
            // InternalRhythm.g:144:3: ( rule__Beat__Group__0 )
            // InternalRhythm.g:144:4: rule__Beat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getGroup()); 

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
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRulePatternBar"
    // InternalRhythm.g:153:1: entryRulePatternBar : rulePatternBar EOF ;
    public final void entryRulePatternBar() throws RecognitionException {
        try {
            // InternalRhythm.g:154:1: ( rulePatternBar EOF )
            // InternalRhythm.g:155:1: rulePatternBar EOF
            {
             before(grammarAccess.getPatternBarRule()); 
            pushFollow(FOLLOW_1);
            rulePatternBar();

            state._fsp--;

             after(grammarAccess.getPatternBarRule()); 
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
    // $ANTLR end "entryRulePatternBar"


    // $ANTLR start "rulePatternBar"
    // InternalRhythm.g:162:1: rulePatternBar : ( ( rule__PatternBar__Group__0 ) ) ;
    public final void rulePatternBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:166:2: ( ( ( rule__PatternBar__Group__0 ) ) )
            // InternalRhythm.g:167:2: ( ( rule__PatternBar__Group__0 ) )
            {
            // InternalRhythm.g:167:2: ( ( rule__PatternBar__Group__0 ) )
            // InternalRhythm.g:168:3: ( rule__PatternBar__Group__0 )
            {
             before(grammarAccess.getPatternBarAccess().getGroup()); 
            // InternalRhythm.g:169:3: ( rule__PatternBar__Group__0 )
            // InternalRhythm.g:169:4: rule__PatternBar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternBar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternBarAccess().getGroup()); 

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
    // $ANTLR end "rulePatternBar"


    // $ANTLR start "entryRuleSection"
    // InternalRhythm.g:178:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalRhythm.g:179:1: ( ruleSection EOF )
            // InternalRhythm.g:180:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalRhythm.g:187:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:191:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalRhythm.g:192:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalRhythm.g:192:2: ( ( rule__Section__Group__0 ) )
            // InternalRhythm.g:193:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalRhythm.g:194:3: ( rule__Section__Group__0 )
            // InternalRhythm.g:194:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRulePatternLoop"
    // InternalRhythm.g:203:1: entryRulePatternLoop : rulePatternLoop EOF ;
    public final void entryRulePatternLoop() throws RecognitionException {
        try {
            // InternalRhythm.g:204:1: ( rulePatternLoop EOF )
            // InternalRhythm.g:205:1: rulePatternLoop EOF
            {
             before(grammarAccess.getPatternLoopRule()); 
            pushFollow(FOLLOW_1);
            rulePatternLoop();

            state._fsp--;

             after(grammarAccess.getPatternLoopRule()); 
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
    // $ANTLR end "entryRulePatternLoop"


    // $ANTLR start "rulePatternLoop"
    // InternalRhythm.g:212:1: rulePatternLoop : ( ( rule__PatternLoop__Group__0 ) ) ;
    public final void rulePatternLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:216:2: ( ( ( rule__PatternLoop__Group__0 ) ) )
            // InternalRhythm.g:217:2: ( ( rule__PatternLoop__Group__0 ) )
            {
            // InternalRhythm.g:217:2: ( ( rule__PatternLoop__Group__0 ) )
            // InternalRhythm.g:218:3: ( rule__PatternLoop__Group__0 )
            {
             before(grammarAccess.getPatternLoopAccess().getGroup()); 
            // InternalRhythm.g:219:3: ( rule__PatternLoop__Group__0 )
            // InternalRhythm.g:219:4: rule__PatternLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternLoopAccess().getGroup()); 

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
    // $ANTLR end "rulePatternLoop"


    // $ANTLR start "entryRulePatternModification"
    // InternalRhythm.g:228:1: entryRulePatternModification : rulePatternModification EOF ;
    public final void entryRulePatternModification() throws RecognitionException {
        try {
            // InternalRhythm.g:229:1: ( rulePatternModification EOF )
            // InternalRhythm.g:230:1: rulePatternModification EOF
            {
             before(grammarAccess.getPatternModificationRule()); 
            pushFollow(FOLLOW_1);
            rulePatternModification();

            state._fsp--;

             after(grammarAccess.getPatternModificationRule()); 
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
    // $ANTLR end "entryRulePatternModification"


    // $ANTLR start "rulePatternModification"
    // InternalRhythm.g:237:1: rulePatternModification : ( ( rule__PatternModification__Group__0 ) ) ;
    public final void rulePatternModification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:241:2: ( ( ( rule__PatternModification__Group__0 ) ) )
            // InternalRhythm.g:242:2: ( ( rule__PatternModification__Group__0 ) )
            {
            // InternalRhythm.g:242:2: ( ( rule__PatternModification__Group__0 ) )
            // InternalRhythm.g:243:3: ( rule__PatternModification__Group__0 )
            {
             before(grammarAccess.getPatternModificationAccess().getGroup()); 
            // InternalRhythm.g:244:3: ( rule__PatternModification__Group__0 )
            // InternalRhythm.g:244:4: rule__PatternModification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternModificationAccess().getGroup()); 

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
    // $ANTLR end "rulePatternModification"


    // $ANTLR start "entryRuleEString"
    // InternalRhythm.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRhythm.g:254:1: ( ruleEString EOF )
            // InternalRhythm.g:255:1: ruleEString EOF
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
    // InternalRhythm.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRhythm.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRhythm.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalRhythm.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRhythm.g:269:3: ( rule__EString__Alternatives )
            // InternalRhythm.g:269:4: rule__EString__Alternatives
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
    // InternalRhythm.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRhythm.g:279:1: ( ruleEInt EOF )
            // InternalRhythm.g:280:1: ruleEInt EOF
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
    // InternalRhythm.g:287:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:291:2: ( ( RULE_INT ) )
            // InternalRhythm.g:292:2: ( RULE_INT )
            {
            // InternalRhythm.g:292:2: ( RULE_INT )
            // InternalRhythm.g:293:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

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


    // $ANTLR start "entryRuleEFloat"
    // InternalRhythm.g:303:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalRhythm.g:304:1: ( ruleEFloat EOF )
            // InternalRhythm.g:305:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRhythm.g:312:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:316:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalRhythm.g:317:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalRhythm.g:317:2: ( ( rule__EFloat__Group__0 ) )
            // InternalRhythm.g:318:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalRhythm.g:319:3: ( rule__EFloat__Group__0 )
            // InternalRhythm.g:319:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "ruleNote"
    // InternalRhythm.g:328:1: ruleNote : ( ( rule__Note__Alternatives ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:332:1: ( ( ( rule__Note__Alternatives ) ) )
            // InternalRhythm.g:333:2: ( ( rule__Note__Alternatives ) )
            {
            // InternalRhythm.g:333:2: ( ( rule__Note__Alternatives ) )
            // InternalRhythm.g:334:3: ( rule__Note__Alternatives )
            {
             before(grammarAccess.getNoteAccess().getAlternatives()); 
            // InternalRhythm.g:335:3: ( rule__Note__Alternatives )
            // InternalRhythm.g:335:4: rule__Note__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Note__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNote"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRhythm.g:343:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:347:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRhythm.g:348:2: ( RULE_STRING )
                    {
                    // InternalRhythm.g:348:2: ( RULE_STRING )
                    // InternalRhythm.g:349:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRhythm.g:354:2: ( RULE_ID )
                    {
                    // InternalRhythm.g:354:2: ( RULE_ID )
                    // InternalRhythm.g:355:3: RULE_ID
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


    // $ANTLR start "rule__Note__Alternatives"
    // InternalRhythm.g:364:1: rule__Note__Alternatives : ( ( ( 'bd' ) ) | ( ( 'sd' ) ) | ( ( '_' ) ) | ( ( 'ch' ) ) | ( ( 'oh' ) ) | ( ( 'cc' ) ) | ( ( 'rc' ) ) );
    public final void rule__Note__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:368:1: ( ( ( 'bd' ) ) | ( ( 'sd' ) ) | ( ( '_' ) ) | ( ( 'ch' ) ) | ( ( 'oh' ) ) | ( ( 'cc' ) ) | ( ( 'rc' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRhythm.g:369:2: ( ( 'bd' ) )
                    {
                    // InternalRhythm.g:369:2: ( ( 'bd' ) )
                    // InternalRhythm.g:370:3: ( 'bd' )
                    {
                     before(grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0()); 
                    // InternalRhythm.g:371:3: ( 'bd' )
                    // InternalRhythm.g:371:4: 'bd'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRhythm.g:375:2: ( ( 'sd' ) )
                    {
                    // InternalRhythm.g:375:2: ( ( 'sd' ) )
                    // InternalRhythm.g:376:3: ( 'sd' )
                    {
                     before(grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1()); 
                    // InternalRhythm.g:377:3: ( 'sd' )
                    // InternalRhythm.g:377:4: 'sd'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRhythm.g:381:2: ( ( '_' ) )
                    {
                    // InternalRhythm.g:381:2: ( ( '_' ) )
                    // InternalRhythm.g:382:3: ( '_' )
                    {
                     before(grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2()); 
                    // InternalRhythm.g:383:3: ( '_' )
                    // InternalRhythm.g:383:4: '_'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRhythm.g:387:2: ( ( 'ch' ) )
                    {
                    // InternalRhythm.g:387:2: ( ( 'ch' ) )
                    // InternalRhythm.g:388:3: ( 'ch' )
                    {
                     before(grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3()); 
                    // InternalRhythm.g:389:3: ( 'ch' )
                    // InternalRhythm.g:389:4: 'ch'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRhythm.g:393:2: ( ( 'oh' ) )
                    {
                    // InternalRhythm.g:393:2: ( ( 'oh' ) )
                    // InternalRhythm.g:394:3: ( 'oh' )
                    {
                     before(grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4()); 
                    // InternalRhythm.g:395:3: ( 'oh' )
                    // InternalRhythm.g:395:4: 'oh'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRhythm.g:399:2: ( ( 'cc' ) )
                    {
                    // InternalRhythm.g:399:2: ( ( 'cc' ) )
                    // InternalRhythm.g:400:3: ( 'cc' )
                    {
                     before(grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5()); 
                    // InternalRhythm.g:401:3: ( 'cc' )
                    // InternalRhythm.g:401:4: 'cc'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRhythm.g:405:2: ( ( 'rc' ) )
                    {
                    // InternalRhythm.g:405:2: ( ( 'rc' ) )
                    // InternalRhythm.g:406:3: ( 'rc' )
                    {
                     before(grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6()); 
                    // InternalRhythm.g:407:3: ( 'rc' )
                    // InternalRhythm.g:407:4: 'rc'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__Note__Alternatives"


    // $ANTLR start "rule__Rhythm__Group__0"
    // InternalRhythm.g:415:1: rule__Rhythm__Group__0 : rule__Rhythm__Group__0__Impl rule__Rhythm__Group__1 ;
    public final void rule__Rhythm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:419:1: ( rule__Rhythm__Group__0__Impl rule__Rhythm__Group__1 )
            // InternalRhythm.g:420:2: rule__Rhythm__Group__0__Impl rule__Rhythm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rhythm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__1();

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
    // $ANTLR end "rule__Rhythm__Group__0"


    // $ANTLR start "rule__Rhythm__Group__0__Impl"
    // InternalRhythm.g:427:1: rule__Rhythm__Group__0__Impl : ( 'rhythm' ) ;
    public final void rule__Rhythm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:431:1: ( ( 'rhythm' ) )
            // InternalRhythm.g:432:1: ( 'rhythm' )
            {
            // InternalRhythm.g:432:1: ( 'rhythm' )
            // InternalRhythm.g:433:2: 'rhythm'
            {
             before(grammarAccess.getRhythmAccess().getRhythmKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRhythmAccess().getRhythmKeyword_0()); 

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
    // $ANTLR end "rule__Rhythm__Group__0__Impl"


    // $ANTLR start "rule__Rhythm__Group__1"
    // InternalRhythm.g:442:1: rule__Rhythm__Group__1 : rule__Rhythm__Group__1__Impl rule__Rhythm__Group__2 ;
    public final void rule__Rhythm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:446:1: ( rule__Rhythm__Group__1__Impl rule__Rhythm__Group__2 )
            // InternalRhythm.g:447:2: rule__Rhythm__Group__1__Impl rule__Rhythm__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rhythm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__2();

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
    // $ANTLR end "rule__Rhythm__Group__1"


    // $ANTLR start "rule__Rhythm__Group__1__Impl"
    // InternalRhythm.g:454:1: rule__Rhythm__Group__1__Impl : ( ( rule__Rhythm__NameAssignment_1 ) ) ;
    public final void rule__Rhythm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:458:1: ( ( ( rule__Rhythm__NameAssignment_1 ) ) )
            // InternalRhythm.g:459:1: ( ( rule__Rhythm__NameAssignment_1 ) )
            {
            // InternalRhythm.g:459:1: ( ( rule__Rhythm__NameAssignment_1 ) )
            // InternalRhythm.g:460:2: ( rule__Rhythm__NameAssignment_1 )
            {
             before(grammarAccess.getRhythmAccess().getNameAssignment_1()); 
            // InternalRhythm.g:461:2: ( rule__Rhythm__NameAssignment_1 )
            // InternalRhythm.g:461:3: rule__Rhythm__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRhythmAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rhythm__Group__1__Impl"


    // $ANTLR start "rule__Rhythm__Group__2"
    // InternalRhythm.g:469:1: rule__Rhythm__Group__2 : rule__Rhythm__Group__2__Impl rule__Rhythm__Group__3 ;
    public final void rule__Rhythm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:473:1: ( rule__Rhythm__Group__2__Impl rule__Rhythm__Group__3 )
            // InternalRhythm.g:474:2: rule__Rhythm__Group__2__Impl rule__Rhythm__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Rhythm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__3();

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
    // $ANTLR end "rule__Rhythm__Group__2"


    // $ANTLR start "rule__Rhythm__Group__2__Impl"
    // InternalRhythm.g:481:1: rule__Rhythm__Group__2__Impl : ( 'tempo' ) ;
    public final void rule__Rhythm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:485:1: ( ( 'tempo' ) )
            // InternalRhythm.g:486:1: ( 'tempo' )
            {
            // InternalRhythm.g:486:1: ( 'tempo' )
            // InternalRhythm.g:487:2: 'tempo'
            {
             before(grammarAccess.getRhythmAccess().getTempoKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRhythmAccess().getTempoKeyword_2()); 

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
    // $ANTLR end "rule__Rhythm__Group__2__Impl"


    // $ANTLR start "rule__Rhythm__Group__3"
    // InternalRhythm.g:496:1: rule__Rhythm__Group__3 : rule__Rhythm__Group__3__Impl rule__Rhythm__Group__4 ;
    public final void rule__Rhythm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:500:1: ( rule__Rhythm__Group__3__Impl rule__Rhythm__Group__4 )
            // InternalRhythm.g:501:2: rule__Rhythm__Group__3__Impl rule__Rhythm__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Rhythm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__4();

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
    // $ANTLR end "rule__Rhythm__Group__3"


    // $ANTLR start "rule__Rhythm__Group__3__Impl"
    // InternalRhythm.g:508:1: rule__Rhythm__Group__3__Impl : ( ( rule__Rhythm__BPMAssignment_3 ) ) ;
    public final void rule__Rhythm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:512:1: ( ( ( rule__Rhythm__BPMAssignment_3 ) ) )
            // InternalRhythm.g:513:1: ( ( rule__Rhythm__BPMAssignment_3 ) )
            {
            // InternalRhythm.g:513:1: ( ( rule__Rhythm__BPMAssignment_3 ) )
            // InternalRhythm.g:514:2: ( rule__Rhythm__BPMAssignment_3 )
            {
             before(grammarAccess.getRhythmAccess().getBPMAssignment_3()); 
            // InternalRhythm.g:515:2: ( rule__Rhythm__BPMAssignment_3 )
            // InternalRhythm.g:515:3: rule__Rhythm__BPMAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__BPMAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRhythmAccess().getBPMAssignment_3()); 

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
    // $ANTLR end "rule__Rhythm__Group__3__Impl"


    // $ANTLR start "rule__Rhythm__Group__4"
    // InternalRhythm.g:523:1: rule__Rhythm__Group__4 : rule__Rhythm__Group__4__Impl rule__Rhythm__Group__5 ;
    public final void rule__Rhythm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:527:1: ( rule__Rhythm__Group__4__Impl rule__Rhythm__Group__5 )
            // InternalRhythm.g:528:2: rule__Rhythm__Group__4__Impl rule__Rhythm__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Rhythm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__5();

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
    // $ANTLR end "rule__Rhythm__Group__4"


    // $ANTLR start "rule__Rhythm__Group__4__Impl"
    // InternalRhythm.g:535:1: rule__Rhythm__Group__4__Impl : ( 'BPM' ) ;
    public final void rule__Rhythm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:539:1: ( ( 'BPM' ) )
            // InternalRhythm.g:540:1: ( 'BPM' )
            {
            // InternalRhythm.g:540:1: ( 'BPM' )
            // InternalRhythm.g:541:2: 'BPM'
            {
             before(grammarAccess.getRhythmAccess().getBPMKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRhythmAccess().getBPMKeyword_4()); 

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
    // $ANTLR end "rule__Rhythm__Group__4__Impl"


    // $ANTLR start "rule__Rhythm__Group__5"
    // InternalRhythm.g:550:1: rule__Rhythm__Group__5 : rule__Rhythm__Group__5__Impl rule__Rhythm__Group__6 ;
    public final void rule__Rhythm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:554:1: ( rule__Rhythm__Group__5__Impl rule__Rhythm__Group__6 )
            // InternalRhythm.g:555:2: rule__Rhythm__Group__5__Impl rule__Rhythm__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Rhythm__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__6();

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
    // $ANTLR end "rule__Rhythm__Group__5"


    // $ANTLR start "rule__Rhythm__Group__5__Impl"
    // InternalRhythm.g:562:1: rule__Rhythm__Group__5__Impl : ( 'resolution:' ) ;
    public final void rule__Rhythm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:566:1: ( ( 'resolution:' ) )
            // InternalRhythm.g:567:1: ( 'resolution:' )
            {
            // InternalRhythm.g:567:1: ( 'resolution:' )
            // InternalRhythm.g:568:2: 'resolution:'
            {
             before(grammarAccess.getRhythmAccess().getResolutionKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRhythmAccess().getResolutionKeyword_5()); 

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
    // $ANTLR end "rule__Rhythm__Group__5__Impl"


    // $ANTLR start "rule__Rhythm__Group__6"
    // InternalRhythm.g:577:1: rule__Rhythm__Group__6 : rule__Rhythm__Group__6__Impl rule__Rhythm__Group__7 ;
    public final void rule__Rhythm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:581:1: ( rule__Rhythm__Group__6__Impl rule__Rhythm__Group__7 )
            // InternalRhythm.g:582:2: rule__Rhythm__Group__6__Impl rule__Rhythm__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Rhythm__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__7();

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
    // $ANTLR end "rule__Rhythm__Group__6"


    // $ANTLR start "rule__Rhythm__Group__6__Impl"
    // InternalRhythm.g:589:1: rule__Rhythm__Group__6__Impl : ( ( rule__Rhythm__ResolutionAssignment_6 ) ) ;
    public final void rule__Rhythm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:593:1: ( ( ( rule__Rhythm__ResolutionAssignment_6 ) ) )
            // InternalRhythm.g:594:1: ( ( rule__Rhythm__ResolutionAssignment_6 ) )
            {
            // InternalRhythm.g:594:1: ( ( rule__Rhythm__ResolutionAssignment_6 ) )
            // InternalRhythm.g:595:2: ( rule__Rhythm__ResolutionAssignment_6 )
            {
             before(grammarAccess.getRhythmAccess().getResolutionAssignment_6()); 
            // InternalRhythm.g:596:2: ( rule__Rhythm__ResolutionAssignment_6 )
            // InternalRhythm.g:596:3: rule__Rhythm__ResolutionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__ResolutionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRhythmAccess().getResolutionAssignment_6()); 

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
    // $ANTLR end "rule__Rhythm__Group__6__Impl"


    // $ANTLR start "rule__Rhythm__Group__7"
    // InternalRhythm.g:604:1: rule__Rhythm__Group__7 : rule__Rhythm__Group__7__Impl rule__Rhythm__Group__8 ;
    public final void rule__Rhythm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:608:1: ( rule__Rhythm__Group__7__Impl rule__Rhythm__Group__8 )
            // InternalRhythm.g:609:2: rule__Rhythm__Group__7__Impl rule__Rhythm__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Rhythm__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__8();

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
    // $ANTLR end "rule__Rhythm__Group__7"


    // $ANTLR start "rule__Rhythm__Group__7__Impl"
    // InternalRhythm.g:616:1: rule__Rhythm__Group__7__Impl : ( 'offset:' ) ;
    public final void rule__Rhythm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:620:1: ( ( 'offset:' ) )
            // InternalRhythm.g:621:1: ( 'offset:' )
            {
            // InternalRhythm.g:621:1: ( 'offset:' )
            // InternalRhythm.g:622:2: 'offset:'
            {
             before(grammarAccess.getRhythmAccess().getOffsetKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRhythmAccess().getOffsetKeyword_7()); 

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
    // $ANTLR end "rule__Rhythm__Group__7__Impl"


    // $ANTLR start "rule__Rhythm__Group__8"
    // InternalRhythm.g:631:1: rule__Rhythm__Group__8 : rule__Rhythm__Group__8__Impl rule__Rhythm__Group__9 ;
    public final void rule__Rhythm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:635:1: ( rule__Rhythm__Group__8__Impl rule__Rhythm__Group__9 )
            // InternalRhythm.g:636:2: rule__Rhythm__Group__8__Impl rule__Rhythm__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Rhythm__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__9();

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
    // $ANTLR end "rule__Rhythm__Group__8"


    // $ANTLR start "rule__Rhythm__Group__8__Impl"
    // InternalRhythm.g:643:1: rule__Rhythm__Group__8__Impl : ( ( rule__Rhythm__OffsetAssignment_8 ) ) ;
    public final void rule__Rhythm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:647:1: ( ( ( rule__Rhythm__OffsetAssignment_8 ) ) )
            // InternalRhythm.g:648:1: ( ( rule__Rhythm__OffsetAssignment_8 ) )
            {
            // InternalRhythm.g:648:1: ( ( rule__Rhythm__OffsetAssignment_8 ) )
            // InternalRhythm.g:649:2: ( rule__Rhythm__OffsetAssignment_8 )
            {
             before(grammarAccess.getRhythmAccess().getOffsetAssignment_8()); 
            // InternalRhythm.g:650:2: ( rule__Rhythm__OffsetAssignment_8 )
            // InternalRhythm.g:650:3: rule__Rhythm__OffsetAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__OffsetAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRhythmAccess().getOffsetAssignment_8()); 

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
    // $ANTLR end "rule__Rhythm__Group__8__Impl"


    // $ANTLR start "rule__Rhythm__Group__9"
    // InternalRhythm.g:658:1: rule__Rhythm__Group__9 : rule__Rhythm__Group__9__Impl rule__Rhythm__Group__10 ;
    public final void rule__Rhythm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:662:1: ( rule__Rhythm__Group__9__Impl rule__Rhythm__Group__10 )
            // InternalRhythm.g:663:2: rule__Rhythm__Group__9__Impl rule__Rhythm__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Rhythm__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__10();

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
    // $ANTLR end "rule__Rhythm__Group__9"


    // $ANTLR start "rule__Rhythm__Group__9__Impl"
    // InternalRhythm.g:670:1: rule__Rhythm__Group__9__Impl : ( 'tick' ) ;
    public final void rule__Rhythm__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:674:1: ( ( 'tick' ) )
            // InternalRhythm.g:675:1: ( 'tick' )
            {
            // InternalRhythm.g:675:1: ( 'tick' )
            // InternalRhythm.g:676:2: 'tick'
            {
             before(grammarAccess.getRhythmAccess().getTickKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRhythmAccess().getTickKeyword_9()); 

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
    // $ANTLR end "rule__Rhythm__Group__9__Impl"


    // $ANTLR start "rule__Rhythm__Group__10"
    // InternalRhythm.g:685:1: rule__Rhythm__Group__10 : rule__Rhythm__Group__10__Impl rule__Rhythm__Group__11 ;
    public final void rule__Rhythm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:689:1: ( rule__Rhythm__Group__10__Impl rule__Rhythm__Group__11 )
            // InternalRhythm.g:690:2: rule__Rhythm__Group__10__Impl rule__Rhythm__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Rhythm__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__11();

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
    // $ANTLR end "rule__Rhythm__Group__10"


    // $ANTLR start "rule__Rhythm__Group__10__Impl"
    // InternalRhythm.g:697:1: rule__Rhythm__Group__10__Impl : ( ( rule__Rhythm__TracksAssignment_10 ) ) ;
    public final void rule__Rhythm__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:701:1: ( ( ( rule__Rhythm__TracksAssignment_10 ) ) )
            // InternalRhythm.g:702:1: ( ( rule__Rhythm__TracksAssignment_10 ) )
            {
            // InternalRhythm.g:702:1: ( ( rule__Rhythm__TracksAssignment_10 ) )
            // InternalRhythm.g:703:2: ( rule__Rhythm__TracksAssignment_10 )
            {
             before(grammarAccess.getRhythmAccess().getTracksAssignment_10()); 
            // InternalRhythm.g:704:2: ( rule__Rhythm__TracksAssignment_10 )
            // InternalRhythm.g:704:3: rule__Rhythm__TracksAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__TracksAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRhythmAccess().getTracksAssignment_10()); 

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
    // $ANTLR end "rule__Rhythm__Group__10__Impl"


    // $ANTLR start "rule__Rhythm__Group__11"
    // InternalRhythm.g:712:1: rule__Rhythm__Group__11 : rule__Rhythm__Group__11__Impl ;
    public final void rule__Rhythm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:716:1: ( rule__Rhythm__Group__11__Impl )
            // InternalRhythm.g:717:2: rule__Rhythm__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rhythm__Group__11__Impl();

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
    // $ANTLR end "rule__Rhythm__Group__11"


    // $ANTLR start "rule__Rhythm__Group__11__Impl"
    // InternalRhythm.g:723:1: rule__Rhythm__Group__11__Impl : ( ( rule__Rhythm__TracksAssignment_11 )* ) ;
    public final void rule__Rhythm__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:727:1: ( ( ( rule__Rhythm__TracksAssignment_11 )* ) )
            // InternalRhythm.g:728:1: ( ( rule__Rhythm__TracksAssignment_11 )* )
            {
            // InternalRhythm.g:728:1: ( ( rule__Rhythm__TracksAssignment_11 )* )
            // InternalRhythm.g:729:2: ( rule__Rhythm__TracksAssignment_11 )*
            {
             before(grammarAccess.getRhythmAccess().getTracksAssignment_11()); 
            // InternalRhythm.g:730:2: ( rule__Rhythm__TracksAssignment_11 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRhythm.g:730:3: rule__Rhythm__TracksAssignment_11
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Rhythm__TracksAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRhythmAccess().getTracksAssignment_11()); 

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
    // $ANTLR end "rule__Rhythm__Group__11__Impl"


    // $ANTLR start "rule__Track__Group__0"
    // InternalRhythm.g:739:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:743:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalRhythm.g:744:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Track__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__1();

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
    // $ANTLR end "rule__Track__Group__0"


    // $ANTLR start "rule__Track__Group__0__Impl"
    // InternalRhythm.g:751:1: rule__Track__Group__0__Impl : ( 'track' ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:755:1: ( ( 'track' ) )
            // InternalRhythm.g:756:1: ( 'track' )
            {
            // InternalRhythm.g:756:1: ( 'track' )
            // InternalRhythm.g:757:2: 'track'
            {
             before(grammarAccess.getTrackAccess().getTrackKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getTrackKeyword_0()); 

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
    // $ANTLR end "rule__Track__Group__0__Impl"


    // $ANTLR start "rule__Track__Group__1"
    // InternalRhythm.g:766:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:770:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalRhythm.g:771:2: rule__Track__Group__1__Impl rule__Track__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Track__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__2();

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
    // $ANTLR end "rule__Track__Group__1"


    // $ANTLR start "rule__Track__Group__1__Impl"
    // InternalRhythm.g:778:1: rule__Track__Group__1__Impl : ( ( rule__Track__NameAssignment_1 ) ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:782:1: ( ( ( rule__Track__NameAssignment_1 ) ) )
            // InternalRhythm.g:783:1: ( ( rule__Track__NameAssignment_1 ) )
            {
            // InternalRhythm.g:783:1: ( ( rule__Track__NameAssignment_1 ) )
            // InternalRhythm.g:784:2: ( rule__Track__NameAssignment_1 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1()); 
            // InternalRhythm.g:785:2: ( rule__Track__NameAssignment_1 )
            // InternalRhythm.g:785:3: rule__Track__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Track__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Track__Group__1__Impl"


    // $ANTLR start "rule__Track__Group__2"
    // InternalRhythm.g:793:1: rule__Track__Group__2 : rule__Track__Group__2__Impl rule__Track__Group__3 ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:797:1: ( rule__Track__Group__2__Impl rule__Track__Group__3 )
            // InternalRhythm.g:798:2: rule__Track__Group__2__Impl rule__Track__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Track__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__3();

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
    // $ANTLR end "rule__Track__Group__2"


    // $ANTLR start "rule__Track__Group__2__Impl"
    // InternalRhythm.g:805:1: rule__Track__Group__2__Impl : ( '{' ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:809:1: ( ( '{' ) )
            // InternalRhythm.g:810:1: ( '{' )
            {
            // InternalRhythm.g:810:1: ( '{' )
            // InternalRhythm.g:811:2: '{'
            {
             before(grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Track__Group__2__Impl"


    // $ANTLR start "rule__Track__Group__3"
    // InternalRhythm.g:820:1: rule__Track__Group__3 : rule__Track__Group__3__Impl rule__Track__Group__4 ;
    public final void rule__Track__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:824:1: ( rule__Track__Group__3__Impl rule__Track__Group__4 )
            // InternalRhythm.g:825:2: rule__Track__Group__3__Impl rule__Track__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Track__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__4();

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
    // $ANTLR end "rule__Track__Group__3"


    // $ANTLR start "rule__Track__Group__3__Impl"
    // InternalRhythm.g:832:1: rule__Track__Group__3__Impl : ( ( rule__Track__Group_3__0 )? ) ;
    public final void rule__Track__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:836:1: ( ( ( rule__Track__Group_3__0 )? ) )
            // InternalRhythm.g:837:1: ( ( rule__Track__Group_3__0 )? )
            {
            // InternalRhythm.g:837:1: ( ( rule__Track__Group_3__0 )? )
            // InternalRhythm.g:838:2: ( rule__Track__Group_3__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_3()); 
            // InternalRhythm.g:839:2: ( rule__Track__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRhythm.g:839:3: rule__Track__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Track__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrackAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Track__Group__3__Impl"


    // $ANTLR start "rule__Track__Group__4"
    // InternalRhythm.g:847:1: rule__Track__Group__4 : rule__Track__Group__4__Impl rule__Track__Group__5 ;
    public final void rule__Track__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:851:1: ( rule__Track__Group__4__Impl rule__Track__Group__5 )
            // InternalRhythm.g:852:2: rule__Track__Group__4__Impl rule__Track__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Track__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__5();

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
    // $ANTLR end "rule__Track__Group__4"


    // $ANTLR start "rule__Track__Group__4__Impl"
    // InternalRhythm.g:859:1: rule__Track__Group__4__Impl : ( 'sections:' ) ;
    public final void rule__Track__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:863:1: ( ( 'sections:' ) )
            // InternalRhythm.g:864:1: ( 'sections:' )
            {
            // InternalRhythm.g:864:1: ( 'sections:' )
            // InternalRhythm.g:865:2: 'sections:'
            {
             before(grammarAccess.getTrackAccess().getSectionsKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getSectionsKeyword_4()); 

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
    // $ANTLR end "rule__Track__Group__4__Impl"


    // $ANTLR start "rule__Track__Group__5"
    // InternalRhythm.g:874:1: rule__Track__Group__5 : rule__Track__Group__5__Impl rule__Track__Group__6 ;
    public final void rule__Track__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:878:1: ( rule__Track__Group__5__Impl rule__Track__Group__6 )
            // InternalRhythm.g:879:2: rule__Track__Group__5__Impl rule__Track__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Track__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__6();

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
    // $ANTLR end "rule__Track__Group__5"


    // $ANTLR start "rule__Track__Group__5__Impl"
    // InternalRhythm.g:886:1: rule__Track__Group__5__Impl : ( ( rule__Track__SectionsAssignment_5 ) ) ;
    public final void rule__Track__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:890:1: ( ( ( rule__Track__SectionsAssignment_5 ) ) )
            // InternalRhythm.g:891:1: ( ( rule__Track__SectionsAssignment_5 ) )
            {
            // InternalRhythm.g:891:1: ( ( rule__Track__SectionsAssignment_5 ) )
            // InternalRhythm.g:892:2: ( rule__Track__SectionsAssignment_5 )
            {
             before(grammarAccess.getTrackAccess().getSectionsAssignment_5()); 
            // InternalRhythm.g:893:2: ( rule__Track__SectionsAssignment_5 )
            // InternalRhythm.g:893:3: rule__Track__SectionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Track__SectionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getSectionsAssignment_5()); 

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
    // $ANTLR end "rule__Track__Group__5__Impl"


    // $ANTLR start "rule__Track__Group__6"
    // InternalRhythm.g:901:1: rule__Track__Group__6 : rule__Track__Group__6__Impl rule__Track__Group__7 ;
    public final void rule__Track__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:905:1: ( rule__Track__Group__6__Impl rule__Track__Group__7 )
            // InternalRhythm.g:906:2: rule__Track__Group__6__Impl rule__Track__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Track__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group__7();

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
    // $ANTLR end "rule__Track__Group__6"


    // $ANTLR start "rule__Track__Group__6__Impl"
    // InternalRhythm.g:913:1: rule__Track__Group__6__Impl : ( ( rule__Track__SectionsAssignment_6 )* ) ;
    public final void rule__Track__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:917:1: ( ( ( rule__Track__SectionsAssignment_6 )* ) )
            // InternalRhythm.g:918:1: ( ( rule__Track__SectionsAssignment_6 )* )
            {
            // InternalRhythm.g:918:1: ( ( rule__Track__SectionsAssignment_6 )* )
            // InternalRhythm.g:919:2: ( rule__Track__SectionsAssignment_6 )*
            {
             before(grammarAccess.getTrackAccess().getSectionsAssignment_6()); 
            // InternalRhythm.g:920:2: ( rule__Track__SectionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRhythm.g:920:3: rule__Track__SectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Track__SectionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTrackAccess().getSectionsAssignment_6()); 

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
    // $ANTLR end "rule__Track__Group__6__Impl"


    // $ANTLR start "rule__Track__Group__7"
    // InternalRhythm.g:928:1: rule__Track__Group__7 : rule__Track__Group__7__Impl ;
    public final void rule__Track__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:932:1: ( rule__Track__Group__7__Impl )
            // InternalRhythm.g:933:2: rule__Track__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group__7__Impl();

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
    // $ANTLR end "rule__Track__Group__7"


    // $ANTLR start "rule__Track__Group__7__Impl"
    // InternalRhythm.g:939:1: rule__Track__Group__7__Impl : ( '}' ) ;
    public final void rule__Track__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:943:1: ( ( '}' ) )
            // InternalRhythm.g:944:1: ( '}' )
            {
            // InternalRhythm.g:944:1: ( '}' )
            // InternalRhythm.g:945:2: '}'
            {
             before(grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Track__Group__7__Impl"


    // $ANTLR start "rule__Track__Group_3__0"
    // InternalRhythm.g:955:1: rule__Track__Group_3__0 : rule__Track__Group_3__0__Impl rule__Track__Group_3__1 ;
    public final void rule__Track__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:959:1: ( rule__Track__Group_3__0__Impl rule__Track__Group_3__1 )
            // InternalRhythm.g:960:2: rule__Track__Group_3__0__Impl rule__Track__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Track__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group_3__1();

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
    // $ANTLR end "rule__Track__Group_3__0"


    // $ANTLR start "rule__Track__Group_3__0__Impl"
    // InternalRhythm.g:967:1: rule__Track__Group_3__0__Impl : ( 'patterns:' ) ;
    public final void rule__Track__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:971:1: ( ( 'patterns:' ) )
            // InternalRhythm.g:972:1: ( 'patterns:' )
            {
            // InternalRhythm.g:972:1: ( 'patterns:' )
            // InternalRhythm.g:973:2: 'patterns:'
            {
             before(grammarAccess.getTrackAccess().getPatternsKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTrackAccess().getPatternsKeyword_3_0()); 

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
    // $ANTLR end "rule__Track__Group_3__0__Impl"


    // $ANTLR start "rule__Track__Group_3__1"
    // InternalRhythm.g:982:1: rule__Track__Group_3__1 : rule__Track__Group_3__1__Impl rule__Track__Group_3__2 ;
    public final void rule__Track__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:986:1: ( rule__Track__Group_3__1__Impl rule__Track__Group_3__2 )
            // InternalRhythm.g:987:2: rule__Track__Group_3__1__Impl rule__Track__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Track__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Track__Group_3__2();

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
    // $ANTLR end "rule__Track__Group_3__1"


    // $ANTLR start "rule__Track__Group_3__1__Impl"
    // InternalRhythm.g:994:1: rule__Track__Group_3__1__Impl : ( ( rule__Track__PatternsAssignment_3_1 ) ) ;
    public final void rule__Track__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:998:1: ( ( ( rule__Track__PatternsAssignment_3_1 ) ) )
            // InternalRhythm.g:999:1: ( ( rule__Track__PatternsAssignment_3_1 ) )
            {
            // InternalRhythm.g:999:1: ( ( rule__Track__PatternsAssignment_3_1 ) )
            // InternalRhythm.g:1000:2: ( rule__Track__PatternsAssignment_3_1 )
            {
             before(grammarAccess.getTrackAccess().getPatternsAssignment_3_1()); 
            // InternalRhythm.g:1001:2: ( rule__Track__PatternsAssignment_3_1 )
            // InternalRhythm.g:1001:3: rule__Track__PatternsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Track__PatternsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getPatternsAssignment_3_1()); 

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
    // $ANTLR end "rule__Track__Group_3__1__Impl"


    // $ANTLR start "rule__Track__Group_3__2"
    // InternalRhythm.g:1009:1: rule__Track__Group_3__2 : rule__Track__Group_3__2__Impl ;
    public final void rule__Track__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1013:1: ( rule__Track__Group_3__2__Impl )
            // InternalRhythm.g:1014:2: rule__Track__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Track__Group_3__2__Impl();

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
    // $ANTLR end "rule__Track__Group_3__2"


    // $ANTLR start "rule__Track__Group_3__2__Impl"
    // InternalRhythm.g:1020:1: rule__Track__Group_3__2__Impl : ( ( rule__Track__PatternsAssignment_3_2 )* ) ;
    public final void rule__Track__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1024:1: ( ( ( rule__Track__PatternsAssignment_3_2 )* ) )
            // InternalRhythm.g:1025:1: ( ( rule__Track__PatternsAssignment_3_2 )* )
            {
            // InternalRhythm.g:1025:1: ( ( rule__Track__PatternsAssignment_3_2 )* )
            // InternalRhythm.g:1026:2: ( rule__Track__PatternsAssignment_3_2 )*
            {
             before(grammarAccess.getTrackAccess().getPatternsAssignment_3_2()); 
            // InternalRhythm.g:1027:2: ( rule__Track__PatternsAssignment_3_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRhythm.g:1027:3: rule__Track__PatternsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Track__PatternsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTrackAccess().getPatternsAssignment_3_2()); 

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
    // $ANTLR end "rule__Track__Group_3__2__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalRhythm.g:1036:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1040:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalRhythm.g:1041:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

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
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalRhythm.g:1048:1: rule__Pattern__Group__0__Impl : ( ( rule__Pattern__NameAssignment_0 ) ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1052:1: ( ( ( rule__Pattern__NameAssignment_0 ) ) )
            // InternalRhythm.g:1053:1: ( ( rule__Pattern__NameAssignment_0 ) )
            {
            // InternalRhythm.g:1053:1: ( ( rule__Pattern__NameAssignment_0 ) )
            // InternalRhythm.g:1054:2: ( rule__Pattern__NameAssignment_0 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_0()); 
            // InternalRhythm.g:1055:2: ( rule__Pattern__NameAssignment_0 )
            // InternalRhythm.g:1055:3: rule__Pattern__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalRhythm.g:1063:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1067:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalRhythm.g:1068:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

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
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalRhythm.g:1075:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1079:1: ( ( '{' ) )
            // InternalRhythm.g:1080:1: ( '{' )
            {
            // InternalRhythm.g:1080:1: ( '{' )
            // InternalRhythm.g:1081:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalRhythm.g:1090:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1094:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalRhythm.g:1095:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

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
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalRhythm.g:1102:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__BarAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1106:1: ( ( ( rule__Pattern__BarAssignment_2 ) ) )
            // InternalRhythm.g:1107:1: ( ( rule__Pattern__BarAssignment_2 ) )
            {
            // InternalRhythm.g:1107:1: ( ( rule__Pattern__BarAssignment_2 ) )
            // InternalRhythm.g:1108:2: ( rule__Pattern__BarAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getBarAssignment_2()); 
            // InternalRhythm.g:1109:2: ( rule__Pattern__BarAssignment_2 )
            // InternalRhythm.g:1109:3: rule__Pattern__BarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__BarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getBarAssignment_2()); 

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
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalRhythm.g:1117:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1121:1: ( rule__Pattern__Group__3__Impl )
            // InternalRhythm.g:1122:2: rule__Pattern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3__Impl();

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
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalRhythm.g:1128:1: rule__Pattern__Group__3__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1132:1: ( ( '}' ) )
            // InternalRhythm.g:1133:1: ( '}' )
            {
            // InternalRhythm.g:1133:1: ( '}' )
            // InternalRhythm.g:1134:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Beat__Group__0"
    // InternalRhythm.g:1144:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1148:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalRhythm.g:1149:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Beat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__1();

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
    // $ANTLR end "rule__Beat__Group__0"


    // $ANTLR start "rule__Beat__Group__0__Impl"
    // InternalRhythm.g:1156:1: rule__Beat__Group__0__Impl : ( ( rule__Beat__TicksAssignment_0 ) ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1160:1: ( ( ( rule__Beat__TicksAssignment_0 ) ) )
            // InternalRhythm.g:1161:1: ( ( rule__Beat__TicksAssignment_0 ) )
            {
            // InternalRhythm.g:1161:1: ( ( rule__Beat__TicksAssignment_0 ) )
            // InternalRhythm.g:1162:2: ( rule__Beat__TicksAssignment_0 )
            {
             before(grammarAccess.getBeatAccess().getTicksAssignment_0()); 
            // InternalRhythm.g:1163:2: ( rule__Beat__TicksAssignment_0 )
            // InternalRhythm.g:1163:3: rule__Beat__TicksAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Beat__TicksAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getTicksAssignment_0()); 

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
    // $ANTLR end "rule__Beat__Group__0__Impl"


    // $ANTLR start "rule__Beat__Group__1"
    // InternalRhythm.g:1171:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1175:1: ( rule__Beat__Group__1__Impl )
            // InternalRhythm.g:1176:2: rule__Beat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__1__Impl();

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
    // $ANTLR end "rule__Beat__Group__1"


    // $ANTLR start "rule__Beat__Group__1__Impl"
    // InternalRhythm.g:1182:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__Group_1__0 )* ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1186:1: ( ( ( rule__Beat__Group_1__0 )* ) )
            // InternalRhythm.g:1187:1: ( ( rule__Beat__Group_1__0 )* )
            {
            // InternalRhythm.g:1187:1: ( ( rule__Beat__Group_1__0 )* )
            // InternalRhythm.g:1188:2: ( rule__Beat__Group_1__0 )*
            {
             before(grammarAccess.getBeatAccess().getGroup_1()); 
            // InternalRhythm.g:1189:2: ( rule__Beat__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRhythm.g:1189:3: rule__Beat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Beat__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBeatAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Beat__Group__1__Impl"


    // $ANTLR start "rule__Beat__Group_1__0"
    // InternalRhythm.g:1198:1: rule__Beat__Group_1__0 : rule__Beat__Group_1__0__Impl rule__Beat__Group_1__1 ;
    public final void rule__Beat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1202:1: ( rule__Beat__Group_1__0__Impl rule__Beat__Group_1__1 )
            // InternalRhythm.g:1203:2: rule__Beat__Group_1__0__Impl rule__Beat__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Beat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group_1__1();

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
    // $ANTLR end "rule__Beat__Group_1__0"


    // $ANTLR start "rule__Beat__Group_1__0__Impl"
    // InternalRhythm.g:1210:1: rule__Beat__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Beat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1214:1: ( ( ',' ) )
            // InternalRhythm.g:1215:1: ( ',' )
            {
            // InternalRhythm.g:1215:1: ( ',' )
            // InternalRhythm.g:1216:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Beat__Group_1__0__Impl"


    // $ANTLR start "rule__Beat__Group_1__1"
    // InternalRhythm.g:1225:1: rule__Beat__Group_1__1 : rule__Beat__Group_1__1__Impl ;
    public final void rule__Beat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1229:1: ( rule__Beat__Group_1__1__Impl )
            // InternalRhythm.g:1230:2: rule__Beat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group_1__1__Impl();

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
    // $ANTLR end "rule__Beat__Group_1__1"


    // $ANTLR start "rule__Beat__Group_1__1__Impl"
    // InternalRhythm.g:1236:1: rule__Beat__Group_1__1__Impl : ( ( rule__Beat__TicksAssignment_1_1 ) ) ;
    public final void rule__Beat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1240:1: ( ( ( rule__Beat__TicksAssignment_1_1 ) ) )
            // InternalRhythm.g:1241:1: ( ( rule__Beat__TicksAssignment_1_1 ) )
            {
            // InternalRhythm.g:1241:1: ( ( rule__Beat__TicksAssignment_1_1 ) )
            // InternalRhythm.g:1242:2: ( rule__Beat__TicksAssignment_1_1 )
            {
             before(grammarAccess.getBeatAccess().getTicksAssignment_1_1()); 
            // InternalRhythm.g:1243:2: ( rule__Beat__TicksAssignment_1_1 )
            // InternalRhythm.g:1243:3: rule__Beat__TicksAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Beat__TicksAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getTicksAssignment_1_1()); 

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
    // $ANTLR end "rule__Beat__Group_1__1__Impl"


    // $ANTLR start "rule__PatternBar__Group__0"
    // InternalRhythm.g:1252:1: rule__PatternBar__Group__0 : rule__PatternBar__Group__0__Impl rule__PatternBar__Group__1 ;
    public final void rule__PatternBar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1256:1: ( rule__PatternBar__Group__0__Impl rule__PatternBar__Group__1 )
            // InternalRhythm.g:1257:2: rule__PatternBar__Group__0__Impl rule__PatternBar__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PatternBar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternBar__Group__1();

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
    // $ANTLR end "rule__PatternBar__Group__0"


    // $ANTLR start "rule__PatternBar__Group__0__Impl"
    // InternalRhythm.g:1264:1: rule__PatternBar__Group__0__Impl : ( 'beat:' ) ;
    public final void rule__PatternBar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1268:1: ( ( 'beat:' ) )
            // InternalRhythm.g:1269:1: ( 'beat:' )
            {
            // InternalRhythm.g:1269:1: ( 'beat:' )
            // InternalRhythm.g:1270:2: 'beat:'
            {
             before(grammarAccess.getPatternBarAccess().getBeatKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPatternBarAccess().getBeatKeyword_0()); 

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
    // $ANTLR end "rule__PatternBar__Group__0__Impl"


    // $ANTLR start "rule__PatternBar__Group__1"
    // InternalRhythm.g:1279:1: rule__PatternBar__Group__1 : rule__PatternBar__Group__1__Impl rule__PatternBar__Group__2 ;
    public final void rule__PatternBar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1283:1: ( rule__PatternBar__Group__1__Impl rule__PatternBar__Group__2 )
            // InternalRhythm.g:1284:2: rule__PatternBar__Group__1__Impl rule__PatternBar__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__PatternBar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternBar__Group__2();

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
    // $ANTLR end "rule__PatternBar__Group__1"


    // $ANTLR start "rule__PatternBar__Group__1__Impl"
    // InternalRhythm.g:1291:1: rule__PatternBar__Group__1__Impl : ( ( rule__PatternBar__BeatsAssignment_1 ) ) ;
    public final void rule__PatternBar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1295:1: ( ( ( rule__PatternBar__BeatsAssignment_1 ) ) )
            // InternalRhythm.g:1296:1: ( ( rule__PatternBar__BeatsAssignment_1 ) )
            {
            // InternalRhythm.g:1296:1: ( ( rule__PatternBar__BeatsAssignment_1 ) )
            // InternalRhythm.g:1297:2: ( rule__PatternBar__BeatsAssignment_1 )
            {
             before(grammarAccess.getPatternBarAccess().getBeatsAssignment_1()); 
            // InternalRhythm.g:1298:2: ( rule__PatternBar__BeatsAssignment_1 )
            // InternalRhythm.g:1298:3: rule__PatternBar__BeatsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternBar__BeatsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternBarAccess().getBeatsAssignment_1()); 

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
    // $ANTLR end "rule__PatternBar__Group__1__Impl"


    // $ANTLR start "rule__PatternBar__Group__2"
    // InternalRhythm.g:1306:1: rule__PatternBar__Group__2 : rule__PatternBar__Group__2__Impl ;
    public final void rule__PatternBar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1310:1: ( rule__PatternBar__Group__2__Impl )
            // InternalRhythm.g:1311:2: rule__PatternBar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternBar__Group__2__Impl();

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
    // $ANTLR end "rule__PatternBar__Group__2"


    // $ANTLR start "rule__PatternBar__Group__2__Impl"
    // InternalRhythm.g:1317:1: rule__PatternBar__Group__2__Impl : ( ( rule__PatternBar__Group_2__0 )* ) ;
    public final void rule__PatternBar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1321:1: ( ( ( rule__PatternBar__Group_2__0 )* ) )
            // InternalRhythm.g:1322:1: ( ( rule__PatternBar__Group_2__0 )* )
            {
            // InternalRhythm.g:1322:1: ( ( rule__PatternBar__Group_2__0 )* )
            // InternalRhythm.g:1323:2: ( rule__PatternBar__Group_2__0 )*
            {
             before(grammarAccess.getPatternBarAccess().getGroup_2()); 
            // InternalRhythm.g:1324:2: ( rule__PatternBar__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRhythm.g:1324:3: rule__PatternBar__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PatternBar__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPatternBarAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PatternBar__Group__2__Impl"


    // $ANTLR start "rule__PatternBar__Group_2__0"
    // InternalRhythm.g:1333:1: rule__PatternBar__Group_2__0 : rule__PatternBar__Group_2__0__Impl rule__PatternBar__Group_2__1 ;
    public final void rule__PatternBar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1337:1: ( rule__PatternBar__Group_2__0__Impl rule__PatternBar__Group_2__1 )
            // InternalRhythm.g:1338:2: rule__PatternBar__Group_2__0__Impl rule__PatternBar__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__PatternBar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternBar__Group_2__1();

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
    // $ANTLR end "rule__PatternBar__Group_2__0"


    // $ANTLR start "rule__PatternBar__Group_2__0__Impl"
    // InternalRhythm.g:1345:1: rule__PatternBar__Group_2__0__Impl : ( 'beat:' ) ;
    public final void rule__PatternBar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1349:1: ( ( 'beat:' ) )
            // InternalRhythm.g:1350:1: ( 'beat:' )
            {
            // InternalRhythm.g:1350:1: ( 'beat:' )
            // InternalRhythm.g:1351:2: 'beat:'
            {
             before(grammarAccess.getPatternBarAccess().getBeatKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPatternBarAccess().getBeatKeyword_2_0()); 

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
    // $ANTLR end "rule__PatternBar__Group_2__0__Impl"


    // $ANTLR start "rule__PatternBar__Group_2__1"
    // InternalRhythm.g:1360:1: rule__PatternBar__Group_2__1 : rule__PatternBar__Group_2__1__Impl ;
    public final void rule__PatternBar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1364:1: ( rule__PatternBar__Group_2__1__Impl )
            // InternalRhythm.g:1365:2: rule__PatternBar__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternBar__Group_2__1__Impl();

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
    // $ANTLR end "rule__PatternBar__Group_2__1"


    // $ANTLR start "rule__PatternBar__Group_2__1__Impl"
    // InternalRhythm.g:1371:1: rule__PatternBar__Group_2__1__Impl : ( ( rule__PatternBar__BeatsAssignment_2_1 ) ) ;
    public final void rule__PatternBar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1375:1: ( ( ( rule__PatternBar__BeatsAssignment_2_1 ) ) )
            // InternalRhythm.g:1376:1: ( ( rule__PatternBar__BeatsAssignment_2_1 ) )
            {
            // InternalRhythm.g:1376:1: ( ( rule__PatternBar__BeatsAssignment_2_1 ) )
            // InternalRhythm.g:1377:2: ( rule__PatternBar__BeatsAssignment_2_1 )
            {
             before(grammarAccess.getPatternBarAccess().getBeatsAssignment_2_1()); 
            // InternalRhythm.g:1378:2: ( rule__PatternBar__BeatsAssignment_2_1 )
            // InternalRhythm.g:1378:3: rule__PatternBar__BeatsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternBar__BeatsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternBarAccess().getBeatsAssignment_2_1()); 

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
    // $ANTLR end "rule__PatternBar__Group_2__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalRhythm.g:1387:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1391:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalRhythm.g:1392:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalRhythm.g:1399:1: rule__Section__Group__0__Impl : ( ( rule__Section__NameAssignment_0 ) ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1403:1: ( ( ( rule__Section__NameAssignment_0 ) ) )
            // InternalRhythm.g:1404:1: ( ( rule__Section__NameAssignment_0 ) )
            {
            // InternalRhythm.g:1404:1: ( ( rule__Section__NameAssignment_0 ) )
            // InternalRhythm.g:1405:2: ( rule__Section__NameAssignment_0 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_0()); 
            // InternalRhythm.g:1406:2: ( rule__Section__NameAssignment_0 )
            // InternalRhythm.g:1406:3: rule__Section__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalRhythm.g:1414:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1418:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalRhythm.g:1419:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalRhythm.g:1426:1: rule__Section__Group__1__Impl : ( '{' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1430:1: ( ( '{' ) )
            // InternalRhythm.g:1431:1: ( '{' )
            {
            // InternalRhythm.g:1431:1: ( '{' )
            // InternalRhythm.g:1432:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalRhythm.g:1441:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1445:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalRhythm.g:1446:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalRhythm.g:1453:1: rule__Section__Group__2__Impl : ( 'pattern:' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1457:1: ( ( 'pattern:' ) )
            // InternalRhythm.g:1458:1: ( 'pattern:' )
            {
            // InternalRhythm.g:1458:1: ( 'pattern:' )
            // InternalRhythm.g:1459:2: 'pattern:'
            {
             before(grammarAccess.getSectionAccess().getPatternKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getPatternKeyword_2()); 

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
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalRhythm.g:1468:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1472:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalRhythm.g:1473:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

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
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalRhythm.g:1480:1: rule__Section__Group__3__Impl : ( ( rule__Section__PatternLoopsAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1484:1: ( ( ( rule__Section__PatternLoopsAssignment_3 ) ) )
            // InternalRhythm.g:1485:1: ( ( rule__Section__PatternLoopsAssignment_3 ) )
            {
            // InternalRhythm.g:1485:1: ( ( rule__Section__PatternLoopsAssignment_3 ) )
            // InternalRhythm.g:1486:2: ( rule__Section__PatternLoopsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getPatternLoopsAssignment_3()); 
            // InternalRhythm.g:1487:2: ( rule__Section__PatternLoopsAssignment_3 )
            // InternalRhythm.g:1487:3: rule__Section__PatternLoopsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Section__PatternLoopsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getPatternLoopsAssignment_3()); 

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
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalRhythm.g:1495:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1499:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalRhythm.g:1500:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

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
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalRhythm.g:1507:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1511:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // InternalRhythm.g:1512:1: ( ( rule__Section__Group_4__0 )* )
            {
            // InternalRhythm.g:1512:1: ( ( rule__Section__Group_4__0 )* )
            // InternalRhythm.g:1513:2: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalRhythm.g:1514:2: ( rule__Section__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRhythm.g:1514:3: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Section__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalRhythm.g:1522:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1526:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalRhythm.g:1527:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

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
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalRhythm.g:1534:1: rule__Section__Group__5__Impl : ( ( rule__Section__PatternModificationsAssignment_5 )* ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1538:1: ( ( ( rule__Section__PatternModificationsAssignment_5 )* ) )
            // InternalRhythm.g:1539:1: ( ( rule__Section__PatternModificationsAssignment_5 )* )
            {
            // InternalRhythm.g:1539:1: ( ( rule__Section__PatternModificationsAssignment_5 )* )
            // InternalRhythm.g:1540:2: ( rule__Section__PatternModificationsAssignment_5 )*
            {
             before(grammarAccess.getSectionAccess().getPatternModificationsAssignment_5()); 
            // InternalRhythm.g:1541:2: ( rule__Section__PatternModificationsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRhythm.g:1541:3: rule__Section__PatternModificationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Section__PatternModificationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getPatternModificationsAssignment_5()); 

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
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalRhythm.g:1549:1: rule__Section__Group__6 : rule__Section__Group__6__Impl ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1553:1: ( rule__Section__Group__6__Impl )
            // InternalRhythm.g:1554:2: rule__Section__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__6__Impl();

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
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalRhythm.g:1560:1: rule__Section__Group__6__Impl : ( '}' ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1564:1: ( ( '}' ) )
            // InternalRhythm.g:1565:1: ( '}' )
            {
            // InternalRhythm.g:1565:1: ( '}' )
            // InternalRhythm.g:1566:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // InternalRhythm.g:1576:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1580:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalRhythm.g:1581:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1();

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
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // InternalRhythm.g:1588:1: rule__Section__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1592:1: ( ( ',' ) )
            // InternalRhythm.g:1593:1: ( ',' )
            {
            // InternalRhythm.g:1593:1: ( ',' )
            // InternalRhythm.g:1594:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // InternalRhythm.g:1603:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1607:1: ( rule__Section__Group_4__1__Impl )
            // InternalRhythm.g:1608:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1__Impl();

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
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // InternalRhythm.g:1614:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__PatternLoopsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1618:1: ( ( ( rule__Section__PatternLoopsAssignment_4_1 ) ) )
            // InternalRhythm.g:1619:1: ( ( rule__Section__PatternLoopsAssignment_4_1 ) )
            {
            // InternalRhythm.g:1619:1: ( ( rule__Section__PatternLoopsAssignment_4_1 ) )
            // InternalRhythm.g:1620:2: ( rule__Section__PatternLoopsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getPatternLoopsAssignment_4_1()); 
            // InternalRhythm.g:1621:2: ( rule__Section__PatternLoopsAssignment_4_1 )
            // InternalRhythm.g:1621:3: rule__Section__PatternLoopsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__PatternLoopsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getPatternLoopsAssignment_4_1()); 

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
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__PatternLoop__Group__0"
    // InternalRhythm.g:1630:1: rule__PatternLoop__Group__0 : rule__PatternLoop__Group__0__Impl rule__PatternLoop__Group__1 ;
    public final void rule__PatternLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1634:1: ( rule__PatternLoop__Group__0__Impl rule__PatternLoop__Group__1 )
            // InternalRhythm.g:1635:2: rule__PatternLoop__Group__0__Impl rule__PatternLoop__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PatternLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternLoop__Group__1();

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
    // $ANTLR end "rule__PatternLoop__Group__0"


    // $ANTLR start "rule__PatternLoop__Group__0__Impl"
    // InternalRhythm.g:1642:1: rule__PatternLoop__Group__0__Impl : ( ( rule__PatternLoop__PatternAssignment_0 ) ) ;
    public final void rule__PatternLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1646:1: ( ( ( rule__PatternLoop__PatternAssignment_0 ) ) )
            // InternalRhythm.g:1647:1: ( ( rule__PatternLoop__PatternAssignment_0 ) )
            {
            // InternalRhythm.g:1647:1: ( ( rule__PatternLoop__PatternAssignment_0 ) )
            // InternalRhythm.g:1648:2: ( rule__PatternLoop__PatternAssignment_0 )
            {
             before(grammarAccess.getPatternLoopAccess().getPatternAssignment_0()); 
            // InternalRhythm.g:1649:2: ( rule__PatternLoop__PatternAssignment_0 )
            // InternalRhythm.g:1649:3: rule__PatternLoop__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternLoop__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternLoopAccess().getPatternAssignment_0()); 

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
    // $ANTLR end "rule__PatternLoop__Group__0__Impl"


    // $ANTLR start "rule__PatternLoop__Group__1"
    // InternalRhythm.g:1657:1: rule__PatternLoop__Group__1 : rule__PatternLoop__Group__1__Impl rule__PatternLoop__Group__2 ;
    public final void rule__PatternLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1661:1: ( rule__PatternLoop__Group__1__Impl rule__PatternLoop__Group__2 )
            // InternalRhythm.g:1662:2: rule__PatternLoop__Group__1__Impl rule__PatternLoop__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__PatternLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternLoop__Group__2();

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
    // $ANTLR end "rule__PatternLoop__Group__1"


    // $ANTLR start "rule__PatternLoop__Group__1__Impl"
    // InternalRhythm.g:1669:1: rule__PatternLoop__Group__1__Impl : ( ( rule__PatternLoop__LoopNumberAssignment_1 ) ) ;
    public final void rule__PatternLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1673:1: ( ( ( rule__PatternLoop__LoopNumberAssignment_1 ) ) )
            // InternalRhythm.g:1674:1: ( ( rule__PatternLoop__LoopNumberAssignment_1 ) )
            {
            // InternalRhythm.g:1674:1: ( ( rule__PatternLoop__LoopNumberAssignment_1 ) )
            // InternalRhythm.g:1675:2: ( rule__PatternLoop__LoopNumberAssignment_1 )
            {
             before(grammarAccess.getPatternLoopAccess().getLoopNumberAssignment_1()); 
            // InternalRhythm.g:1676:2: ( rule__PatternLoop__LoopNumberAssignment_1 )
            // InternalRhythm.g:1676:3: rule__PatternLoop__LoopNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternLoop__LoopNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternLoopAccess().getLoopNumberAssignment_1()); 

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
    // $ANTLR end "rule__PatternLoop__Group__1__Impl"


    // $ANTLR start "rule__PatternLoop__Group__2"
    // InternalRhythm.g:1684:1: rule__PatternLoop__Group__2 : rule__PatternLoop__Group__2__Impl ;
    public final void rule__PatternLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1688:1: ( rule__PatternLoop__Group__2__Impl )
            // InternalRhythm.g:1689:2: rule__PatternLoop__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternLoop__Group__2__Impl();

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
    // $ANTLR end "rule__PatternLoop__Group__2"


    // $ANTLR start "rule__PatternLoop__Group__2__Impl"
    // InternalRhythm.g:1695:1: rule__PatternLoop__Group__2__Impl : ( 'times' ) ;
    public final void rule__PatternLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1699:1: ( ( 'times' ) )
            // InternalRhythm.g:1700:1: ( 'times' )
            {
            // InternalRhythm.g:1700:1: ( 'times' )
            // InternalRhythm.g:1701:2: 'times'
            {
             before(grammarAccess.getPatternLoopAccess().getTimesKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPatternLoopAccess().getTimesKeyword_2()); 

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
    // $ANTLR end "rule__PatternLoop__Group__2__Impl"


    // $ANTLR start "rule__PatternModification__Group__0"
    // InternalRhythm.g:1711:1: rule__PatternModification__Group__0 : rule__PatternModification__Group__0__Impl rule__PatternModification__Group__1 ;
    public final void rule__PatternModification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1715:1: ( rule__PatternModification__Group__0__Impl rule__PatternModification__Group__1 )
            // InternalRhythm.g:1716:2: rule__PatternModification__Group__0__Impl rule__PatternModification__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__PatternModification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__1();

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
    // $ANTLR end "rule__PatternModification__Group__0"


    // $ANTLR start "rule__PatternModification__Group__0__Impl"
    // InternalRhythm.g:1723:1: rule__PatternModification__Group__0__Impl : ( ( rule__PatternModification__PatternAssignment_0 ) ) ;
    public final void rule__PatternModification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1727:1: ( ( ( rule__PatternModification__PatternAssignment_0 ) ) )
            // InternalRhythm.g:1728:1: ( ( rule__PatternModification__PatternAssignment_0 ) )
            {
            // InternalRhythm.g:1728:1: ( ( rule__PatternModification__PatternAssignment_0 ) )
            // InternalRhythm.g:1729:2: ( rule__PatternModification__PatternAssignment_0 )
            {
             before(grammarAccess.getPatternModificationAccess().getPatternAssignment_0()); 
            // InternalRhythm.g:1730:2: ( rule__PatternModification__PatternAssignment_0 )
            // InternalRhythm.g:1730:3: rule__PatternModification__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternModification__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternModificationAccess().getPatternAssignment_0()); 

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
    // $ANTLR end "rule__PatternModification__Group__0__Impl"


    // $ANTLR start "rule__PatternModification__Group__1"
    // InternalRhythm.g:1738:1: rule__PatternModification__Group__1 : rule__PatternModification__Group__1__Impl rule__PatternModification__Group__2 ;
    public final void rule__PatternModification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1742:1: ( rule__PatternModification__Group__1__Impl rule__PatternModification__Group__2 )
            // InternalRhythm.g:1743:2: rule__PatternModification__Group__1__Impl rule__PatternModification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PatternModification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__2();

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
    // $ANTLR end "rule__PatternModification__Group__1"


    // $ANTLR start "rule__PatternModification__Group__1__Impl"
    // InternalRhythm.g:1750:1: rule__PatternModification__Group__1__Impl : ( '(iteration:' ) ;
    public final void rule__PatternModification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1754:1: ( ( '(iteration:' ) )
            // InternalRhythm.g:1755:1: ( '(iteration:' )
            {
            // InternalRhythm.g:1755:1: ( '(iteration:' )
            // InternalRhythm.g:1756:2: '(iteration:'
            {
             before(grammarAccess.getPatternModificationAccess().getIterationKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternModificationAccess().getIterationKeyword_1()); 

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
    // $ANTLR end "rule__PatternModification__Group__1__Impl"


    // $ANTLR start "rule__PatternModification__Group__2"
    // InternalRhythm.g:1765:1: rule__PatternModification__Group__2 : rule__PatternModification__Group__2__Impl rule__PatternModification__Group__3 ;
    public final void rule__PatternModification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1769:1: ( rule__PatternModification__Group__2__Impl rule__PatternModification__Group__3 )
            // InternalRhythm.g:1770:2: rule__PatternModification__Group__2__Impl rule__PatternModification__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__PatternModification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__3();

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
    // $ANTLR end "rule__PatternModification__Group__2"


    // $ANTLR start "rule__PatternModification__Group__2__Impl"
    // InternalRhythm.g:1777:1: rule__PatternModification__Group__2__Impl : ( ( rule__PatternModification__IterationAssignment_2 ) ) ;
    public final void rule__PatternModification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1781:1: ( ( ( rule__PatternModification__IterationAssignment_2 ) ) )
            // InternalRhythm.g:1782:1: ( ( rule__PatternModification__IterationAssignment_2 ) )
            {
            // InternalRhythm.g:1782:1: ( ( rule__PatternModification__IterationAssignment_2 ) )
            // InternalRhythm.g:1783:2: ( rule__PatternModification__IterationAssignment_2 )
            {
             before(grammarAccess.getPatternModificationAccess().getIterationAssignment_2()); 
            // InternalRhythm.g:1784:2: ( rule__PatternModification__IterationAssignment_2 )
            // InternalRhythm.g:1784:3: rule__PatternModification__IterationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternModification__IterationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternModificationAccess().getIterationAssignment_2()); 

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
    // $ANTLR end "rule__PatternModification__Group__2__Impl"


    // $ANTLR start "rule__PatternModification__Group__3"
    // InternalRhythm.g:1792:1: rule__PatternModification__Group__3 : rule__PatternModification__Group__3__Impl rule__PatternModification__Group__4 ;
    public final void rule__PatternModification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1796:1: ( rule__PatternModification__Group__3__Impl rule__PatternModification__Group__4 )
            // InternalRhythm.g:1797:2: rule__PatternModification__Group__3__Impl rule__PatternModification__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PatternModification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__4();

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
    // $ANTLR end "rule__PatternModification__Group__3"


    // $ANTLR start "rule__PatternModification__Group__3__Impl"
    // InternalRhythm.g:1804:1: rule__PatternModification__Group__3__Impl : ( ',beat:' ) ;
    public final void rule__PatternModification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1808:1: ( ( ',beat:' ) )
            // InternalRhythm.g:1809:1: ( ',beat:' )
            {
            // InternalRhythm.g:1809:1: ( ',beat:' )
            // InternalRhythm.g:1810:2: ',beat:'
            {
             before(grammarAccess.getPatternModificationAccess().getBeatKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPatternModificationAccess().getBeatKeyword_3()); 

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
    // $ANTLR end "rule__PatternModification__Group__3__Impl"


    // $ANTLR start "rule__PatternModification__Group__4"
    // InternalRhythm.g:1819:1: rule__PatternModification__Group__4 : rule__PatternModification__Group__4__Impl rule__PatternModification__Group__5 ;
    public final void rule__PatternModification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1823:1: ( rule__PatternModification__Group__4__Impl rule__PatternModification__Group__5 )
            // InternalRhythm.g:1824:2: rule__PatternModification__Group__4__Impl rule__PatternModification__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__PatternModification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__5();

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
    // $ANTLR end "rule__PatternModification__Group__4"


    // $ANTLR start "rule__PatternModification__Group__4__Impl"
    // InternalRhythm.g:1831:1: rule__PatternModification__Group__4__Impl : ( ( rule__PatternModification__BeatNumberAssignment_4 ) ) ;
    public final void rule__PatternModification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1835:1: ( ( ( rule__PatternModification__BeatNumberAssignment_4 ) ) )
            // InternalRhythm.g:1836:1: ( ( rule__PatternModification__BeatNumberAssignment_4 ) )
            {
            // InternalRhythm.g:1836:1: ( ( rule__PatternModification__BeatNumberAssignment_4 ) )
            // InternalRhythm.g:1837:2: ( rule__PatternModification__BeatNumberAssignment_4 )
            {
             before(grammarAccess.getPatternModificationAccess().getBeatNumberAssignment_4()); 
            // InternalRhythm.g:1838:2: ( rule__PatternModification__BeatNumberAssignment_4 )
            // InternalRhythm.g:1838:3: rule__PatternModification__BeatNumberAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PatternModification__BeatNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPatternModificationAccess().getBeatNumberAssignment_4()); 

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
    // $ANTLR end "rule__PatternModification__Group__4__Impl"


    // $ANTLR start "rule__PatternModification__Group__5"
    // InternalRhythm.g:1846:1: rule__PatternModification__Group__5 : rule__PatternModification__Group__5__Impl rule__PatternModification__Group__6 ;
    public final void rule__PatternModification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1850:1: ( rule__PatternModification__Group__5__Impl rule__PatternModification__Group__6 )
            // InternalRhythm.g:1851:2: rule__PatternModification__Group__5__Impl rule__PatternModification__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__PatternModification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__6();

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
    // $ANTLR end "rule__PatternModification__Group__5"


    // $ANTLR start "rule__PatternModification__Group__5__Impl"
    // InternalRhythm.g:1858:1: rule__PatternModification__Group__5__Impl : ( '):' ) ;
    public final void rule__PatternModification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1862:1: ( ( '):' ) )
            // InternalRhythm.g:1863:1: ( '):' )
            {
            // InternalRhythm.g:1863:1: ( '):' )
            // InternalRhythm.g:1864:2: '):'
            {
             before(grammarAccess.getPatternModificationAccess().getRightParenthesisColonKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPatternModificationAccess().getRightParenthesisColonKeyword_5()); 

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
    // $ANTLR end "rule__PatternModification__Group__5__Impl"


    // $ANTLR start "rule__PatternModification__Group__6"
    // InternalRhythm.g:1873:1: rule__PatternModification__Group__6 : rule__PatternModification__Group__6__Impl ;
    public final void rule__PatternModification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1877:1: ( rule__PatternModification__Group__6__Impl )
            // InternalRhythm.g:1878:2: rule__PatternModification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternModification__Group__6__Impl();

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
    // $ANTLR end "rule__PatternModification__Group__6"


    // $ANTLR start "rule__PatternModification__Group__6__Impl"
    // InternalRhythm.g:1884:1: rule__PatternModification__Group__6__Impl : ( ( rule__PatternModification__BeatAssignment_6 ) ) ;
    public final void rule__PatternModification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1888:1: ( ( ( rule__PatternModification__BeatAssignment_6 ) ) )
            // InternalRhythm.g:1889:1: ( ( rule__PatternModification__BeatAssignment_6 ) )
            {
            // InternalRhythm.g:1889:1: ( ( rule__PatternModification__BeatAssignment_6 ) )
            // InternalRhythm.g:1890:2: ( rule__PatternModification__BeatAssignment_6 )
            {
             before(grammarAccess.getPatternModificationAccess().getBeatAssignment_6()); 
            // InternalRhythm.g:1891:2: ( rule__PatternModification__BeatAssignment_6 )
            // InternalRhythm.g:1891:3: rule__PatternModification__BeatAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PatternModification__BeatAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPatternModificationAccess().getBeatAssignment_6()); 

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
    // $ANTLR end "rule__PatternModification__Group__6__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalRhythm.g:1900:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1904:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalRhythm.g:1905:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalRhythm.g:1912:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1916:1: ( ( RULE_INT ) )
            // InternalRhythm.g:1917:1: ( RULE_INT )
            {
            // InternalRhythm.g:1917:1: ( RULE_INT )
            // InternalRhythm.g:1918:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalRhythm.g:1927:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1931:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalRhythm.g:1932:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalRhythm.g:1939:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1943:1: ( ( '.' ) )
            // InternalRhythm.g:1944:1: ( '.' )
            {
            // InternalRhythm.g:1944:1: ( '.' )
            // InternalRhythm.g:1945:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalRhythm.g:1954:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1958:1: ( rule__EFloat__Group__2__Impl )
            // InternalRhythm.g:1959:2: rule__EFloat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalRhythm.g:1965:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1969:1: ( ( RULE_INT ) )
            // InternalRhythm.g:1970:1: ( RULE_INT )
            {
            // InternalRhythm.g:1970:1: ( RULE_INT )
            // InternalRhythm.g:1971:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__Rhythm__NameAssignment_1"
    // InternalRhythm.g:1981:1: rule__Rhythm__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rhythm__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1985:1: ( ( ruleEString ) )
            // InternalRhythm.g:1986:2: ( ruleEString )
            {
            // InternalRhythm.g:1986:2: ( ruleEString )
            // InternalRhythm.g:1987:3: ruleEString
            {
             before(grammarAccess.getRhythmAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRhythmAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rhythm__NameAssignment_1"


    // $ANTLR start "rule__Rhythm__BPMAssignment_3"
    // InternalRhythm.g:1996:1: rule__Rhythm__BPMAssignment_3 : ( ruleEInt ) ;
    public final void rule__Rhythm__BPMAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2000:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2001:2: ( ruleEInt )
            {
            // InternalRhythm.g:2001:2: ( ruleEInt )
            // InternalRhythm.g:2002:3: ruleEInt
            {
             before(grammarAccess.getRhythmAccess().getBPMEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRhythmAccess().getBPMEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rhythm__BPMAssignment_3"


    // $ANTLR start "rule__Rhythm__ResolutionAssignment_6"
    // InternalRhythm.g:2011:1: rule__Rhythm__ResolutionAssignment_6 : ( ruleEInt ) ;
    public final void rule__Rhythm__ResolutionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2015:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2016:2: ( ruleEInt )
            {
            // InternalRhythm.g:2016:2: ( ruleEInt )
            // InternalRhythm.g:2017:3: ruleEInt
            {
             before(grammarAccess.getRhythmAccess().getResolutionEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRhythmAccess().getResolutionEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Rhythm__ResolutionAssignment_6"


    // $ANTLR start "rule__Rhythm__OffsetAssignment_8"
    // InternalRhythm.g:2026:1: rule__Rhythm__OffsetAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Rhythm__OffsetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2030:1: ( ( ruleEFloat ) )
            // InternalRhythm.g:2031:2: ( ruleEFloat )
            {
            // InternalRhythm.g:2031:2: ( ruleEFloat )
            // InternalRhythm.g:2032:3: ruleEFloat
            {
             before(grammarAccess.getRhythmAccess().getOffsetEFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRhythmAccess().getOffsetEFloatParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Rhythm__OffsetAssignment_8"


    // $ANTLR start "rule__Rhythm__TracksAssignment_10"
    // InternalRhythm.g:2041:1: rule__Rhythm__TracksAssignment_10 : ( ruleTrack ) ;
    public final void rule__Rhythm__TracksAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2045:1: ( ( ruleTrack ) )
            // InternalRhythm.g:2046:2: ( ruleTrack )
            {
            // InternalRhythm.g:2046:2: ( ruleTrack )
            // InternalRhythm.g:2047:3: ruleTrack
            {
             before(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Rhythm__TracksAssignment_10"


    // $ANTLR start "rule__Rhythm__TracksAssignment_11"
    // InternalRhythm.g:2056:1: rule__Rhythm__TracksAssignment_11 : ( ruleTrack ) ;
    public final void rule__Rhythm__TracksAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2060:1: ( ( ruleTrack ) )
            // InternalRhythm.g:2061:2: ( ruleTrack )
            {
            // InternalRhythm.g:2061:2: ( ruleTrack )
            // InternalRhythm.g:2062:3: ruleTrack
            {
             before(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getRhythmAccess().getTracksTrackParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Rhythm__TracksAssignment_11"


    // $ANTLR start "rule__Track__NameAssignment_1"
    // InternalRhythm.g:2071:1: rule__Track__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2075:1: ( ( ruleEString ) )
            // InternalRhythm.g:2076:2: ( ruleEString )
            {
            // InternalRhythm.g:2076:2: ( ruleEString )
            // InternalRhythm.g:2077:3: ruleEString
            {
             before(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Track__NameAssignment_1"


    // $ANTLR start "rule__Track__PatternsAssignment_3_1"
    // InternalRhythm.g:2086:1: rule__Track__PatternsAssignment_3_1 : ( rulePattern ) ;
    public final void rule__Track__PatternsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2090:1: ( ( rulePattern ) )
            // InternalRhythm.g:2091:2: ( rulePattern )
            {
            // InternalRhythm.g:2091:2: ( rulePattern )
            // InternalRhythm.g:2092:3: rulePattern
            {
             before(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Track__PatternsAssignment_3_1"


    // $ANTLR start "rule__Track__PatternsAssignment_3_2"
    // InternalRhythm.g:2101:1: rule__Track__PatternsAssignment_3_2 : ( rulePattern ) ;
    public final void rule__Track__PatternsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2105:1: ( ( rulePattern ) )
            // InternalRhythm.g:2106:2: ( rulePattern )
            {
            // InternalRhythm.g:2106:2: ( rulePattern )
            // InternalRhythm.g:2107:3: rulePattern
            {
             before(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getPatternsPatternParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Track__PatternsAssignment_3_2"


    // $ANTLR start "rule__Track__SectionsAssignment_5"
    // InternalRhythm.g:2116:1: rule__Track__SectionsAssignment_5 : ( ruleSection ) ;
    public final void rule__Track__SectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2120:1: ( ( ruleSection ) )
            // InternalRhythm.g:2121:2: ( ruleSection )
            {
            // InternalRhythm.g:2121:2: ( ruleSection )
            // InternalRhythm.g:2122:3: ruleSection
            {
             before(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Track__SectionsAssignment_5"


    // $ANTLR start "rule__Track__SectionsAssignment_6"
    // InternalRhythm.g:2131:1: rule__Track__SectionsAssignment_6 : ( ruleSection ) ;
    public final void rule__Track__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2135:1: ( ( ruleSection ) )
            // InternalRhythm.g:2136:2: ( ruleSection )
            {
            // InternalRhythm.g:2136:2: ( ruleSection )
            // InternalRhythm.g:2137:3: ruleSection
            {
             before(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getSectionsSectionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Track__SectionsAssignment_6"


    // $ANTLR start "rule__Pattern__NameAssignment_0"
    // InternalRhythm.g:2146:1: rule__Pattern__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2150:1: ( ( ruleEString ) )
            // InternalRhythm.g:2151:2: ( ruleEString )
            {
            // InternalRhythm.g:2151:2: ( ruleEString )
            // InternalRhythm.g:2152:3: ruleEString
            {
             before(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Pattern__NameAssignment_0"


    // $ANTLR start "rule__Pattern__BarAssignment_2"
    // InternalRhythm.g:2161:1: rule__Pattern__BarAssignment_2 : ( rulePatternBar ) ;
    public final void rule__Pattern__BarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2165:1: ( ( rulePatternBar ) )
            // InternalRhythm.g:2166:2: ( rulePatternBar )
            {
            // InternalRhythm.g:2166:2: ( rulePatternBar )
            // InternalRhythm.g:2167:3: rulePatternBar
            {
             before(grammarAccess.getPatternAccess().getBarPatternBarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBar();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBarPatternBarParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pattern__BarAssignment_2"


    // $ANTLR start "rule__Beat__TicksAssignment_0"
    // InternalRhythm.g:2176:1: rule__Beat__TicksAssignment_0 : ( ruleNote ) ;
    public final void rule__Beat__TicksAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2180:1: ( ( ruleNote ) )
            // InternalRhythm.g:2181:2: ( ruleNote )
            {
            // InternalRhythm.g:2181:2: ( ruleNote )
            // InternalRhythm.g:2182:3: ruleNote
            {
             before(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Beat__TicksAssignment_0"


    // $ANTLR start "rule__Beat__TicksAssignment_1_1"
    // InternalRhythm.g:2191:1: rule__Beat__TicksAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Beat__TicksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2195:1: ( ( ruleNote ) )
            // InternalRhythm.g:2196:2: ( ruleNote )
            {
            // InternalRhythm.g:2196:2: ( ruleNote )
            // InternalRhythm.g:2197:3: ruleNote
            {
             before(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getTicksNoteEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Beat__TicksAssignment_1_1"


    // $ANTLR start "rule__PatternBar__BeatsAssignment_1"
    // InternalRhythm.g:2206:1: rule__PatternBar__BeatsAssignment_1 : ( ruleBeat ) ;
    public final void rule__PatternBar__BeatsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2210:1: ( ( ruleBeat ) )
            // InternalRhythm.g:2211:2: ( ruleBeat )
            {
            // InternalRhythm.g:2211:2: ( ruleBeat )
            // InternalRhythm.g:2212:3: ruleBeat
            {
             before(grammarAccess.getPatternBarAccess().getBeatsBeatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getPatternBarAccess().getBeatsBeatParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PatternBar__BeatsAssignment_1"


    // $ANTLR start "rule__PatternBar__BeatsAssignment_2_1"
    // InternalRhythm.g:2221:1: rule__PatternBar__BeatsAssignment_2_1 : ( ruleBeat ) ;
    public final void rule__PatternBar__BeatsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2225:1: ( ( ruleBeat ) )
            // InternalRhythm.g:2226:2: ( ruleBeat )
            {
            // InternalRhythm.g:2226:2: ( ruleBeat )
            // InternalRhythm.g:2227:3: ruleBeat
            {
             before(grammarAccess.getPatternBarAccess().getBeatsBeatParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getPatternBarAccess().getBeatsBeatParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__PatternBar__BeatsAssignment_2_1"


    // $ANTLR start "rule__Section__NameAssignment_0"
    // InternalRhythm.g:2236:1: rule__Section__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2240:1: ( ( ruleEString ) )
            // InternalRhythm.g:2241:2: ( ruleEString )
            {
            // InternalRhythm.g:2241:2: ( ruleEString )
            // InternalRhythm.g:2242:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Section__NameAssignment_0"


    // $ANTLR start "rule__Section__PatternLoopsAssignment_3"
    // InternalRhythm.g:2251:1: rule__Section__PatternLoopsAssignment_3 : ( rulePatternLoop ) ;
    public final void rule__Section__PatternLoopsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2255:1: ( ( rulePatternLoop ) )
            // InternalRhythm.g:2256:2: ( rulePatternLoop )
            {
            // InternalRhythm.g:2256:2: ( rulePatternLoop )
            // InternalRhythm.g:2257:3: rulePatternLoop
            {
             before(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePatternLoop();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Section__PatternLoopsAssignment_3"


    // $ANTLR start "rule__Section__PatternLoopsAssignment_4_1"
    // InternalRhythm.g:2266:1: rule__Section__PatternLoopsAssignment_4_1 : ( rulePatternLoop ) ;
    public final void rule__Section__PatternLoopsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2270:1: ( ( rulePatternLoop ) )
            // InternalRhythm.g:2271:2: ( rulePatternLoop )
            {
            // InternalRhythm.g:2271:2: ( rulePatternLoop )
            // InternalRhythm.g:2272:3: rulePatternLoop
            {
             before(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternLoop();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getPatternLoopsPatternLoopParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Section__PatternLoopsAssignment_4_1"


    // $ANTLR start "rule__Section__PatternModificationsAssignment_5"
    // InternalRhythm.g:2281:1: rule__Section__PatternModificationsAssignment_5 : ( rulePatternModification ) ;
    public final void rule__Section__PatternModificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2285:1: ( ( rulePatternModification ) )
            // InternalRhythm.g:2286:2: ( rulePatternModification )
            {
            // InternalRhythm.g:2286:2: ( rulePatternModification )
            // InternalRhythm.g:2287:3: rulePatternModification
            {
             before(grammarAccess.getSectionAccess().getPatternModificationsPatternModificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePatternModification();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getPatternModificationsPatternModificationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Section__PatternModificationsAssignment_5"


    // $ANTLR start "rule__PatternLoop__PatternAssignment_0"
    // InternalRhythm.g:2296:1: rule__PatternLoop__PatternAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__PatternLoop__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2300:1: ( ( ( ruleEString ) ) )
            // InternalRhythm.g:2301:2: ( ( ruleEString ) )
            {
            // InternalRhythm.g:2301:2: ( ( ruleEString ) )
            // InternalRhythm.g:2302:3: ( ruleEString )
            {
             before(grammarAccess.getPatternLoopAccess().getPatternPatternCrossReference_0_0()); 
            // InternalRhythm.g:2303:3: ( ruleEString )
            // InternalRhythm.g:2304:4: ruleEString
            {
             before(grammarAccess.getPatternLoopAccess().getPatternPatternEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternLoopAccess().getPatternPatternEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternLoopAccess().getPatternPatternCrossReference_0_0()); 

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
    // $ANTLR end "rule__PatternLoop__PatternAssignment_0"


    // $ANTLR start "rule__PatternLoop__LoopNumberAssignment_1"
    // InternalRhythm.g:2315:1: rule__PatternLoop__LoopNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__PatternLoop__LoopNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2319:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2320:2: ( ruleEInt )
            {
            // InternalRhythm.g:2320:2: ( ruleEInt )
            // InternalRhythm.g:2321:3: ruleEInt
            {
             before(grammarAccess.getPatternLoopAccess().getLoopNumberEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPatternLoopAccess().getLoopNumberEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PatternLoop__LoopNumberAssignment_1"


    // $ANTLR start "rule__PatternModification__PatternAssignment_0"
    // InternalRhythm.g:2330:1: rule__PatternModification__PatternAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__PatternModification__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2334:1: ( ( ( ruleEString ) ) )
            // InternalRhythm.g:2335:2: ( ( ruleEString ) )
            {
            // InternalRhythm.g:2335:2: ( ( ruleEString ) )
            // InternalRhythm.g:2336:3: ( ruleEString )
            {
             before(grammarAccess.getPatternModificationAccess().getPatternPatternCrossReference_0_0()); 
            // InternalRhythm.g:2337:3: ( ruleEString )
            // InternalRhythm.g:2338:4: ruleEString
            {
             before(grammarAccess.getPatternModificationAccess().getPatternPatternEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternModificationAccess().getPatternPatternEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternModificationAccess().getPatternPatternCrossReference_0_0()); 

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
    // $ANTLR end "rule__PatternModification__PatternAssignment_0"


    // $ANTLR start "rule__PatternModification__IterationAssignment_2"
    // InternalRhythm.g:2349:1: rule__PatternModification__IterationAssignment_2 : ( ruleEInt ) ;
    public final void rule__PatternModification__IterationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2353:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2354:2: ( ruleEInt )
            {
            // InternalRhythm.g:2354:2: ( ruleEInt )
            // InternalRhythm.g:2355:3: ruleEInt
            {
             before(grammarAccess.getPatternModificationAccess().getIterationEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPatternModificationAccess().getIterationEIntParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PatternModification__IterationAssignment_2"


    // $ANTLR start "rule__PatternModification__BeatNumberAssignment_4"
    // InternalRhythm.g:2364:1: rule__PatternModification__BeatNumberAssignment_4 : ( ruleEInt ) ;
    public final void rule__PatternModification__BeatNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2368:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2369:2: ( ruleEInt )
            {
            // InternalRhythm.g:2369:2: ( ruleEInt )
            // InternalRhythm.g:2370:3: ruleEInt
            {
             before(grammarAccess.getPatternModificationAccess().getBeatNumberEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPatternModificationAccess().getBeatNumberEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PatternModification__BeatNumberAssignment_4"


    // $ANTLR start "rule__PatternModification__BeatAssignment_6"
    // InternalRhythm.g:2379:1: rule__PatternModification__BeatAssignment_6 : ( ruleBeat ) ;
    public final void rule__PatternModification__BeatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2383:1: ( ( ruleBeat ) )
            // InternalRhythm.g:2384:2: ( ruleBeat )
            {
            // InternalRhythm.g:2384:2: ( ruleBeat )
            // InternalRhythm.g:2385:3: ruleBeat
            {
             before(grammarAccess.getPatternModificationAccess().getBeatBeatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getPatternModificationAccess().getBeatBeatParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PatternModification__BeatAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000028000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});

}