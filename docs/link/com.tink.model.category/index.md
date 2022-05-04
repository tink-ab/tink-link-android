---
title: com.tink.model.category
---
//[link](../../index.html)/[com.tink.model.category](index.html)



# Package com.tink.model.category



## Types


| Name | Summary |
|---|---|
| Category | [common, androidJvm]<br>[common]<br>data class [Category]([common]-category/index.html)(val code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Category.Type]([common]-category/-type/index.html), val parentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val children: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Category]([common]-category/index.html)&gt;, val sortOrder: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val isDefaultChild: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>[androidJvm]<br>data class [Category]([android-jvm]-category/index.html)(val code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Category.Type]([android-jvm]-category/-type/index.html), val parentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val children: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Category]([android-jvm]-category/index.html)&gt;, val sortOrder: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val isDefaultChild: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| CategoryTree | [common, androidJvm]<br>[common]<br>data class [CategoryTree]([common]-category-tree/index.html)(val expenses: [Category]([common]-category/index.html), val income: [Category]([common]-category/index.html), val transfers: [Category]([common]-category/index.html))<br>[androidJvm]<br>data class [CategoryTree]([android-jvm]-category-tree/index.html)(val expenses: [Category]([android-jvm]-category/index.html), val income: [Category]([android-jvm]-category/index.html), val transfers: [Category]([android-jvm]-category/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |

