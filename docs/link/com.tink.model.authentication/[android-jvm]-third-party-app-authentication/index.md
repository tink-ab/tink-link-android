---
title: [androidJvm]ThirdPartyAppAuthentication
---
//[link](../../../index.html)/[com.tink.model.authentication](../index.html)/[[androidJvm]ThirdPartyAppAuthentication](index.html)



# ThirdPartyAppAuthentication



[androidJvm]\
data class [ThirdPartyAppAuthentication](index.html)(val downloadMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val downloadTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val android: [ThirdPartyAppAuthentication.Android](-android/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

This model contains information required for third party authentication flow.



## Constructors


| | |
|---|---|
| [ThirdPartyAppAuthentication](-third-party-app-authentication.html) | [androidJvm]<br>fun [ThirdPartyAppAuthentication](-third-party-app-authentication.html)(downloadMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), downloadTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), upgradeMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), upgradeTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), android: [ThirdPartyAppAuthentication.Android](-android/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [Android](-android/index.html) | [androidJvm]<br>data class [Android](-android/index.html)(val intent: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val requiredMinimumVersion: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This model contains Android specific information required to launch the third party application. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [android](android.html) | [androidJvm]<br>val [android](android.html): [ThirdPartyAppAuthentication.Android](-android/index.html)? = null<br>The object containing Android specific information required to launch the third party application. |
| [downloadMessage](download-message.html) | [androidJvm]<br>val [downloadMessage](download-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A user-friendly text requesting the user to download the application for third party app authentication |
| [downloadTitle](download-title.html) | [androidJvm]<br>val [downloadTitle](download-title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The title of the download application prompt shown to the users |
| [upgradeMessage](upgrade-message.html) | [androidJvm]<br>val [upgradeMessage](upgrade-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A user-friendly text requesting the user to upgrade the application for third party app authentication |
| [upgradeTitle](upgrade-title.html) | [androidJvm]<br>val [upgradeTitle](upgrade-title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The title of the upgrade application prompt shown to the users |

