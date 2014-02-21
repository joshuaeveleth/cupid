/*
* generated by Xtext
*/
grammar InternalCupidLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.earthsystemcurator.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.earthsystemcurator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.earthsystemcurator.services.CupidLanguageGrammarAccess;

}

@parser::members {

 	private CupidLanguageGrammarAccess grammarAccess;
 	
    public InternalCupidLanguageParser(TokenStream input, CupidLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Mappings";	
   	}
   	
   	@Override
   	protected CupidLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMappings
entryRuleMappings returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMappingsRule()); }
	 iv_ruleMappings=ruleMappings 
	 { $current=$iv_ruleMappings.current; } 
	 EOF 
;

// Rule Mappings
ruleMappings returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0_0()); 
	    }
		lv_mappings_0_0=ruleMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappingsRule());
	        }
       		add(
       			$current, 
       			"mappings",
        		lv_mappings_0_0, 
        		"Mapping");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMappingsAccess().getConceptsConceptDefParserRuleCall_1_0()); 
	    }
		lv_concepts_1_0=ruleConceptDef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappingsRule());
	        }
       		add(
       			$current, 
       			"concepts",
        		lv_concepts_1_0, 
        		"ConceptDef");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleConceptDefOrRef
entryRuleConceptDefOrRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConceptDefOrRefRule()); }
	 iv_ruleConceptDefOrRef=ruleConceptDefOrRef 
	 { $current=$iv_ruleConceptDefOrRef.current; } 
	 EOF 
;

// Rule ConceptDefOrRef
ruleConceptDefOrRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConceptDefOrRefAccess().getAnonymousConceptParserRuleCall_0()); 
    }
    this_AnonymousConcept_0=ruleAnonymousConcept
    { 
        $current = $this_AnonymousConcept_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConceptDefOrRefAccess().getConceptRefParserRuleCall_1()); 
    }
    this_ConceptRef_1=ruleConceptRef
    { 
        $current = $this_ConceptRef_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleConceptDef
entryRuleConceptDef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConceptDefRule()); }
	 iv_ruleConceptDef=ruleConceptDef 
	 { $current=$iv_ruleConceptDef.current; } 
	 EOF 
;

// Rule ConceptDef
ruleConceptDef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_top_0_0=	'top' 
    {
        newLeafNode(lv_top_0_0, grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConceptDefRule());
	        }
       		setWithLastConsumed($current, "top", true, "top");
	    }

)
)?	otherlv_1='concept' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConceptDefAccess().getConceptKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConceptDefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(	otherlv_3='<' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConceptDefAccess().getLessThanSignKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
	    }
		lv_mapping_4_0=ruleMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConceptDefRule());
	        }
       		set(
       			$current, 
       			"mapping",
        		lv_mapping_4_0, 
        		"Mapping");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='>' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConceptDefAccess().getGreaterThanSignKeyword_3_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getConceptDefAccess().getBodyConceptDefBodyParserRuleCall_4_0()); 
	    }
		lv_body_6_0=ruleConceptDefBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConceptDefRule());
	        }
       		set(
       			$current, 
       			"body",
        		lv_body_6_0, 
        		"ConceptDefBody");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleAnonymousConcept
entryRuleAnonymousConcept returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnonymousConceptRule()); }
	 iv_ruleAnonymousConcept=ruleAnonymousConcept 
	 { $current=$iv_ruleAnonymousConcept.current; } 
	 EOF 
;

// Rule AnonymousConcept
ruleAnonymousConcept returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_localName_0_0=RULE_ID
		{
			newLeafNode(lv_localName_0_0, grammarAccess.getAnonymousConceptAccess().getLocalNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnonymousConceptRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"localName",
        		lv_localName_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAnonymousConceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
	    }
		lv_cardinality_1_0=ruleCardinality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnonymousConceptRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_1_0, 
        		"Cardinality");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_required_2_0=	'!' 
    {
        newLeafNode(lv_required_2_0, grammarAccess.getAnonymousConceptAccess().getRequiredExclamationMarkKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnonymousConceptRule());
	        }
       		setWithLastConsumed($current, "required", true, "!");
	    }

)
)?(	otherlv_3='<' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAnonymousConceptAccess().getLessThanSignKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnonymousConceptAccess().getMappingMappingParserRuleCall_3_1_0()); 
	    }
		lv_mapping_4_0=ruleMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnonymousConceptRule());
	        }
       		set(
       			$current, 
       			"mapping",
        		lv_mapping_4_0, 
        		"Mapping");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='>' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAnonymousConceptAccess().getGreaterThanSignKeyword_3_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getAnonymousConceptAccess().getBodyConceptDefBodyParserRuleCall_4_0()); 
	    }
		lv_body_6_0=ruleConceptDefBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnonymousConceptRule());
	        }
       		set(
       			$current, 
       			"body",
        		lv_body_6_0, 
        		"ConceptDefBody");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleConceptDefBody
