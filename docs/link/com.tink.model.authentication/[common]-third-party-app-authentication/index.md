---
title: [common]ThirdPartyAppAuthentication
---
//[link](../../../index.html)/[com.tink.model.authentication](../index.html)/[[common]ThirdPartyAppAuthentication](index.html)



# ThirdPartyAppAuthentication



[common]\
data class [ThirdPartyAppAuthentication](index.html)(val downloadMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val downloadTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val android: [ThirdPartyAppAuthentication.Android](-android/index.html)? = null)

This model contains information required for third party authentication flow.



## Constructors


| | |
|---|---|
| [ThirdPartyAppAuthentication](-third-party-app-authentication.html) | [common]<br>fun [ThirdPartyAppAuthentication](-third-party-app-authentication.html)(downloadMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), downloadTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), upgradeMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), upgradeTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), android: [ThirdPartyAppAuthentication.Android](-android/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [Android](-android/index.html) | [common]<br>data class [Android](-android/index.html)(val intent: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val requiredMinimumVersion: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>This model contains Android specific information required to launch the third party application. |


## Properties


| Name | Summary |
|---|---|
| [android](android.html) | [common]<br>val [android](android.html): [ThirdPartyAppAuthentication.Android](-android/index.html)? = null<br>The object containing Android specific information required to launch the third party application. |
| [downloadMessage](download-message.html) | [common]<br>val [downloadMessage](download-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A user-friendly text requesting the user to download the application for third party app authentication |
| [downloadTitle](download-title.html) | [common]<br>val [downloadTitle](download-title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The title of the download application prompt shown to the users |
| [upgradeMessage](upgrade-message.html) | [common]<br>val [upgradeMessage](upgrade-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A user-friendly text requesting the user to upgrade the application for third party app authentication |
| [upgradeTitle](upgrade-title.html) | [common]<br>val [upgradeTitle](upgrade-title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The title of the upgrade application prompt shown to the users |

