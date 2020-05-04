[link](../../index.md) / [com.tink.rest.models](../index.md) / [ActionableInsight](./index.md)

# ActionableInsight

`@JsonClass(true) data class ActionableInsight`

An actionable insight represent some kind of actionable event or insight derived from user data. It could for instance be that a user has low balance on one of their bank accounts where the action could be to transfer money to that account. Another example could be to encourage a user to save more money by creating a budget for a specific category. Read more about it [here](https://docs.tink.com/resources/pfm/actionable-insights).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | An actionable insight represent some kind of actionable event or insight derived from user data. It could for instance be that a user has low balance on one of their bank accounts where the action could be to transfer money to that account. Another example could be to encourage a user to save more money by creating a budget for a specific category. Read more about it [here](https://docs.tink.com/resources/pfm/actionable-insights).`ActionableInsight(userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, data: `[`InsightData`](../-insight-data/index.md)`? = null, createdTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, insightActions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InsightProposedAction`](../-insight-proposed-action/index.md)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [createdTime](created-time.md) | The epoch timestamp in UTC when the insight was created.`var createdTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [data](data.md) | `var data: `[`InsightData`](../-insight-data/index.md)`?` |
| [description](description.md) | The description of the insight which can be shown to the user.`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [id](id.md) | The unique identifier of the insight.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [insightActions](insight-actions.md) | A list of proposed actions that the user can take in response to the insight.`var insightActions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InsightProposedAction`](../-insight-proposed-action/index.md)`>?` |
| [title](title.md) | The title of the insight which can be shown to the user.`var title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | Conveys the meaning of the Insight. The type will also indicate the structure of the data field`var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [userId](user-id.md) | The unique identifier of the user that the insight belongs to.`var userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
