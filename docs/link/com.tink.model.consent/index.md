---
title: com.tink.model.consent
---
//[link](../../index.html)/[com.tink.model.consent](index.html)



# Package com.tink.model.consent



## Types


| Name | Summary |
|---|---|
| OAuthClientDescription | [common, androidJvm]<br>[common]<br>data class [OAuthClientDescription]([common]-o-auth-client-description/index.html)(val clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription]([common]-scope-description/index.html)&gt;)<br>[androidJvm]<br>data class [OAuthClientDescription]([android-jvm]-o-auth-client-description/index.html)(val clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription]([android-jvm]-scope-description/index.html)&gt;) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>A description of the OAuth client and the data it will collect from the user. |
| ScopeDescription | [common]<br>data class [ScopeDescription]([common]-scope-description/index.html)(val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>A title and description explaining a specific [Scope](../com.tink.model.user/[common]-scope/index.html).<br>[androidJvm]<br>data class [ScopeDescription]([android-jvm]-scope-description/index.html)(val title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>A title and description explaining a specific [Scope](../com.tink.model.user/[android-jvm]-scope/index.html). |

