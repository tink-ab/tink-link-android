[link](../../index.md) / [com.tink.model.insights](../index.md) / [InsightAction](./index.md)

# InsightAction

`data class InsightAction : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Types

| Name | Summary |
|---|---|
| [Data](-data/index.md) | All subclasses should be data classes or provide a meaningful `equals()` function`sealed class Data : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [Type](-type/index.md) | `enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InsightAction(label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, actionType: Type, data: Data)` |

### Properties

| Name | Summary |
|---|---|
| [actionType](action-type.md) | `val actionType: Type` |
| [data](data.md) | `val data: Data` |
| [label](label.md) | `val label: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
