---
title: [common]InsightData
---
//[link](../../../index.html)/[com.tink.model.insights](../index.html)/[[common]InsightData](index.html)



# InsightData



[common]\
sealed class [InsightData](index.html)

All subclasses should be data classes or provide a meaningful equals() function



## Types


| Name | Summary |
|---|---|
| [AccountBalanceLowData](-account-balance-low-data/index.html) | [common]<br>data class [AccountBalanceLowData](-account-balance-low-data/index.html)(val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val balance: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [AggregationRefreshPsd2CredentialData](-aggregation-refresh-psd2-credential-data/index.html) | [common]<br>data class [AggregationRefreshPsd2CredentialData](-aggregation-refresh-psd2-credential-data/index.html)(val credential: [RefreshCredential](../../com.tink.model.credentials/[common]-refresh-credential/index.html)) : [InsightData](index.html) |
| [BudgetCloseData](-budget-close-data/index.html) | [common]<br>data class [BudgetCloseData](-budget-close-data/index.html)(val budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val budgetPeriod: [Budget.Period](../../com.tink.model.budget/[common]-budget/-period/index.html), val currentTime: &lt;ERROR CLASS&gt;) : [InsightData](index.html) |
| [BudgetIdToPeriod](-budget-id-to-period/index.html) | [common]<br>data class [BudgetIdToPeriod](-budget-id-to-period/index.html)(val budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val budgetPeriod: [Budget.Period](../../com.tink.model.budget/[common]-budget/-period/index.html)) |
| [BudgetResultData](-budget-result-data/index.html) | [common]<br>data class [BudgetResultData](-budget-result-data/index.html)(val budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val budgetPeriod: [Budget.Period](../../com.tink.model.budget/[common]-budget/-period/index.html)) : [InsightData](index.html) |
| [BudgetSuggestCreateFirstData](-budget-suggest-create-first-data/index.html) | [common]<br>object [BudgetSuggestCreateFirstData](-budget-suggest-create-first-data/index.html) : [InsightData](index.html) |
| [BudgetSuggestCreateTopCategoryData](-budget-suggest-create-top-category-data/index.html) | [common]<br>data class [BudgetSuggestCreateTopCategoryData](-budget-suggest-create-top-category-data/index.html)(val categorySpending: [AmountByCategory](../../com.tink.model.relations/[common]-amount-by-category/index.html), val suggestedBudgetAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [BudgetSuggestCreateTopPrimaryCategoryData](-budget-suggest-create-top-primary-category-data/index.html) | [common]<br>data class [BudgetSuggestCreateTopPrimaryCategoryData](-budget-suggest-create-top-primary-category-data/index.html)(val categorySpending: [AmountByCategory](../../com.tink.model.relations/[common]-amount-by-category/index.html), val suggestedBudgetAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [BudgetSummaryAchievedData](-budget-summary-achieved-data/index.html) | [common]<br>data class [BudgetSummaryAchievedData](-budget-summary-achieved-data/index.html)(val achievedBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](-budget-id-to-period/index.html)&gt;, val overspentBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](-budget-id-to-period/index.html)&gt;, val savedAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [BudgetSummaryOverspentData](-budget-summary-overspent-data/index.html) | [common]<br>data class [BudgetSummaryOverspentData](-budget-summary-overspent-data/index.html)(val achievedBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](-budget-id-to-period/index.html)&gt;, val overspentBudgets: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[InsightData.BudgetIdToPeriod](-budget-id-to-period/index.html)&gt;, val overspentAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [CreditCardLimitCloseData](-credit-card-limit-close-data/index.html) | [common]<br>data class [CreditCardLimitCloseData](-credit-card-limit-close-data/index.html)(val account: [AccountWithName](../../com.tink.model.account/[common]-account-with-name/index.html), val availableCredit: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [CreditCardLimitReachedData](-credit-card-limit-reached-data/index.html) | [common]<br>data class [CreditCardLimitReachedData](-credit-card-limit-reached-data/index.html)(val account: [AccountWithName](../../com.tink.model.account/[common]-account-with-name/index.html)) : [InsightData](index.html) |
| [DoubleChargeData](-double-charge-data/index.html) | [common]<br>data class [DoubleChargeData](-double-charge-data/index.html)(val transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [InsightData](index.html) |
| [LargeExpenseData](-large-expense-data/index.html) | [common]<br>data class [LargeExpenseData](-large-expense-data/index.html)(val transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightData](index.html) |
| [LeftToSpendNegative](-left-to-spend-negative/index.html) | [common]<br>data class [LeftToSpendNegative](-left-to-spend-negative/index.html)(val createdAt: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val leftToSpend: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html)) : [InsightData](index.html) |
| [LeftToSpendNegativeBeginningMonth](-left-to-spend-negative-beginning-month/index.html) | [common]<br>data class [LeftToSpendNegativeBeginningMonth](-left-to-spend-negative-beginning-month/index.html)(val amountDifference: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val leftToSpendStatistics: [LeftToSpendStatisticsMid](../../com.tink.model.leftToSpend/[common]-left-to-spend-statistics-mid/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html), val totalExpense: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [LeftToSpendNegativeMidMonth](-left-to-spend-negative-mid-month/index.html) | [common]<br>data class [LeftToSpendNegativeMidMonth](-left-to-spend-negative-mid-month/index.html)(val amountDifference: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val leftToSpendStatistics: [LeftToSpendStatisticsMid](../../com.tink.model.leftToSpend/[common]-left-to-spend-statistics-mid/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html)) : [InsightData](index.html) |
| [LeftToSpendNegativeSummary](-left-to-spend-negative-summary/index.html) | [common]<br>data class [LeftToSpendNegativeSummary](-left-to-spend-negative-summary/index.html)(val leftToSpend: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html)) : [InsightData](index.html) |
| [LeftToSpendPositiveBeginningMonth](-left-to-spend-positive-beginning-month/index.html) | [common]<br>data class [LeftToSpendPositiveBeginningMonth](-left-to-spend-positive-beginning-month/index.html)(val amountDifference: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val leftToSpendStatistics: [LeftToSpendStatisticsMid](../../com.tink.model.leftToSpend/[common]-left-to-spend-statistics-mid/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html), val totalExpense: [Amount](../../com.tink.model.misc/[common]-amount/index.html)) : [InsightData](index.html) |
| [LeftToSpendPositiveFinalWeek](-left-to-spend-positive-final-week/index.html) | [common]<br>data class [LeftToSpendPositiveFinalWeek](-left-to-spend-positive-final-week/index.html)(val amountDifference: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val leftToSpendPerDay: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val leftToSpendStatistics: [LeftToSpendStatisticsMid](../../com.tink.model.leftToSpend/[common]-left-to-spend-statistics-mid/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html)) : [InsightData](index.html) |
| [LeftToSpendPositiveMidMonth](-left-to-spend-positive-mid-month/index.html) | [common]<br>data class [LeftToSpendPositiveMidMonth](-left-to-spend-positive-mid-month/index.html)(val amountDifference: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val leftToSpendStatistics: [LeftToSpendStatisticsMid](../../com.tink.model.leftToSpend/[common]-left-to-spend-statistics-mid/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html)) : [InsightData](index.html) |
| [LeftToSpendPositiveSummarySavingsAccount](-left-to-spend-positive-summary-savings-account/index.html) | [common]<br>data class [LeftToSpendPositiveSummarySavingsAccount](-left-to-spend-positive-summary-savings-account/index.html)(val leftAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html)) : [InsightData](index.html) |
| [MonthlyExpenseTransactionsData](-monthly-expense-transactions-data/index.html) | [common]<br>data class [MonthlyExpenseTransactionsData](-monthly-expense-transactions-data/index.html)(val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html), val transactionSummary: [TransactionSummary](../../com.tink.model.relations/[common]-transaction-summary/index.html)) : [InsightData](index.html) |
| [MonthlySummaryExpensesByCategoryData](-monthly-summary-expenses-by-category-data/index.html) | [common]<br>data class [MonthlySummaryExpensesByCategoryData](-monthly-summary-expenses-by-category-data/index.html)(val month: [YearMonth](../../com.tink.model.time/[common]-year-month/index.html), val expenses: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AmountByCategory](../../com.tink.model.relations/[common]-amount-by-category/index.html)&gt;) : [InsightData](index.html) |
| [NoData](-no-data/index.html) | [common]<br>object [NoData](-no-data/index.html) : [InsightData](index.html) |
| [UncategorizedTransactionData](-uncategorized-transaction-data/index.html) | [common]<br>data class [UncategorizedTransactionData](-uncategorized-transaction-data/index.html)(val transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [InsightData](index.html) |
| [WeeklyExpensesByCategoryData](-weekly-expenses-by-category-data/index.html) | [common]<br>data class [WeeklyExpensesByCategoryData](-weekly-expenses-by-category-data/index.html)(val week: [YearWeek](../../com.tink.model.time/[common]-year-week/index.html), val expenses: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AmountByCategory](../../com.tink.model.relations/[common]-amount-by-category/index.html)&gt;) : [InsightData](index.html) |
| [WeeklyExpensesByDayData](-weekly-expenses-by-day-data/index.html) | [common]<br>data class [WeeklyExpensesByDayData](-weekly-expenses-by-day-data/index.html)(val week: [YearWeek](../../com.tink.model.time/[common]-year-week/index.html), val expensesByDay: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ExpensesByDay](../../com.tink.model.relations/[common]-expenses-by-day/index.html)&gt;) : [InsightData](index.html) |
| [WeeklyExpenseTransactionsData](-weekly-expense-transactions-data/index.html) | [common]<br>data class [WeeklyExpenseTransactionsData](-weekly-expense-transactions-data/index.html)(val week: [YearWeek](../../com.tink.model.time/[common]-year-week/index.html), val transactionSummary: [TransactionSummary](../../com.tink.model.relations/[common]-transaction-summary/index.html)) : [InsightData](index.html) |
| [WeeklyUncategorizedTransactionsData](-weekly-uncategorized-transactions-data/index.html) | [common]<br>data class [WeeklyUncategorizedTransactionsData](-weekly-uncategorized-transactions-data/index.html)(val week: [YearWeek](../../com.tink.model.time/[common]-year-week/index.html), val transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [InsightData](index.html) |


## Inheritors


| Name |
|---|
| NoData |
| AccountBalanceLowData |
| AggregationRefreshPsd2CredentialData |
| BudgetResultData |
| BudgetSummaryAchievedData |
| BudgetSummaryOverspentData |
| BudgetSuggestCreateFirstData |
| BudgetSuggestCreateTopCategoryData |
| BudgetSuggestCreateTopPrimaryCategoryData |
| BudgetCloseData |
| CreditCardLimitCloseData |
| CreditCardLimitReachedData |
| UncategorizedTransactionData |
| LargeExpenseData |
| DoubleChargeData |
| WeeklyExpensesByCategoryData |
| WeeklyUncategorizedTransactionsData |
| WeeklyExpensesByDayData |
| MonthlySummaryExpensesByCategoryData |
| MonthlyExpenseTransactionsData |
| WeeklyExpenseTransactionsData |
| LeftToSpendNegative |
| LeftToSpendPositiveMidMonth |
| LeftToSpendNegativeMidMonth |
| LeftToSpendNegativeSummary |
| LeftToSpendPositiveBeginningMonth |
| LeftToSpendNegativeBeginningMonth |
| LeftToSpendPositiveSummarySavingsAccount |
| LeftToSpendPositiveFinalWeek |

