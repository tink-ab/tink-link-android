[link](../../index.md) / [com.tink.rest.models](../index.md) / [SearchQuery](./index.md)

# SearchQuery

`@JsonClass(true) data class SearchQuery`

### Types

| Name | Summary |
|---|---|
| [OrderEnum](-order-enum/index.md) | The order of the result. Values: ASC, DESC`enum class OrderEnum` |
| [SortEnum](-sort-enum/index.md) | The sort order of the result. Values: SCORE, DATE, ACCOUNT, DESCRIPTION, AMOUNT, CATEGORY`enum class SortEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SearchQuery(accounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, categories: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, externalIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, endDate: ZonedDateTime? = null, limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, order: OrderEnum? = null, queryString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, sort: SortEnum? = null, startDate: ZonedDateTime? = null, includeUpcoming: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [accounts](accounts.md) | A list of account IDs to filter by.`var accounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [categories](categories.md) | A list of category IDs to filter by. Could either be leaf node categories, such as the category ID corresponding to &#x60;expenses:food.restaurants&#x60;, or groups of categories, such as the category ID corresponding to &#x60;expenses:food&#x60;.`var categories: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [endDate](end-date.md) | The end date of the result.`var endDate: ZonedDateTime?` |
| [externalIds](external-ids.md) | A list of external IDs to filter by.`var externalIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [includeUpcoming](include-upcoming.md) | Indicates if result should include upcoming transactions.`var includeUpcoming: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [limit](limit.md) | The limit for the result, used for paging. Defaults to 50 if not set or set to 0.`var limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [offset](offset.md) | The offset for the result, used for paging.`var offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [order](order.md) | The order of the result.`var order: OrderEnum?` |
| [queryString](query-string.md) | The string query.`var queryString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [sort](sort.md) | The sort order of the result.`var sort: SortEnum?` |
| [startDate](start-date.md) | The start date of the result.`var startDate: ZonedDateTime?` |
