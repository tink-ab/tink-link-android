---
title: [common]BudgetService
---
//[link](../../../index.html)/[com.tink.service.budget](../index.html)/[[common]BudgetService](index.html)



# BudgetService



[common]\
interface [BudgetService](index.html)



## Functions


| Name | Summary |
|---|---|
| [archiveBudget](archive-budget.html) | [common]<br>abstract suspend fun [archiveBudget](archive-budget.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-1713223439) |
| [budgetPeriodDetails](budget-period-details.html) | [common]<br>abstract suspend fun [budgetPeriodDetails](budget-period-details.html)(budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), start: &lt;ERROR CLASS&gt;, end: &lt;ERROR CLASS&gt;): &lt;ERROR CLASS&gt;&lt;[BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-1713223439), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[BudgetPeriod](../../com.tink.model.budget/index.html#406477269%2FClasslikes%2F-1713223439)&gt;&gt; |
| [createBudget](create-budget.html) | [common]<br>abstract suspend fun [createBudget](create-budget.html)(descriptor: [BudgetCreateOrUpdateDescriptor](../../com.tink.model.budget/[common]-budget-create-or-update-descriptor/index.html)): [BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-1713223439) |
| [listBudgets](list-budgets.html) | [common]<br>abstract suspend fun [listBudgets](list-budgets.html)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[BudgetSummary](../../com.tink.model.budget/index.html#1968246694%2FClasslikes%2F-1713223439)&gt; |
| [listTransactionsForBudget](list-transactions-for-budget.html) | [common]<br>abstract suspend fun [listTransactionsForBudget](list-transactions-for-budget.html)(budgetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), start: &lt;ERROR CLASS&gt;, end: &lt;ERROR CLASS&gt;): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[BudgetTransaction](../../com.tink.model.budget/index.html#-1403204114%2FClasslikes%2F-1713223439)&gt; |
| [updateBudget](update-budget.html) | [common]<br>abstract suspend fun [updateBudget](update-budget.html)(descriptor: [BudgetCreateOrUpdateDescriptor](../../com.tink.model.budget/[common]-budget-create-or-update-descriptor/index.html)): [BudgetSpecification](../../com.tink.model.budget/index.html#1357535401%2FClasslikes%2F-1713223439) |


## Inheritors


| Name |
|---|
| BudgetServiceImpl |

