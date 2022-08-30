---
title: [androidJvm]Transaction
---
//[link](../../../index.html)/[com.tink.model.transaction](../index.html)/[[androidJvm]Transaction](index.html)



# Transaction



[androidJvm]\
data class [Transaction](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val amount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val categoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val date: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val notes: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../[android-jvm]-tag/index.html)&gt;, val upcoming: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val pending: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val originalDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val originalDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val originalAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val inserted: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val categoryType: [CategoryType](../[android-jvm]-category-type/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Transaction](-transaction.html) | [androidJvm]<br>fun [Transaction](-transaction.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), categoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), date: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), notes: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../[android-jvm]-tag/index.html)&gt;, upcoming: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), pending: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), originalDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), originalDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), originalAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), inserted: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), categoryType: [CategoryType](../[android-jvm]-category-type/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accountId](account-id.html) | [androidJvm]<br>val [accountId](account-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [amount](amount.html) | [androidJvm]<br>val [amount](amount.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [categoryId](category-id.html) | [androidJvm]<br>val [categoryId](category-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [categoryType](category-type.html) | [androidJvm]<br>val [categoryType](category-type.html): [CategoryType](../[android-jvm]-category-type/index.html) |
| [date](date.html) | [androidJvm]<br>val [date](date.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [description](description.html) | [androidJvm]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [inserted](inserted.html) | [androidJvm]<br>val [inserted](inserted.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [notes](notes.html) | [androidJvm]<br>val [notes](notes.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [originalAmount](original-amount.html) | [androidJvm]<br>val [originalAmount](original-amount.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [originalDate](original-date.html) | [androidJvm]<br>val [originalDate](original-date.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [originalDescription](original-description.html) | [androidJvm]<br>val [originalDescription](original-description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [pending](pending.html) | [androidJvm]<br>val [pending](pending.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [tags](tags.html) | [androidJvm]<br>val [tags](tags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../[android-jvm]-tag/index.html)&gt; |
| [upcoming](upcoming.html) | [androidJvm]<br>val [upcoming](upcoming.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |


## Extensions


| Name | Summary |
|---|---|
| toTransactionUpdateObject | [common, androidJvm]<br>[common]<br>fun [Transaction](../[common]-transaction/index.html).[toTransactionUpdateObject](../../com.tink.service.transaction/[common]to-transaction-update-object.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Transaction](index.html).[toTransactionUpdateObject](../../com.tink.service.transaction/[android-jvm]to-transaction-update-object.html)(): TransactionUpdateObject |

