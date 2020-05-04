[link](../../index.md) / [com.tink.rest.models](../index.md) / [SearchResult](./index.md)

# SearchResult

`@JsonClass(true) data class SearchResult`

### Types

| Name | Summary |
|---|---|
| [TypeEnum](-type-enum/index.md) | The search type. Values: STATEMENT, TRANSACTION, CATEGORY, BUDGET, GOAL, SUGGESTION`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SearchResult(type: TypeEnum, transaction: `[`TransactionResponse`](../-transaction-response/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [transaction](transaction.md) | The transactions resulting from the query.`var transaction: `[`TransactionResponse`](../-transaction-response/index.md)`?` |
| [type](type.md) | The search type.`var type: TypeEnum` |
