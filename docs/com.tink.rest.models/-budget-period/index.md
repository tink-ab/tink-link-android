[link](../../index.md) / [com.tink.rest.models](../index.md) / [BudgetPeriod](./index.md)

# BudgetPeriod

`@JsonClass(true) data class BudgetPeriod`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BudgetPeriod(start: ZonedDateTime? = null, end: ZonedDateTime? = null, spentAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [end](end.md) | Period end expressed as UTC epoch timestamp in milliseconds.`var end: ZonedDateTime?` |
| [spentAmount](spent-amount.md) | Period spent amount.`var spentAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [start](start.md) | Period start expressed as UTC epoch timestamp in milliseconds.`var start: ZonedDateTime?` |
