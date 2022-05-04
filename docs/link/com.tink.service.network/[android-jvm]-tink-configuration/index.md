---
title: [androidJvm]TinkConfiguration
---
//[link](../../../index.html)/[com.tink.service.network](../index.html)/[[androidJvm]TinkConfiguration](index.html)



# TinkConfiguration



[androidJvm]\
data class [TinkConfiguration](index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(val environment: [Environment](../[android-jvm]-environment/index.html), val oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val redirectUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), val callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)

Configuration for Tink Link



## Parameters


androidJvm

| | |
|---|---|
| environment | The environment you want to connect to. Use [Environment.Production](../[android-jvm]-environment/-production/index.html) if you are using the Tink environment or add your own with [Environment.Custom](../[android-jvm]-environment/-custom/index.html) |
| oAuthClientId | Your client id. You can retrieve it from https://console.tink.com. |
| redirectUri | The URI to redirect back to your app from a browser or third party app. Refer to the third party authorization guide[https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md] for details. |



## Constructors


| | |
|---|---|
| [TinkConfiguration](-tink-configuration.html) | [androidJvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [TinkConfiguration](-tink-configuration.html)(environment: [Environment](../[android-jvm]-environment/index.html), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [callbackUri](callback-uri.html) | [androidJvm]<br>val [callbackUri](callback-uri.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [environment](environment.html) | [androidJvm]<br>val [environment](environment.html): [Environment](../[android-jvm]-environment/index.html) |
| [oAuthClientId](o-auth-client-id.html) | [androidJvm]<br>val [oAuthClientId](o-auth-client-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [redirectUri](redirect-uri.html) | [androidJvm]<br>val [redirectUri](redirect-uri.html): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html) |

