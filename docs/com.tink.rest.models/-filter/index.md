[link](../../index.md) / [com.tink.rest.models](../index.md) / [Filter](./index.md)

# Filter

`@JsonClass(true) data class Filter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Filter(accounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetFilterAccount`](../-budget-filter-account/index.md)`>? = null, categories: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetFilterCategory`](../-budget-filter-category/index.md)`>? = null, tags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetFilterTag`](../-budget-filter-tag/index.md)`>? = null, freeTextQuery: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [accounts](accounts.md) | List of included accounts. Applied as logical or (union).`var accounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetFilterAccount`](../-budget-filter-account/index.md)`>?` |
| [categories](categories.md) | List of included categories. Applied as logical or (union).`var categories: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetFilterCategory`](../-budget-filter-category/index.md)`>?` |
| [freeTextQuery](free-text-query.md) | Query for a partial transaction description match.`var freeTextQuery: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [tags](tags.md) | List of included tags. Applied as logical or (union).`var tags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BudgetFilterTag`](../-budget-filter-tag/index.md)`>?` |
