[link](../../index.md) / [com.tink.rest.models](../index.md) / [BudgetDetailsResponse](./index.md)

# BudgetDetailsResponse

`@JsonClass(true) data class BudgetDetailsResponse`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BudgetDetailsResponse(budgetSpecification: `[`Budget`](../-budget/index.md)`? = null, budgetPeriods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetPeriod`](../-budget-period/index.md)`>? = null, start: ZonedDateTime? = null, end: ZonedDateTime? = null, totalSpentAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null, averageSpentAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [averageSpentAmount](average-spent-amount.md) | Average period spending for the listed periods.`var averageSpentAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [budgetPeriods](budget-periods.md) | List of budget periods.`var budgetPeriods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetPeriod`](../-budget-period/index.md)`>?` |
| [budgetSpecification](budget-specification.md) | The budget.`var budgetSpecification: `[`Budget`](../-budget/index.md)`?` |
| [end](end.md) | Last period end expressed as UTC epoch timestamp in milliseconds.`var end: ZonedDateTime?` |
| [start](start.md) | First period start expressed as UTC epoch timestamp in milliseconds.`var start: ZonedDateTime?` |
| [totalSpentAmount](total-spent-amount.md) | Total amount spent within the listed periods.`var totalSpentAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
