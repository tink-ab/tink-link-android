---
title: Android
---
//[link](../../../../index.html)/[com.tink.model.authentication](../../index.html)/[[androidJvm]ThirdPartyAppAuthentication](../index.html)/[Android](index.html)



# Android



[androidJvm]\
data class [Android](index.html)(val intent: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val requiredMinimumVersion: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

This model contains Android specific information required to launch the third party application.



## Constructors


| | |
|---|---|
| [Android](-android.html) | [androidJvm]<br>fun [Android](-android.html)(intent: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), requiredMinimumVersion: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [intent](intent.html) | [androidJvm]<br>val [intent](intent.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A uri string that can be parsed into [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html) and set as data for the [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html) to launch the third party application. See [Intent.setData](https://developer.android.com/reference/kotlin/android/content/Intent.html#setdata) |
| [packageName](package-name.html) | [androidJvm]<br>val [packageName](package-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The package name of the third party application |
| [requiredMinimumVersion](required-minimum-version.html) | [androidJvm]<br>val [requiredMinimumVersion](required-minimum-version.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The minimum version of the third party application that needs to be installed on the device for the authentication flow |

