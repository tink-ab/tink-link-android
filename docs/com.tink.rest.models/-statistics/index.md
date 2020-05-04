[link](../../index.md) / [com.tink.rest.models](../index.md) / [Statistics](./index.md)

# Statistics

`@JsonClass(true) data class Statistics`

Statistics contain derived data from different types of information which is available for a user. This calculated data is stored for a certain period of time with a certain time resolution, and could be based on information such as expenses, incomes or balances. As an example, statistics could be a time series of travel expenses calculated monthly for the last six months.

### Types

| Name | Summary |
|---|---|
| [ResolutionEnum](-resolution-enum/index.md) | Resolution for the statistics. Values: DAILY, MONTHLY, MONTHLY_ADJUSTED, YEARLY, ALL, WEEKLY`enum class ResolutionEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Statistics contain derived data from different types of information which is available for a user. This calculated data is stored for a certain period of time with a certain time resolution, and could be based on information such as expenses, incomes or balances. As an example, statistics could be a time series of travel expenses calculated monthly for the last six months.`Statistics(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, period: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resolution: ResolutionEnum, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, payload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | Identifier of the data the statistic represents.`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [payload](payload.md) | Secondary identifier of the data the statistic represent.`var payload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [period](period.md) | The statistic&#39;s period, depends on its resolution. One of: year, month, week or day. Format: &#x60;2014&#x60;, &#x60;2014-02&#x60;, &#x60;2014:45&#x60; or &#x60;2014-02-12&#x60;.`var period: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resolution](resolution.md) | Resolution for the statistics.`var resolution: ResolutionEnum` |
| [type](type.md) | The statistic&#39;s type.`var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [userId](user-id.md) | The internal identifier of the user that the statistics belongs to.`var userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [value](value.md) | The value of the statistics for this type, period, and description.`var value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
