[link](../../index.md) / [com.tink.rest.models](../index.md) / [ArchivedInsight](./index.md)

# ArchivedInsight

`@JsonClass(true) data class ArchivedInsight`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ArchivedInsight(userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, data: `[`InsightData`](../-insight-data/index.md)`? = null, dateInsightCreated: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, dateArchived: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [data](data.md) | `var data: `[`InsightData`](../-insight-data/index.md)`?` |
| [dateArchived](date-archived.md) | The epoch timestamp in UTC when the insight was archived.`var dateArchived: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [dateInsightCreated](date-insight-created.md) | The epoch timestamp in UTC when the insight was created.`var dateInsightCreated: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [description](description.md) | The description of the archived insight.`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [id](id.md) | The ID of the archived insight. This is the same ID as for the corresponding insight, before it has been archived.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [title](title.md) | The title of the archived insight.`var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | The type of the archived insight.`var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [userId](user-id.md) | The ID of the user that the archived insight belongs to.`var userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
