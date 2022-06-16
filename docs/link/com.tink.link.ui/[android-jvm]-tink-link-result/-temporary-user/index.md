---
title: TemporaryUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]TinkLinkResult](../index.html)/[TemporaryUser](index.html)



# TemporaryUser



[androidJvm]\
data class [TemporaryUser](index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [TinkLinkResult](../index.html)

The data returned when a [LinkUser.TemporaryUser](../../[android-jvm]-link-user/-temporary-user/index.html) is used in the Tink Link UI flow.



## Parameters


androidJvm

| | |
|---|---|
| authorizationCode | Authorization code from authorizing the user towards a new set of scopes |
| credentials | [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html) connected to the user |



## Constructors


| | |
|---|---|
| [TemporaryUser](-temporary-user.html) | [androidJvm]<br>fun [TemporaryUser](-temporary-user.html)(authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authorizationCode](authorization-code.html) | [androidJvm]<br>val [authorizationCode](authorization-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [credentials](credentials.html) | [androidJvm]<br>val [credentials](credentials.html): [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html) |

