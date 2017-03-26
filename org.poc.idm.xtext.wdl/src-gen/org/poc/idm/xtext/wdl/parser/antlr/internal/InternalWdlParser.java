package org.poc.idm.xtext.wdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.poc.idm.xtext.wdl.services.WdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mobile'", "'website'", "'{'", "'copyright :'", "'}'", "'page'", "'title : '", "'menu :'", "','"
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
    public String getGrammarFileName() { return "../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g"; }



     	private WdlGrammarAccess grammarAccess;
     	
        public InternalWdlParser(TokenStream input, WdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "WebsiteRule";	
       	}
       	
       	@Override
       	protected WdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWebsiteRule"
    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:67:1: entryRuleWebsiteRule returns [EObject current=null] : iv_ruleWebsiteRule= ruleWebsiteRule EOF ;
    public final EObject entryRuleWebsiteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebsiteRule = null;


        try {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:68:2: (iv_ruleWebsiteRule= ruleWebsiteRule EOF )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:69:2: iv_ruleWebsiteRule= ruleWebsiteRule EOF
            {
             newCompositeNode(grammarAccess.getWebsiteRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWebsiteRule_in_entryRuleWebsiteRule75);
            iv_ruleWebsiteRule=ruleWebsiteRule();

            state._fsp--;

             current =iv_ruleWebsiteRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWebsiteRule85); 

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
    // $ANTLR end "entryRuleWebsiteRule"


    // $ANTLR start "ruleWebsiteRule"
    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:76:1: ruleWebsiteRule returns [EObject current=null] : ( ( (lv_isMobileFriendly_0_0= 'mobile' ) )? otherlv_1= 'website' otherlv_2= '{' (otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) ) )? ( (lv_pages_5_0= rulePageRule ) )+ otherlv_6= '}' ) ;
    public final EObject ruleWebsiteRule() throws RecognitionException {
        EObject current = null;

        Token lv_isMobileFriendly_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_copyright_4_0=null;
        Token otherlv_6=null;
        EObject lv_pages_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:79:28: ( ( ( (lv_isMobileFriendly_0_0= 'mobile' ) )? otherlv_1= 'website' otherlv_2= '{' (otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) ) )? ( (lv_pages_5_0= rulePageRule ) )+ otherlv_6= '}' ) )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:80:1: ( ( (lv_isMobileFriendly_0_0= 'mobile' ) )? otherlv_1= 'website' otherlv_2= '{' (otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) ) )? ( (lv_pages_5_0= rulePageRule ) )+ otherlv_6= '}' )
            {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:80:1: ( ( (lv_isMobileFriendly_0_0= 'mobile' ) )? otherlv_1= 'website' otherlv_2= '{' (otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) ) )? ( (lv_pages_5_0= rulePageRule ) )+ otherlv_6= '}' )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:80:2: ( (lv_isMobileFriendly_0_0= 'mobile' ) )? otherlv_1= 'website' otherlv_2= '{' (otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) ) )? ( (lv_pages_5_0= rulePageRule ) )+ otherlv_6= '}'
            {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:80:2: ( (lv_isMobileFriendly_0_0= 'mobile' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:81:1: (lv_isMobileFriendly_0_0= 'mobile' )
                    {
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:81:1: (lv_isMobileFriendly_0_0= 'mobile' )
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:82:3: lv_isMobileFriendly_0_0= 'mobile'
                    {
                    lv_isMobileFriendly_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWebsiteRule128); 

                            newLeafNode(lv_isMobileFriendly_0_0, grammarAccess.getWebsiteRuleAccess().getIsMobileFriendlyMobileKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWebsiteRuleRule());
                    	        }
                           		setWithLastConsumed(current, "isMobileFriendly", true, "mobile");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWebsiteRule154); 

                	newLeafNode(otherlv_1, grammarAccess.getWebsiteRuleAccess().getWebsiteKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWebsiteRule166); 

                	newLeafNode(otherlv_2, grammarAccess.getWebsiteRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:103:1: (otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:103:3: otherlv_3= 'copyright :' ( (lv_copyright_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWebsiteRule179); 

                        	newLeafNode(otherlv_3, grammarAccess.getWebsiteRuleAccess().getCopyrightKeyword_3_0());
                        
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:107:1: ( (lv_copyright_4_0= RULE_STRING ) )
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:108:1: (lv_copyright_4_0= RULE_STRING )
                    {
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:108:1: (lv_copyright_4_0= RULE_STRING )
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:109:3: lv_copyright_4_0= RULE_STRING
                    {
                    lv_copyright_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleWebsiteRule196); 

                    			newLeafNode(lv_copyright_4_0, grammarAccess.getWebsiteRuleAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWebsiteRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"copyright",
                            		lv_copyright_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:125:4: ( (lv_pages_5_0= rulePageRule ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:126:1: (lv_pages_5_0= rulePageRule )
            	    {
            	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:126:1: (lv_pages_5_0= rulePageRule )
            	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:127:3: lv_pages_5_0= rulePageRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWebsiteRuleAccess().getPagesPageRuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePageRule_in_ruleWebsiteRule224);
            	    lv_pages_5_0=rulePageRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWebsiteRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_5_0, 
            	            		"PageRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWebsiteRule237); 

                	newLeafNode(otherlv_6, grammarAccess.getWebsiteRuleAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleWebsiteRule"


    // $ANTLR start "entryRulePageRule"
    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:155:1: entryRulePageRule returns [EObject current=null] : iv_rulePageRule= rulePageRule EOF ;
    public final EObject entryRulePageRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageRule = null;


        try {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:156:2: (iv_rulePageRule= rulePageRule EOF )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:157:2: iv_rulePageRule= rulePageRule EOF
            {
             newCompositeNode(grammarAccess.getPageRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageRule_in_entryRulePageRule273);
            iv_rulePageRule=rulePageRule();

            state._fsp--;

             current =iv_rulePageRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageRule283); 

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
    // $ANTLR end "entryRulePageRule"


    // $ANTLR start "rulePageRule"
    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:164:1: rulePageRule returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title : ' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' ) ;
    public final EObject rulePageRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:167:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title : ' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' ) )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:168:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title : ' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' )
            {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:168:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title : ' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}' )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:168:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title : ' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePageRule320); 

                	newLeafNode(otherlv_0, grammarAccess.getPageRuleAccess().getPageKeyword_0());
                
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:172:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:173:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:173:1: (lv_name_1_0= RULE_ID )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:174:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePageRule337); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPageRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageRule354); 

                	newLeafNode(otherlv_2, grammarAccess.getPageRuleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageRule366); 

                	newLeafNode(otherlv_3, grammarAccess.getPageRuleAccess().getTitleKeyword_3());
                
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:198:1: ( (lv_title_4_0= RULE_STRING ) )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:199:1: (lv_title_4_0= RULE_STRING )
            {
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:199:1: (lv_title_4_0= RULE_STRING )
            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:200:3: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePageRule383); 

            			newLeafNode(lv_title_4_0, grammarAccess.getPageRuleAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:216:2: (otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:216:4: otherlv_5= 'menu :' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePageRule401); 

                        	newLeafNode(otherlv_5, grammarAccess.getPageRuleAccess().getMenuKeyword_5_0());
                        
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:220:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:221:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:221:1: (otherlv_6= RULE_ID )
                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:222:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRuleRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePageRule421); 

                    		newLeafNode(otherlv_6, grammarAccess.getPageRuleAccess().getTargetsPageCrossReference_5_1_0()); 
                    	

                    }


                    }

                    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:233:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:233:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePageRule434); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPageRuleAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:237:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:238:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:238:1: (otherlv_8= RULE_ID )
                    	    // ../org.poc.idm.xtext.wdl/src-gen/org/poc/idm/xtext/wdl/parser/antlr/internal/InternalWdl.g:239:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPageRuleRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePageRule454); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getPageRuleAccess().getTargetsPageCrossReference_5_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePageRule470); 

                	newLeafNode(otherlv_9, grammarAccess.getPageRuleAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePageRule"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleWebsiteRule_in_entryRuleWebsiteRule75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWebsiteRule85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleWebsiteRule128 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWebsiteRule154 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWebsiteRule166 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleWebsiteRule179 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleWebsiteRule196 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rulePageRule_in_ruleWebsiteRule224 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_15_in_ruleWebsiteRule237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageRule_in_entryRulePageRule273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageRule283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePageRule320 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePageRule337 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageRule354 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePageRule366 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePageRule383 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_rulePageRule401 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePageRule421 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_rulePageRule434 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePageRule454 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_rulePageRule470 = new BitSet(new long[]{0x0000000000000002L});
    }


}