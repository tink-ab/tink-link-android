---
title: WeeklyExpensesByCategoryData
---
//[link](../../../../index.html)/[com.tink.model.insights](../../index.html)/[[androidJvm]InsightData](../index.html)/[WeeklyExpensesByCategoryData](index.html)



# WeeklyExpensesByCategoryData



[androidJvm]\
data class [WeeklyExpensesByCategoryData](index.html)(val week: [YearWeek](../../../com.tink.model.time/[android-jvm]-year-week/index.html), val expenses: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AmountByCategory](../../../com.tink.model.relations/[android-jvm]-amount-by-category/index.html)&gt;) : [InsightData](../index.html)



## Constructors


| | |
|---|---|
| [WeeklyExpensesByCategoryData](-weekly-expenses-by-category-data.html) | [androidJvm]<br>fun [WeeklyExpensesByCategoryData](-weekly-expenses-by-category-data.html)(week: [YearWeek](../../../com.tink.model.time/[android-jvm]-year-week/index.html), expenses: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AmountByCategory](../../../com.tink.model.relations/[android-jvm]-amount-by-category/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [expenses](expenses.html) | [androidJvm]<br>val [expenses](expenses.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AmountByCategory](../../../com.tink.model.relations/[android-jvm]-amount-by-category/index.html)&gt; |
| [week](week.html) | [androidJvm]<br>val [week](week.html): [YearWeek](../../../com.tink.model.time/[android-jvm]-year-week/index.html) |

