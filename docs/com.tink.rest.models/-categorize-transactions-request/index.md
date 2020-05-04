[link](../../index.md) / [com.tink.rest.models](../index.md) / [CategorizeTransactionsRequest](./index.md)

# CategorizeTransactionsRequest

`@JsonClass(true) data class CategorizeTransactionsRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CategorizeTransactionsRequest(categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, transactionIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [categoryId](category-id.md) | The internal identifier of the category that the list of transactions is categorized to.`var categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [transactionIds](transaction-ids.md) | A list of internal identifiers of the transactions categorized.`var transactionIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