entryRuleConceptDefBody returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConceptDefBodyRule()); }
	 iv_ruleConceptDefBody=ruleConceptDefBody 
	 { $current=$iv_ruleConceptDefBody.current; } 
	 EOF 
;

// Rule ConceptDefBody
ruleConceptDefBody returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConceptDefBodyAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConceptDefBodyAccess().getSubconceptConceptDefOrRefParserRuleCall_1_0()); 
	    }
		lv_subconcept_1_0=ruleConceptDefOrRef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConceptDefBodyRule());
	        }
       		add(
       			$current, 
       			"subconcept",
        		lv_subconcept_1_0, 
        		"ConceptDefOrRef");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConceptDefBodyAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConceptDefBodyAccess().getSubconceptConceptDefOrRefParserRuleCall_2_1_0()); 
	    }
		lv_subconcept_3_0=ruleConceptDefOrRef		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConceptDefBodyRule());
	        }
       		add(
       			$current, 
       			"subconcept",
        		lv_subconcept_3_0, 
        		"ConceptDefOrRef");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConceptDefBodyAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleConceptRef
entryRuleConceptRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConceptRefRule()); }
	 iv_ruleConceptRef=ruleConceptRef 
	 { $current=$iv_ruleConceptRef.current; } 
	 EOF 
;

// Rule ConceptRef
ruleConceptRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_localName_0_0=RULE_ID
		{
			newLeafNode(lv_localName_0_0, grammarAccess.getConceptRefAccess().getLocalNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConceptRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"localName",
        		lv_localName_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConceptRefAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
	    }
		lv_cardinality_1_0=ruleCardinality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConceptRefRule());
	        }
       		set(
       			$current, 
       			"cardinality",
        		lv_cardinality_1_0, 
        		"Cardinality");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_required_2_0=	'!' 
    {
        newLeafNode(lv_required_2_0, grammarAccess.getConceptRefAccess().getRequiredExclamationMarkKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConceptRefRule());
	        }
       		setWithLastConsumed($current, "required", true, "!");
	    }

)
)?	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConceptRefAccess().getColonKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConceptRefRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getConceptRefAccess().getNameConceptDefCrossReference_4_0()); 
	}

)
))
;





// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	 iv_ruleCardinality=ruleCardinality 
	 { $current=$iv_ruleCardinality.current; } 
	 EOF 
;

// Rule Cardinality
ruleCardinality returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_zeroOrMore_0_0=	'*' 
    {
        newLeafNode(lv_zeroOrMore_0_0, grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCardinalityRule());
	        }
       		setWithLastConsumed($current, "zeroOrMore", true, "*");
	    }

)
)
    |(
(
		lv_oneOrMore_1_0=	'+' 
    {
        newLeafNode(lv_oneOrMore_1_0, grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCardinalityRule());
	        }
       		setWithLastConsumed($current, "oneOrMore", true, "+");
	    }

)
))
;





// Entry rule entryRuleMapping
entryRuleMapping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMappingRule()); }
	 iv_ruleMapping=ruleMapping 
	 { $current=$iv_ruleMapping.current; } 
	 EOF 
;

// Rule Mapping
ruleMapping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
	    }
		lv_context_0_0=rulePathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappingRule());
	        }
       		set(
       			$current, 
       			"context",
        		lv_context_0_0, 
        		"PathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
	    }
		lv_mapping_1_0=ruleImplicitContextMapping		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMappingRule());
	        }
       		set(
       			$current, 
       			"mapping",
        		lv_mapping_1_0, 
        		"ImplicitContextMapping");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleImplicitContextMapping
entryRuleImplicitContextMapping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImplicitContextMappingRule()); }
	 iv_ruleImplicitContextMapping=ruleImplicitContextMapping 
	 { $current=$iv_ruleImplicitContextMapping.current; } 
	 EOF 
;

