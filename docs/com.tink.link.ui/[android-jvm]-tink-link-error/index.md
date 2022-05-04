---
title: [androidJvm]TinkLinkError
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[androidJvm]TinkLinkError](index.html)



# TinkLinkError



[androidJvm]\
sealed class [TinkLinkError](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Represents errors that happen during the Tink Link UI flow.



## Types


| Name | Summary |
|---|---|
| [CredentialsNotFound](-credentials-not-found/index.html) | [androidJvm]<br>data class [CredentialsNotFound](-credentials-not-found/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkError](index.html)<br>Tink Link UI is unable to fetch the credentials with the specified [credentialsId](-credentials-not-found/credentials-id.html). |
| [FailedToAddCredentials](-failed-to-add-credentials/index.html) | [androidJvm]<br>data class [FailedToAddCredentials](-failed-to-add-credentials/index.html)(val errorsByCredentialsId: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../[android-jvm]-tink-link-error-info/index.html)&gt;) : [TinkLinkError](index.html)<br>Tink Link UI failed to add one or more credentials. |
| [InternalError](-internal-error/index.html) | [androidJvm]<br>object [InternalError](-internal-error/index.html) : [TinkLinkError](index.html)<br>An internal error occurred in the Tink Link UI flow. |
| [ProviderListEmpty](-provider-list-empty/index.html) | [androidJvm]<br>object [ProviderListEmpty](-provider-list-empty/index.html) : [TinkLinkError](index.html)<br>Tink Link UI fetched an empty list of providers |
| [ProviderNotFound](-provider-not-found/index.html) | [androidJvm]<br>data class [ProviderNotFound](-provider-not-found/index.html)(val providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkError](index.html)<br>Tink Link UI is unable to fetch the provider with the specified [providerName](-provider-not-found/provider-name.html). |
| [UnableToFetchProviders](-unable-to-fetch-providers/index.html) | [androidJvm]<br>object [UnableToFetchProviders](-unable-to-fetch-providers/index.html) : [TinkLinkError](index.html)<br>Tink Link UI is unable to fetch providers. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| UnableToFetchProviders |
| ProviderNotFound |
| ProviderListEmpty |
| CredentialsNotFound |
| FailedToAddCredentials |
| InternalError |

