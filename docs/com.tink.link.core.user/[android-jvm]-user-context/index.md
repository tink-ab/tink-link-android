---
title: [androidJvm]UserContext -
---
//[link](../../index.md)/[com.tink.link.core.user](../index.md)/[[androidJvm]UserContext](index.md)



# UserContext  
 [androidJvm] interface [UserContext](index.md)

Context for functionality that requires a user to be set.

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.user/UserContext/authorize/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[kotlin.String]/PointingToDeclaration/"></a>[authorize](authorize.md)| <a name="com.tink.link.core.user/UserContext/authorize/#kotlin.collections.Set[com.tink.model.user.Scope]#com.tink.service.handler.ResultHandler[kotlin.String]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [authorize](authorize.md)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[Scope](../../com.tink.model.user/[android-jvm]-scope/index.md)>, resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Authorize your user towards a new set of scopes.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.link.core.user/UserContext/handleUri/#android.net.Uri#com.tink.service.handler.ResultHandler[kotlin.Unit]?/PointingToDeclaration/"></a>[handleUri](handle-uri.md)| <a name="com.tink.link.core.user/UserContext/handleUri/#android.net.Uri#com.tink.service.handler.ResultHandler[kotlin.Unit]?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [handleUri](handle-uri.md)(uri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Handle a third-party callback.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.user/UserContext/credentialsRepository/#/PointingToDeclaration/"></a>[credentialsRepository](credentials-repository.md)| <a name="com.tink.link.core.user/UserContext/credentialsRepository/#/PointingToDeclaration/"></a> [androidJvm] abstract val [credentialsRepository](credentials-repository.md): [CredentialsRepository](../../com.tink.link.core.credentials/[android-jvm]-credentials-repository/index.md)   <br>
| <a name="com.tink.link.core.user/UserContext/providerRepository/#/PointingToDeclaration/"></a>[providerRepository](provider-repository.md)| <a name="com.tink.link.core.user/UserContext/providerRepository/#/PointingToDeclaration/"></a> [androidJvm] abstract val [providerRepository](provider-repository.md): [ProviderRepository](../../com.tink.core.provider/[android-jvm]-provider-repository/index.md)   <br>

