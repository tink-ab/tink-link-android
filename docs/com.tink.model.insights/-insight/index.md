[link](../../index.md) / [com.tink.model.insights](../index.md) / [Insight](./index.md)

# Insight

`data class Insight : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Types

| Name | Summary |
|---|---|
| [ViewDetails](-view-details.md) | All subclasses should be data classes or provide a meaningful `equals()` function`interface ViewDetails : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Insight(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: `[`InsightType`](../-insight-type/index.md)`, title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, created: Instant, actions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InsightAction`](../-insight-action/index.md)`>, state: `[`InsightState`](../-insight-state/index.md)`, data: `[`InsightData`](../-insight-data/index.md)`, viewDetails: ViewDetails? = null)` |

### Properties

| Name | Summary |
|---|---|
| [actions](actions.md) | `val actions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InsightAction`](../-insight-action/index.md)`>` |
| [created](created.md) | `val created: Instant` |
| [data](data.md) | `val data: `[`InsightData`](../-insight-data/index.md) |
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [state](state.md) | `val state: `[`InsightState`](../-insight-state/index.md) |
| [title](title.md) | `val title: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [type](type.md) | `val type: `[`InsightType`](../-insight-type/index.md) |
| [viewDetails](view-details.md) | `var viewDetails: ViewDetails?` |
