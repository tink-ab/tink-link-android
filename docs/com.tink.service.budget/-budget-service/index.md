[link](../../index.md) / [com.tink.service.budget](../index.md) / [BudgetService](./index.md)

# BudgetService

`interface BudgetService`

### Functions

| Name | Summary |
|---|---|
| [archiveBudget](archive-budget.md) | `abstract suspend fun archiveBudget(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`BudgetSpecification`](../../com.tink.model.budget/-budget-specification.md) |
| [budgetPeriodDetails](budget-period-details.md) | `abstract suspend fun budgetPeriodDetails(budgetId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, start: Instant, end: Instant): `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`BudgetSpecification`](../../com.tink.model.budget/-budget-specification.md)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetPeriod`](../../com.tink.model.budget/-budget-period.md)`>>` |
| [createBudget](create-budget.md) | `abstract suspend fun createBudget(descriptor: `[`BudgetCreateOrUpdateDescriptor`](../../com.tink.model.budget/-budget-create-or-update-descriptor/index.md)`): `[`BudgetSpecification`](../../com.tink.model.budget/-budget-specification.md) |
| [listBudgets](list-budgets.md) | `abstract suspend fun listBudgets(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetSummary`](../../com.tink.model.budget/-budget-summary.md)`>` |
| [listTransactionsForBudget](list-transactions-for-budget.md) | `abstract suspend fun listTransactionsForBudget(budgetId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, start: Instant, end: Instant): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetTransaction`](../../com.tink.model.budget/-budget-transaction.md)`>` |
| [updateBudget](update-budget.md) | `abstract suspend fun updateBudget(descriptor: `[`BudgetCreateOrUpdateDescriptor`](../../com.tink.model.budget/-budget-create-or-update-descriptor/index.md)`): `[`BudgetSpecification`](../../com.tink.model.budget/-budget-specification.md) |

### Inheritors

| Name | Summary |
|---|---|
| [BudgetServiceImpl](../-budget-service-impl/index.md) | `class BudgetServiceImpl : `[`BudgetService`](./index.md) |
