---
title: com.tink.model.misc -
---
//[link](../index.md)/[com.tink.model.misc](index.md)



# Package com.tink.model.misc  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Amount///PointingToDeclaration/"></a>Amount| <a name="com.tink.model.misc/Amount///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [Amount]([common]-amount/index.md)(**value**: [ExactNumber]([common]-exact-number/index.md), **currencyCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>[androidJvm]  <br>data class [Amount]([android-jvm]-amount/index.md)(**value**: [ExactNumber]([android-jvm]-exact-number/index.md), **currencyCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br><br><br>
| <a name="com.tink.model.misc/ExactNumber///PointingToDeclaration/"></a>ExactNumber| <a name="com.tink.model.misc/ExactNumber///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [ExactNumber]([common]-exact-number/index.md)(**unscaledValue**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), **scale**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)<[ExactNumber]([common]-exact-number/index.md)>   <br>[androidJvm]  <br>data class [ExactNumber]([android-jvm]-exact-number/index.md)(**unscaledValue**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), **scale**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)<[ExactNumber]([android-jvm]-exact-number/index.md)> , [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br><br><br>
| <a name="com.tink.model.misc/Field///PointingToDeclaration/"></a>Field| <a name="com.tink.model.misc/Field///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [Field]([common]-field/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **validationRules**: [Field.ValidationRules]([common]-field/-validation-rules/index.md), **attributes**: [Field.Attributes]([common]-field/-attributes/index.md))  <br>[androidJvm]  <br>data class [Field]([android-jvm]-field/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **validationRules**: [Field.ValidationRules]([android-jvm]-field/-validation-rules/index.md), **attributes**: [Field.Attributes]([android-jvm]-field/-attributes/index.md)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br>More info  <br>This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.  <br><br><br>

