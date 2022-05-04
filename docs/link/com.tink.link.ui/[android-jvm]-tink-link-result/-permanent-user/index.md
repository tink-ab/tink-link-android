---
title: PermanentUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]TinkLinkResult](../index.html)/[PermanentUser](index.html)



# PermanentUser



[androidJvm]\
data class [PermanentUser](index.html)(val credentials: Credentials) : [TinkLinkResult](../index.html)

The data returned when a [LinkUser.ExistingUser](../../[android-jvm]-link-user/-existing-user/index.html) or [LinkUser.UnauthenticatedUser](../../[android-jvm]-link-user/-unauthenticated-user/index.html) is used in the Tink Link UI flow.



## Parameters


androidJvm

| | |
|---|---|
| credentials | Credentials connected to the user |



## Constructors


| | |
|---|---|
| [PermanentUser](-permanent-user.html) | [androidJvm]<br>fun [PermanentUser](-permanent-user.html)(credentials: Credentials) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentials](credentials.html) | [androidJvm]<br>val [credentials](credentials.html): Credentials |

