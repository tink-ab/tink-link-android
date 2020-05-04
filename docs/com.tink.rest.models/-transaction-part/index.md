[link](../../index.md) / [com.tink.rest.models](../index.md) / [TransactionPart](./index.md)

# TransactionPart

`@JsonClass(true) data class TransactionPart`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TransactionPart(date: ZonedDateTime, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, lastModified: ZonedDateTime, categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, counterpartId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, counterpartTransactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, counterpartDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, amount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, counterpartTransactionAmount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | The amount of the transaction part.`var amount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [categoryId](category-id.md) | The category of the transaction part.`var categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [counterpartDescription](counterpart-description.md) | The description of the transaction containing the counterpart.`var counterpartDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [counterpartId](counterpart-id.md) | The id of the counterpart. The counterpart is a transaction part in another transaction`var counterpartId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [counterpartTransactionAmount](counterpart-transaction-amount.md) | The amount of the transaction containing the counterpart.`var counterpartTransactionAmount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [counterpartTransactionId](counterpart-transaction-id.md) | The ID of the transaction containing the counterpart.`var counterpartTransactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [date](date.md) | The date the transaction part was created.`var date: ZonedDateTime` |
| [id](id.md) | The ID of the transaction part.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [lastModified](last-modified.md) | The date the transaction part was last modified.`var lastModified: ZonedDateTime` |
