---
title: [androidJvm]BudgetService
---
//[link](../../../index.html)/[com.tink.service.budget](../index.html)/[[androidJvm]BudgetService](index.html)



# BudgetService



[androidJvm]\
interface [BudgetService](index.html)



## Functions


| Name | Summary |
|---|---|
| [archiveBudget](archive-budget.html) | [androidJvm]<br>abstract suspend fun [archiveBudget](archive-budget.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-812656150) |
| [budgetPeriodDetails](budget-period-details.html) | [androidJvm]<br>abstract suspend fun [budgetPeriodDetails](budget-period-details.html)(budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), start: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), end: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)): [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-812656150), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[BudgetPeriod](../../com.tink.model.budget/index.html#406477269%2FClasslikes%2F-812656150)&gt;&gt; |
| [createBudget](create-budget.html) | [androidJvm]<br>abstract suspend fun [createBudget](create-budget.html)(descriptor: [BudgetCreateOrUpdateDescriptor](../../com.tink.model.budget/[android-jvm]-budget-create-or-update-descriptor/index.html)): [BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-812656150) |
| [listBudgets](list-budgets.html) | [androidJvm]<br>abstract suspend fun [listBudgets](list-budgets.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[BudgetSummary](../../com.tink.model.budget/index.html#1968246694%2FClasslikes%2F-812656150)&gt; |
| [listTransactionsForBudget](list-transactions-for-budget.html) | [androidJvm]<br>abstract suspend fun [listTransactionsForBudget](list-transactions-for-budget.html)(budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), start: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), end: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[BudgetTransaction](../../com.tink.model.budget/index.html#-1403204114%2FClasslikes%2F-812656150)&gt; |
| [updateBudget](update-budget.html) | [androidJvm]<br>abstract suspend fun [updateBudget](update-budget.html)(descriptor: [BudgetCreateOrUpdateDescriptor](../../com.tink.model.budget/[android-jvm]-budget-create-or-update-descriptor/index.html)): [BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-812656150) |


## Inheritors


| Name |
|---|
| BudgetServiceImpl |

