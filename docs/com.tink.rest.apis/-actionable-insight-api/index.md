[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ActionableInsightApi](./index.md)

# ActionableInsightApi

`@JvmSuppressWildcards interface ActionableInsightApi`

### Functions

| Name | Summary |
|---|---|
| [archiveInsight](archive-insight.md) | Archive an insight Move an active insight to an archived state.`abstract suspend fun archiveInsight(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [list](list.md) | List insights Lists all insights for the user.`abstract suspend fun list(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ActionableInsight`](../../com.tink.rest.models/-actionable-insight/index.md)`>` |
| [listArchivedInsights](list-archived-insights.md) | List archived insights Lists all archived insights for the user.`abstract suspend fun listArchivedInsights(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ArchivedInsight`](../../com.tink.rest.models/-archived-insight/index.md)`>` |
| [selectInsightAction](select-insight-action.md) | Take action on an insight Report a user action on an insight and move the insight to an archived state.`abstract suspend fun selectInsightAction(body: `[`SelectInsightActionRequest`](../../com.tink.rest.models/-select-insight-action-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
