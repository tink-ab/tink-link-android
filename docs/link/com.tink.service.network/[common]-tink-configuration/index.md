---
title: [common]TinkConfiguration
---
//[link](../../../index.html)/[com.tink.service.network](../index.html)/[[common]TinkConfiguration](index.html)



# TinkConfiguration



[common]\
data class [TinkConfiguration](index.html)constructor(val environment: [Environment](../[common]-environment/index.html), val oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val redirectUri: &lt;ERROR CLASS&gt;, val callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)

Configuration for Tink Link



## Parameters


common

| | |
|---|---|
| environment | The environment you want to connect to. Use [Environment.Production](../[common]-environment/-production/index.html) if you are using the Tink environment or add your own with [Environment.Custom](../[common]-environment/-custom/index.html) |
| oAuthClientId | Your client id. You can retrieve it from https://console.tink.com. |
| redirectUri | The URI to redirect back to your app from a browser or third party app. Refer to the third party authorization guide[https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md] for details. |



## Constructors


| | |
|---|---|
| [TinkConfiguration](-tink-configuration.html) | [common]<br>fun [TinkConfiguration](-tink-configuration.html)(environment: [Environment](../[common]-environment/index.html), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: &lt;ERROR CLASS&gt;, callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [callbackUri](callback-uri.html) | [common]<br>val [callbackUri](callback-uri.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [environment](environment.html) | [common]<br>val [environment](environment.html): [Environment](../[common]-environment/index.html) |
| [oAuthClientId](o-auth-client-id.html) | [common]<br>val [oAuthClientId](o-auth-client-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [redirectUri](redirect-uri.html) | [common]<br>val [redirectUri](redirect-uri.html): &lt;ERROR CLASS&gt; |

