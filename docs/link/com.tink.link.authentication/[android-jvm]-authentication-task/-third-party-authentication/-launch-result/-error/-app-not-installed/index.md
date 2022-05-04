---
title: AppNotInstalled
---
//[link](../../../../../../../index.html)/[com.tink.link.authentication](../../../../../index.html)/[[androidJvm]AuthenticationTask](../../../../index.html)/[ThirdPartyAuthentication](../../../index.html)/[LaunchResult](../../index.html)/[Error](../index.html)/[AppNotInstalled](index.html)



# AppNotInstalled



[androidJvm]\
data class [AppNotInstalled](index.html)(val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](../index.html)

The app necessary for authentication is not installed on the user's device.



Properties [packageName](package-name.html), [title](title.html), and [message](message.html) can be used for example to show a dialog to the user prompting to install the app.



## Constructors


| | |
|---|---|
| [AppNotInstalled](-app-not-installed.html) | [androidJvm]<br>fun [AppNotInstalled](-app-not-installed.html)(packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [message](message.html) | [androidJvm]<br>open override val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.html) | [androidJvm]<br>open override val [packageName](package-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [title](title.html) | [androidJvm]<br>open override val [title](title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

