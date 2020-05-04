[link](../../index.md) / [com.tink.rest.models](../index.md) / [CreateRecurringBudgetRequest](./index.md)

# CreateRecurringBudgetRequest

`@JsonClass(true) data class CreateRecurringBudgetRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CreateRecurringBudgetRequest(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`, filter: `[`Filter`](../-filter/index.md)`, recurringPeriodicity: `[`RecurringPeriodicity`](../-recurring-periodicity/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | The target amount for the budget. The currency must match the user profile currency setting.`var amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md) |
| [filter](filter.md) | The filter defining the budget and which transactions that is included in it. The configured fields of the filter are applied as logical and operator (intersection).`var filter: `[`Filter`](../-filter/index.md) |
| [name](name.md) | The name of the Budget.`var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [recurringPeriodicity](recurring-periodicity.md) | Periodicity configuration for the recurring budget.`var recurringPeriodicity: `[`RecurringPeriodicity`](../-recurring-periodicity/index.md) |
