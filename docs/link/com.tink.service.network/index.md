---
title: com.tink.service.network
---
//[link](../../index.html)/[com.tink.service.network](index.html)



# Package com.tink.service.network



## Types


| Name | Summary |
|---|---|
| Environment | [common, androidJvm]<br>[common]<br>sealed class [Environment]([common]-environment/index.html)<br>[androidJvm]<br>sealed class [Environment]([android-jvm]-environment/index.html)<br>Represents the environment you want to connect to. |
| ErrorState | [common, androidJvm]<br>[common]<br>data class [ErrorState]([common]-error-state/index.html)&lt;[T]([common]-error-state/index.html)&gt;(val errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [ResponseState]([common]-response-state/index.html)&lt;[T]([common]-error-state/index.html)&gt; <br>[androidJvm]<br>data class [ErrorState]([android-jvm]-error-state/index.html)&lt;[T]([android-jvm]-error-state/index.html)&gt;(val errorMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [ResponseState]([android-jvm]-response-state/index.html)&lt;[T]([android-jvm]-error-state/index.html)&gt; |
| LoadingState | [common, androidJvm]<br>[common]<br>object [LoadingState]([common]-loading-state/index.html) : [ResponseState]([common]-response-state/index.html)&lt;[Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)&gt; <br>[androidJvm]<br>object [LoadingState]([android-jvm]-loading-state/index.html) : [ResponseState]([android-jvm]-response-state/index.html)&lt;[Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)&gt; |
| ResponseState | [common, androidJvm]<br>[common]<br>sealed class [ResponseState]([common]-response-state/index.html)&lt;out [T]([common]-response-state/index.html)&gt;<br>[androidJvm]<br>sealed class [ResponseState]([android-jvm]-response-state/index.html)&lt;out [T]([android-jvm]-response-state/index.html)&gt; |
| SdkClient | [common, androidJvm]<br>[common]<br>enum [SdkClient]([common]-sdk-client/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SdkClient]([common]-sdk-client/index.html)&gt; <br>[androidJvm]<br>enum [SdkClient]([android-jvm]-sdk-client/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SdkClient]([android-jvm]-sdk-client/index.html)&gt; |
| SdkInformation | [common, androidJvm]<br>[common]<br>data class [SdkInformation]([common]-sdk-information/index.html)(val sdkClient: [SdkClient]([common]-sdk-client/index.html), val version: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[androidJvm]<br>data class [SdkInformation]([android-jvm]-sdk-information/index.html)(val sdkClient: [SdkClient]([android-jvm]-sdk-client/index.html), val version: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| SuccessState | [common, androidJvm]<br>[common]<br>data class [SuccessState]([common]-success-state/index.html)&lt;[T]([common]-success-state/index.html)&gt;(val data: [T]([common]-success-state/index.html)) : [ResponseState]([common]-response-state/index.html)&lt;[T]([common]-success-state/index.html)&gt; <br>[androidJvm]<br>data class [SuccessState]([android-jvm]-success-state/index.html)&lt;[T]([android-jvm]-success-state/index.html)&gt;(val data: [T]([android-jvm]-success-state/index.html)) : [ResponseState]([android-jvm]-response-state/index.html)&lt;[T]([android-jvm]-success-state/index.html)&gt; |
| TinkConfiguration | [common, androidJvm]<br>[common]<br>data class [TinkConfiguration]([common]-tink-configuration/index.html)constructor(val environment: [Environment]([common]-environment/index.html), val oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val redirectUri: &lt;ERROR CLASS&gt;, val callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>[androidJvm]<br>data class [TinkConfiguration]([android-jvm]-tink-configuration/index.html)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(val environment: [Environment]([android-jvm]-environment/index.html), val oAuthClientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val redirectUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), val callbackUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>Configuration for Tink Link |


## Functions


| Name | Summary |
|---|---|
| map | [common, androidJvm]<br>[common]<br>fun &lt;[T]([common]map.html), [R]([common]map.html)&gt; [ResponseState]([common]-response-state/index.html)&lt;[T]([common]map.html)&gt;.[map]([common]map.html)(f: ([T]([common]map.html)) -&gt; [R]([common]map.html)): [ResponseState]([common]-response-state/index.html)&lt;[R]([common]map.html)&gt;<br>[androidJvm]<br>fun &lt;[T]([android-jvm]map.html), [R]([android-jvm]map.html)&gt; [ResponseState]([android-jvm]-response-state/index.html)&lt;[T]([android-jvm]map.html)&gt;.[map]([android-jvm]map.html)(f: ([T]([android-jvm]map.html)) -&gt; [R]([android-jvm]map.html)): [ResponseState]([android-jvm]-response-state/index.html)&lt;[R]([android-jvm]map.html)&gt; |
| withSslKey | [common]<br>fun [Environment.Production]([common]-environment/-production/index.html).[withSslKey]([common]with-ssl-key.html)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom]([common]-environment/-custom/index.html)<br>Creates an environment with the [Environment.Production]([common]-environment/-production/index.html) rest URL and the specified [sslCertificate]([common]with-ssl-key.html).<br>[androidJvm]<br>fun [Environment.Production]([android-jvm]-environment/-production/index.html).[withSslKey]([android-jvm]with-ssl-key.html)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom]([android-jvm]-environment/-custom/index.html)<br>Creates an environment with the [Environment.Production]([android-jvm]-environment/-production/index.html) rest URL and the specified [sslCertificate]([android-jvm]with-ssl-key.html). |


## Properties


| Name | Summary |
|---|---|
| [coreSdkInformation](core-sdk-information.html) | [common]<br>var [coreSdkInformation](core-sdk-information.html): [SdkInformation]([common]-sdk-information/index.html)? = nullvar [coreSdkInformation](core-sdk-information.html): [SdkInformation]([common]-sdk-information/index.html)? = nullvar [coreSdkInformation](core-sdk-information.html): [SdkInformation]([common]-sdk-information/index.html)? = nullvar [coreSdkInformation](core-sdk-information.html): [SdkInformation]([common]-sdk-information/index.html)? = null<br>[androidJvm]<br>var [coreSdkInformation](core-sdk-information.html): [SdkInformation]([android-jvm]-sdk-information/index.html)? = nullvar [coreSdkInformation](core-sdk-information.html): [SdkInformation]([android-jvm]-sdk-information/index.html)? = nullvar [coreSdkInformation](core-sdk-information.html): [SdkInformation]([android-jvm]-sdk-information/index.html)? = null |

