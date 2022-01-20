---
title: [androidJvm]ProviderRepository -
---
//[link](../../index.md)/[com.tink.core.provider](../index.md)/[[androidJvm]ProviderRepository](index.md)



# ProviderRepository  
 [androidJvm] class [ProviderRepository](index.md)@Inject()constructor(**service**: [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.md))

Repository for retrieving [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.md)s

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.core.provider/ProviderRepository/ProviderRepository/#com.tink.service.provider.ProviderService/PointingToDeclaration/"></a>[ProviderRepository](-provider-repository.md)| <a name="com.tink.core.provider/ProviderRepository/ProviderRepository/#com.tink.service.provider.ProviderService/PointingToDeclaration/"></a> [androidJvm] @Inject()  <br>  <br>fun [ProviderRepository](-provider-repository.md)(service: [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.md))Create a new repository instance from a [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.md).   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.core.provider/ProviderRepository/getProvider/#kotlin.String#com.tink.service.handler.ResultHandler[com.tink.model.provider.Provider?]/PointingToDeclaration/"></a>[getProvider](get-provider.md)| <a name="com.tink.core.provider/ProviderRepository/getProvider/#kotlin.String#com.tink.service.handler.ResultHandler[com.tink.model.provider.Provider?]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getProvider](get-provider.md)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[Provider](../../com.tink.model.provider/[android-jvm]-provider/index.md)?>)  <br>More info  <br>Get the provider with the specified [name](../../com.tink.model.provider/[android-jvm]-provider/name.md).  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.core.provider/ProviderRepository/listProviders/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.provider.Provider]]#com.tink.service.provider.ProviderFilter?/PointingToDeclaration/"></a>[listProviders](list-providers.md)| <a name="com.tink.core.provider/ProviderRepository/listProviders/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.provider.Provider]]#com.tink.service.provider.ProviderFilter?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [listProviders](list-providers.md)(handler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Provider](../../com.tink.model.provider/[android-jvm]-provider/index.md)>>, filter: [ProviderFilter](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md)? = null)  <br>More info  <br>List all providers on the current market.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

