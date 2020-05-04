[link](../../index.md) / [com.tink.rest.models](../index.md) / [TransferDestination](./index.md)

# TransferDestination

`@JsonClass(true) data class TransferDestination`

### Types

| Name | Summary |
|---|---|
| [TypeEnum](-type-enum/index.md) | The account type of the destination. Will be `EXTERNAL` for all destinations not owned by the user. Values: CHECKING, SAVINGS, INVESTMENT, CREDIT_CARD, LOAN, EXTERNAL`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TransferDestination(balance: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, displayBankName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, displayAccountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, type: TypeEnum? = null, matchesMultiple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [balance](balance.md) | The balance of the account. Will only be populated for accounts that is owned by the user.`var balance: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [displayAccountNumber](display-account-number.md) | A display formatted alpha-numeric string of the destination account/payment recipient number.`var displayAccountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayBankName](display-bank-name.md) | The name of the bank where this destination resides. Will not be populated for payment destinations.`var displayBankName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [matchesMultiple](matches-multiple.md) | Indicates whether this &#x60;TransferDestination&#x60; matches multiple destinations. If true, the uri will be a regular expression, for instance &#x60;\&quot;se-pg://.+\&quot;&#x60; meaning that the source account can make PG payments.`var matchesMultiple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [name](name.md) | The name of the destination if one exists.`var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | The account type of the destination. Will be &#x60;EXTERNAL&#x60; for all destinations not owned by the user.`var type: TypeEnum?` |
| [uri](uri.md) | The uri used to describe this destination.`var uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
