---
title: TinkConfiguration
---
//[link](../../../index.html)/[com.tink.service.network](../index.html)/[[common]TinkConfiguration](index.html)/[TinkConfiguration](-tink-configuration.html)



# TinkConfiguration



[common]\
fun [TinkConfiguration](-tink-configuration.html)(environment: [Environment](../[common]-environment/index.html), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: &lt;ERROR CLASS&gt;, callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)



## Parameters


common

| | |
|---|---|
| environment | The environment you want to connect to. Use [Environment.Production](../[common]-environment/-production/index.html) if you are using the Tink environment or add your own with [Environment.Custom](../[common]-environment/-custom/index.html) |
| oAuthClientId | Your client id. You can retrieve it from https://console.tink.com. |
| redirectUri | The URI to redirect back to your app from a browser or third party app. Refer to the third party authorization guide[https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md] for details. |




