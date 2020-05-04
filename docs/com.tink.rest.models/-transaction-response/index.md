[link](../../index.md) / [com.tink.rest.models](../index.md) / [TransactionResponse](./index.md)

# TransactionResponse

`@JsonClass(true) data class TransactionResponse`

### Types

| Name | Summary |
|---|---|
| [CategoryTypeEnum](-category-type-enum/index.md) | The category type of the transaction. Values: INCOME, EXPENSES, TRANSFERS`enum class CategoryTypeEnum` |
| [TypeEnum](-type-enum/index.md) | The type of the transaction. Values: DEFAULT, CREDIT_CARD, TRANSFER, PAYMENT, WITHDRAWAL`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TransactionResponse(accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, amount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, categoryType: CategoryTypeEnum, date: ZonedDateTime, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, lastModified: ZonedDateTime, notes: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, originalAmount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, originalDate: ZonedDateTime, originalDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, pending: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, timestamp: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, type: TypeEnum, userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, payload: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, upcoming: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, currencyDenominatedAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null, currencyDenominatedOriginalAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`? = null, parts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TransactionPart`](../-transaction-part/index.md)`>? = null, partnerPayload: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>>? = null, dispensableAmount: `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`? = null, userModified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [accountId](account-id.md) | The internal identifier of the account that the transaction belongs to.`var accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [amount](amount.md) | The amount of the transaction. This can be modified by the user.`var amount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [categoryId](category-id.md) | The category of the transaction. This can be modified by the user.`var categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [categoryType](category-type.md) | The category type of the transaction.`var categoryType: CategoryTypeEnum` |
| [currencyDenominatedAmount](currency-denominated-amount.md) | The amount of the transaction represented as a scale and unscaled value together with the ISO 4217 currency code of the amount. The amount can be modified by the user but not the currency code.`var currencyDenominatedAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [currencyDenominatedOriginalAmount](currency-denominated-original-amount.md) | The original amount that was received from the provider, before the user changed it. The amount is represented as a scale and unscaled value together with the ISO 4217 currency code of the amount.`var currencyDenominatedOriginalAmount: `[`CurrencyDenominatedAmount`](../-currency-denominated-amount/index.md)`?` |
| [date](date.md) | The date the transaction was executed. This can be modified by the user.`var date: ZonedDateTime` |
| [description](description.md) | The description of the transaction. This can be modified by the user.`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [dispensableAmount](dispensable-amount.md) | The dispensable amount of the transaction.`var dispensableAmount: `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`?` |
| [id](id.md) | The internal identifier of the transaction.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [lastModified](last-modified.md) | The date the transaction was last modified by the user.`var lastModified: ZonedDateTime` |
| [notes](notes.md) | A free-text field modifiable by the user. Any &#39;word&#39; (whitespace separated), prefixed with a #, is considered a tag. These tags become searchable.`var notes: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [originalAmount](original-amount.md) | The original amount that was received from the provider, before the user changed it.`var originalAmount: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [originalDate](original-date.md) | The original date that was received from the provider, before the user changed it.`var originalDate: ZonedDateTime` |
| [originalDescription](original-description.md) | The original description that was received from the provider, before the user changed it.`var originalDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [partnerPayload](partner-payload.md) | The payload that was previously ingested on the Connector API.`var partnerPayload: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>>?` |
| [parts](parts.md) | TransactionResponse parts (Beta). Available if the transaction is divided into more than one part.`var parts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TransactionPart`](../-transaction-part/index.md)`>?` |
| [payload](payload.md) | Meta data about the transaction, in key value format with Strings.`var payload: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [pending](pending.md) | Indicates if this transaction has been settled or is still pending.`var pending: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [timestamp](timestamp.md) | The timestamp of when the transaction was first saved to database.`var timestamp: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [type](type.md) | The type of the transaction.`var type: TypeEnum` |
| [upcoming](upcoming.md) | Indicates if this is an upcoming transaction not booked yet.`var upcoming: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [userId](user-id.md) | The internal identifier of the user that the transaction belongs to.`var userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [userModified](user-modified.md) | `var userModified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
