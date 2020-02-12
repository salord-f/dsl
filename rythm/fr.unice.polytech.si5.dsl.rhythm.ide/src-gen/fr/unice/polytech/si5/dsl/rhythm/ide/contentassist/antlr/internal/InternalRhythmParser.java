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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bd'", "'sd'", "'_'", "'ch'", "'oh'", "'cc'", "'rc'", "'rhythm'", "'tempo'", "'BPM'", "'resolution:'", "'offset:'", "'tick'", "'track'", "'{'", "'sections:'", "'}'", "'patterns:'", "'beat:'", "','", "'pattern:'", "'times'", "'(iteration:'", "',beat:'", "'):'", "'.'"
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


    // $ANTLR start "entryRuleSection"
    // InternalRhythm.g:153:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalRhythm.g:154:1: ( ruleSection EOF )
            // InternalRhythm.g:155:1: ruleSection EOF
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
    // InternalRhythm.g:162:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:166:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalRhythm.g:167:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalRhythm.g:167:2: ( ( rule__Section__Group__0 ) )
            // InternalRhythm.g:168:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalRhythm.g:169:3: ( rule__Section__Group__0 )
            // InternalRhythm.g:169:4: rule__Section__Group__0
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
    // InternalRhythm.g:178:1: entryRulePatternLoop : rulePatternLoop EOF ;
    public final void entryRulePatternLoop() throws RecognitionException {
        try {
            // InternalRhythm.g:179:1: ( rulePatternLoop EOF )
            // InternalRhythm.g:180:1: rulePatternLoop EOF
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
    // InternalRhythm.g:187:1: rulePatternLoop : ( ( rule__PatternLoop__Group__0 ) ) ;
    public final void rulePatternLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:191:2: ( ( ( rule__PatternLoop__Group__0 ) ) )
            // InternalRhythm.g:192:2: ( ( rule__PatternLoop__Group__0 ) )
            {
            // InternalRhythm.g:192:2: ( ( rule__PatternLoop__Group__0 ) )
            // InternalRhythm.g:193:3: ( rule__PatternLoop__Group__0 )
            {
             before(grammarAccess.getPatternLoopAccess().getGroup()); 
            // InternalRhythm.g:194:3: ( rule__PatternLoop__Group__0 )
            // InternalRhythm.g:194:4: rule__PatternLoop__Group__0
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
    // InternalRhythm.g:203:1: entryRulePatternModification : rulePatternModification EOF ;
    public final void entryRulePatternModification() throws RecognitionException {
        try {
            // InternalRhythm.g:204:1: ( rulePatternModification EOF )
            // InternalRhythm.g:205:1: rulePatternModification EOF
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
    // InternalRhythm.g:212:1: rulePatternModification : ( ( rule__PatternModification__Group__0 ) ) ;
    public final void rulePatternModification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:216:2: ( ( ( rule__PatternModification__Group__0 ) ) )
            // InternalRhythm.g:217:2: ( ( rule__PatternModification__Group__0 ) )
            {
            // InternalRhythm.g:217:2: ( ( rule__PatternModification__Group__0 ) )
            // InternalRhythm.g:218:3: ( rule__PatternModification__Group__0 )
            {
             before(grammarAccess.getPatternModificationAccess().getGroup()); 
            // InternalRhythm.g:219:3: ( rule__PatternModification__Group__0 )
            // InternalRhythm.g:219:4: rule__PatternModification__Group__0
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
    // InternalRhythm.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRhythm.g:229:1: ( ruleEString EOF )
            // InternalRhythm.g:230:1: ruleEString EOF
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
    // InternalRhythm.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRhythm.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRhythm.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalRhythm.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRhythm.g:244:3: ( rule__EString__Alternatives )
            // InternalRhythm.g:244:4: rule__EString__Alternatives
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
    // InternalRhythm.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRhythm.g:254:1: ( ruleEInt EOF )
            // InternalRhythm.g:255:1: ruleEInt EOF
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
    // InternalRhythm.g:262:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:266:2: ( ( RULE_INT ) )
            // InternalRhythm.g:267:2: ( RULE_INT )
            {
            // InternalRhythm.g:267:2: ( RULE_INT )
            // InternalRhythm.g:268:3: RULE_INT
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
    // InternalRhythm.g:278:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalRhythm.g:279:1: ( ruleEFloat EOF )
            // InternalRhythm.g:280:1: ruleEFloat EOF
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
    // InternalRhythm.g:287:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:291:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalRhythm.g:292:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalRhythm.g:292:2: ( ( rule__EFloat__Group__0 ) )
            // InternalRhythm.g:293:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalRhythm.g:294:3: ( rule__EFloat__Group__0 )
            // InternalRhythm.g:294:4: rule__EFloat__Group__0
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
    // InternalRhythm.g:303:1: ruleNote : ( ( rule__Note__Alternatives ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:307:1: ( ( ( rule__Note__Alternatives ) ) )
            // InternalRhythm.g:308:2: ( ( rule__Note__Alternatives ) )
            {
            // InternalRhythm.g:308:2: ( ( rule__Note__Alternatives ) )
            // InternalRhythm.g:309:3: ( rule__Note__Alternatives )
            {
             before(grammarAccess.getNoteAccess().getAlternatives()); 
            // InternalRhythm.g:310:3: ( rule__Note__Alternatives )
            // InternalRhythm.g:310:4: rule__Note__Alternatives
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
    // InternalRhythm.g:318:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:322:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRhythm.g:323:2: ( RULE_STRING )
                    {
                    // InternalRhythm.g:323:2: ( RULE_STRING )
                    // InternalRhythm.g:324:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRhythm.g:329:2: ( RULE_ID )
                    {
                    // InternalRhythm.g:329:2: ( RULE_ID )
                    // InternalRhythm.g:330:3: RULE_ID
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
    // InternalRhythm.g:339:1: rule__Note__Alternatives : ( ( ( 'bd' ) ) | ( ( 'sd' ) ) | ( ( '_' ) ) | ( ( 'ch' ) ) | ( ( 'oh' ) ) | ( ( 'cc' ) ) | ( ( 'rc' ) ) );
    public final void rule__Note__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:343:1: ( ( ( 'bd' ) ) | ( ( 'sd' ) ) | ( ( '_' ) ) | ( ( 'ch' ) ) | ( ( 'oh' ) ) | ( ( 'cc' ) ) | ( ( 'rc' ) ) )
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
                    // InternalRhythm.g:344:2: ( ( 'bd' ) )
                    {
                    // InternalRhythm.g:344:2: ( ( 'bd' ) )
                    // InternalRhythm.g:345:3: ( 'bd' )
                    {
                     before(grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0()); 
                    // InternalRhythm.g:346:3: ( 'bd' )
                    // InternalRhythm.g:346:4: 'bd'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getBDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRhythm.g:350:2: ( ( 'sd' ) )
                    {
                    // InternalRhythm.g:350:2: ( ( 'sd' ) )
                    // InternalRhythm.g:351:3: ( 'sd' )
                    {
                     before(grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1()); 
                    // InternalRhythm.g:352:3: ( 'sd' )
                    // InternalRhythm.g:352:4: 'sd'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getSDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRhythm.g:356:2: ( ( '_' ) )
                    {
                    // InternalRhythm.g:356:2: ( ( '_' ) )
                    // InternalRhythm.g:357:3: ( '_' )
                    {
                     before(grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2()); 
                    // InternalRhythm.g:358:3: ( '_' )
                    // InternalRhythm.g:358:4: '_'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getBLANKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRhythm.g:362:2: ( ( 'ch' ) )
                    {
                    // InternalRhythm.g:362:2: ( ( 'ch' ) )
                    // InternalRhythm.g:363:3: ( 'ch' )
                    {
                     before(grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3()); 
                    // InternalRhythm.g:364:3: ( 'ch' )
                    // InternalRhythm.g:364:4: 'ch'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getCHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRhythm.g:368:2: ( ( 'oh' ) )
                    {
                    // InternalRhythm.g:368:2: ( ( 'oh' ) )
                    // InternalRhythm.g:369:3: ( 'oh' )
                    {
                     before(grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4()); 
                    // InternalRhythm.g:370:3: ( 'oh' )
                    // InternalRhythm.g:370:4: 'oh'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getOHEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRhythm.g:374:2: ( ( 'cc' ) )
                    {
                    // InternalRhythm.g:374:2: ( ( 'cc' ) )
                    // InternalRhythm.g:375:3: ( 'cc' )
                    {
                     before(grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5()); 
                    // InternalRhythm.g:376:3: ( 'cc' )
                    // InternalRhythm.g:376:4: 'cc'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteAccess().getCCEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRhythm.g:380:2: ( ( 'rc' ) )
                    {
                    // InternalRhythm.g:380:2: ( ( 'rc' ) )
                    // InternalRhythm.g:381:3: ( 'rc' )
                    {
                     before(grammarAccess.getNoteAccess().getRCEnumLiteralDeclaration_6()); 
                    // InternalRhythm.g:382:3: ( 'rc' )
                    // InternalRhythm.g:382:4: 'rc'
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
    // InternalRhythm.g:390:1: rule__Rhythm__Group__0 : rule__Rhythm__Group__0__Impl rule__Rhythm__Group__1 ;
    public final void rule__Rhythm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:394:1: ( rule__Rhythm__Group__0__Impl rule__Rhythm__Group__1 )
            // InternalRhythm.g:395:2: rule__Rhythm__Group__0__Impl rule__Rhythm__Group__1
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
    // InternalRhythm.g:402:1: rule__Rhythm__Group__0__Impl : ( 'rhythm' ) ;
    public final void rule__Rhythm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:406:1: ( ( 'rhythm' ) )
            // InternalRhythm.g:407:1: ( 'rhythm' )
            {
            // InternalRhythm.g:407:1: ( 'rhythm' )
            // InternalRhythm.g:408:2: 'rhythm'
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
    // InternalRhythm.g:417:1: rule__Rhythm__Group__1 : rule__Rhythm__Group__1__Impl rule__Rhythm__Group__2 ;
    public final void rule__Rhythm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:421:1: ( rule__Rhythm__Group__1__Impl rule__Rhythm__Group__2 )
            // InternalRhythm.g:422:2: rule__Rhythm__Group__1__Impl rule__Rhythm__Group__2
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
    // InternalRhythm.g:429:1: rule__Rhythm__Group__1__Impl : ( ( rule__Rhythm__NameAssignment_1 ) ) ;
    public final void rule__Rhythm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:433:1: ( ( ( rule__Rhythm__NameAssignment_1 ) ) )
            // InternalRhythm.g:434:1: ( ( rule__Rhythm__NameAssignment_1 ) )
            {
            // InternalRhythm.g:434:1: ( ( rule__Rhythm__NameAssignment_1 ) )
            // InternalRhythm.g:435:2: ( rule__Rhythm__NameAssignment_1 )
            {
             before(grammarAccess.getRhythmAccess().getNameAssignment_1()); 
            // InternalRhythm.g:436:2: ( rule__Rhythm__NameAssignment_1 )
            // InternalRhythm.g:436:3: rule__Rhythm__NameAssignment_1
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
    // InternalRhythm.g:444:1: rule__Rhythm__Group__2 : rule__Rhythm__Group__2__Impl rule__Rhythm__Group__3 ;
    public final void rule__Rhythm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:448:1: ( rule__Rhythm__Group__2__Impl rule__Rhythm__Group__3 )
            // InternalRhythm.g:449:2: rule__Rhythm__Group__2__Impl rule__Rhythm__Group__3
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
    // InternalRhythm.g:456:1: rule__Rhythm__Group__2__Impl : ( 'tempo' ) ;
    public final void rule__Rhythm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:460:1: ( ( 'tempo' ) )
            // InternalRhythm.g:461:1: ( 'tempo' )
            {
            // InternalRhythm.g:461:1: ( 'tempo' )
            // InternalRhythm.g:462:2: 'tempo'
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
    // InternalRhythm.g:471:1: rule__Rhythm__Group__3 : rule__Rhythm__Group__3__Impl rule__Rhythm__Group__4 ;
    public final void rule__Rhythm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:475:1: ( rule__Rhythm__Group__3__Impl rule__Rhythm__Group__4 )
            // InternalRhythm.g:476:2: rule__Rhythm__Group__3__Impl rule__Rhythm__Group__4
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
    // InternalRhythm.g:483:1: rule__Rhythm__Group__3__Impl : ( ( rule__Rhythm__BPMAssignment_3 ) ) ;
    public final void rule__Rhythm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:487:1: ( ( ( rule__Rhythm__BPMAssignment_3 ) ) )
            // InternalRhythm.g:488:1: ( ( rule__Rhythm__BPMAssignment_3 ) )
            {
            // InternalRhythm.g:488:1: ( ( rule__Rhythm__BPMAssignment_3 ) )
            // InternalRhythm.g:489:2: ( rule__Rhythm__BPMAssignment_3 )
            {
             before(grammarAccess.getRhythmAccess().getBPMAssignment_3()); 
            // InternalRhythm.g:490:2: ( rule__Rhythm__BPMAssignment_3 )
            // InternalRhythm.g:490:3: rule__Rhythm__BPMAssignment_3
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
    // InternalRhythm.g:498:1: rule__Rhythm__Group__4 : rule__Rhythm__Group__4__Impl rule__Rhythm__Group__5 ;
    public final void rule__Rhythm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:502:1: ( rule__Rhythm__Group__4__Impl rule__Rhythm__Group__5 )
            // InternalRhythm.g:503:2: rule__Rhythm__Group__4__Impl rule__Rhythm__Group__5
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
    // InternalRhythm.g:510:1: rule__Rhythm__Group__4__Impl : ( 'BPM' ) ;
    public final void rule__Rhythm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:514:1: ( ( 'BPM' ) )
            // InternalRhythm.g:515:1: ( 'BPM' )
            {
            // InternalRhythm.g:515:1: ( 'BPM' )
            // InternalRhythm.g:516:2: 'BPM'
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
    // InternalRhythm.g:525:1: rule__Rhythm__Group__5 : rule__Rhythm__Group__5__Impl rule__Rhythm__Group__6 ;
    public final void rule__Rhythm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:529:1: ( rule__Rhythm__Group__5__Impl rule__Rhythm__Group__6 )
            // InternalRhythm.g:530:2: rule__Rhythm__Group__5__Impl rule__Rhythm__Group__6
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
    // InternalRhythm.g:537:1: rule__Rhythm__Group__5__Impl : ( 'resolution:' ) ;
    public final void rule__Rhythm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:541:1: ( ( 'resolution:' ) )
            // InternalRhythm.g:542:1: ( 'resolution:' )
            {
            // InternalRhythm.g:542:1: ( 'resolution:' )
            // InternalRhythm.g:543:2: 'resolution:'
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
    // InternalRhythm.g:552:1: rule__Rhythm__Group__6 : rule__Rhythm__Group__6__Impl rule__Rhythm__Group__7 ;
    public final void rule__Rhythm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:556:1: ( rule__Rhythm__Group__6__Impl rule__Rhythm__Group__7 )
            // InternalRhythm.g:557:2: rule__Rhythm__Group__6__Impl rule__Rhythm__Group__7
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
    // InternalRhythm.g:564:1: rule__Rhythm__Group__6__Impl : ( ( rule__Rhythm__ResolutionAssignment_6 ) ) ;
    public final void rule__Rhythm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:568:1: ( ( ( rule__Rhythm__ResolutionAssignment_6 ) ) )
            // InternalRhythm.g:569:1: ( ( rule__Rhythm__ResolutionAssignment_6 ) )
            {
            // InternalRhythm.g:569:1: ( ( rule__Rhythm__ResolutionAssignment_6 ) )
            // InternalRhythm.g:570:2: ( rule__Rhythm__ResolutionAssignment_6 )
            {
             before(grammarAccess.getRhythmAccess().getResolutionAssignment_6()); 
            // InternalRhythm.g:571:2: ( rule__Rhythm__ResolutionAssignment_6 )
            // InternalRhythm.g:571:3: rule__Rhythm__ResolutionAssignment_6
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
    // InternalRhythm.g:579:1: rule__Rhythm__Group__7 : rule__Rhythm__Group__7__Impl rule__Rhythm__Group__8 ;
    public final void rule__Rhythm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:583:1: ( rule__Rhythm__Group__7__Impl rule__Rhythm__Group__8 )
            // InternalRhythm.g:584:2: rule__Rhythm__Group__7__Impl rule__Rhythm__Group__8
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
    // InternalRhythm.g:591:1: rule__Rhythm__Group__7__Impl : ( 'offset:' ) ;
    public final void rule__Rhythm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:595:1: ( ( 'offset:' ) )
            // InternalRhythm.g:596:1: ( 'offset:' )
            {
            // InternalRhythm.g:596:1: ( 'offset:' )
            // InternalRhythm.g:597:2: 'offset:'
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
    // InternalRhythm.g:606:1: rule__Rhythm__Group__8 : rule__Rhythm__Group__8__Impl rule__Rhythm__Group__9 ;
    public final void rule__Rhythm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:610:1: ( rule__Rhythm__Group__8__Impl rule__Rhythm__Group__9 )
            // InternalRhythm.g:611:2: rule__Rhythm__Group__8__Impl rule__Rhythm__Group__9
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
    // InternalRhythm.g:618:1: rule__Rhythm__Group__8__Impl : ( ( rule__Rhythm__OffsetAssignment_8 ) ) ;
    public final void rule__Rhythm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:622:1: ( ( ( rule__Rhythm__OffsetAssignment_8 ) ) )
            // InternalRhythm.g:623:1: ( ( rule__Rhythm__OffsetAssignment_8 ) )
            {
            // InternalRhythm.g:623:1: ( ( rule__Rhythm__OffsetAssignment_8 ) )
            // InternalRhythm.g:624:2: ( rule__Rhythm__OffsetAssignment_8 )
            {
             before(grammarAccess.getRhythmAccess().getOffsetAssignment_8()); 
            // InternalRhythm.g:625:2: ( rule__Rhythm__OffsetAssignment_8 )
            // InternalRhythm.g:625:3: rule__Rhythm__OffsetAssignment_8
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
    // InternalRhythm.g:633:1: rule__Rhythm__Group__9 : rule__Rhythm__Group__9__Impl rule__Rhythm__Group__10 ;
    public final void rule__Rhythm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:637:1: ( rule__Rhythm__Group__9__Impl rule__Rhythm__Group__10 )
            // InternalRhythm.g:638:2: rule__Rhythm__Group__9__Impl rule__Rhythm__Group__10
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
    // InternalRhythm.g:645:1: rule__Rhythm__Group__9__Impl : ( 'tick' ) ;
    public final void rule__Rhythm__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:649:1: ( ( 'tick' ) )
            // InternalRhythm.g:650:1: ( 'tick' )
            {
            // InternalRhythm.g:650:1: ( 'tick' )
            // InternalRhythm.g:651:2: 'tick'
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
    // InternalRhythm.g:660:1: rule__Rhythm__Group__10 : rule__Rhythm__Group__10__Impl rule__Rhythm__Group__11 ;
    public final void rule__Rhythm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:664:1: ( rule__Rhythm__Group__10__Impl rule__Rhythm__Group__11 )
            // InternalRhythm.g:665:2: rule__Rhythm__Group__10__Impl rule__Rhythm__Group__11
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
    // InternalRhythm.g:672:1: rule__Rhythm__Group__10__Impl : ( ( rule__Rhythm__TracksAssignment_10 ) ) ;
    public final void rule__Rhythm__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:676:1: ( ( ( rule__Rhythm__TracksAssignment_10 ) ) )
            // InternalRhythm.g:677:1: ( ( rule__Rhythm__TracksAssignment_10 ) )
            {
            // InternalRhythm.g:677:1: ( ( rule__Rhythm__TracksAssignment_10 ) )
            // InternalRhythm.g:678:2: ( rule__Rhythm__TracksAssignment_10 )
            {
             before(grammarAccess.getRhythmAccess().getTracksAssignment_10()); 
            // InternalRhythm.g:679:2: ( rule__Rhythm__TracksAssignment_10 )
            // InternalRhythm.g:679:3: rule__Rhythm__TracksAssignment_10
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
    // InternalRhythm.g:687:1: rule__Rhythm__Group__11 : rule__Rhythm__Group__11__Impl ;
    public final void rule__Rhythm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:691:1: ( rule__Rhythm__Group__11__Impl )
            // InternalRhythm.g:692:2: rule__Rhythm__Group__11__Impl
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
    // InternalRhythm.g:698:1: rule__Rhythm__Group__11__Impl : ( ( rule__Rhythm__TracksAssignment_11 )* ) ;
    public final void rule__Rhythm__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:702:1: ( ( ( rule__Rhythm__TracksAssignment_11 )* ) )
            // InternalRhythm.g:703:1: ( ( rule__Rhythm__TracksAssignment_11 )* )
            {
            // InternalRhythm.g:703:1: ( ( rule__Rhythm__TracksAssignment_11 )* )
            // InternalRhythm.g:704:2: ( rule__Rhythm__TracksAssignment_11 )*
            {
             before(grammarAccess.getRhythmAccess().getTracksAssignment_11()); 
            // InternalRhythm.g:705:2: ( rule__Rhythm__TracksAssignment_11 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRhythm.g:705:3: rule__Rhythm__TracksAssignment_11
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
    // InternalRhythm.g:714:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:718:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // InternalRhythm.g:719:2: rule__Track__Group__0__Impl rule__Track__Group__1
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
    // InternalRhythm.g:726:1: rule__Track__Group__0__Impl : ( 'track' ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:730:1: ( ( 'track' ) )
            // InternalRhythm.g:731:1: ( 'track' )
            {
            // InternalRhythm.g:731:1: ( 'track' )
            // InternalRhythm.g:732:2: 'track'
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
    // InternalRhythm.g:741:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:745:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // InternalRhythm.g:746:2: rule__Track__Group__1__Impl rule__Track__Group__2
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
    // InternalRhythm.g:753:1: rule__Track__Group__1__Impl : ( ( rule__Track__NameAssignment_1 ) ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:757:1: ( ( ( rule__Track__NameAssignment_1 ) ) )
            // InternalRhythm.g:758:1: ( ( rule__Track__NameAssignment_1 ) )
            {
            // InternalRhythm.g:758:1: ( ( rule__Track__NameAssignment_1 ) )
            // InternalRhythm.g:759:2: ( rule__Track__NameAssignment_1 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1()); 
            // InternalRhythm.g:760:2: ( rule__Track__NameAssignment_1 )
            // InternalRhythm.g:760:3: rule__Track__NameAssignment_1
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
    // InternalRhythm.g:768:1: rule__Track__Group__2 : rule__Track__Group__2__Impl rule__Track__Group__3 ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:772:1: ( rule__Track__Group__2__Impl rule__Track__Group__3 )
            // InternalRhythm.g:773:2: rule__Track__Group__2__Impl rule__Track__Group__3
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
    // InternalRhythm.g:780:1: rule__Track__Group__2__Impl : ( '{' ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:784:1: ( ( '{' ) )
            // InternalRhythm.g:785:1: ( '{' )
            {
            // InternalRhythm.g:785:1: ( '{' )
            // InternalRhythm.g:786:2: '{'
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
    // InternalRhythm.g:795:1: rule__Track__Group__3 : rule__Track__Group__3__Impl rule__Track__Group__4 ;
    public final void rule__Track__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:799:1: ( rule__Track__Group__3__Impl rule__Track__Group__4 )
            // InternalRhythm.g:800:2: rule__Track__Group__3__Impl rule__Track__Group__4
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
    // InternalRhythm.g:807:1: rule__Track__Group__3__Impl : ( ( rule__Track__Group_3__0 )? ) ;
    public final void rule__Track__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:811:1: ( ( ( rule__Track__Group_3__0 )? ) )
            // InternalRhythm.g:812:1: ( ( rule__Track__Group_3__0 )? )
            {
            // InternalRhythm.g:812:1: ( ( rule__Track__Group_3__0 )? )
            // InternalRhythm.g:813:2: ( rule__Track__Group_3__0 )?
            {
             before(grammarAccess.getTrackAccess().getGroup_3()); 
            // InternalRhythm.g:814:2: ( rule__Track__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRhythm.g:814:3: rule__Track__Group_3__0
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
    // InternalRhythm.g:822:1: rule__Track__Group__4 : rule__Track__Group__4__Impl rule__Track__Group__5 ;
    public final void rule__Track__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:826:1: ( rule__Track__Group__4__Impl rule__Track__Group__5 )
            // InternalRhythm.g:827:2: rule__Track__Group__4__Impl rule__Track__Group__5
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
    // InternalRhythm.g:834:1: rule__Track__Group__4__Impl : ( 'sections:' ) ;
    public final void rule__Track__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:838:1: ( ( 'sections:' ) )
            // InternalRhythm.g:839:1: ( 'sections:' )
            {
            // InternalRhythm.g:839:1: ( 'sections:' )
            // InternalRhythm.g:840:2: 'sections:'
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
    // InternalRhythm.g:849:1: rule__Track__Group__5 : rule__Track__Group__5__Impl rule__Track__Group__6 ;
    public final void rule__Track__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:853:1: ( rule__Track__Group__5__Impl rule__Track__Group__6 )
            // InternalRhythm.g:854:2: rule__Track__Group__5__Impl rule__Track__Group__6
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
    // InternalRhythm.g:861:1: rule__Track__Group__5__Impl : ( ( rule__Track__SectionsAssignment_5 ) ) ;
    public final void rule__Track__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:865:1: ( ( ( rule__Track__SectionsAssignment_5 ) ) )
            // InternalRhythm.g:866:1: ( ( rule__Track__SectionsAssignment_5 ) )
            {
            // InternalRhythm.g:866:1: ( ( rule__Track__SectionsAssignment_5 ) )
            // InternalRhythm.g:867:2: ( rule__Track__SectionsAssignment_5 )
            {
             before(grammarAccess.getTrackAccess().getSectionsAssignment_5()); 
            // InternalRhythm.g:868:2: ( rule__Track__SectionsAssignment_5 )
            // InternalRhythm.g:868:3: rule__Track__SectionsAssignment_5
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
    // InternalRhythm.g:876:1: rule__Track__Group__6 : rule__Track__Group__6__Impl rule__Track__Group__7 ;
    public final void rule__Track__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:880:1: ( rule__Track__Group__6__Impl rule__Track__Group__7 )
            // InternalRhythm.g:881:2: rule__Track__Group__6__Impl rule__Track__Group__7
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
    // InternalRhythm.g:888:1: rule__Track__Group__6__Impl : ( ( rule__Track__SectionsAssignment_6 )* ) ;
    public final void rule__Track__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:892:1: ( ( ( rule__Track__SectionsAssignment_6 )* ) )
            // InternalRhythm.g:893:1: ( ( rule__Track__SectionsAssignment_6 )* )
            {
            // InternalRhythm.g:893:1: ( ( rule__Track__SectionsAssignment_6 )* )
            // InternalRhythm.g:894:2: ( rule__Track__SectionsAssignment_6 )*
            {
             before(grammarAccess.getTrackAccess().getSectionsAssignment_6()); 
            // InternalRhythm.g:895:2: ( rule__Track__SectionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRhythm.g:895:3: rule__Track__SectionsAssignment_6
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
    // InternalRhythm.g:903:1: rule__Track__Group__7 : rule__Track__Group__7__Impl ;
    public final void rule__Track__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:907:1: ( rule__Track__Group__7__Impl )
            // InternalRhythm.g:908:2: rule__Track__Group__7__Impl
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
    // InternalRhythm.g:914:1: rule__Track__Group__7__Impl : ( '}' ) ;
    public final void rule__Track__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:918:1: ( ( '}' ) )
            // InternalRhythm.g:919:1: ( '}' )
            {
            // InternalRhythm.g:919:1: ( '}' )
            // InternalRhythm.g:920:2: '}'
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
    // InternalRhythm.g:930:1: rule__Track__Group_3__0 : rule__Track__Group_3__0__Impl rule__Track__Group_3__1 ;
    public final void rule__Track__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:934:1: ( rule__Track__Group_3__0__Impl rule__Track__Group_3__1 )
            // InternalRhythm.g:935:2: rule__Track__Group_3__0__Impl rule__Track__Group_3__1
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
    // InternalRhythm.g:942:1: rule__Track__Group_3__0__Impl : ( 'patterns:' ) ;
    public final void rule__Track__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:946:1: ( ( 'patterns:' ) )
            // InternalRhythm.g:947:1: ( 'patterns:' )
            {
            // InternalRhythm.g:947:1: ( 'patterns:' )
            // InternalRhythm.g:948:2: 'patterns:'
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
    // InternalRhythm.g:957:1: rule__Track__Group_3__1 : rule__Track__Group_3__1__Impl rule__Track__Group_3__2 ;
    public final void rule__Track__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:961:1: ( rule__Track__Group_3__1__Impl rule__Track__Group_3__2 )
            // InternalRhythm.g:962:2: rule__Track__Group_3__1__Impl rule__Track__Group_3__2
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
    // InternalRhythm.g:969:1: rule__Track__Group_3__1__Impl : ( ( rule__Track__PatternsAssignment_3_1 ) ) ;
    public final void rule__Track__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:973:1: ( ( ( rule__Track__PatternsAssignment_3_1 ) ) )
            // InternalRhythm.g:974:1: ( ( rule__Track__PatternsAssignment_3_1 ) )
            {
            // InternalRhythm.g:974:1: ( ( rule__Track__PatternsAssignment_3_1 ) )
            // InternalRhythm.g:975:2: ( rule__Track__PatternsAssignment_3_1 )
            {
             before(grammarAccess.getTrackAccess().getPatternsAssignment_3_1()); 
            // InternalRhythm.g:976:2: ( rule__Track__PatternsAssignment_3_1 )
            // InternalRhythm.g:976:3: rule__Track__PatternsAssignment_3_1
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
    // InternalRhythm.g:984:1: rule__Track__Group_3__2 : rule__Track__Group_3__2__Impl ;
    public final void rule__Track__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:988:1: ( rule__Track__Group_3__2__Impl )
            // InternalRhythm.g:989:2: rule__Track__Group_3__2__Impl
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
    // InternalRhythm.g:995:1: rule__Track__Group_3__2__Impl : ( ( rule__Track__PatternsAssignment_3_2 )* ) ;
    public final void rule__Track__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:999:1: ( ( ( rule__Track__PatternsAssignment_3_2 )* ) )
            // InternalRhythm.g:1000:1: ( ( rule__Track__PatternsAssignment_3_2 )* )
            {
            // InternalRhythm.g:1000:1: ( ( rule__Track__PatternsAssignment_3_2 )* )
            // InternalRhythm.g:1001:2: ( rule__Track__PatternsAssignment_3_2 )*
            {
             before(grammarAccess.getTrackAccess().getPatternsAssignment_3_2()); 
            // InternalRhythm.g:1002:2: ( rule__Track__PatternsAssignment_3_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRhythm.g:1002:3: rule__Track__PatternsAssignment_3_2
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
    // InternalRhythm.g:1011:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1015:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalRhythm.g:1016:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalRhythm.g:1023:1: rule__Pattern__Group__0__Impl : ( ( rule__Pattern__NameAssignment_0 ) ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1027:1: ( ( ( rule__Pattern__NameAssignment_0 ) ) )
            // InternalRhythm.g:1028:1: ( ( rule__Pattern__NameAssignment_0 ) )
            {
            // InternalRhythm.g:1028:1: ( ( rule__Pattern__NameAssignment_0 ) )
            // InternalRhythm.g:1029:2: ( rule__Pattern__NameAssignment_0 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_0()); 
            // InternalRhythm.g:1030:2: ( rule__Pattern__NameAssignment_0 )
            // InternalRhythm.g:1030:3: rule__Pattern__NameAssignment_0
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
    // InternalRhythm.g:1038:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1042:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalRhythm.g:1043:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalRhythm.g:1050:1: rule__Pattern__Group__1__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1054:1: ( ( '{' ) )
            // InternalRhythm.g:1055:1: ( '{' )
            {
            // InternalRhythm.g:1055:1: ( '{' )
            // InternalRhythm.g:1056:2: '{'
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
    // InternalRhythm.g:1065:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1069:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalRhythm.g:1070:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalRhythm.g:1077:1: rule__Pattern__Group__2__Impl : ( 'beat:' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1081:1: ( ( 'beat:' ) )
            // InternalRhythm.g:1082:1: ( 'beat:' )
            {
            // InternalRhythm.g:1082:1: ( 'beat:' )
            // InternalRhythm.g:1083:2: 'beat:'
            {
             before(grammarAccess.getPatternAccess().getBeatKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getBeatKeyword_2()); 

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
    // InternalRhythm.g:1092:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1096:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalRhythm.g:1097:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

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
    // InternalRhythm.g:1104:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__BeatsAssignment_3 ) ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1108:1: ( ( ( rule__Pattern__BeatsAssignment_3 ) ) )
            // InternalRhythm.g:1109:1: ( ( rule__Pattern__BeatsAssignment_3 ) )
            {
            // InternalRhythm.g:1109:1: ( ( rule__Pattern__BeatsAssignment_3 ) )
            // InternalRhythm.g:1110:2: ( rule__Pattern__BeatsAssignment_3 )
            {
             before(grammarAccess.getPatternAccess().getBeatsAssignment_3()); 
            // InternalRhythm.g:1111:2: ( rule__Pattern__BeatsAssignment_3 )
            // InternalRhythm.g:1111:3: rule__Pattern__BeatsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__BeatsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getBeatsAssignment_3()); 

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


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalRhythm.g:1119:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1123:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalRhythm.g:1124:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

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
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalRhythm.g:1131:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__Group_4__0 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1135:1: ( ( ( rule__Pattern__Group_4__0 )* ) )
            // InternalRhythm.g:1136:1: ( ( rule__Pattern__Group_4__0 )* )
            {
            // InternalRhythm.g:1136:1: ( ( rule__Pattern__Group_4__0 )* )
            // InternalRhythm.g:1137:2: ( rule__Pattern__Group_4__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_4()); 
            // InternalRhythm.g:1138:2: ( rule__Pattern__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRhythm.g:1138:3: rule__Pattern__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Pattern__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalRhythm.g:1146:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1150:1: ( rule__Pattern__Group__5__Impl )
            // InternalRhythm.g:1151:2: rule__Pattern__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5__Impl();

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
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalRhythm.g:1157:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1161:1: ( ( '}' ) )
            // InternalRhythm.g:1162:1: ( '}' )
            {
            // InternalRhythm.g:1162:1: ( '}' )
            // InternalRhythm.g:1163:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalRhythm.g:1173:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1177:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalRhythm.g:1178:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

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
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalRhythm.g:1185:1: rule__Pattern__Group_4__0__Impl : ( 'beat:' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1189:1: ( ( 'beat:' ) )
            // InternalRhythm.g:1190:1: ( 'beat:' )
            {
            // InternalRhythm.g:1190:1: ( 'beat:' )
            // InternalRhythm.g:1191:2: 'beat:'
            {
             before(grammarAccess.getPatternAccess().getBeatKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getBeatKeyword_4_0()); 

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
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalRhythm.g:1200:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1204:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalRhythm.g:1205:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalRhythm.g:1211:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__BeatsAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1215:1: ( ( ( rule__Pattern__BeatsAssignment_4_1 ) ) )
            // InternalRhythm.g:1216:1: ( ( rule__Pattern__BeatsAssignment_4_1 ) )
            {
            // InternalRhythm.g:1216:1: ( ( rule__Pattern__BeatsAssignment_4_1 ) )
            // InternalRhythm.g:1217:2: ( rule__Pattern__BeatsAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getBeatsAssignment_4_1()); 
            // InternalRhythm.g:1218:2: ( rule__Pattern__BeatsAssignment_4_1 )
            // InternalRhythm.g:1218:3: rule__Pattern__BeatsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__BeatsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getBeatsAssignment_4_1()); 

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
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Beat__Group__0"
    // InternalRhythm.g:1227:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1231:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalRhythm.g:1232:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRhythm.g:1239:1: rule__Beat__Group__0__Impl : ( ( rule__Beat__TicksAssignment_0 ) ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1243:1: ( ( ( rule__Beat__TicksAssignment_0 ) ) )
            // InternalRhythm.g:1244:1: ( ( rule__Beat__TicksAssignment_0 ) )
            {
            // InternalRhythm.g:1244:1: ( ( rule__Beat__TicksAssignment_0 ) )
            // InternalRhythm.g:1245:2: ( rule__Beat__TicksAssignment_0 )
            {
             before(grammarAccess.getBeatAccess().getTicksAssignment_0()); 
            // InternalRhythm.g:1246:2: ( rule__Beat__TicksAssignment_0 )
            // InternalRhythm.g:1246:3: rule__Beat__TicksAssignment_0
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
    // InternalRhythm.g:1254:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1258:1: ( rule__Beat__Group__1__Impl )
            // InternalRhythm.g:1259:2: rule__Beat__Group__1__Impl
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
    // InternalRhythm.g:1265:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__Group_1__0 )* ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1269:1: ( ( ( rule__Beat__Group_1__0 )* ) )
            // InternalRhythm.g:1270:1: ( ( rule__Beat__Group_1__0 )* )
            {
            // InternalRhythm.g:1270:1: ( ( rule__Beat__Group_1__0 )* )
            // InternalRhythm.g:1271:2: ( rule__Beat__Group_1__0 )*
            {
             before(grammarAccess.getBeatAccess().getGroup_1()); 
            // InternalRhythm.g:1272:2: ( rule__Beat__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRhythm.g:1272:3: rule__Beat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Beat__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRhythm.g:1281:1: rule__Beat__Group_1__0 : rule__Beat__Group_1__0__Impl rule__Beat__Group_1__1 ;
    public final void rule__Beat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1285:1: ( rule__Beat__Group_1__0__Impl rule__Beat__Group_1__1 )
            // InternalRhythm.g:1286:2: rule__Beat__Group_1__0__Impl rule__Beat__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRhythm.g:1293:1: rule__Beat__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Beat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1297:1: ( ( ',' ) )
            // InternalRhythm.g:1298:1: ( ',' )
            {
            // InternalRhythm.g:1298:1: ( ',' )
            // InternalRhythm.g:1299:2: ','
            {
             before(grammarAccess.getBeatAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRhythm.g:1308:1: rule__Beat__Group_1__1 : rule__Beat__Group_1__1__Impl ;
    public final void rule__Beat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1312:1: ( rule__Beat__Group_1__1__Impl )
            // InternalRhythm.g:1313:2: rule__Beat__Group_1__1__Impl
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
    // InternalRhythm.g:1319:1: rule__Beat__Group_1__1__Impl : ( ( rule__Beat__TicksAssignment_1_1 ) ) ;
    public final void rule__Beat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1323:1: ( ( ( rule__Beat__TicksAssignment_1_1 ) ) )
            // InternalRhythm.g:1324:1: ( ( rule__Beat__TicksAssignment_1_1 ) )
            {
            // InternalRhythm.g:1324:1: ( ( rule__Beat__TicksAssignment_1_1 ) )
            // InternalRhythm.g:1325:2: ( rule__Beat__TicksAssignment_1_1 )
            {
             before(grammarAccess.getBeatAccess().getTicksAssignment_1_1()); 
            // InternalRhythm.g:1326:2: ( rule__Beat__TicksAssignment_1_1 )
            // InternalRhythm.g:1326:3: rule__Beat__TicksAssignment_1_1
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


    // $ANTLR start "rule__Section__Group__0"
    // InternalRhythm.g:1335:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1339:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalRhythm.g:1340:2: rule__Section__Group__0__Impl rule__Section__Group__1
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
    // InternalRhythm.g:1347:1: rule__Section__Group__0__Impl : ( ( rule__Section__NameAssignment_0 ) ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1351:1: ( ( ( rule__Section__NameAssignment_0 ) ) )
            // InternalRhythm.g:1352:1: ( ( rule__Section__NameAssignment_0 ) )
            {
            // InternalRhythm.g:1352:1: ( ( rule__Section__NameAssignment_0 ) )
            // InternalRhythm.g:1353:2: ( rule__Section__NameAssignment_0 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_0()); 
            // InternalRhythm.g:1354:2: ( rule__Section__NameAssignment_0 )
            // InternalRhythm.g:1354:3: rule__Section__NameAssignment_0
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
    // InternalRhythm.g:1362:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1366:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalRhythm.g:1367:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalRhythm.g:1374:1: rule__Section__Group__1__Impl : ( '{' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1378:1: ( ( '{' ) )
            // InternalRhythm.g:1379:1: ( '{' )
            {
            // InternalRhythm.g:1379:1: ( '{' )
            // InternalRhythm.g:1380:2: '{'
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
    // InternalRhythm.g:1389:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1393:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalRhythm.g:1394:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalRhythm.g:1401:1: rule__Section__Group__2__Impl : ( 'pattern:' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1405:1: ( ( 'pattern:' ) )
            // InternalRhythm.g:1406:1: ( 'pattern:' )
            {
            // InternalRhythm.g:1406:1: ( 'pattern:' )
            // InternalRhythm.g:1407:2: 'pattern:'
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
    // InternalRhythm.g:1416:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1420:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalRhythm.g:1421:2: rule__Section__Group__3__Impl rule__Section__Group__4
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
    // InternalRhythm.g:1428:1: rule__Section__Group__3__Impl : ( ( rule__Section__PatternLoopsAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1432:1: ( ( ( rule__Section__PatternLoopsAssignment_3 ) ) )
            // InternalRhythm.g:1433:1: ( ( rule__Section__PatternLoopsAssignment_3 ) )
            {
            // InternalRhythm.g:1433:1: ( ( rule__Section__PatternLoopsAssignment_3 ) )
            // InternalRhythm.g:1434:2: ( rule__Section__PatternLoopsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getPatternLoopsAssignment_3()); 
            // InternalRhythm.g:1435:2: ( rule__Section__PatternLoopsAssignment_3 )
            // InternalRhythm.g:1435:3: rule__Section__PatternLoopsAssignment_3
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
    // InternalRhythm.g:1443:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1447:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalRhythm.g:1448:2: rule__Section__Group__4__Impl rule__Section__Group__5
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
    // InternalRhythm.g:1455:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1459:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // InternalRhythm.g:1460:1: ( ( rule__Section__Group_4__0 )* )
            {
            // InternalRhythm.g:1460:1: ( ( rule__Section__Group_4__0 )* )
            // InternalRhythm.g:1461:2: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalRhythm.g:1462:2: ( rule__Section__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRhythm.g:1462:3: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalRhythm.g:1470:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1474:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalRhythm.g:1475:2: rule__Section__Group__5__Impl rule__Section__Group__6
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
    // InternalRhythm.g:1482:1: rule__Section__Group__5__Impl : ( ( rule__Section__PatternModificationsAssignment_5 )* ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1486:1: ( ( ( rule__Section__PatternModificationsAssignment_5 )* ) )
            // InternalRhythm.g:1487:1: ( ( rule__Section__PatternModificationsAssignment_5 )* )
            {
            // InternalRhythm.g:1487:1: ( ( rule__Section__PatternModificationsAssignment_5 )* )
            // InternalRhythm.g:1488:2: ( rule__Section__PatternModificationsAssignment_5 )*
            {
             before(grammarAccess.getSectionAccess().getPatternModificationsAssignment_5()); 
            // InternalRhythm.g:1489:2: ( rule__Section__PatternModificationsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRhythm.g:1489:3: rule__Section__PatternModificationsAssignment_5
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
    // InternalRhythm.g:1497:1: rule__Section__Group__6 : rule__Section__Group__6__Impl ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1501:1: ( rule__Section__Group__6__Impl )
            // InternalRhythm.g:1502:2: rule__Section__Group__6__Impl
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
    // InternalRhythm.g:1508:1: rule__Section__Group__6__Impl : ( '}' ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1512:1: ( ( '}' ) )
            // InternalRhythm.g:1513:1: ( '}' )
            {
            // InternalRhythm.g:1513:1: ( '}' )
            // InternalRhythm.g:1514:2: '}'
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
    // InternalRhythm.g:1524:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1528:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalRhythm.g:1529:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
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
    // InternalRhythm.g:1536:1: rule__Section__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1540:1: ( ( ',' ) )
            // InternalRhythm.g:1541:1: ( ',' )
            {
            // InternalRhythm.g:1541:1: ( ',' )
            // InternalRhythm.g:1542:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRhythm.g:1551:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1555:1: ( rule__Section__Group_4__1__Impl )
            // InternalRhythm.g:1556:2: rule__Section__Group_4__1__Impl
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
    // InternalRhythm.g:1562:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__PatternLoopsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1566:1: ( ( ( rule__Section__PatternLoopsAssignment_4_1 ) ) )
            // InternalRhythm.g:1567:1: ( ( rule__Section__PatternLoopsAssignment_4_1 ) )
            {
            // InternalRhythm.g:1567:1: ( ( rule__Section__PatternLoopsAssignment_4_1 ) )
            // InternalRhythm.g:1568:2: ( rule__Section__PatternLoopsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getPatternLoopsAssignment_4_1()); 
            // InternalRhythm.g:1569:2: ( rule__Section__PatternLoopsAssignment_4_1 )
            // InternalRhythm.g:1569:3: rule__Section__PatternLoopsAssignment_4_1
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
    // InternalRhythm.g:1578:1: rule__PatternLoop__Group__0 : rule__PatternLoop__Group__0__Impl rule__PatternLoop__Group__1 ;
    public final void rule__PatternLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1582:1: ( rule__PatternLoop__Group__0__Impl rule__PatternLoop__Group__1 )
            // InternalRhythm.g:1583:2: rule__PatternLoop__Group__0__Impl rule__PatternLoop__Group__1
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
    // InternalRhythm.g:1590:1: rule__PatternLoop__Group__0__Impl : ( ( rule__PatternLoop__PatternAssignment_0 ) ) ;
    public final void rule__PatternLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1594:1: ( ( ( rule__PatternLoop__PatternAssignment_0 ) ) )
            // InternalRhythm.g:1595:1: ( ( rule__PatternLoop__PatternAssignment_0 ) )
            {
            // InternalRhythm.g:1595:1: ( ( rule__PatternLoop__PatternAssignment_0 ) )
            // InternalRhythm.g:1596:2: ( rule__PatternLoop__PatternAssignment_0 )
            {
             before(grammarAccess.getPatternLoopAccess().getPatternAssignment_0()); 
            // InternalRhythm.g:1597:2: ( rule__PatternLoop__PatternAssignment_0 )
            // InternalRhythm.g:1597:3: rule__PatternLoop__PatternAssignment_0
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
    // InternalRhythm.g:1605:1: rule__PatternLoop__Group__1 : rule__PatternLoop__Group__1__Impl rule__PatternLoop__Group__2 ;
    public final void rule__PatternLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1609:1: ( rule__PatternLoop__Group__1__Impl rule__PatternLoop__Group__2 )
            // InternalRhythm.g:1610:2: rule__PatternLoop__Group__1__Impl rule__PatternLoop__Group__2
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
    // InternalRhythm.g:1617:1: rule__PatternLoop__Group__1__Impl : ( ( rule__PatternLoop__LoopNumberAssignment_1 ) ) ;
    public final void rule__PatternLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1621:1: ( ( ( rule__PatternLoop__LoopNumberAssignment_1 ) ) )
            // InternalRhythm.g:1622:1: ( ( rule__PatternLoop__LoopNumberAssignment_1 ) )
            {
            // InternalRhythm.g:1622:1: ( ( rule__PatternLoop__LoopNumberAssignment_1 ) )
            // InternalRhythm.g:1623:2: ( rule__PatternLoop__LoopNumberAssignment_1 )
            {
             before(grammarAccess.getPatternLoopAccess().getLoopNumberAssignment_1()); 
            // InternalRhythm.g:1624:2: ( rule__PatternLoop__LoopNumberAssignment_1 )
            // InternalRhythm.g:1624:3: rule__PatternLoop__LoopNumberAssignment_1
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
    // InternalRhythm.g:1632:1: rule__PatternLoop__Group__2 : rule__PatternLoop__Group__2__Impl ;
    public final void rule__PatternLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1636:1: ( rule__PatternLoop__Group__2__Impl )
            // InternalRhythm.g:1637:2: rule__PatternLoop__Group__2__Impl
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
    // InternalRhythm.g:1643:1: rule__PatternLoop__Group__2__Impl : ( 'times' ) ;
    public final void rule__PatternLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1647:1: ( ( 'times' ) )
            // InternalRhythm.g:1648:1: ( 'times' )
            {
            // InternalRhythm.g:1648:1: ( 'times' )
            // InternalRhythm.g:1649:2: 'times'
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
    // InternalRhythm.g:1659:1: rule__PatternModification__Group__0 : rule__PatternModification__Group__0__Impl rule__PatternModification__Group__1 ;
    public final void rule__PatternModification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1663:1: ( rule__PatternModification__Group__0__Impl rule__PatternModification__Group__1 )
            // InternalRhythm.g:1664:2: rule__PatternModification__Group__0__Impl rule__PatternModification__Group__1
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
    // InternalRhythm.g:1671:1: rule__PatternModification__Group__0__Impl : ( ( rule__PatternModification__PatternAssignment_0 ) ) ;
    public final void rule__PatternModification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1675:1: ( ( ( rule__PatternModification__PatternAssignment_0 ) ) )
            // InternalRhythm.g:1676:1: ( ( rule__PatternModification__PatternAssignment_0 ) )
            {
            // InternalRhythm.g:1676:1: ( ( rule__PatternModification__PatternAssignment_0 ) )
            // InternalRhythm.g:1677:2: ( rule__PatternModification__PatternAssignment_0 )
            {
             before(grammarAccess.getPatternModificationAccess().getPatternAssignment_0()); 
            // InternalRhythm.g:1678:2: ( rule__PatternModification__PatternAssignment_0 )
            // InternalRhythm.g:1678:3: rule__PatternModification__PatternAssignment_0
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
    // InternalRhythm.g:1686:1: rule__PatternModification__Group__1 : rule__PatternModification__Group__1__Impl rule__PatternModification__Group__2 ;
    public final void rule__PatternModification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1690:1: ( rule__PatternModification__Group__1__Impl rule__PatternModification__Group__2 )
            // InternalRhythm.g:1691:2: rule__PatternModification__Group__1__Impl rule__PatternModification__Group__2
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
    // InternalRhythm.g:1698:1: rule__PatternModification__Group__1__Impl : ( '(iteration:' ) ;
    public final void rule__PatternModification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1702:1: ( ( '(iteration:' ) )
            // InternalRhythm.g:1703:1: ( '(iteration:' )
            {
            // InternalRhythm.g:1703:1: ( '(iteration:' )
            // InternalRhythm.g:1704:2: '(iteration:'
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
    // InternalRhythm.g:1713:1: rule__PatternModification__Group__2 : rule__PatternModification__Group__2__Impl rule__PatternModification__Group__3 ;
    public final void rule__PatternModification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1717:1: ( rule__PatternModification__Group__2__Impl rule__PatternModification__Group__3 )
            // InternalRhythm.g:1718:2: rule__PatternModification__Group__2__Impl rule__PatternModification__Group__3
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
    // InternalRhythm.g:1725:1: rule__PatternModification__Group__2__Impl : ( ( rule__PatternModification__IterationAssignment_2 ) ) ;
    public final void rule__PatternModification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1729:1: ( ( ( rule__PatternModification__IterationAssignment_2 ) ) )
            // InternalRhythm.g:1730:1: ( ( rule__PatternModification__IterationAssignment_2 ) )
            {
            // InternalRhythm.g:1730:1: ( ( rule__PatternModification__IterationAssignment_2 ) )
            // InternalRhythm.g:1731:2: ( rule__PatternModification__IterationAssignment_2 )
            {
             before(grammarAccess.getPatternModificationAccess().getIterationAssignment_2()); 
            // InternalRhythm.g:1732:2: ( rule__PatternModification__IterationAssignment_2 )
            // InternalRhythm.g:1732:3: rule__PatternModification__IterationAssignment_2
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
    // InternalRhythm.g:1740:1: rule__PatternModification__Group__3 : rule__PatternModification__Group__3__Impl rule__PatternModification__Group__4 ;
    public final void rule__PatternModification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1744:1: ( rule__PatternModification__Group__3__Impl rule__PatternModification__Group__4 )
            // InternalRhythm.g:1745:2: rule__PatternModification__Group__3__Impl rule__PatternModification__Group__4
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
    // InternalRhythm.g:1752:1: rule__PatternModification__Group__3__Impl : ( ',beat:' ) ;
    public final void rule__PatternModification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1756:1: ( ( ',beat:' ) )
            // InternalRhythm.g:1757:1: ( ',beat:' )
            {
            // InternalRhythm.g:1757:1: ( ',beat:' )
            // InternalRhythm.g:1758:2: ',beat:'
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
    // InternalRhythm.g:1767:1: rule__PatternModification__Group__4 : rule__PatternModification__Group__4__Impl rule__PatternModification__Group__5 ;
    public final void rule__PatternModification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1771:1: ( rule__PatternModification__Group__4__Impl rule__PatternModification__Group__5 )
            // InternalRhythm.g:1772:2: rule__PatternModification__Group__4__Impl rule__PatternModification__Group__5
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
    // InternalRhythm.g:1779:1: rule__PatternModification__Group__4__Impl : ( ( rule__PatternModification__BeatNumberAssignment_4 ) ) ;
    public final void rule__PatternModification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1783:1: ( ( ( rule__PatternModification__BeatNumberAssignment_4 ) ) )
            // InternalRhythm.g:1784:1: ( ( rule__PatternModification__BeatNumberAssignment_4 ) )
            {
            // InternalRhythm.g:1784:1: ( ( rule__PatternModification__BeatNumberAssignment_4 ) )
            // InternalRhythm.g:1785:2: ( rule__PatternModification__BeatNumberAssignment_4 )
            {
             before(grammarAccess.getPatternModificationAccess().getBeatNumberAssignment_4()); 
            // InternalRhythm.g:1786:2: ( rule__PatternModification__BeatNumberAssignment_4 )
            // InternalRhythm.g:1786:3: rule__PatternModification__BeatNumberAssignment_4
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
    // InternalRhythm.g:1794:1: rule__PatternModification__Group__5 : rule__PatternModification__Group__5__Impl rule__PatternModification__Group__6 ;
    public final void rule__PatternModification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1798:1: ( rule__PatternModification__Group__5__Impl rule__PatternModification__Group__6 )
            // InternalRhythm.g:1799:2: rule__PatternModification__Group__5__Impl rule__PatternModification__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalRhythm.g:1806:1: rule__PatternModification__Group__5__Impl : ( '):' ) ;
    public final void rule__PatternModification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1810:1: ( ( '):' ) )
            // InternalRhythm.g:1811:1: ( '):' )
            {
            // InternalRhythm.g:1811:1: ( '):' )
            // InternalRhythm.g:1812:2: '):'
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
    // InternalRhythm.g:1821:1: rule__PatternModification__Group__6 : rule__PatternModification__Group__6__Impl ;
    public final void rule__PatternModification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1825:1: ( rule__PatternModification__Group__6__Impl )
            // InternalRhythm.g:1826:2: rule__PatternModification__Group__6__Impl
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
    // InternalRhythm.g:1832:1: rule__PatternModification__Group__6__Impl : ( ( rule__PatternModification__BeatAssignment_6 ) ) ;
    public final void rule__PatternModification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1836:1: ( ( ( rule__PatternModification__BeatAssignment_6 ) ) )
            // InternalRhythm.g:1837:1: ( ( rule__PatternModification__BeatAssignment_6 ) )
            {
            // InternalRhythm.g:1837:1: ( ( rule__PatternModification__BeatAssignment_6 ) )
            // InternalRhythm.g:1838:2: ( rule__PatternModification__BeatAssignment_6 )
            {
             before(grammarAccess.getPatternModificationAccess().getBeatAssignment_6()); 
            // InternalRhythm.g:1839:2: ( rule__PatternModification__BeatAssignment_6 )
            // InternalRhythm.g:1839:3: rule__PatternModification__BeatAssignment_6
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
    // InternalRhythm.g:1848:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1852:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalRhythm.g:1853:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalRhythm.g:1860:1: rule__EFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1864:1: ( ( RULE_INT ) )
            // InternalRhythm.g:1865:1: ( RULE_INT )
            {
            // InternalRhythm.g:1865:1: ( RULE_INT )
            // InternalRhythm.g:1866:2: RULE_INT
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
    // InternalRhythm.g:1875:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1879:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalRhythm.g:1880:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalRhythm.g:1887:1: rule__EFloat__Group__1__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1891:1: ( ( '.' ) )
            // InternalRhythm.g:1892:1: ( '.' )
            {
            // InternalRhythm.g:1892:1: ( '.' )
            // InternalRhythm.g:1893:2: '.'
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
    // InternalRhythm.g:1902:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1906:1: ( rule__EFloat__Group__2__Impl )
            // InternalRhythm.g:1907:2: rule__EFloat__Group__2__Impl
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
    // InternalRhythm.g:1913:1: rule__EFloat__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1917:1: ( ( RULE_INT ) )
            // InternalRhythm.g:1918:1: ( RULE_INT )
            {
            // InternalRhythm.g:1918:1: ( RULE_INT )
            // InternalRhythm.g:1919:2: RULE_INT
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
    // InternalRhythm.g:1929:1: rule__Rhythm__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rhythm__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1933:1: ( ( ruleEString ) )
            // InternalRhythm.g:1934:2: ( ruleEString )
            {
            // InternalRhythm.g:1934:2: ( ruleEString )
            // InternalRhythm.g:1935:3: ruleEString
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
    // InternalRhythm.g:1944:1: rule__Rhythm__BPMAssignment_3 : ( ruleEInt ) ;
    public final void rule__Rhythm__BPMAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1948:1: ( ( ruleEInt ) )
            // InternalRhythm.g:1949:2: ( ruleEInt )
            {
            // InternalRhythm.g:1949:2: ( ruleEInt )
            // InternalRhythm.g:1950:3: ruleEInt
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
    // InternalRhythm.g:1959:1: rule__Rhythm__ResolutionAssignment_6 : ( ruleEInt ) ;
    public final void rule__Rhythm__ResolutionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1963:1: ( ( ruleEInt ) )
            // InternalRhythm.g:1964:2: ( ruleEInt )
            {
            // InternalRhythm.g:1964:2: ( ruleEInt )
            // InternalRhythm.g:1965:3: ruleEInt
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
    // InternalRhythm.g:1974:1: rule__Rhythm__OffsetAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Rhythm__OffsetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1978:1: ( ( ruleEFloat ) )
            // InternalRhythm.g:1979:2: ( ruleEFloat )
            {
            // InternalRhythm.g:1979:2: ( ruleEFloat )
            // InternalRhythm.g:1980:3: ruleEFloat
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
    // InternalRhythm.g:1989:1: rule__Rhythm__TracksAssignment_10 : ( ruleTrack ) ;
    public final void rule__Rhythm__TracksAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:1993:1: ( ( ruleTrack ) )
            // InternalRhythm.g:1994:2: ( ruleTrack )
            {
            // InternalRhythm.g:1994:2: ( ruleTrack )
            // InternalRhythm.g:1995:3: ruleTrack
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
    // InternalRhythm.g:2004:1: rule__Rhythm__TracksAssignment_11 : ( ruleTrack ) ;
    public final void rule__Rhythm__TracksAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2008:1: ( ( ruleTrack ) )
            // InternalRhythm.g:2009:2: ( ruleTrack )
            {
            // InternalRhythm.g:2009:2: ( ruleTrack )
            // InternalRhythm.g:2010:3: ruleTrack
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
    // InternalRhythm.g:2019:1: rule__Track__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Track__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2023:1: ( ( ruleEString ) )
            // InternalRhythm.g:2024:2: ( ruleEString )
            {
            // InternalRhythm.g:2024:2: ( ruleEString )
            // InternalRhythm.g:2025:3: ruleEString
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
    // InternalRhythm.g:2034:1: rule__Track__PatternsAssignment_3_1 : ( rulePattern ) ;
    public final void rule__Track__PatternsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2038:1: ( ( rulePattern ) )
            // InternalRhythm.g:2039:2: ( rulePattern )
            {
            // InternalRhythm.g:2039:2: ( rulePattern )
            // InternalRhythm.g:2040:3: rulePattern
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
    // InternalRhythm.g:2049:1: rule__Track__PatternsAssignment_3_2 : ( rulePattern ) ;
    public final void rule__Track__PatternsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2053:1: ( ( rulePattern ) )
            // InternalRhythm.g:2054:2: ( rulePattern )
            {
            // InternalRhythm.g:2054:2: ( rulePattern )
            // InternalRhythm.g:2055:3: rulePattern
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
    // InternalRhythm.g:2064:1: rule__Track__SectionsAssignment_5 : ( ruleSection ) ;
    public final void rule__Track__SectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2068:1: ( ( ruleSection ) )
            // InternalRhythm.g:2069:2: ( ruleSection )
            {
            // InternalRhythm.g:2069:2: ( ruleSection )
            // InternalRhythm.g:2070:3: ruleSection
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
    // InternalRhythm.g:2079:1: rule__Track__SectionsAssignment_6 : ( ruleSection ) ;
    public final void rule__Track__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2083:1: ( ( ruleSection ) )
            // InternalRhythm.g:2084:2: ( ruleSection )
            {
            // InternalRhythm.g:2084:2: ( ruleSection )
            // InternalRhythm.g:2085:3: ruleSection
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
    // InternalRhythm.g:2094:1: rule__Pattern__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Pattern__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2098:1: ( ( ruleEString ) )
            // InternalRhythm.g:2099:2: ( ruleEString )
            {
            // InternalRhythm.g:2099:2: ( ruleEString )
            // InternalRhythm.g:2100:3: ruleEString
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


    // $ANTLR start "rule__Pattern__BeatsAssignment_3"
    // InternalRhythm.g:2109:1: rule__Pattern__BeatsAssignment_3 : ( ruleBeat ) ;
    public final void rule__Pattern__BeatsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2113:1: ( ( ruleBeat ) )
            // InternalRhythm.g:2114:2: ( ruleBeat )
            {
            // InternalRhythm.g:2114:2: ( ruleBeat )
            // InternalRhythm.g:2115:3: ruleBeat
            {
             before(grammarAccess.getPatternAccess().getBeatsBeatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBeatsBeatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Pattern__BeatsAssignment_3"


    // $ANTLR start "rule__Pattern__BeatsAssignment_4_1"
    // InternalRhythm.g:2124:1: rule__Pattern__BeatsAssignment_4_1 : ( ruleBeat ) ;
    public final void rule__Pattern__BeatsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2128:1: ( ( ruleBeat ) )
            // InternalRhythm.g:2129:2: ( ruleBeat )
            {
            // InternalRhythm.g:2129:2: ( ruleBeat )
            // InternalRhythm.g:2130:3: ruleBeat
            {
             before(grammarAccess.getPatternAccess().getBeatsBeatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBeatsBeatParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Pattern__BeatsAssignment_4_1"


    // $ANTLR start "rule__Beat__TicksAssignment_0"
    // InternalRhythm.g:2139:1: rule__Beat__TicksAssignment_0 : ( ruleNote ) ;
    public final void rule__Beat__TicksAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2143:1: ( ( ruleNote ) )
            // InternalRhythm.g:2144:2: ( ruleNote )
            {
            // InternalRhythm.g:2144:2: ( ruleNote )
            // InternalRhythm.g:2145:3: ruleNote
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
    // InternalRhythm.g:2154:1: rule__Beat__TicksAssignment_1_1 : ( ruleNote ) ;
    public final void rule__Beat__TicksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2158:1: ( ( ruleNote ) )
            // InternalRhythm.g:2159:2: ( ruleNote )
            {
            // InternalRhythm.g:2159:2: ( ruleNote )
            // InternalRhythm.g:2160:3: ruleNote
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


    // $ANTLR start "rule__Section__NameAssignment_0"
    // InternalRhythm.g:2169:1: rule__Section__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2173:1: ( ( ruleEString ) )
            // InternalRhythm.g:2174:2: ( ruleEString )
            {
            // InternalRhythm.g:2174:2: ( ruleEString )
            // InternalRhythm.g:2175:3: ruleEString
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
    // InternalRhythm.g:2184:1: rule__Section__PatternLoopsAssignment_3 : ( rulePatternLoop ) ;
    public final void rule__Section__PatternLoopsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2188:1: ( ( rulePatternLoop ) )
            // InternalRhythm.g:2189:2: ( rulePatternLoop )
            {
            // InternalRhythm.g:2189:2: ( rulePatternLoop )
            // InternalRhythm.g:2190:3: rulePatternLoop
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
    // InternalRhythm.g:2199:1: rule__Section__PatternLoopsAssignment_4_1 : ( rulePatternLoop ) ;
    public final void rule__Section__PatternLoopsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2203:1: ( ( rulePatternLoop ) )
            // InternalRhythm.g:2204:2: ( rulePatternLoop )
            {
            // InternalRhythm.g:2204:2: ( rulePatternLoop )
            // InternalRhythm.g:2205:3: rulePatternLoop
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
    // InternalRhythm.g:2214:1: rule__Section__PatternModificationsAssignment_5 : ( rulePatternModification ) ;
    public final void rule__Section__PatternModificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2218:1: ( ( rulePatternModification ) )
            // InternalRhythm.g:2219:2: ( rulePatternModification )
            {
            // InternalRhythm.g:2219:2: ( rulePatternModification )
            // InternalRhythm.g:2220:3: rulePatternModification
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
    // InternalRhythm.g:2229:1: rule__PatternLoop__PatternAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__PatternLoop__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2233:1: ( ( ( ruleEString ) ) )
            // InternalRhythm.g:2234:2: ( ( ruleEString ) )
            {
            // InternalRhythm.g:2234:2: ( ( ruleEString ) )
            // InternalRhythm.g:2235:3: ( ruleEString )
            {
             before(grammarAccess.getPatternLoopAccess().getPatternPatternCrossReference_0_0()); 
            // InternalRhythm.g:2236:3: ( ruleEString )
            // InternalRhythm.g:2237:4: ruleEString
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
    // InternalRhythm.g:2248:1: rule__PatternLoop__LoopNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__PatternLoop__LoopNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2252:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2253:2: ( ruleEInt )
            {
            // InternalRhythm.g:2253:2: ( ruleEInt )
            // InternalRhythm.g:2254:3: ruleEInt
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
    // InternalRhythm.g:2263:1: rule__PatternModification__PatternAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__PatternModification__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2267:1: ( ( ( ruleEString ) ) )
            // InternalRhythm.g:2268:2: ( ( ruleEString ) )
            {
            // InternalRhythm.g:2268:2: ( ( ruleEString ) )
            // InternalRhythm.g:2269:3: ( ruleEString )
            {
             before(grammarAccess.getPatternModificationAccess().getPatternPatternCrossReference_0_0()); 
            // InternalRhythm.g:2270:3: ( ruleEString )
            // InternalRhythm.g:2271:4: ruleEString
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
    // InternalRhythm.g:2282:1: rule__PatternModification__IterationAssignment_2 : ( ruleEInt ) ;
    public final void rule__PatternModification__IterationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2286:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2287:2: ( ruleEInt )
            {
            // InternalRhythm.g:2287:2: ( ruleEInt )
            // InternalRhythm.g:2288:3: ruleEInt
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
    // InternalRhythm.g:2297:1: rule__PatternModification__BeatNumberAssignment_4 : ( ruleEInt ) ;
    public final void rule__PatternModification__BeatNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2301:1: ( ( ruleEInt ) )
            // InternalRhythm.g:2302:2: ( ruleEInt )
            {
            // InternalRhythm.g:2302:2: ( ruleEInt )
            // InternalRhythm.g:2303:3: ruleEInt
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
    // InternalRhythm.g:2312:1: rule__PatternModification__BeatAssignment_6 : ( ruleBeat ) ;
    public final void rule__PatternModification__BeatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRhythm.g:2316:1: ( ( ruleBeat ) )
            // InternalRhythm.g:2317:2: ( ruleBeat )
            {
            // InternalRhythm.g:2317:2: ( ruleBeat )
            // InternalRhythm.g:2318:3: ruleBeat
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000048000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});

}