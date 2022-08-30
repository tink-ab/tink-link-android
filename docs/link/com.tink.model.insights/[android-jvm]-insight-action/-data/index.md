---
title: Data
---
//[link](../../../../index.html)/[com.tink.model.insights](../../index.html)/[[androidJvm]InsightAction](../index.html)/[Data](index.html)



# Data



[androidJvm]\
sealed class [Data](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

All subclasses should be data classes or provide a meaningful equals() function



## Types


| Name | Summary |
|---|---|
| [Acknowledge](-acknowledge/index.html) | [androidJvm]<br>object [Acknowledge](-acknowledge/index.html) : [InsightAction.Data](index.html) |
| [CategorizeExpense](-categorize-expense/index.html) | [androidJvm]<br>data class [CategorizeExpense](-categorize-expense/index.html)(val transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.html) |
| [CategorizeTransactions](-categorize-transactions/index.html) | [androidJvm]<br>data class [CategorizeTransactions](-categorize-transactions/index.html)(val transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [InsightAction.Data](index.html) |
| [CreateBudget](-create-budget/index.html) | [androidJvm]<br>data class [CreateBudget](-create-budget/index.html)(val budgetFilter: [BudgetFilter](../../../com.tink.model.budget/index.html#-2018963458%2FClasslikes%2F-812656150)?, val amount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html)?, val periodicity: [BudgetPeriodicity](../../../com.tink.model.budget/index.html#-756637127%2FClasslikes%2F-812656150)?) : [InsightAction.Data](index.html) |
| [CreateTransfer](-create-transfer/index.html) | [androidJvm]<br>data class [CreateTransfer](-create-transfer/index.html)(val sourceUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val destinationUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val amount: [Amount](../../../com.tink.model.misc/[android-jvm]-amount/index.html)? = null, val sourceAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val destinationAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [InsightAction.Data](index.html) |
| [Dismiss](-dismiss/index.html) | [androidJvm]<br>object [Dismiss](-dismiss/index.html) : [InsightAction.Data](index.html) |
| [NoData](-no-data/index.html) | [androidJvm]<br>object [NoData](-no-data/index.html) : [InsightAction.Data](index.html) |
| [RefreshCredential](-refresh-credential/index.html) | [androidJvm]<br>data class [RefreshCredential](-refresh-credential/index.html)(val credentialId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.html) |
| [ViewAccount](-view-account/index.html) | [androidJvm]<br>data class [ViewAccount](-view-account/index.html)(val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.html) |
| [ViewBudget](-view-budget/index.html) | [androidJvm]<br>data class [ViewBudget](-view-budget/index.html)(val budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val periodStartDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) : [InsightAction.Data](index.html) |
| [ViewLeftToSpend](-view-left-to-spend/index.html) | [androidJvm]<br>data class [ViewLeftToSpend](-view-left-to-spend/index.html)(val month: [YearMonth](../../../com.tink.model.time/[android-jvm]-year-month/index.html)) : [InsightAction.Data](index.html) |
| [ViewTransactions](-view-transactions/index.html) | [androidJvm]<br>data class [ViewTransactions](-view-transactions/index.html)(val transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [InsightAction.Data](index.html) |
| [ViewTransactionsByCategory](-view-transactions-by-category/index.html) | [androidJvm]<br>data class [ViewTransactionsByCategory](-view-transactions-by-category/index.html)(val transactionsByCategory: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;) : [InsightAction.Data](index.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| NoData |
| Acknowledge |
| Dismiss |
| ViewBudget |
| CreateBudget |
| CreateTransfer |
| CategorizeExpense |
| CategorizeTransactions |
| RefreshCredential |
| ViewAccount |
| ViewTransactions |
| ViewTransactionsByCategory |
| ViewLeftToSpend |

