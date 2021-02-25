[link](../../index.md) / [com.tink.service.insight](../index.md) / [InsightServiceImpl](./index.md)

# InsightServiceImpl

`class InsightServiceImpl : `[`InsightService`](../-insight-service/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InsightServiceImpl(api: ActionableInsightApi)` |

### Properties

| Name | Summary |
|---|---|
| [api](api.md) | `val api: ActionableInsightApi` |

### Functions

| Name | Summary |
|---|---|
| [listArchived](list-archived.md) | `suspend fun listArchived(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Insight`](../../com.tink.model.insights/-insight/index.md)`>` |
| [listInsights](list-insights.md) | `suspend fun listInsights(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Insight`](../../com.tink.model.insights/-insight/index.md)`>` |
| [selectAction](select-action.md) | `suspend fun selectAction(performedAction: `[`PerformedInsightAction`](../../com.tink.model.insights/-performed-insight-action/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
