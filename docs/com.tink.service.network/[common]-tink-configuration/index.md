---
title: [common]TinkConfiguration -
---
//[link](../../index.md)/[com.tink.service.network](../index.md)/[[common]TinkConfiguration](index.md)



# TinkConfiguration  
 [common] data class [TinkConfiguration](index.md)(**environment**: [Environment](../[common]-environment/index.md), **oAuthClientId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **redirectUri**: <ERROR CLASS>)

Configuration for Tink Link

   


## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>environment| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a><br><br>The environment you want to connect to. Use [Environment.Production](../[common]-environment/-production/index.md) if you are using the Tink environment or add your own with [Environment.Custom](../[common]-environment/-custom/index.md)<br><br>
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>oAuthClientId| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a><br><br>Your client id. You can retrieve it from https://console.tink.com.<br><br>
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>redirectUri| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a><br><br>The URI to redirect back to your app from a browser or third party app. Refer to the third party authorization guide[https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md] for details.<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration/TinkConfiguration/#com.tink.service.network.Environment#kotlin.String#/PointingToDeclaration/"></a>[TinkConfiguration](-tink-configuration.md)| <a name="com.tink.service.network/TinkConfiguration/TinkConfiguration/#com.tink.service.network.Environment#kotlin.String#/PointingToDeclaration/"></a> [common] fun [TinkConfiguration](-tink-configuration.md)(environment: [Environment](../[common]-environment/index.md), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: <ERROR CLASS>)The environment you want to connect to.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.service.network/TinkConfiguration/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [Environment](../[common]-environment/index.md)  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.service.network/TinkConfiguration/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.service.network/TinkConfiguration/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component3](component3.md)(): <ERROR CLASS>  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration/copy/#com.tink.service.network.Environment#kotlin.String#/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.service.network/TinkConfiguration/copy/#com.tink.service.network.Environment#kotlin.String#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(environment: [Environment](../[common]-environment/index.md), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: <ERROR CLASS>): [TinkConfiguration](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration/environment/#/PointingToDeclaration/"></a>[environment](environment.md)| <a name="com.tink.service.network/TinkConfiguration/environment/#/PointingToDeclaration/"></a> [common] val [environment](environment.md): [Environment](../[common]-environment/index.md)The environment you want to connect to.   <br>
| <a name="com.tink.service.network/TinkConfiguration/oAuthClientId/#/PointingToDeclaration/"></a>[oAuthClientId](o-auth-client-id.md)| <a name="com.tink.service.network/TinkConfiguration/oAuthClientId/#/PointingToDeclaration/"></a> [common] val [oAuthClientId](o-auth-client-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Your client id.   <br>
| <a name="com.tink.service.network/TinkConfiguration/redirectUri/#/PointingToDeclaration/"></a>[redirectUri](redirect-uri.md)| <a name="com.tink.service.network/TinkConfiguration/redirectUri/#/PointingToDeclaration/"></a> [common] val [redirectUri](redirect-uri.md): <ERROR CLASS>The URI to redirect back to your app from a browser or third party app.   <br>

