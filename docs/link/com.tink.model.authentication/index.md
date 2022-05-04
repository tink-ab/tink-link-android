---
title: com.tink.model.authentication
---
//[link](../../index.html)/[com.tink.model.authentication](index.html)



# Package com.tink.model.authentication



## Types


| Name | Summary |
|---|---|
| AuthenticationMethod | [common, androidJvm]<br>[common]<br>enum [AuthenticationMethod]([common]-authentication-method/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[AuthenticationMethod]([common]-authentication-method/index.html)&gt; <br>[androidJvm]<br>enum [AuthenticationMethod]([android-jvm]-authentication-method/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[AuthenticationMethod]([android-jvm]-authentication-method/index.html)&gt; |
| ThirdPartyAppAuthentication | [common, androidJvm]<br>[common]<br>data class [ThirdPartyAppAuthentication]([common]-third-party-app-authentication/index.html)(val downloadMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val downloadTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val android: [ThirdPartyAppAuthentication.Android]([common]-third-party-app-authentication/-android/index.html)? = null)<br>[androidJvm]<br>data class [ThirdPartyAppAuthentication]([android-jvm]-third-party-app-authentication/index.html)(val downloadMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val downloadTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val upgradeTitle: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val android: [ThirdPartyAppAuthentication.Android]([android-jvm]-third-party-app-authentication/-android/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This model contains information required for third party authentication flow. |

