[link](../../index.md) / [com.tink.rest.models](../index.md) / [StatisticQuery](./index.md)

# StatisticQuery

`@JsonClass(true) data class StatisticQuery`

### Types

| Name | Summary |
|---|---|
| [ResolutionEnum](-resolution-enum/index.md) | Resolution for the statistics. Note that monthly statistics will be calculated only with the resolution that the user has in the user settings (MONTHLY, MONTHLY_ADJUSTED), and not for both. Values: DAILY, MONTHLY, MONTHLY_ADJUSTED, YEARLY, ALL, WEEKLY`enum class ResolutionEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StatisticQuery(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, periods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, resolution: ResolutionEnum? = null, types: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, padResultUntilToday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | Identifier of the data the statistic represents. This could for example be a category ID.`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [padResultUntilToday](pad-result-until-today.md) | Indicates if the result should be flat filled until the period of today.`var padResultUntilToday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [periods](periods.md) | Time periods for the statistics: year, month, week or day. Format: &#x60;2014&#x60;, &#x60;2014-02&#x60;, &#x60;2014:45&#x60; or &#x60;2014-02-12&#x60;.`var periods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [resolution](resolution.md) | Resolution for the statistics. Note that monthly statistics will be calculated only with the resolution that the user has in the user settings (MONTHLY, MONTHLY_ADJUSTED), and not for both.`var resolution: ResolutionEnum?` |
| [types](types.md) | A list of types of statistics. Default: &#x60;expenses-by-category&#x60;, &#x60;income-by-category&#x60;, &#x60;left-to-spend&#x60;, &#x60;left-to-spend-average&#x60;. Read more about statistics for type information.`var types: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
