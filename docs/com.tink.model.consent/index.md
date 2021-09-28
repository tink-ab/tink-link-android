---
title: com.tink.model.consent -
---
//[link](../index.md)/[com.tink.model.consent](index.md)



# Package com.tink.model.consent  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>OAuthClientDescription| <a name="com.tink.model.consent/OAuthClientDescription///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [OAuthClientDescription]([common]-o-auth-client-description/index.md)(**clientName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **clientUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **clientIconUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **verified**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **aggregator**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **scopeDescriptions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription]([common]-scope-description/index.md)>)  <br>[androidJvm]  <br>data class [OAuthClientDescription]([android-jvm]-o-auth-client-description/index.md)(**clientName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **clientUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **clientIconUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **verified**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **aggregator**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **scopeDescriptions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription]([android-jvm]-scope-description/index.md)>) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br>More info  <br>A description of the OAuth client and the data it will collect from the user.  <br><br><br>
| <a name="com.tink.model.consent/ScopeDescription///PointingToDeclaration/"></a>ScopeDescription| <a name="com.tink.model.consent/ScopeDescription///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [ScopeDescription]([common]-scope-description/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **description**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>A title and description explaining a specific [Scope](../com.tink.model.user/[common]-scope/index.md).  <br><br><br>[androidJvm]  <br>Content  <br>data class [ScopeDescription]([android-jvm]-scope-description/index.md)(**title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **description**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br>More info  <br>A title and description explaining a specific [Scope](../com.tink.model.user/[android-jvm]-scope/index.md).  <br><br><br>

