---
title: [androidJvm]CredentialsOperationArgs
---
//[link](../../../index.html)/[com.tink.link.ui.credentials](../index.html)/[[androidJvm]CredentialsOperationArgs](index.html)



# CredentialsOperationArgs



[androidJvm]\
sealed class [CredentialsOperationArgs](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Types


| Name | Summary |
|---|---|
| [Authenticate](-authenticate/index.html) | [androidJvm]<br>data class [Authenticate](-authenticate/index.html)(val provider: [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [CredentialsOperationArgs](index.html) |
| [Create](-create/index.html) | [androidJvm]<br>data class [Create](-create/index.html)(val provider: [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html)) : [CredentialsOperationArgs](index.html) |
| [Refresh](-refresh/index.html) | [androidJvm]<br>data class [Refresh](-refresh/index.html)(val provider: [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html), val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [CredentialsOperationArgs](index.html) |
| [Update](-update/index.html) | [androidJvm]<br>data class [Update](-update/index.html)(val provider: [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [CredentialsOperationArgs](index.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [provider](provider.html) | [androidJvm]<br>abstract val [provider](provider.html): [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html) |


## Inheritors


| Name |
|---|
| Create |
| Update |
| Refresh |
| Authenticate |
