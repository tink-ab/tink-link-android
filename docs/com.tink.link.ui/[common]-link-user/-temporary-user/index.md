---
title: TemporaryUser -
---
//[link](../../../index.md)/[com.tink.link.ui](../../index.md)/[[common]LinkUser](../index.md)/[TemporaryUser](index.md)



# TemporaryUser  
 [common] data class [TemporaryUser](index.md)(**market**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **locale**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](../index.md)

Pass this to the [TinkLinkUiActivity.createIntent](../../[common]-tink-link-ui-activity/-companion/create-intent.md) function to create a temporary user to be used in the flow. The [market](market.md) determines what providers will be available to the user, and the [locale](locale.md) determines which language is used on a backend level.



We recommend that the [locale](locale.md) is set to the same as is used in the user's phone so that the user is not faced with a mix of languages.

   


## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>locale| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a><br><br>Locale for the user. Defaults to default locale for the user's market. Example: "sv_SE"<br><br>
| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>market| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a><br><br>Market specific code for the user as a ISO 3166-1 country code. Example: "SE"<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/LinkUser.TemporaryUser/TemporaryUser/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[TemporaryUser](-temporary-user.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser/TemporaryUser/#kotlin.String#kotlin.String/PointingToDeclaration/"></a> [common] fun [TemporaryUser](-temporary-user.md)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))Locale for the user.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/LinkUser.TemporaryUser/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.link.ui/LinkUser.TemporaryUser/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.link.ui/LinkUser.TemporaryUser/copy/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser/copy/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [LinkUser.TemporaryUser](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/LinkUser.TemporaryUser/locale/#/PointingToDeclaration/"></a>[locale](locale.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser/locale/#/PointingToDeclaration/"></a> [common] val [locale](locale.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Locale for the user.   <br>
| <a name="com.tink.link.ui/LinkUser.TemporaryUser/market/#/PointingToDeclaration/"></a>[market](market.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser/market/#/PointingToDeclaration/"></a> [common] val [market](market.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Market specific code for the user as a ISO 3166-1 country code.   <br>

