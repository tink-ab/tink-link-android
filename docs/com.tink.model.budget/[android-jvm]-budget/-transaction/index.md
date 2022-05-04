---
title: Transaction
---
//[link](../../../../index.html)/[com.tink.model.budget](../../index.html)/[[androidJvm]Budget](../index.html)/[Transaction](index.html)



# Transaction



[androidJvm]\
data class [Transaction](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val amount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html), val dispensableAmount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html), val categoryCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val date: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Transaction](-transaction.html) | [androidJvm]<br>fun [Transaction](-transaction.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html), dispensableAmount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html), categoryCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), date: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accountId](account-id.html) | [androidJvm]<br>val [accountId](account-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [amount](amount.html) | [androidJvm]<br>val [amount](amount.html): [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [categoryCode](category-code.html) | [androidJvm]<br>val [categoryCode](category-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [date](date.html) | [androidJvm]<br>val [date](date.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [description](description.html) | [androidJvm]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [dispensableAmount](dispensable-amount.html) | [androidJvm]<br>val [dispensableAmount](dispensable-amount.html): [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

