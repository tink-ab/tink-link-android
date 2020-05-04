[link](../../index.md) / [com.tink.rest.models](../index.md) / [SuggestTransactionsResponse](./index.md)

# SuggestTransactionsResponse

`@JsonClass(true) data class SuggestTransactionsResponse`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SuggestTransactionsResponse(categorizationImprovement: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, categorizationLevel: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, clusters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TransactionCluster`](../-transaction-cluster/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [categorizationImprovement](categorization-improvement.md) | The categorization improvement achieve if all clusters are categorized.`var categorizationImprovement: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [categorizationLevel](categorization-level.md) | The current categorization level before categorization.`var categorizationLevel: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [clusters](clusters.md) | Clusters to categorize.`var clusters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TransactionCluster`](../-transaction-cluster/index.md)`>` |
