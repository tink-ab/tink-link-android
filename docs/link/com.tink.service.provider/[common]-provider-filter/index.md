---
title: [common]ProviderFilter
---
//[link](../../../index.html)/[com.tink.service.provider](../index.html)/[[common]ProviderFilter](index.html)



# ProviderFilter



[common]\
data class [ProviderFilter](index.html)(val includeDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, val includeNonDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, val requireCapability: [Provider.Capability](../../com.tink.model.provider/[common]-provider/-capability/index.html)? = null)

A filter to describe which providers should be included in the response



## Constructors


| | |
|---|---|
| [ProviderFilter](-provider-filter.html) | [common]<br>fun [ProviderFilter](-provider-filter.html)(includeDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, includeNonDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, requireCapability: [Provider.Capability](../../com.tink.model.provider/[common]-provider/-capability/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [includeDemoProviders](include-demo-providers.html) | [common]<br>val [includeDemoProviders](include-demo-providers.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>If set to true, providers of type [TEST](../../com.tink.model.provider/[common]-provider/-type/-t-e-s-t/index.html) will be added in the response list. Default: false |
| [includeNonDemoProviders](include-non-demo-providers.html) | [common]<br>val [includeNonDemoProviders](include-non-demo-providers.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>If set to false, providers with a type different than [TEST](../../com.tink.model.provider/[common]-provider/-type/-t-e-s-t/index.html) will be removed from the response list. Default: true |
| [requireCapability](require-capability.html) | [common]<br>val [requireCapability](require-capability.html): [Provider.Capability](../../com.tink.model.provider/[common]-provider/-capability/index.html)? = null<br>Use the capability to only list providers with a specific capability. By default the list will not be filtered by capability |

