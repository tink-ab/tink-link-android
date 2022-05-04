---
title: BudgetSummaryAchievedData
---
//[link](../../../../index.html)/[com.tink.model.insights](../../index.html)/[[androidJvm]InsightData](../index.html)/[BudgetSummaryAchievedData](index.html)



# BudgetSummaryAchievedData



[androidJvm]\
data class [BudgetSummaryAchievedData](index.html)(val achievedBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](../-budget-id-to-period/index.html)&gt;, val overspentBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](../-budget-id-to-period/index.html)&gt;, val savedAmount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html)) : [InsightData](../index.html)



## Constructors


| | |
|---|---|
| [BudgetSummaryAchievedData](-budget-summary-achieved-data.html) | [androidJvm]<br>fun [BudgetSummaryAchievedData](-budget-summary-achieved-data.html)(achievedBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](../-budget-id-to-period/index.html)&gt;, overspentBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](../-budget-id-to-period/index.html)&gt;, savedAmount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [achievedBudgets](achieved-budgets.html) | [androidJvm]<br>val [achievedBudgets](achieved-budgets.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](../-budget-id-to-period/index.html)&gt; |
| [overspentBudgets](overspent-budgets.html) | [androidJvm]<br>val [overspentBudgets](overspent-budgets.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](../-budget-id-to-period/index.html)&gt; |
| [savedAmount](saved-amount.html) | [androidJvm]<br>val [savedAmount](saved-amount.html): [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html) |

