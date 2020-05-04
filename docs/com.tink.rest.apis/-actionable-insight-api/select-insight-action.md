[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ActionableInsightApi](index.md) / [selectInsightAction](./select-insight-action.md)

# selectInsightAction

`@POST("/api/v1/insights/action") abstract suspend fun selectInsightAction(@Body body: `[`SelectInsightActionRequest`](../../com.tink.rest.models/-select-insight-action-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Take action on an insight
Report a user action on an insight and move the insight to an archived state.

### Parameters

`body` - The insight action that should be selected. (required)