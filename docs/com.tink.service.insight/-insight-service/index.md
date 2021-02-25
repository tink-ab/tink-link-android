[link](../../index.md) / [com.tink.service.insight](../index.md) / [InsightService](./index.md)

# InsightService

`interface InsightService`

### Functions

| Name | Summary |
|---|---|
| [listArchived](list-archived.md) | `abstract suspend fun listArchived(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Insight`](../../com.tink.model.insights/-insight/index.md)`>` |
| [listInsights](list-insights.md) | `abstract suspend fun listInsights(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Insight`](../../com.tink.model.insights/-insight/index.md)`>` |
| [selectAction](select-action.md) | `abstract suspend fun selectAction(performedAction: `[`PerformedInsightAction`](../../com.tink.model.insights/-performed-insight-action/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [InsightServiceImpl](../-insight-service-impl/index.md) | `class InsightServiceImpl : `[`InsightService`](./index.md) |
