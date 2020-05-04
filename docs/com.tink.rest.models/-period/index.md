[link](../../index.md) / [com.tink.rest.models](../index.md) / [Period](./index.md)

# Period

`@JsonClass(true) data class Period`

### Types

| Name | Summary |
|---|---|
| [ResolutionEnum](-resolution-enum/index.md) | Resolution for the statistics. Values: MONTHLY, MONTHLY_ADJUSTED`enum class ResolutionEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Period(endDate: ZonedDateTime? = null, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, resolution: ResolutionEnum? = null, startDate: ZonedDateTime? = null)` |

### Properties

| Name | Summary |
|---|---|
| [endDate](end-date.md) | Timestamp at the end of the period`var endDate: ZonedDateTime?` |
| [name](name.md) | `var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [resolution](resolution.md) | Resolution for the statistics.`var resolution: ResolutionEnum?` |
| [startDate](start-date.md) | Timestamp at the start of the period`var startDate: ZonedDateTime?` |
