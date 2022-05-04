---
title: com.tink.model.misc
---
//[link](../../index.html)/[com.tink.model.misc](index.html)



# Package com.tink.model.misc



## Types


| Name | Summary |
|---|---|
| Amount | [common, androidJvm]<br>[common]<br>data class [Amount]([common]-amount/index.html)(val value: [ExactNumber]([common]-exact-number/index.html), val currencyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[androidJvm]<br>data class [Amount]([android-jvm]-amount/index.html)(val value: [ExactNumber]([android-jvm]-exact-number/index.html), val currencyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| ExactNumber | [common, androidJvm]<br>[common]<br>data class [ExactNumber]([common]-exact-number/index.html)(val unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[ExactNumber]([common]-exact-number/index.html)&gt; <br>[androidJvm]<br>data class [ExactNumber]([android-jvm]-exact-number/index.html)(val unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[ExactNumber]([android-jvm]-exact-number/index.html)&gt; , [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| Field | [common, androidJvm]<br>[common]<br>data class [Field]([common]-field/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val validationRules: [Field.ValidationRules]([common]-field/-validation-rules/index.html), val attributes: [Field.Attributes]([common]-field/-attributes/index.html))<br>[androidJvm]<br>data class [Field]([android-jvm]-field/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val validationRules: [Field.ValidationRules]([android-jvm]-field/-validation-rules/index.html), val attributes: [Field.Attributes]([android-jvm]-field/-attributes/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow. |

