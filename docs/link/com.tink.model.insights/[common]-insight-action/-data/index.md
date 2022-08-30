---
title: Data
---
//[link](../../../../index.html)/[com.tink.model.insights](../../index.html)/[[common]InsightAction](../index.html)/[Data](index.html)



# Data



[common]\
sealed class [Data](index.html)

All subclasses should be data classes or provide a meaningful equals() function



## Types


| Name | Summary |
|---|---|
| [Acknowledge](-acknowledge/index.html) | [common]<br>object [Acknowledge](-acknowledge/index.html) : [InsightAction.Data](index.html) |
| [CategorizeExpense](-categorize-expense/index.html) | [common]<br>data class [CategorizeExpense](-categorize-expense/index.html)(val transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.html) |
| [CategorizeTransactions](-categorize-transactions/index.html) | [common]<br>data class [CategorizeTransactions](-categorize-transactions/index.html)(val transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [InsightAction.Data](index.html) |
| [CreateBudget](-create-budget/index.html) | [common]<br>data class [CreateBudget](-create-budget/index.html)(val budgetFilter: [BudgetFilter](../../../com.tink.model.budget/index.html#-2018963458%2FClasslikes%2F-1713223439)?, val amount: [Amount](../../../com.tink.model.misc/[common]-amount/index.html)?, val periodicity: [BudgetPeriodicity](../../../com.tink.model.budget/index.html#-756637127%2FClasslikes%2F-1713223439)?) : [InsightAction.Data](index.html) |
| [CreateTransfer](-create-transfer/index.html) | [common]<br>data class [CreateTransfer](-create-transfer/index.html)(val sourceUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val destinationUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val amount: [Amount](../../../com.tink.model.misc/[common]-amount/index.html)? = null, val sourceAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val destinationAccountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [InsightAction.Data](index.html) |
| [Dismiss](-dismiss/index.html) | [common]<br>object [Dismiss](-dismiss/index.html) : [InsightAction.Data](index.html) |
| [NoData](-no-data/index.html) | [common]<br>object [NoData](-no-data/index.html) : [InsightAction.Data](index.html) |
| [RefreshCredential](-refresh-credential/index.html) | [common]<br>data class [RefreshCredential](-refresh-credential/index.html)(val credentialId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.html) |
| [ViewAccount](-view-account/index.html) | [common]<br>data class [ViewAccount](-view-account/index.html)(val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightAction.Data](index.html) |
| [ViewBudget](-view-budget/index.html) | [common]<br>data class [ViewBudget](-view-budget/index.html)(val budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val periodStartDate: &lt;ERROR CLASS&gt;) : [InsightAction.Data](index.html) |
| [ViewLeftToSpend](-view-left-to-spend/index.html) | [common]<br>data class [ViewLeftToSpend](-view-left-to-spend/index.html)(val month: [YearMonth](../../../com.tink.model.time/[common]-year-month/index.html)) : [InsightAction.Data](index.html) |
| [ViewTransactions](-view-transactions/index.html) | [common]<br>data class [ViewTransactions](-view-transactions/index.html)(val transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [InsightAction.Data](index.html) |
| [ViewTransactionsByCategory](-view-transactions-by-category/index.html) | [common]<br>data class [ViewTransactionsByCategory](-view-transactions-by-category/index.html)(val transactionsByCategory: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;) : [InsightAction.Data](index.html) |


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

