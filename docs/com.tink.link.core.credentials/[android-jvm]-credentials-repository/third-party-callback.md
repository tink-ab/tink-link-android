//[link](../../index.md)/[com.tink.link.core.credentials](../index.md)/[[androidJvm]CredentialsRepository](index.md)/[thirdPartyCallback](third-party-callback.md)



# thirdPartyCallback  
[androidJvm]  
Content  
fun [thirdPartyCallback](third-party-callback.md)(state: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parameters: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, handler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>)  
More info  


Sends the third party callback information from an Account Servicing Payment Service Provider (ASPSP).



This is usually done inside the TinkLink framework and it should normally not be necessary to do this on your own.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsRepository/thirdPartyCallback/#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a>state| <a name="com.tink.link.core.credentials/CredentialsRepository/thirdPartyCallback/#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a><br><br>The value corresponding to the state key from the received callback parameters.<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/thirdPartyCallback/#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a>parameters| <a name="com.tink.link.core.credentials/CredentialsRepository/thirdPartyCallback/#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a><br><br>The map of key and value pairs, other than state from the received callback parameters.<br><br>
| <a name="com.tink.link.core.credentials/CredentialsRepository/thirdPartyCallback/#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a>handler| <a name="com.tink.link.core.credentials/CredentialsRepository/thirdPartyCallback/#kotlin.String#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a><br><br>The [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md) for processing error and success callbacks<br><br>
  
  



