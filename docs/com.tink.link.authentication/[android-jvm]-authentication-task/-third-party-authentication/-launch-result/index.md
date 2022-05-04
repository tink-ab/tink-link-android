---
title: LaunchResult
---
//[link](../../../../../index.html)/[com.tink.link.authentication](../../../index.html)/[[androidJvm]AuthenticationTask](../../index.html)/[ThirdPartyAuthentication](../index.html)/[LaunchResult](index.html)



# LaunchResult



[androidJvm]\
sealed class [LaunchResult](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Indicates if the user was successfully redirected when [launch](../launch.html) was called.



Possible values are [Success](-success/index.html) and [Error](-error/index.html)



## Types


| Name | Summary |
|---|---|
| [Error](-error/index.html) | [androidJvm]<br>sealed class [Error](-error/index.html) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](index.html)<br>There was an error when launching the third party app. |
| [Success](-success/index.html) | [androidJvm]<br>object [Success](-success/index.html) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](index.html)<br>The user has successfully been redirected to the third party app. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| Success |
| Error |

