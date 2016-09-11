package org.poc.idm.xtext.wdl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.poc.idm.xtext.wdl.services.WdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWdlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'website'", "'{'", "'}'", "'copyright :'", "'page'", "'title : '", "'menu :'", "','", "'mobile'"
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
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalWdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWdlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g"; }


     
     	private WdlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WdlGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleWebsiteRule"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:60:1: entryRuleWebsiteRule : ruleWebsiteRule EOF ;
    public final void entryRuleWebsiteRule() throws RecognitionException {
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:61:1: ( ruleWebsiteRule EOF )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:62:1: ruleWebsiteRule EOF
            {
             before(grammarAccess.getWebsiteRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWebsiteRule_in_entryRuleWebsiteRule61);
            ruleWebsiteRule();

            state._fsp--;

             after(grammarAccess.getWebsiteRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWebsiteRule68); 

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
    // $ANTLR end "entryRuleWebsiteRule"


    // $ANTLR start "ruleWebsiteRule"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:69:1: ruleWebsiteRule : ( ( rule__WebsiteRule__Group__0 ) ) ;
    public final void ruleWebsiteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:73:2: ( ( ( rule__WebsiteRule__Group__0 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:74:1: ( ( rule__WebsiteRule__Group__0 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:74:1: ( ( rule__WebsiteRule__Group__0 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:75:1: ( rule__WebsiteRule__Group__0 )
            {
             before(grammarAccess.getWebsiteRuleAccess().getGroup()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:76:1: ( rule__WebsiteRule__Group__0 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:76:2: rule__WebsiteRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__0_in_ruleWebsiteRule94);
            rule__WebsiteRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWebsiteRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWebsiteRule"


    // $ANTLR start "entryRulePageRule"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:88:1: entryRulePageRule : rulePageRule EOF ;
    public final void entryRulePageRule() throws RecognitionException {
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:89:1: ( rulePageRule EOF )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:90:1: rulePageRule EOF
            {
             before(grammarAccess.getPageRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageRule_in_entryRulePageRule121);
            rulePageRule();

            state._fsp--;

             after(grammarAccess.getPageRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageRule128); 

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
    // $ANTLR end "entryRulePageRule"


    // $ANTLR start "rulePageRule"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:97:1: rulePageRule : ( ( rule__PageRule__Group__0 ) ) ;
    public final void rulePageRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:101:2: ( ( ( rule__PageRule__Group__0 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:102:1: ( ( rule__PageRule__Group__0 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:102:1: ( ( rule__PageRule__Group__0 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:103:1: ( rule__PageRule__Group__0 )
            {
             before(grammarAccess.getPageRuleAccess().getGroup()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:104:1: ( rule__PageRule__Group__0 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:104:2: rule__PageRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__0_in_rulePageRule154);
            rule__PageRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageRule"


    // $ANTLR start "rule__WebsiteRule__Group__0"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:118:1: rule__WebsiteRule__Group__0 : rule__WebsiteRule__Group__0__Impl rule__WebsiteRule__Group__1 ;
    public final void rule__WebsiteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:122:1: ( rule__WebsiteRule__Group__0__Impl rule__WebsiteRule__Group__1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:123:2: rule__WebsiteRule__Group__0__Impl rule__WebsiteRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__0__Impl_in_rule__WebsiteRule__Group__0188);
            rule__WebsiteRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__1_in_rule__WebsiteRule__Group__0191);
            rule__WebsiteRule__Group__1();

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
    // $ANTLR end "rule__WebsiteRule__Group__0"


    // $ANTLR start "rule__WebsiteRule__Group__0__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:130:1: rule__WebsiteRule__Group__0__Impl : ( ( rule__WebsiteRule__IsMobileFriendlyAssignment_0 )? ) ;
    public final void rule__WebsiteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:134:1: ( ( ( rule__WebsiteRule__IsMobileFriendlyAssignment_0 )? ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:135:1: ( ( rule__WebsiteRule__IsMobileFriendlyAssignment_0 )? )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:135:1: ( ( rule__WebsiteRule__IsMobileFriendlyAssignment_0 )? )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:136:1: ( rule__WebsiteRule__IsMobileFriendlyAssignment_0 )?
            {
             before(grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyAssignment_0()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:137:1: ( rule__WebsiteRule__IsMobileFriendlyAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:137:2: rule__WebsiteRule__IsMobileFriendlyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__IsMobileFriendlyAssignment_0_in_rule__WebsiteRule__Group__0__Impl218);
                    rule__WebsiteRule__IsMobileFriendlyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group__0__Impl"


    // $ANTLR start "rule__WebsiteRule__Group__1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:147:1: rule__WebsiteRule__Group__1 : rule__WebsiteRule__Group__1__Impl rule__WebsiteRule__Group__2 ;
    public final void rule__WebsiteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:151:1: ( rule__WebsiteRule__Group__1__Impl rule__WebsiteRule__Group__2 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:152:2: rule__WebsiteRule__Group__1__Impl rule__WebsiteRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__1__Impl_in_rule__WebsiteRule__Group__1249);
            rule__WebsiteRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__2_in_rule__WebsiteRule__Group__1252);
            rule__WebsiteRule__Group__2();

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
    // $ANTLR end "rule__WebsiteRule__Group__1"


    // $ANTLR start "rule__WebsiteRule__Group__1__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:159:1: rule__WebsiteRule__Group__1__Impl : ( 'website' ) ;
    public final void rule__WebsiteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:163:1: ( ( 'website' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:164:1: ( 'website' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:164:1: ( 'website' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:165:1: 'website'
            {
             before(grammarAccess.getWebsiteRuleAccess().getWebsiteKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__WebsiteRule__Group__1__Impl280); 
             after(grammarAccess.getWebsiteRuleAccess().getWebsiteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group__1__Impl"


    // $ANTLR start "rule__WebsiteRule__Group__2"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:178:1: rule__WebsiteRule__Group__2 : rule__WebsiteRule__Group__2__Impl rule__WebsiteRule__Group__3 ;
    public final void rule__WebsiteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:182:1: ( rule__WebsiteRule__Group__2__Impl rule__WebsiteRule__Group__3 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:183:2: rule__WebsiteRule__Group__2__Impl rule__WebsiteRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__2__Impl_in_rule__WebsiteRule__Group__2311);
            rule__WebsiteRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__3_in_rule__WebsiteRule__Group__2314);
            rule__WebsiteRule__Group__3();

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
    // $ANTLR end "rule__WebsiteRule__Group__2"


    // $ANTLR start "rule__WebsiteRule__Group__2__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:190:1: rule__WebsiteRule__Group__2__Impl : ( '{' ) ;
    public final void rule__WebsiteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:194:1: ( ( '{' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:195:1: ( '{' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:195:1: ( '{' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:196:1: '{'
            {
             before(grammarAccess.getWebsiteRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__WebsiteRule__Group__2__Impl342); 
             after(grammarAccess.getWebsiteRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group__2__Impl"


    // $ANTLR start "rule__WebsiteRule__Group__3"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:209:1: rule__WebsiteRule__Group__3 : rule__WebsiteRule__Group__3__Impl rule__WebsiteRule__Group__4 ;
    public final void rule__WebsiteRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:213:1: ( rule__WebsiteRule__Group__3__Impl rule__WebsiteRule__Group__4 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:214:2: rule__WebsiteRule__Group__3__Impl rule__WebsiteRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__3__Impl_in_rule__WebsiteRule__Group__3373);
            rule__WebsiteRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__4_in_rule__WebsiteRule__Group__3376);
            rule__WebsiteRule__Group__4();

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
    // $ANTLR end "rule__WebsiteRule__Group__3"


    // $ANTLR start "rule__WebsiteRule__Group__3__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:221:1: rule__WebsiteRule__Group__3__Impl : ( ( rule__WebsiteRule__Group_3__0 )? ) ;
    public final void rule__WebsiteRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:225:1: ( ( ( rule__WebsiteRule__Group_3__0 )? ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:226:1: ( ( rule__WebsiteRule__Group_3__0 )? )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:226:1: ( ( rule__WebsiteRule__Group_3__0 )? )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:227:1: ( rule__WebsiteRule__Group_3__0 )?
            {
             before(grammarAccess.getWebsiteRuleAccess().getGroup_3()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:228:1: ( rule__WebsiteRule__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:228:2: rule__WebsiteRule__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group_3__0_in_rule__WebsiteRule__Group__3__Impl403);
                    rule__WebsiteRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWebsiteRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group__3__Impl"


    // $ANTLR start "rule__WebsiteRule__Group__4"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:238:1: rule__WebsiteRule__Group__4 : rule__WebsiteRule__Group__4__Impl rule__WebsiteRule__Group__5 ;
    public final void rule__WebsiteRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:242:1: ( rule__WebsiteRule__Group__4__Impl rule__WebsiteRule__Group__5 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:243:2: rule__WebsiteRule__Group__4__Impl rule__WebsiteRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__4__Impl_in_rule__WebsiteRule__Group__4434);
            rule__WebsiteRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__5_in_rule__WebsiteRule__Group__4437);
            rule__WebsiteRule__Group__5();

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
    // $ANTLR end "rule__WebsiteRule__Group__4"


    // $ANTLR start "rule__WebsiteRule__Group__4__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:250:1: rule__WebsiteRule__Group__4__Impl : ( ( ( rule__WebsiteRule__PagesAssignment_4 ) ) ( ( rule__WebsiteRule__PagesAssignment_4 )* ) ) ;
    public final void rule__WebsiteRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:254:1: ( ( ( ( rule__WebsiteRule__PagesAssignment_4 ) ) ( ( rule__WebsiteRule__PagesAssignment_4 )* ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:255:1: ( ( ( rule__WebsiteRule__PagesAssignment_4 ) ) ( ( rule__WebsiteRule__PagesAssignment_4 )* ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:255:1: ( ( ( rule__WebsiteRule__PagesAssignment_4 ) ) ( ( rule__WebsiteRule__PagesAssignment_4 )* ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:256:1: ( ( rule__WebsiteRule__PagesAssignment_4 ) ) ( ( rule__WebsiteRule__PagesAssignment_4 )* )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:256:1: ( ( rule__WebsiteRule__PagesAssignment_4 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:257:1: ( rule__WebsiteRule__PagesAssignment_4 )
            {
             before(grammarAccess.getWebsiteRuleAccess().getPagesAssignment_4()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:258:1: ( rule__WebsiteRule__PagesAssignment_4 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:258:2: rule__WebsiteRule__PagesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__PagesAssignment_4_in_rule__WebsiteRule__Group__4__Impl466);
            rule__WebsiteRule__PagesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWebsiteRuleAccess().getPagesAssignment_4()); 

            }

            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:261:1: ( ( rule__WebsiteRule__PagesAssignment_4 )* )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:262:1: ( rule__WebsiteRule__PagesAssignment_4 )*
            {
             before(grammarAccess.getWebsiteRuleAccess().getPagesAssignment_4()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:263:1: ( rule__WebsiteRule__PagesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:263:2: rule__WebsiteRule__PagesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__PagesAssignment_4_in_rule__WebsiteRule__Group__4__Impl478);
            	    rule__WebsiteRule__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWebsiteRuleAccess().getPagesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group__4__Impl"


    // $ANTLR start "rule__WebsiteRule__Group__5"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:274:1: rule__WebsiteRule__Group__5 : rule__WebsiteRule__Group__5__Impl ;
    public final void rule__WebsiteRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:278:1: ( rule__WebsiteRule__Group__5__Impl )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:279:2: rule__WebsiteRule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group__5__Impl_in_rule__WebsiteRule__Group__5511);
            rule__WebsiteRule__Group__5__Impl();

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
    // $ANTLR end "rule__WebsiteRule__Group__5"


    // $ANTLR start "rule__WebsiteRule__Group__5__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:285:1: rule__WebsiteRule__Group__5__Impl : ( '}' ) ;
    public final void rule__WebsiteRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:289:1: ( ( '}' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:290:1: ( '}' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:290:1: ( '}' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:291:1: '}'
            {
             before(grammarAccess.getWebsiteRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__WebsiteRule__Group__5__Impl539); 
             after(grammarAccess.getWebsiteRuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group__5__Impl"


    // $ANTLR start "rule__WebsiteRule__Group_3__0"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:316:1: rule__WebsiteRule__Group_3__0 : rule__WebsiteRule__Group_3__0__Impl rule__WebsiteRule__Group_3__1 ;
    public final void rule__WebsiteRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:320:1: ( rule__WebsiteRule__Group_3__0__Impl rule__WebsiteRule__Group_3__1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:321:2: rule__WebsiteRule__Group_3__0__Impl rule__WebsiteRule__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group_3__0__Impl_in_rule__WebsiteRule__Group_3__0582);
            rule__WebsiteRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group_3__1_in_rule__WebsiteRule__Group_3__0585);
            rule__WebsiteRule__Group_3__1();

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
    // $ANTLR end "rule__WebsiteRule__Group_3__0"


    // $ANTLR start "rule__WebsiteRule__Group_3__0__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:328:1: rule__WebsiteRule__Group_3__0__Impl : ( 'copyright :' ) ;
    public final void rule__WebsiteRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:332:1: ( ( 'copyright :' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:333:1: ( 'copyright :' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:333:1: ( 'copyright :' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:334:1: 'copyright :'
            {
             before(grammarAccess.getWebsiteRuleAccess().getCopyrightKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WebsiteRule__Group_3__0__Impl613); 
             after(grammarAccess.getWebsiteRuleAccess().getCopyrightKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group_3__0__Impl"


    // $ANTLR start "rule__WebsiteRule__Group_3__1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:347:1: rule__WebsiteRule__Group_3__1 : rule__WebsiteRule__Group_3__1__Impl ;
    public final void rule__WebsiteRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:351:1: ( rule__WebsiteRule__Group_3__1__Impl )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:352:2: rule__WebsiteRule__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__Group_3__1__Impl_in_rule__WebsiteRule__Group_3__1644);
            rule__WebsiteRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__WebsiteRule__Group_3__1"


    // $ANTLR start "rule__WebsiteRule__Group_3__1__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:358:1: rule__WebsiteRule__Group_3__1__Impl : ( ( rule__WebsiteRule__CopyrightAssignment_3_1 ) ) ;
    public final void rule__WebsiteRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:362:1: ( ( ( rule__WebsiteRule__CopyrightAssignment_3_1 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:363:1: ( ( rule__WebsiteRule__CopyrightAssignment_3_1 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:363:1: ( ( rule__WebsiteRule__CopyrightAssignment_3_1 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:364:1: ( rule__WebsiteRule__CopyrightAssignment_3_1 )
            {
             before(grammarAccess.getWebsiteRuleAccess().getCopyrightAssignment_3_1()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:365:1: ( rule__WebsiteRule__CopyrightAssignment_3_1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:365:2: rule__WebsiteRule__CopyrightAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WebsiteRule__CopyrightAssignment_3_1_in_rule__WebsiteRule__Group_3__1__Impl671);
            rule__WebsiteRule__CopyrightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWebsiteRuleAccess().getCopyrightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__Group_3__1__Impl"


    // $ANTLR start "rule__PageRule__Group__0"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:379:1: rule__PageRule__Group__0 : rule__PageRule__Group__0__Impl rule__PageRule__Group__1 ;
    public final void rule__PageRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:383:1: ( rule__PageRule__Group__0__Impl rule__PageRule__Group__1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:384:2: rule__PageRule__Group__0__Impl rule__PageRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__0__Impl_in_rule__PageRule__Group__0705);
            rule__PageRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__1_in_rule__PageRule__Group__0708);
            rule__PageRule__Group__1();

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
    // $ANTLR end "rule__PageRule__Group__0"


    // $ANTLR start "rule__PageRule__Group__0__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:391:1: rule__PageRule__Group__0__Impl : ( 'page' ) ;
    public final void rule__PageRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:395:1: ( ( 'page' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:396:1: ( 'page' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:396:1: ( 'page' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:397:1: 'page'
            {
             before(grammarAccess.getPageRuleAccess().getPageKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__PageRule__Group__0__Impl736); 
             after(grammarAccess.getPageRuleAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__0__Impl"


    // $ANTLR start "rule__PageRule__Group__1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:410:1: rule__PageRule__Group__1 : rule__PageRule__Group__1__Impl rule__PageRule__Group__2 ;
    public final void rule__PageRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:414:1: ( rule__PageRule__Group__1__Impl rule__PageRule__Group__2 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:415:2: rule__PageRule__Group__1__Impl rule__PageRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__1__Impl_in_rule__PageRule__Group__1767);
            rule__PageRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__2_in_rule__PageRule__Group__1770);
            rule__PageRule__Group__2();

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
    // $ANTLR end "rule__PageRule__Group__1"


    // $ANTLR start "rule__PageRule__Group__1__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:422:1: rule__PageRule__Group__1__Impl : ( ( rule__PageRule__NameAssignment_1 ) ) ;
    public final void rule__PageRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:426:1: ( ( ( rule__PageRule__NameAssignment_1 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:427:1: ( ( rule__PageRule__NameAssignment_1 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:427:1: ( ( rule__PageRule__NameAssignment_1 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:428:1: ( rule__PageRule__NameAssignment_1 )
            {
             before(grammarAccess.getPageRuleAccess().getNameAssignment_1()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:429:1: ( rule__PageRule__NameAssignment_1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:429:2: rule__PageRule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__NameAssignment_1_in_rule__PageRule__Group__1__Impl797);
            rule__PageRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__1__Impl"


    // $ANTLR start "rule__PageRule__Group__2"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:439:1: rule__PageRule__Group__2 : rule__PageRule__Group__2__Impl rule__PageRule__Group__3 ;
    public final void rule__PageRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:443:1: ( rule__PageRule__Group__2__Impl rule__PageRule__Group__3 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:444:2: rule__PageRule__Group__2__Impl rule__PageRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__2__Impl_in_rule__PageRule__Group__2827);
            rule__PageRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__3_in_rule__PageRule__Group__2830);
            rule__PageRule__Group__3();

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
    // $ANTLR end "rule__PageRule__Group__2"


    // $ANTLR start "rule__PageRule__Group__2__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:451:1: rule__PageRule__Group__2__Impl : ( '{' ) ;
    public final void rule__PageRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:455:1: ( ( '{' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:456:1: ( '{' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:456:1: ( '{' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:457:1: '{'
            {
             before(grammarAccess.getPageRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__PageRule__Group__2__Impl858); 
             after(grammarAccess.getPageRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__2__Impl"


    // $ANTLR start "rule__PageRule__Group__3"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:470:1: rule__PageRule__Group__3 : rule__PageRule__Group__3__Impl rule__PageRule__Group__4 ;
    public final void rule__PageRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:474:1: ( rule__PageRule__Group__3__Impl rule__PageRule__Group__4 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:475:2: rule__PageRule__Group__3__Impl rule__PageRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__3__Impl_in_rule__PageRule__Group__3889);
            rule__PageRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__4_in_rule__PageRule__Group__3892);
            rule__PageRule__Group__4();

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
    // $ANTLR end "rule__PageRule__Group__3"


    // $ANTLR start "rule__PageRule__Group__3__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:482:1: rule__PageRule__Group__3__Impl : ( 'title : ' ) ;
    public final void rule__PageRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:486:1: ( ( 'title : ' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:487:1: ( 'title : ' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:487:1: ( 'title : ' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:488:1: 'title : '
            {
             before(grammarAccess.getPageRuleAccess().getTitleKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PageRule__Group__3__Impl920); 
             after(grammarAccess.getPageRuleAccess().getTitleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__3__Impl"


    // $ANTLR start "rule__PageRule__Group__4"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:501:1: rule__PageRule__Group__4 : rule__PageRule__Group__4__Impl rule__PageRule__Group__5 ;
    public final void rule__PageRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:505:1: ( rule__PageRule__Group__4__Impl rule__PageRule__Group__5 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:506:2: rule__PageRule__Group__4__Impl rule__PageRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__4__Impl_in_rule__PageRule__Group__4951);
            rule__PageRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__5_in_rule__PageRule__Group__4954);
            rule__PageRule__Group__5();

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
    // $ANTLR end "rule__PageRule__Group__4"


    // $ANTLR start "rule__PageRule__Group__4__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:513:1: rule__PageRule__Group__4__Impl : ( ( rule__PageRule__TitleAssignment_4 ) ) ;
    public final void rule__PageRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:517:1: ( ( ( rule__PageRule__TitleAssignment_4 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:518:1: ( ( rule__PageRule__TitleAssignment_4 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:518:1: ( ( rule__PageRule__TitleAssignment_4 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:519:1: ( rule__PageRule__TitleAssignment_4 )
            {
             before(grammarAccess.getPageRuleAccess().getTitleAssignment_4()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:520:1: ( rule__PageRule__TitleAssignment_4 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:520:2: rule__PageRule__TitleAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__TitleAssignment_4_in_rule__PageRule__Group__4__Impl981);
            rule__PageRule__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPageRuleAccess().getTitleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__4__Impl"


    // $ANTLR start "rule__PageRule__Group__5"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:530:1: rule__PageRule__Group__5 : rule__PageRule__Group__5__Impl rule__PageRule__Group__6 ;
    public final void rule__PageRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:534:1: ( rule__PageRule__Group__5__Impl rule__PageRule__Group__6 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:535:2: rule__PageRule__Group__5__Impl rule__PageRule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__5__Impl_in_rule__PageRule__Group__51011);
            rule__PageRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__6_in_rule__PageRule__Group__51014);
            rule__PageRule__Group__6();

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
    // $ANTLR end "rule__PageRule__Group__5"


    // $ANTLR start "rule__PageRule__Group__5__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:542:1: rule__PageRule__Group__5__Impl : ( ( rule__PageRule__Group_5__0 )? ) ;
    public final void rule__PageRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:546:1: ( ( ( rule__PageRule__Group_5__0 )? ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:547:1: ( ( rule__PageRule__Group_5__0 )? )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:547:1: ( ( rule__PageRule__Group_5__0 )? )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:548:1: ( rule__PageRule__Group_5__0 )?
            {
             before(grammarAccess.getPageRuleAccess().getGroup_5()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:549:1: ( rule__PageRule__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:549:2: rule__PageRule__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5__0_in_rule__PageRule__Group__5__Impl1041);
                    rule__PageRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__5__Impl"


    // $ANTLR start "rule__PageRule__Group__6"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:559:1: rule__PageRule__Group__6 : rule__PageRule__Group__6__Impl ;
    public final void rule__PageRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:563:1: ( rule__PageRule__Group__6__Impl )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:564:2: rule__PageRule__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group__6__Impl_in_rule__PageRule__Group__61072);
            rule__PageRule__Group__6__Impl();

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
    // $ANTLR end "rule__PageRule__Group__6"


    // $ANTLR start "rule__PageRule__Group__6__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:570:1: rule__PageRule__Group__6__Impl : ( '}' ) ;
    public final void rule__PageRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:574:1: ( ( '}' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:575:1: ( '}' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:575:1: ( '}' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:576:1: '}'
            {
             before(grammarAccess.getPageRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__PageRule__Group__6__Impl1100); 
             after(grammarAccess.getPageRuleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__6__Impl"


    // $ANTLR start "rule__PageRule__Group_5__0"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:603:1: rule__PageRule__Group_5__0 : rule__PageRule__Group_5__0__Impl rule__PageRule__Group_5__1 ;
    public final void rule__PageRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:607:1: ( rule__PageRule__Group_5__0__Impl rule__PageRule__Group_5__1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:608:2: rule__PageRule__Group_5__0__Impl rule__PageRule__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5__0__Impl_in_rule__PageRule__Group_5__01145);
            rule__PageRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5__1_in_rule__PageRule__Group_5__01148);
            rule__PageRule__Group_5__1();

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
    // $ANTLR end "rule__PageRule__Group_5__0"


    // $ANTLR start "rule__PageRule__Group_5__0__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:615:1: rule__PageRule__Group_5__0__Impl : ( 'menu :' ) ;
    public final void rule__PageRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:619:1: ( ( 'menu :' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:620:1: ( 'menu :' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:620:1: ( 'menu :' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:621:1: 'menu :'
            {
             before(grammarAccess.getPageRuleAccess().getMenuKeyword_5_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PageRule__Group_5__0__Impl1176); 
             after(grammarAccess.getPageRuleAccess().getMenuKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__0__Impl"


    // $ANTLR start "rule__PageRule__Group_5__1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:634:1: rule__PageRule__Group_5__1 : rule__PageRule__Group_5__1__Impl rule__PageRule__Group_5__2 ;
    public final void rule__PageRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:638:1: ( rule__PageRule__Group_5__1__Impl rule__PageRule__Group_5__2 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:639:2: rule__PageRule__Group_5__1__Impl rule__PageRule__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5__1__Impl_in_rule__PageRule__Group_5__11207);
            rule__PageRule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5__2_in_rule__PageRule__Group_5__11210);
            rule__PageRule__Group_5__2();

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
    // $ANTLR end "rule__PageRule__Group_5__1"


    // $ANTLR start "rule__PageRule__Group_5__1__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:646:1: rule__PageRule__Group_5__1__Impl : ( ( rule__PageRule__TargetsAssignment_5_1 ) ) ;
    public final void rule__PageRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:650:1: ( ( ( rule__PageRule__TargetsAssignment_5_1 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:651:1: ( ( rule__PageRule__TargetsAssignment_5_1 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:651:1: ( ( rule__PageRule__TargetsAssignment_5_1 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:652:1: ( rule__PageRule__TargetsAssignment_5_1 )
            {
             before(grammarAccess.getPageRuleAccess().getTargetsAssignment_5_1()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:653:1: ( rule__PageRule__TargetsAssignment_5_1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:653:2: rule__PageRule__TargetsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__TargetsAssignment_5_1_in_rule__PageRule__Group_5__1__Impl1237);
            rule__PageRule__TargetsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPageRuleAccess().getTargetsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__1__Impl"


    // $ANTLR start "rule__PageRule__Group_5__2"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:663:1: rule__PageRule__Group_5__2 : rule__PageRule__Group_5__2__Impl ;
    public final void rule__PageRule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:667:1: ( rule__PageRule__Group_5__2__Impl )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:668:2: rule__PageRule__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5__2__Impl_in_rule__PageRule__Group_5__21267);
            rule__PageRule__Group_5__2__Impl();

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
    // $ANTLR end "rule__PageRule__Group_5__2"


    // $ANTLR start "rule__PageRule__Group_5__2__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:674:1: rule__PageRule__Group_5__2__Impl : ( ( rule__PageRule__Group_5_2__0 )* ) ;
    public final void rule__PageRule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:678:1: ( ( ( rule__PageRule__Group_5_2__0 )* ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:679:1: ( ( rule__PageRule__Group_5_2__0 )* )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:679:1: ( ( rule__PageRule__Group_5_2__0 )* )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:680:1: ( rule__PageRule__Group_5_2__0 )*
            {
             before(grammarAccess.getPageRuleAccess().getGroup_5_2()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:681:1: ( rule__PageRule__Group_5_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:681:2: rule__PageRule__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5_2__0_in_rule__PageRule__Group_5__2__Impl1294);
            	    rule__PageRule__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPageRuleAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__2__Impl"


    // $ANTLR start "rule__PageRule__Group_5_2__0"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:697:1: rule__PageRule__Group_5_2__0 : rule__PageRule__Group_5_2__0__Impl rule__PageRule__Group_5_2__1 ;
    public final void rule__PageRule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:701:1: ( rule__PageRule__Group_5_2__0__Impl rule__PageRule__Group_5_2__1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:702:2: rule__PageRule__Group_5_2__0__Impl rule__PageRule__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5_2__0__Impl_in_rule__PageRule__Group_5_2__01331);
            rule__PageRule__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5_2__1_in_rule__PageRule__Group_5_2__01334);
            rule__PageRule__Group_5_2__1();

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
    // $ANTLR end "rule__PageRule__Group_5_2__0"


    // $ANTLR start "rule__PageRule__Group_5_2__0__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:709:1: rule__PageRule__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__PageRule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:713:1: ( ( ',' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:714:1: ( ',' )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:714:1: ( ',' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:715:1: ','
            {
             before(grammarAccess.getPageRuleAccess().getCommaKeyword_5_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PageRule__Group_5_2__0__Impl1362); 
             after(grammarAccess.getPageRuleAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5_2__0__Impl"


    // $ANTLR start "rule__PageRule__Group_5_2__1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:728:1: rule__PageRule__Group_5_2__1 : rule__PageRule__Group_5_2__1__Impl ;
    public final void rule__PageRule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:732:1: ( rule__PageRule__Group_5_2__1__Impl )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:733:2: rule__PageRule__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__Group_5_2__1__Impl_in_rule__PageRule__Group_5_2__11393);
            rule__PageRule__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__PageRule__Group_5_2__1"


    // $ANTLR start "rule__PageRule__Group_5_2__1__Impl"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:739:1: rule__PageRule__Group_5_2__1__Impl : ( ( rule__PageRule__TargetsAssignment_5_2_1 ) ) ;
    public final void rule__PageRule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:743:1: ( ( ( rule__PageRule__TargetsAssignment_5_2_1 ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:744:1: ( ( rule__PageRule__TargetsAssignment_5_2_1 ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:744:1: ( ( rule__PageRule__TargetsAssignment_5_2_1 ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:745:1: ( rule__PageRule__TargetsAssignment_5_2_1 )
            {
             before(grammarAccess.getPageRuleAccess().getTargetsAssignment_5_2_1()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:746:1: ( rule__PageRule__TargetsAssignment_5_2_1 )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:746:2: rule__PageRule__TargetsAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageRule__TargetsAssignment_5_2_1_in_rule__PageRule__Group_5_2__1__Impl1420);
            rule__PageRule__TargetsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPageRuleAccess().getTargetsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5_2__1__Impl"


    // $ANTLR start "rule__WebsiteRule__IsMobileFriendlyAssignment_0"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:761:1: rule__WebsiteRule__IsMobileFriendlyAssignment_0 : ( ( 'mobile' ) ) ;
    public final void rule__WebsiteRule__IsMobileFriendlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:765:1: ( ( ( 'mobile' ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:766:1: ( ( 'mobile' ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:766:1: ( ( 'mobile' ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:767:1: ( 'mobile' )
            {
             before(grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyMobileKeyword_0_0()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:768:1: ( 'mobile' )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:769:1: 'mobile'
            {
             before(grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyMobileKeyword_0_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WebsiteRule__IsMobileFriendlyAssignment_01464); 
             after(grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyMobileKeyword_0_0()); 

            }

             after(grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyMobileKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__IsMobileFriendlyAssignment_0"


    // $ANTLR start "rule__WebsiteRule__CopyrightAssignment_3_1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:784:1: rule__WebsiteRule__CopyrightAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__WebsiteRule__CopyrightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:788:1: ( ( RULE_STRING ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:789:1: ( RULE_STRING )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:789:1: ( RULE_STRING )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:790:1: RULE_STRING
            {
             before(grammarAccess.getWebsiteRuleAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__WebsiteRule__CopyrightAssignment_3_11503); 
             after(grammarAccess.getWebsiteRuleAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__CopyrightAssignment_3_1"


    // $ANTLR start "rule__WebsiteRule__PagesAssignment_4"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:799:1: rule__WebsiteRule__PagesAssignment_4 : ( rulePageRule ) ;
    public final void rule__WebsiteRule__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:803:1: ( ( rulePageRule ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:804:1: ( rulePageRule )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:804:1: ( rulePageRule )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:805:1: rulePageRule
            {
             before(grammarAccess.getWebsiteRuleAccess().getPagesPageRuleParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePageRule_in_rule__WebsiteRule__PagesAssignment_41534);
            rulePageRule();

            state._fsp--;

             after(grammarAccess.getWebsiteRuleAccess().getPagesPageRuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebsiteRule__PagesAssignment_4"


    // $ANTLR start "rule__PageRule__NameAssignment_1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:814:1: rule__PageRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PageRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:818:1: ( ( RULE_ID ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:819:1: ( RULE_ID )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:819:1: ( RULE_ID )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:820:1: RULE_ID
            {
             before(grammarAccess.getPageRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PageRule__NameAssignment_11565); 
             after(grammarAccess.getPageRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__NameAssignment_1"


    // $ANTLR start "rule__PageRule__TitleAssignment_4"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:829:1: rule__PageRule__TitleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PageRule__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:833:1: ( ( RULE_STRING ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:834:1: ( RULE_STRING )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:834:1: ( RULE_STRING )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:835:1: RULE_STRING
            {
             before(grammarAccess.getPageRuleAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PageRule__TitleAssignment_41596); 
             after(grammarAccess.getPageRuleAccess().getTitleSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__TitleAssignment_4"


    // $ANTLR start "rule__PageRule__TargetsAssignment_5_1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:844:1: rule__PageRule__TargetsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__PageRule__TargetsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:848:1: ( ( ( RULE_ID ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:849:1: ( ( RULE_ID ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:849:1: ( ( RULE_ID ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:850:1: ( RULE_ID )
            {
             before(grammarAccess.getPageRuleAccess().getTargetsPageCrossReference_5_1_0()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:851:1: ( RULE_ID )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:852:1: RULE_ID
            {
             before(grammarAccess.getPageRuleAccess().getTargetsPageIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PageRule__TargetsAssignment_5_11631); 
             after(grammarAccess.getPageRuleAccess().getTargetsPageIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getPageRuleAccess().getTargetsPageCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__TargetsAssignment_5_1"


    // $ANTLR start "rule__PageRule__TargetsAssignment_5_2_1"
    // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:863:1: rule__PageRule__TargetsAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PageRule__TargetsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:867:1: ( ( ( RULE_ID ) ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:868:1: ( ( RULE_ID ) )
            {
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:868:1: ( ( RULE_ID ) )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:869:1: ( RULE_ID )
            {
             before(grammarAccess.getPageRuleAccess().getTargetsPageCrossReference_5_2_1_0()); 
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:870:1: ( RULE_ID )
            // ../org.poc.idm.xtext.wdl.ui/src-gen/org/poc/idm/xtext/wdl/ui/contentassist/antlr/internal/InternalWdl.g:871:1: RULE_ID
            {
             before(grammarAccess.getPageRuleAccess().getTargetsPageIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PageRule__TargetsAssignment_5_2_11670); 
             after(grammarAccess.getPageRuleAccess().getTargetsPageIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getPageRuleAccess().getTargetsPageCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__TargetsAssignment_5_2_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleWebsiteRule_in_entryRuleWebsiteRule61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWebsiteRule68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__0_in_ruleWebsiteRule94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageRule_in_entryRulePageRule121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageRule128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__0_in_rulePageRule154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__0__Impl_in_rule__WebsiteRule__Group__0188 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__1_in_rule__WebsiteRule__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__IsMobileFriendlyAssignment_0_in_rule__WebsiteRule__Group__0__Impl218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__1__Impl_in_rule__WebsiteRule__Group__1249 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__2_in_rule__WebsiteRule__Group__1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__WebsiteRule__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__2__Impl_in_rule__WebsiteRule__Group__2311 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__3_in_rule__WebsiteRule__Group__2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__WebsiteRule__Group__2__Impl342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__3__Impl_in_rule__WebsiteRule__Group__3373 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__4_in_rule__WebsiteRule__Group__3376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group_3__0_in_rule__WebsiteRule__Group__3__Impl403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__4__Impl_in_rule__WebsiteRule__Group__4434 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__5_in_rule__WebsiteRule__Group__4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__PagesAssignment_4_in_rule__WebsiteRule__Group__4__Impl466 = new BitSet(new long[]{0x000000000000C002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__PagesAssignment_4_in_rule__WebsiteRule__Group__4__Impl478 = new BitSet(new long[]{0x000000000000C002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group__5__Impl_in_rule__WebsiteRule__Group__5511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__WebsiteRule__Group__5__Impl539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group_3__0__Impl_in_rule__WebsiteRule__Group_3__0582 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group_3__1_in_rule__WebsiteRule__Group_3__0585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WebsiteRule__Group_3__0__Impl613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__Group_3__1__Impl_in_rule__WebsiteRule__Group_3__1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WebsiteRule__CopyrightAssignment_3_1_in_rule__WebsiteRule__Group_3__1__Impl671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__0__Impl_in_rule__PageRule__Group__0705 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PageRule__Group__1_in_rule__PageRule__Group__0708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__PageRule__Group__0__Impl736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__1__Impl_in_rule__PageRule__Group__1767 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__PageRule__Group__2_in_rule__PageRule__Group__1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__NameAssignment_1_in_rule__PageRule__Group__1__Impl797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__2__Impl_in_rule__PageRule__Group__2827 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PageRule__Group__3_in_rule__PageRule__Group__2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PageRule__Group__2__Impl858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__3__Impl_in_rule__PageRule__Group__3889 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__PageRule__Group__4_in_rule__PageRule__Group__3892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PageRule__Group__3__Impl920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__4__Impl_in_rule__PageRule__Group__4951 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__PageRule__Group__5_in_rule__PageRule__Group__4954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__TitleAssignment_4_in_rule__PageRule__Group__4__Impl981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__5__Impl_in_rule__PageRule__Group__51011 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__PageRule__Group__6_in_rule__PageRule__Group__51014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5__0_in_rule__PageRule__Group__5__Impl1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group__6__Impl_in_rule__PageRule__Group__61072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PageRule__Group__6__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5__0__Impl_in_rule__PageRule__Group_5__01145 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5__1_in_rule__PageRule__Group_5__01148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PageRule__Group_5__0__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5__1__Impl_in_rule__PageRule__Group_5__11207 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5__2_in_rule__PageRule__Group_5__11210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__TargetsAssignment_5_1_in_rule__PageRule__Group_5__1__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5__2__Impl_in_rule__PageRule__Group_5__21267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5_2__0_in_rule__PageRule__Group_5__2__Impl1294 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5_2__0__Impl_in_rule__PageRule__Group_5_2__01331 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5_2__1_in_rule__PageRule__Group_5_2__01334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PageRule__Group_5_2__0__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__Group_5_2__1__Impl_in_rule__PageRule__Group_5_2__11393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageRule__TargetsAssignment_5_2_1_in_rule__PageRule__Group_5_2__1__Impl1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WebsiteRule__IsMobileFriendlyAssignment_01464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__WebsiteRule__CopyrightAssignment_3_11503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageRule_in_rule__WebsiteRule__PagesAssignment_41534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PageRule__NameAssignment_11565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PageRule__TitleAssignment_41596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PageRule__TargetsAssignment_5_11631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PageRule__TargetsAssignment_5_2_11670 = new BitSet(new long[]{0x0000000000000002L});
    }


}