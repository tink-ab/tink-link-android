[link](../../index.md) / [com.tink.rest.models](../index.md) / [BudgetTransaction](./index.md)

# BudgetTransaction

`@JsonClass(true) data class BudgetTransaction`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BudgetTransaction(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null, dispensableAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null, date: ZonedDateTime? = null, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, categoryCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [accountId](account-id.md) | The ID of the account this transaction belongs to.`var accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [amount](amount.md) | The transaction amount.`var amount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [categoryCode](category-code.md) | Category code.`var categoryCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [date](date.md) | Date of the transaction expressed as UTC epoch timestamp in milliseconds.`var date: ZonedDateTime?` |
| [description](description.md) | Description of the transaction.`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [dispensableAmount](dispensable-amount.md) | The dispensable amount. This amount will e.g. be reduced if the account it belongs to has ownership set to 50%.`var dispensableAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [id](id.md) | The ID of the transaction.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
