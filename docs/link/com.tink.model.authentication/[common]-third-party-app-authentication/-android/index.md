---
title: Android
---
//[link](../../../../index.html)/[com.tink.model.authentication](../../index.html)/[[common]ThirdPartyAppAuthentication](../index.html)/[Android](index.html)



# Android



[common]\
data class [Android](index.html)(val intent: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val requiredMinimumVersion: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

This model contains Android specific information required to launch the third party application.



## Constructors


| | |
|---|---|
| [Android](-android.html) | [common]<br>fun [Android](-android.html)(intent: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), requiredMinimumVersion: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [intent](intent.html) | [common]<br>val [intent](intent.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A uri string that can be parsed into Uri and set as data for the Intent to launch the third party application. See Intent.setData |
| [packageName](package-name.html) | [common]<br>val [packageName](package-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The package name of the third party application |
| [requiredMinimumVersion](required-minimum-version.html) | [common]<br>val [requiredMinimumVersion](required-minimum-version.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The minimum version of the third party application that needs to be installed on the device for the authentication flow |

