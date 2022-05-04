---
title: AppNeedsUpgrade
---
//[link](../../../../../../../index.html)/[com.tink.link.authentication](../../../../../index.html)/[[androidJvm]AuthenticationTask](../../../../index.html)/[ThirdPartyAuthentication](../../../index.html)/[LaunchResult](../../index.html)/[Error](../index.html)/[AppNeedsUpgrade](index.html)



# AppNeedsUpgrade



[androidJvm]\
data class [AppNeedsUpgrade](index.html)(val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](../index.html)

The app necessary for authentication is installed on the users device but needs to be updated.



Properties [packageName](package-name.html), [title](title.html), and [message](message.html) can be used for example to show a dialog to the user prompting to upgrade the app.



## Constructors


| | |
|---|---|
| [AppNeedsUpgrade](-app-needs-upgrade.html) | [androidJvm]<br>fun [AppNeedsUpgrade](-app-needs-upgrade.html)(packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [message](message.html) | [androidJvm]<br>open override val [message](message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [packageName](package-name.html) | [androidJvm]<br>open override val [packageName](package-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [title](title.html) | [androidJvm]<br>open override val [title](title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

