[link](../../index.md) / [com.tink.rest.models](../index.md) / [SearchResponse](./index.md)

# SearchResponse

`@JsonClass(true) data class SearchResponse`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SearchResponse(count: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, periodAmounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`StringDoublePair`](../-string-double-pair/index.md)`>, query: `[`SearchQuery`](../-search-query/index.md)`, results: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`SearchResult`](../-search-result/index.md)`>, net: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [count](count.md) | Number of results returned.`var count: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [net](net.md) | The transaction amount net of the result. Will only include the amounts from transactions which has the same currency as the user to who they belong.`var net: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [periodAmounts](period-amounts.md) | Key-value object where the key is a period (&#x60;YYYY-MM&#x60;) and the value is the net amount of the transactions found within the specified date range (if any) of the search query.`var periodAmounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`StringDoublePair`](../-string-double-pair/index.md)`>` |
| [query](query.md) | The query executed.`var query: `[`SearchQuery`](../-search-query/index.md) |
| [results](results.md) | The search result.`var results: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`SearchResult`](../-search-result/index.md)`>` |
