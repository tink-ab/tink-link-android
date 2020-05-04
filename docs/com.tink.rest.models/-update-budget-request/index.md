[link](../../index.md) / [com.tink.rest.models](../index.md) / [UpdateBudgetRequest](./index.md)

# UpdateBudgetRequest

`@JsonClass(true) data class UpdateBudgetRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UpdateBudgetRequest(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`, filter: `[`Filter`](../-filter/index.md)`, recurringPeriodicity: `[`RecurringPeriodicity`](../-recurring-periodicity/index.md)`? = null, oneOffPeriodicity: `[`OneOffPeriodicity`](../-one-off-periodicity/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | The target amount for the budget.`var amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md) |
| [filter](filter.md) | The filter defining the budget and which transactions that is included in it. The configured fields of the filter are applied as logical and operator (intersection).`var filter: `[`Filter`](../-filter/index.md) |
| [name](name.md) | The name of the Budget.`var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [oneOffPeriodicity](one-off-periodicity.md) | Periodicity configuration for a ONE_OFF budget. Required if periodicityType is set to ONE_OFF.`var oneOffPeriodicity: `[`OneOffPeriodicity`](../-one-off-periodicity/index.md)`?` |
| [recurringPeriodicity](recurring-periodicity.md) | Periodicity configuration for a RECURRING budget. Required if periodicityType is set to RECURRING.`var recurringPeriodicity: `[`RecurringPeriodicity`](../-recurring-periodicity/index.md)`?` |