// Rule ImplicitContextMapping
ruleImplicitContextMapping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
    }
    this_Module_0=ruleModule
    { 
        $current = $this_Module_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_1()); 
    }
    this_UsesModule_1=ruleUsesModule
    { 
        $current = $this_UsesModule_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_2()); 
    }
    this_UsesEntity_2=ruleUsesEntity
    { 
        $current = $this_UsesEntity_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_3()); 
    }
    this_Call_3=ruleCall
    { 
        $current = $this_Call_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_4()); 
    }
    this_Subroutine_4=ruleSubroutine
    { 
        $current = $this_Subroutine_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_5()); 
    }
    this_SubroutineName_5=ruleSubroutineName
    { 
        $current = $this_SubroutineName_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModuleAccess().getModuleAction_0(),
            $current);
    }
)	otherlv_1='module' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
    }
(	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
	    }
		lv_name_3_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2());
    }
)?)
;





// Entry rule entryRuleUsesModule
entryRuleUsesModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUsesModuleRule()); }
	 iv_ruleUsesModule=ruleUsesModule 
	 { $current=$iv_ruleUsesModule.current; } 
	 EOF 
;

// Rule UsesModule
ruleUsesModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='usesModule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUsesModuleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleUsesEntity
entryRuleUsesEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUsesEntityRule()); }
	 iv_ruleUsesEntity=ruleUsesEntity 
	 { $current=$iv_ruleUsesEntity.current; } 
	 EOF 
;

// Rule UsesEntity
ruleUsesEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='usesEntity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUsesEntityRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleSubroutine
entryRuleSubroutine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubroutineRule()); }
	 iv_ruleSubroutine=ruleSubroutine 
	 { $current=$iv_ruleSubroutine.current; } 
	 EOF 
;

// Rule Subroutine
ruleSubroutine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='subroutine' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubroutineKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubroutineRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
	    }
		lv_params_4_0=ruleFormalParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubroutineRule());
	        }
       		add(
       			$current, 
       			"params",
        		lv_params_4_0, 
        		"FormalParam");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
	    }
		lv_params_6_0=ruleFormalParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubroutineRule());
	        }
       		add(
       			$current, 
       			"params",
        		lv_params_6_0, 
        		"FormalParam");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2());
    }
)?	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleFormalParam
entryRuleFormalParam returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFormalParamRule()); }
	 iv_ruleFormalParam=ruleFormalParam 
	 { $current=$iv_ruleFormalParam.current; } 
	 EOF 
;

// Rule FormalParam
ruleFormalParam returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
	    }
		lv_intent_0_0=ruleIntent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFormalParamRule());
	        }
       		set(
       			$current, 
       			"intent",
        		lv_intent_0_0, 
        		"Intent");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFormalParamRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFormalParamRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleIntent
entryRuleIntent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntentRule()); }
	 iv_ruleIntent=ruleIntent 
	 { $current=$iv_ruleIntent.current; } 
	 EOF 
;

// Rule Intent
ruleIntent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_in_0_0=	'in' 
    {
        newLeafNode(lv_in_0_0, grammarAccess.getIntentAccess().getInInKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntentRule());
	        }
       		setWithLastConsumed($current, "in", true, "in");
	    }

)
)
    |(
(
		lv_out_1_0=	'out' 
    {
        newLeafNode(lv_out_1_0, grammarAccess.getIntentAccess().getOutOutKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntentRule());
	        }
       		setWithLastConsumed($current, "out", true, "out");
	    }

)
)
    |(
(
		lv_inout_2_0=	'inout' 
    {
        newLeafNode(lv_inout_2_0, grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntentRule());
	        }
       		setWithLastConsumed($current, "inout", true, "inout");
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_integer_0_0=	'integer' 
    {
        newLeafNode(lv_integer_0_0, grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "integer", true, "integer");
	    }

)
)
    |(
(
		lv_character_1_0=	'character' 
    {
        newLeafNode(lv_character_1_0, grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "character", true, "character");
	    }

)
)
    |(
(
		lv_logical_2_0=	'logical' 
    {
        newLeafNode(lv_logical_2_0, grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "logical", true, "logical");
	    }

)
)
    |(
(
		lv_real_3_0=	'real' 
    {
        newLeafNode(lv_real_3_0, grammarAccess.getTypeAccess().getRealRealKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "real", true, "real");
	    }

)
)
    |((
(
		lv_double_4_0=	'double' 
    {
        newLeafNode(lv_double_4_0, grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "double", true, "double");
	    }

)
)(	otherlv_5='precision' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getPrecisionKeyword_4_1());
    }
)?)
    |((
(
		lv_derived_6_0=	'type' 
    {
        newLeafNode(lv_derived_6_0, grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "derived", true, "type");
	    }

)
)	otherlv_7='(' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
	    }
		lv_derivedType_8_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		set(
       			$current, 
       			"derivedType",
        		lv_derivedType_8_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9=')' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3());
    }
))
;





// Entry rule entryRuleSubroutineName
entryRuleSubroutineName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubroutineNameRule()); }
	 iv_ruleSubroutineName=ruleSubroutineName 
	 { $current=$iv_ruleSubroutineName.current; } 
	 EOF 
;

// Rule SubroutineName
ruleSubroutineName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='subroutineName' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1(),
            $current);
    }
)(	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
	    }
		lv_name_3_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubroutineNameRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2());
    }
)?)
;





// Entry rule entryRuleCall
entryRuleCall returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCallRule()); }
	 iv_ruleCall=ruleCall 
	 { $current=$iv_ruleCall.current; } 
	 EOF 
;

// Rule Call
ruleCall returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='call' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
	    }
		lv_subroutineName_2_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCallRule());
	        }
       		set(
       			$current, 
       			"subroutineName",
        		lv_subroutineName_2_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
	    }
		lv_params_4_0=ruleActualParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCallRule());
	        }
       		add(
       			$current, 
       			"params",
        		lv_params_4_0, 
        		"ActualParam");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
	    }
		lv_params_6_0=ruleActualParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCallRule());
	        }
       		add(
       			$current, 
       			"params",
        		lv_params_6_0, 
        		"ActualParam");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2());
    }
)?	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleActualParam
entryRuleActualParam returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActualParamRule()); }
	 iv_ruleActualParam=ruleActualParam 
	 { $current=$iv_ruleActualParam.current; } 
	 EOF 
;

// Rule ActualParam
ruleActualParam returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_keyword_0_0=RULE_ID
		{
			newLeafNode(lv_keyword_0_0, grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActualParamRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"keyword",
        		lv_keyword_0_0, 
        		"ID");
	    }

)
)(
(
		lv_optional_1_0=	'?' 
    {
        newLeafNode(lv_optional_1_0, grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActualParamRule());
	        }
       		setWithLastConsumed($current, "optional", true, "?");
	    }

)
)?	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
	    }
		lv_value_3_0=ruleIDOrPathExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActualParamRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"IDOrPathExpr");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleIDOrWildcard
entryRuleIDOrWildcard returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIDOrWildcardRule()); }
	 iv_ruleIDOrWildcard=ruleIDOrWildcard 
	 { $current=$iv_ruleIDOrWildcard.current; } 
	 EOF 
;

// Rule IDOrWildcard
ruleIDOrWildcard returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_id_0_0=RULE_ID
		{
			newLeafNode(lv_id_0_0, grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIDOrWildcardRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"ID");
	    }

)
)
    |(
(
		lv_wildcard_1_0=	'*' 
    {
        newLeafNode(lv_wildcard_1_0, grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIDOrWildcardRule());
	        }
       		setWithLastConsumed($current, "wildcard", true, "*");
	    }

)
))
;





// Entry rule entryRuleIDOrPathExpr
entryRuleIDOrPathExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIDOrPathExprRule()); }
	 iv_ruleIDOrPathExpr=ruleIDOrPathExpr 
	 { $current=$iv_ruleIDOrPathExpr.current; } 
	 EOF 
;

// Rule IDOrPathExpr
ruleIDOrPathExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
    }
    this_IDOrWildcard_0=ruleIDOrWildcard
    { 
        $current = $this_IDOrWildcard_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
    }
    this_PathExpr_1=rulePathExpr
    { 
        $current = $this_PathExpr_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePathExpr
entryRulePathExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPathExprRule()); }
	 iv_rulePathExpr=rulePathExpr 
	 { $current=$iv_rulePathExpr.current; } 
	 EOF 
;

// Rule PathExpr
rulePathExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='#' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getNumberSignKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 
	    }
		lv_segments_1_0=rulePathSegment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPathExprRule());
	        }
       		add(
       			$current, 
       			"segments",
        		lv_segments_1_0, 
        		"PathSegment");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='/' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPathExprAccess().getSolidusKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 
	    }
		lv_segments_3_0=rulePathSegment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPathExprRule());
	        }
       		add(
       			$current, 
       			"segments",
        		lv_segments_3_0, 
        		"PathSegment");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePathSegment
entryRulePathSegment returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPathSegmentRule()); } 
	 iv_rulePathSegment=rulePathSegment 
	 { $current=$iv_rulePathSegment.current.getText(); }  
	 EOF 
;

// Rule PathSegment
rulePathSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='..' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

