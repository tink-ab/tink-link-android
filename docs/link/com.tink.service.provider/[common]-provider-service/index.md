---
title: [common]ProviderService
---
//[link](../../../index.html)/[com.tink.service.provider](../index.html)/[[common]ProviderService](index.html)



# ProviderService



[common]\
interface [ProviderService](index.html)



## Functions


| Name | Summary |
|---|---|
| [getProvider](get-provider.html) | [common]<br>abstract suspend fun [getProvider](get-provider.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Provider](../../com.tink.model.provider/[common]-provider/index.html)? |
| [listProviders](list-providers.html) | [common]<br>abstract suspend fun [listProviders](list-providers.html)(filter: [ProviderFilter](../[common]-provider-filter/index.html)?): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider](../../com.tink.model.provider/[common]-provider/index.html)&gt; |
| [listSuggestions](list-suggestions.html) | [common]<br>abstract suspend fun [listSuggestions](list-suggestions.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider](../../com.tink.model.provider/[common]-provider/index.html)&gt; |

