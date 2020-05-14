[link](../index.md) / [com.tink.model.credentials](./index.md)

## Package com.tink.model.credentials

### Types

| Name | Summary |
|---|---|
| [Credentials](-credentials/index.md) | This model represents how users are connected to a [Provider](../com.tink.model.provider/-provider/index.md) to access their financial data.`data class Credentials : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Credentials`](-credentials/index.md)`>, `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [RefreshableItem](-refreshable-item/index.md) | Refreshable items are a way to limit which types of data should be aggregated from a provider.`enum class RefreshableItem` |

### Functions

| Name | Summary |
|---|---|
| [plus](plus.md) | `operator fun `[`RefreshableItem`](-refreshable-item/index.md)`.plus(other: `[`RefreshableItem`](-refreshable-item/index.md)`): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](-refreshable-item/index.md)`>` |
