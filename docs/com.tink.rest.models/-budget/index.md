[link](../../index.md) / [com.tink.rest.models](../index.md) / [Budget](./index.md)

# Budget

`@JsonClass(true) data class Budget`

A budget represents a financial target for a defined period. The budget itself is identified by certain filter/criteria (such as accounts, categories, tags or free-text) to target expenses. Defining multiple filter properties will yield an AND operation, and specifying multiple values of a filter property will yield an OR operation.Depending on the use case a budget can either be recurring (WEEK, MONTH or YEAR) or be seen as a one-off budget (fixed start and end time period). The amount of the budget will relate to the recurring period defined by the periodicity unit for recurring budgets, or the fixed time window for a one-off budget. A budget could for example be the goal to spend at maximum 10 euros weekly on coffee.

### Types

| Name | Summary |
|---|---|
| [PeriodicityTypeEnum](-periodicity-type-enum/index.md) | Tells whether the budget is recurring or one off type. Using this field it's possible to see which of the field `recurringPeriodicity` or `oneOffPeriodicity` is set. Values: ONE_OFF, RECURRING`enum class PeriodicityTypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A budget represents a financial target for a defined period. The budget itself is identified by certain filter/criteria (such as accounts, categories, tags or free-text) to target expenses. Defining multiple filter properties will yield an AND operation, and specifying multiple values of a filter property will yield an OR operation.Depending on the use case a budget can either be recurring (WEEK, MONTH or YEAR) or be seen as a one-off budget (fixed start and end time period). The amount of the budget will relate to the recurring period defined by the periodicity unit for recurring budgets, or the fixed time window for a one-off budget. A budget could for example be the goal to spend at maximum 10 euros weekly on coffee.`Budget(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null, periodicityType: PeriodicityTypeEnum? = null, recurringPeriodicity: `[`RecurringPeriodicity`](../-recurring-periodicity/index.md)`? = null, oneOffPeriodicity: `[`OneOffPeriodicity`](../-one-off-periodicity/index.md)`? = null, archived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, filter: `[`Filter`](../-filter/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | The target amount for the budget.`var amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [archived](archived.md) | Indicates if the budget has state archived or not.`var archived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [filter](filter.md) | The filter defining the budget and which transactions that is included in it. The configured fields of the filter are applied as logical and operator (intersection).`var filter: `[`Filter`](../-filter/index.md)`?` |
| [id](id.md) | The ID of the Budget.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | The name of the budget.`var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [oneOffPeriodicity](one-off-periodicity.md) | Periodicity configuration for a &#x60;ONE_OFF&#x60; budget.`var oneOffPeriodicity: `[`OneOffPeriodicity`](../-one-off-periodicity/index.md)`?` |
| [periodicityType](periodicity-type.md) | Tells whether the budget is recurring or one off type. Using this field it&#39;s possible to see which of the field &#x60;recurringPeriodicity&#x60; or &#x60;oneOffPeriodicity&#x60; is set.`var periodicityType: PeriodicityTypeEnum?` |
| [recurringPeriodicity](recurring-periodicity.md) | Periodicity configuration for a &#x60;RECURRING&#x60; budget.`var recurringPeriodicity: `[`RecurringPeriodicity`](../-recurring-periodicity/index.md)`?` |
