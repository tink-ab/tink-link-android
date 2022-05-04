---
title: UnauthenticatedUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]LinkUser](../index.html)/[UnauthenticatedUser](index.html)



# UnauthenticatedUser



[androidJvm]\
data class [UnauthenticatedUser](index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](../index.html)

Pass this to the [TinkLinkUiActivity.createIntent](../../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate the permanent user to be used in the flow.



## Parameters


androidJvm

| | |
|---|---|
| authorizationCode | The authorization code from delegation to use for authentication |



## Constructors


| | |
|---|---|
| [UnauthenticatedUser](-unauthenticated-user.html) | [androidJvm]<br>fun [UnauthenticatedUser](-unauthenticated-user.html)(authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authorizationCode](authorization-code.html) | [androidJvm]<br>val [authorizationCode](authorization-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

