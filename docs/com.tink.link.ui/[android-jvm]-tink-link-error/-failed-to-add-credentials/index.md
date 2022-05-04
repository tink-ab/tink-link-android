---
title: FailedToAddCredentials
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]TinkLinkError](../index.html)/[FailedToAddCredentials](index.html)



# FailedToAddCredentials



[androidJvm]\
data class [FailedToAddCredentials](index.html)(val errorsByCredentialsId: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../../[android-jvm]-tink-link-error-info/index.html)&gt;) : [TinkLinkError](../index.html)

Tink Link UI failed to add one or more credentials.



## Constructors


| | |
|---|---|
| [FailedToAddCredentials](-failed-to-add-credentials.html) | [androidJvm]<br>fun [FailedToAddCredentials](-failed-to-add-credentials.html)(errorsByCredentialsId: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../../[android-jvm]-tink-link-error-info/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [errorsByCredentialsId](errors-by-credentials-id.html) | [androidJvm]<br>val [errorsByCredentialsId](errors-by-credentials-id.html): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../../[android-jvm]-tink-link-error-info/index.html)&gt;<br>A map of failed credentials ids to [errors](../../[android-jvm]-tink-link-error-info/index.html) |

