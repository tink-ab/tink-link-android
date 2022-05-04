---
title: [androidJvm]ProviderFilter
---
//[link](../../../index.html)/[com.tink.service.provider](../index.html)/[[androidJvm]ProviderFilter](index.html)



# ProviderFilter



[androidJvm]\
data class [ProviderFilter](index.html)(val includeDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, val includeNonDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, val requireCapability: [Provider.Capability](../../com.tink.model.provider/[android-jvm]-provider/-capability/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

A filter to describe which providers should be included in the response



## Constructors


| | |
|---|---|
| [ProviderFilter](-provider-filter.html) | [androidJvm]<br>fun [ProviderFilter](-provider-filter.html)(includeDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, includeNonDemoProviders: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, requireCapability: [Provider.Capability](../../com.tink.model.provider/[android-jvm]-provider/-capability/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [includeDemoProviders](include-demo-providers.html) | [androidJvm]<br>val [includeDemoProviders](include-demo-providers.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>If set to true, providers of type [TEST](../../com.tink.model.provider/[android-jvm]-provider/-type/-t-e-s-t/index.html) will be added in the response list. Default: false |
| [includeNonDemoProviders](include-non-demo-providers.html) | [androidJvm]<br>val [includeNonDemoProviders](include-non-demo-providers.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>If set to false, providers with a type different than [TEST](../../com.tink.model.provider/[android-jvm]-provider/-type/-t-e-s-t/index.html) will be removed from the response list. Default: true |
| [requireCapability](require-capability.html) | [androidJvm]<br>val [requireCapability](require-capability.html): [Provider.Capability](../../com.tink.model.provider/[android-jvm]-provider/-capability/index.html)? = null<br>Use the capability to only list providers with a specific capability. By default the list will not be filtered by capability |

