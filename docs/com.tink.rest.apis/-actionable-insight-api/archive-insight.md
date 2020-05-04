[link](../../index.md) / [com.tink.rest.apis](../index.md) / [ActionableInsightApi](index.md) / [archiveInsight](./archive-insight.md)

# archiveInsight

`@PUT("/api/v1/insights/{id}/archive") abstract suspend fun archiveInsight(@Path("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Archive an insight
Move an active insight to an archived state.

### Parameters

`id` - The identifier of the insight that should be archived. (required)