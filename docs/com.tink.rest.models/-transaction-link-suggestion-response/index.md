[link](../../index.md) / [com.tink.rest.models](../index.md) / [TransactionLinkSuggestionResponse](./index.md)

# TransactionLinkSuggestionResponse

`@JsonClass(true) data class TransactionLinkSuggestionResponse`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TransactionLinkSuggestionResponse(transactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, suggestedCounterpartTransactions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Transaction`](../-transaction/index.md)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [limit](limit.md) | The maximum amount of suggestions requested to be returned.`var limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [suggestedCounterpartTransactions](suggested-counterpart-transactions.md) | Suggested counterpart transactions.`var suggestedCounterpartTransactions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Transaction`](../-transaction/index.md)`>?` |
| [transactionId](transaction-id.md) | The ID of the transaction to find suggestions for.`var transactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
