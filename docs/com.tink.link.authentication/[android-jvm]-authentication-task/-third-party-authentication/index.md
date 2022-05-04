---
title: ThirdPartyAuthentication
---
//[link](../../../../index.html)/[com.tink.link.authentication](../../index.html)/[[androidJvm]AuthenticationTask](../index.html)/[ThirdPartyAuthentication](index.html)



# ThirdPartyAuthentication



[androidJvm]\
data class [ThirdPartyAuthentication](index.html)(credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [AuthenticationTask](../index.html)

Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](launch.html), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](third-party-app-authentication.html)



## Constructors


| | |
|---|---|
| [ThirdPartyAuthentication](-third-party-authentication.html) | [androidJvm]<br>fun [ThirdPartyAuthentication](-third-party-authentication.html)(credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) |


## Types


| Name | Summary |
|---|---|
| [LaunchResult](-launch-result/index.html) | [androidJvm]<br>sealed class [LaunchResult](-launch-result/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Indicates if the user was successfully redirected when [launch](launch.html) was called. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isNewerThan](../is-newer-than.html) | [androidJvm]<br>fun [isNewerThan](../is-newer-than.html)(other: [AuthenticationTask](../index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Helper function comparing two [AuthenticationTask](../index.html)s to see if one is newer than that the other. This can be used to determine if a new update should be sent. This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise. |
| [launch](launch.html) | [androidJvm]<br>fun [launch](launch.html)(activity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)): [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](-launch-result/index.html)<br>Try to redirect the user to the third party app for authentication. |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [thirdPartyAppAuthentication](third-party-app-authentication.html) | [androidJvm]<br>val [thirdPartyAppAuthentication](third-party-app-authentication.html): [ThirdPartyAppAuthentication](../../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.html) |

