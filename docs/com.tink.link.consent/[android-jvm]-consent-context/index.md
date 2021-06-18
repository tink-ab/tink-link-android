//[link](../../index.md)/[com.tink.link.consent](../index.md)/[[androidJvm]ConsentContext](index.md)



# ConsentContext  
 [androidJvm] class [ConsentContext](index.md)(**consentService**: [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.md), **dispatcher**: CoroutineDispatcher)

Context for handling things around user consent.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService/PointingToDeclaration/"></a>[ConsentContext](-consent-context.md)| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService/PointingToDeclaration/"></a> [androidJvm] @Inject()  <br>  <br>fun [ConsentContext](-consent-context.md)(consentService: [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.md))   <br>
| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>[ConsentContext](-consent-context.md)| <a name="com.tink.link.consent/ConsentContext/ConsentContext/#com.tink.service.consent.ConsentService#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a> [androidJvm] fun [ConsentContext](-consent-context.md)(consentService: [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.md), dispatcher: CoroutineDispatcher)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a>[describeClient](describe-client.md)| <a name="com.tink.link.consent/ConsentContext/describeClient/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[com.tink.model.consent.OAuthClientDescription]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [describeClient](describe-client.md)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[Scope](../../com.tink.model.user/[android-jvm]-scope/index.md)>, resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[OAuthClientDescription](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.md)>)  <br>More info  <br>Get the [client description](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.md) for a client with the provided scopes.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link.consent/ConsentContext/privacyPolicy/#java.util.Locale/PointingToDeclaration/"></a>[privacyPolicy](privacy-policy.md)| <a name="com.tink.link.consent/ConsentContext/privacyPolicy/#java.util.Locale/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [privacyPolicy](privacy-policy.md)(locale: [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) = Locale.getDefault()): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)  <br>More info  <br>Get a link to the Privacy Policy for Tink Link.  <br><br><br>
| <a name="com.tink.link.consent/ConsentContext/termsAndConditions/#java.util.Locale/PointingToDeclaration/"></a>[termsAndConditions](terms-and-conditions.md)| <a name="com.tink.link.consent/ConsentContext/termsAndConditions/#java.util.Locale/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [termsAndConditions](terms-and-conditions.md)(locale: [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) = Locale.getDefault()): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)  <br>More info  <br>Get a link to the Terms & Conditions for Tink Link.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

