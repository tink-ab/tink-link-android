---
title: Specification
---
//[link](../../../../index.html)/[com.tink.model.budget](../../index.html)/[[androidJvm]Budget](../index.html)/[Specification](index.html)



# Specification



[androidJvm]\
data class [Specification](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val amount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html), val periodicity: [Budget.Periodicity](../-periodicity/index.html), val archived: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val filter: [Budget.Specification.Filter](-filter/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Specification](-specification.html) | [androidJvm]<br>fun [Specification](-specification.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), amount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html), periodicity: [Budget.Periodicity](../-periodicity/index.html), archived: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), filter: [Budget.Specification.Filter](-filter/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Filter](-filter/index.html) | [androidJvm]<br>data class [Filter](-filter/index.html)(val accounts: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Account](-filter/-account/index.html)&gt;, val categories: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Category](-filter/-category/index.html)&gt;, val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Budget.Specification.Filter.Tag](-filter/-tag/index.html)&gt;, val freeTextQuery: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [amount](amount.html) | [androidJvm]<br>val [amount](amount.html): [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [archived](archived.html) | [androidJvm]<br>val [archived](archived.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [created](created.html) | [androidJvm]<br>val [created](created.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [filter](filter.html) | [androidJvm]<br>val [filter](filter.html): [Budget.Specification.Filter](-filter/index.html) |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodicity](periodicity.html) | [androidJvm]<br>val [periodicity](periodicity.html): [Budget.Periodicity](../-periodicity/index.html) |

