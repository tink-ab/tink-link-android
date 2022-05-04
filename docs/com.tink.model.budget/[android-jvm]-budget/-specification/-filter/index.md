---
title: Filter
---
//[link](../../../../../index.html)/[com.tink.model.budget](../../../index.html)/[[androidJvm]Budget](../../index.html)/[Specification](../index.html)/[Filter](index.html)



# Filter



[androidJvm]\
data class [Filter](index.html)(val accounts: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-account/index.html)&gt;, val categories: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-category/index.html)&gt;, val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-tag/index.html)&gt;, val freeTextQuery: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Filter](-filter.html) | [androidJvm]<br>fun [Filter](-filter.html)(accounts: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-account/index.html)&gt;, categories: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-category/index.html)&gt;, tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-tag/index.html)&gt;, freeTextQuery: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Account](-account/index.html) | [androidJvm]<br>data class [Account](-account/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| [Category](-category/index.html) | [androidJvm]<br>data class [Category](-category/index.html)(val code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| [Tag](-tag/index.html) | [androidJvm]<br>data class [Tag](-tag/index.html)(val key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accounts](accounts.html) | [androidJvm]<br>val [accounts](accounts.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-account/index.html)&gt; |
| [categories](categories.html) | [androidJvm]<br>val [categories](categories.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-category/index.html)&gt; |
| [freeTextQuery](free-text-query.html) | [androidJvm]<br>val [freeTextQuery](free-text-query.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [tags](tags.html) | [androidJvm]<br>val [tags](tags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-tag/index.html)&gt; |


## Extensions


| Name | Summary |
|---|---|
| toDto | [common, androidJvm]<br>[common]<br>fun [Budget.Specification.Filter](../../../[common]-budget/-specification/-filter/index.html).[toDto](../../../../com.tink.service.budget/[common]to-dto.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Budget.Specification.Filter](index.html).[toDto](../../../../com.tink.service.budget/[android-jvm]to-dto.html)(): Filter |

