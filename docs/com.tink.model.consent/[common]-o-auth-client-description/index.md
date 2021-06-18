---
title: [common]OAuthClientDescription -
---
//[link](../../index.md)/[com.tink.model.consent](../index.md)/[[common]OAuthClientDescription](index.md)



# OAuthClientDescription  
 [common] data class [OAuthClientDescription](index.md)(**clientName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **clientUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **clientIconUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **verified**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **aggregator**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **scopeDescriptions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription](../[common]-scope-description/index.md)>)

A description of the OAuth client and the data it will collect from the user.

   


## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>clientName| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a><br><br>: The name of the application specified by the client when creating it in the console.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>clientUrl| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a><br><br>: A url specified by the client for additional information. Can be empty.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>clientIconUrl| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a><br><br>: A url for a client icon. Can be empty.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>scopeDescriptions| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a><br><br>: A list of [ScopeDescription](../[common]-scope-description/index.md)s describing which financial info is going to be collected.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>verified| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a><br><br>: Indicates whether the app is verified or not. If it is unverified, the user should be cautious when sharing financial data.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>aggregator| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a><br><br>: Describes whether the client is aggregating data under their own or under Tink's license.<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>[OAuthClientDescription](-o-auth-client-description.md)| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a> [common] fun [OAuthClientDescription](-o-auth-client-description.md)(clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription](../[common]-scope-description/index.md)>): The name of the application specified by the client when creating it in the console.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.consent/OAuthClientDescription/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.model.consent/OAuthClientDescription/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.model.consent/OAuthClientDescription/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.model.consent/OAuthClientDescription/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component3](component3.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.tink.model.consent/OAuthClientDescription/component4/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component4](component4.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/component5/#/PointingToDeclaration/"></a>[component5](component5.md)| <a name="com.tink.model.consent/OAuthClientDescription/component5/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component5](component5.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/component6/#/PointingToDeclaration/"></a>[component6](component6.md)| <a name="com.tink.model.consent/OAuthClientDescription/component6/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component6](component6.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription](../[common]-scope-description/index.md)>  <br><br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/copy/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.model.consent/OAuthClientDescription/copy/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription](../[common]-scope-description/index.md)>): [OAuthClientDescription](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.consent/OAuthClientDescription/aggregator/#/PointingToDeclaration/"></a>[aggregator](aggregator.md)| <a name="com.tink.model.consent/OAuthClientDescription/aggregator/#/PointingToDeclaration/"></a> [common] val [aggregator](aggregator.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Describes whether the client is aggregating data under their own or under Tink's license.   <br>
| <a name="com.tink.model.consent/OAuthClientDescription/clientIconUrl/#/PointingToDeclaration/"></a>[clientIconUrl](client-icon-url.md)| <a name="com.tink.model.consent/OAuthClientDescription/clientIconUrl/#/PointingToDeclaration/"></a> [common] val [clientIconUrl](client-icon-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html): A url for a client icon.   <br>
| <a name="com.tink.model.consent/OAuthClientDescription/clientName/#/PointingToDeclaration/"></a>[clientName](client-name.md)| <a name="com.tink.model.consent/OAuthClientDescription/clientName/#/PointingToDeclaration/"></a> [common] val [clientName](client-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html): The name of the application specified by the client when creating it in the console.   <br>
| <a name="com.tink.model.consent/OAuthClientDescription/clientUrl/#/PointingToDeclaration/"></a>[clientUrl](client-url.md)| <a name="com.tink.model.consent/OAuthClientDescription/clientUrl/#/PointingToDeclaration/"></a> [common] val [clientUrl](client-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html): A url specified by the client for additional information.   <br>
| <a name="com.tink.model.consent/OAuthClientDescription/scopeDescriptions/#/PointingToDeclaration/"></a>[scopeDescriptions](scope-descriptions.md)| <a name="com.tink.model.consent/OAuthClientDescription/scopeDescriptions/#/PointingToDeclaration/"></a> [common] val [scopeDescriptions](scope-descriptions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription](../[common]-scope-description/index.md)>: A list of [ScopeDescription](../[common]-scope-description/index.md)s describing which financial info is going to be collected.   <br>
| <a name="com.tink.model.consent/OAuthClientDescription/verified/#/PointingToDeclaration/"></a>[verified](verified.md)| <a name="com.tink.model.consent/OAuthClientDescription/verified/#/PointingToDeclaration/"></a> [common] val [verified](verified.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html): Indicates whether the app is verified or not.   <br>

