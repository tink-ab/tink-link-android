---
title: [androidJvm]RefreshCredential
---
//[link](../../../index.html)/[com.tink.model.credentials](../index.html)/[[androidJvm]RefreshCredential](index.html)



# RefreshCredential



[androidJvm]\
data class [RefreshCredential](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val provider: [RefreshProvider](../../com.tink.model.provider/[android-jvm]-refresh-provider/index.html), val sessionExpiryDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [RefreshCredential](-refresh-credential.html) | [androidJvm]<br>fun [RefreshCredential](-refresh-credential.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), provider: [RefreshProvider](../../com.tink.model.provider/[android-jvm]-refresh-provider/index.html), sessionExpiryDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [provider](provider.html) | [androidJvm]<br>val [provider](provider.html): [RefreshProvider](../../com.tink.model.provider/[android-jvm]-refresh-provider/index.html) |
| [sessionExpiryDate](session-expiry-date.html) | [androidJvm]<br>val [sessionExpiryDate](session-expiry-date.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |

