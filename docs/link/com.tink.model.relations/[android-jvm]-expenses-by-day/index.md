---
title: [androidJvm]ExpensesByDay
---
//[link](../../../index.html)/[com.tink.model.relations](../index.html)/[[androidJvm]ExpensesByDay](index.html)



# ExpensesByDay



[androidJvm]\
data class [ExpensesByDay](index.html)(val date: [LocalDate](https://developer.android.com/reference/kotlin/java/time/LocalDate.html), val totalAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val averageAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [ExpensesByDay](-expenses-by-day.html) | [androidJvm]<br>fun [ExpensesByDay](-expenses-by-day.html)(date: [LocalDate](https://developer.android.com/reference/kotlin/java/time/LocalDate.html), totalAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), averageAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [averageAmount](average-amount.html) | [androidJvm]<br>val [averageAmount](average-amount.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [date](date.html) | [androidJvm]<br>val [date](date.html): [LocalDate](https://developer.android.com/reference/kotlin/java/time/LocalDate.html) |
| [totalAmount](total-amount.html) | [androidJvm]<br>val [totalAmount](total-amount.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |

