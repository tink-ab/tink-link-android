---
title: [androidJvm]ProviderRepository
---
//[link](../../../index.html)/[com.tink.core.provider](../index.html)/[[androidJvm]ProviderRepository](index.html)



# ProviderRepository



[androidJvm]\
class [ProviderRepository](index.html)@Injectconstructor(service: [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.html))

Repository for retrieving [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html)s



## Constructors


| | |
|---|---|
| [ProviderRepository](-provider-repository.html) | [androidJvm]<br>@Inject<br>fun [ProviderRepository](-provider-repository.html)(service: [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.html))<br>Create a new repository instance from a [ProviderService](../../com.tink.service.provider/[android-jvm]-provider-service/index.html). This is usually done inside the TinkLink framework and it should normally not be necessary to create your own instance. |


## Functions


| Name | Summary |
|---|---|
| [getProvider](get-provider.html) | [androidJvm]<br>fun [getProvider](get-provider.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html)?&gt;)<br>Get the provider with the specified [name](../../com.tink.model.provider/[android-jvm]-provider/name.html). null will be passed to the [resultHandler](get-provider.html) in case no provider with this name could be found. |
| [listProviders](list-providers.html) | [androidJvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [listProviders](list-providers.html)(handler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html)&gt;&gt;, filter: [ProviderFilter](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html)? = null)<br>List all providers on the current market. The result will already be filtered to only contain providers that are [enabled](../../com.tink.model.provider/[android-jvm]-provider/-status/-e-n-a-b-l-e-d/index.html) |

