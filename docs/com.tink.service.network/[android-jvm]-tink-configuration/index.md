//[link](../../index.md)/[com.tink.service.network](../index.md)/[[androidJvm]TinkConfiguration](index.md)



# TinkConfiguration  
 [androidJvm] data class [TinkConfiguration](index.md)(**environment**: [Environment](../[android-jvm]-environment/index.md), **oAuthClientId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **redirectUri**: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html))

Configuration for Tink Link

   


## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>environment| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a><br><br>The environment you want to connect to. Use [Environment.Production](../[android-jvm]-environment/-production/index.md) if you are using the Tink environment or add your own with [Environment.Custom](../[android-jvm]-environment/-custom/index.md)<br><br>
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>oAuthClientId| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a><br><br>Your client id. You can retrieve it from https://console.tink.com.<br><br>
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>redirectUri| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a><br><br>The URI to redirect back to your app from a browser or third party app. Refer to the third party authorization guide[https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md] for details.<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration/TinkConfiguration/#com.tink.service.network.Environment#kotlin.String#android.net.Uri/PointingToDeclaration/"></a>[TinkConfiguration](-tink-configuration.md)| <a name="com.tink.service.network/TinkConfiguration/TinkConfiguration/#com.tink.service.network.Environment#kotlin.String#android.net.Uri/PointingToDeclaration/"></a> [androidJvm] fun [TinkConfiguration](-tink-configuration.md)(environment: [Environment](../[android-jvm]-environment/index.md), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html))The environment you want to connect to.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.service.network/TinkConfiguration/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [Environment](../[android-jvm]-environment/index.md)  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.service.network/TinkConfiguration/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.service.network/TinkConfiguration/component3/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component3](component3.md)(): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration/copy/#com.tink.service.network.Environment#kotlin.String#android.net.Uri/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.service.network/TinkConfiguration/copy/#com.tink.service.network.Environment#kotlin.String#android.net.Uri/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(environment: [Environment](../[android-jvm]-environment/index.md), oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)): [TinkConfiguration](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/TinkConfiguration/environment/#/PointingToDeclaration/"></a>[environment](environment.md)| <a name="com.tink.service.network/TinkConfiguration/environment/#/PointingToDeclaration/"></a> [androidJvm] val [environment](environment.md): [Environment](../[android-jvm]-environment/index.md)The environment you want to connect to.   <br>
| <a name="com.tink.service.network/TinkConfiguration/oAuthClientId/#/PointingToDeclaration/"></a>[oAuthClientId](o-auth-client-id.md)| <a name="com.tink.service.network/TinkConfiguration/oAuthClientId/#/PointingToDeclaration/"></a> [androidJvm] val [oAuthClientId](o-auth-client-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Your client id.   <br>
| <a name="com.tink.service.network/TinkConfiguration/redirectUri/#/PointingToDeclaration/"></a>[redirectUri](redirect-uri.md)| <a name="com.tink.service.network/TinkConfiguration/redirectUri/#/PointingToDeclaration/"></a> [androidJvm] val [redirectUri](redirect-uri.md): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)The URI to redirect back to your app from a browser or third party app.   <br>

