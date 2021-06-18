//[link](../../index.md)/[com.tink.link.consent](../index.md)/[[common]ConsentContext](index.md)



# ConsentContext  
 [common] class [ConsentContext](index.md)(**consentService**: [ConsentService](../../com.tink.service.consent/[common]-consent-service/index.md), **dispatcher**: <ERROR CLASS>)

Context for handling things around user consent.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService/PointingToDeclaration/"></a>[ConsentContext](-consent-context.md)| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService/PointingToDeclaration/"></a> [common] fun [ConsentContext](-consent-context.md)(consentService: [ConsentService](../../com.tink.service.consent/[common]-consent-service/index.md))   <br>
| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService#/PointingToDeclaration/"></a>[ConsentContext](-consent-context.md)| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService#/PointingToDeclaration/"></a> [common] fun [ConsentContext](-consent-context.md)(consentService: [ConsentService](../../com.tink.service.consent/[common]-consent-service/index.md), dispatcher: <ERROR CLASS>)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a>[describeClient](describe-client.md)| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [describeClient](describe-client.md)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[Scope](../../com.tink.model.user/[common]-scope/index.md)>, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[OAuthClientDescription](../../com.tink.model.consent/[common]-o-auth-client-description/index.md)>)  <br>More info  <br>Get the [client description](../../com.tink.model.consent/[common]-o-auth-client-description/index.md) for a client with the provided scopes.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link.consent/ConsentContext/privacyPolicy/#/PointingToDeclaration/"></a>[privacyPolicy](privacy-policy.md)| <a name="com.tink.link.consent/ConsentContext/privacyPolicy/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [privacyPolicy](privacy-policy.md)(locale: <ERROR CLASS> = Locale.getDefault()): <ERROR CLASS>  <br>More info  <br>Get a link to the Privacy Policy for Tink Link.  <br><br><br>
| <a name="com.tink.link.consent/ConsentContext/termsAndConditions/#/PointingToDeclaration/"></a>[termsAndConditions](terms-and-conditions.md)| <a name="com.tink.link.consent/ConsentContext/termsAndConditions/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [termsAndConditions](terms-and-conditions.md)(locale: <ERROR CLASS> = Locale.getDefault()): <ERROR CLASS>  <br>More info  <br>Get a link to the Terms & Conditions for Tink Link.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

