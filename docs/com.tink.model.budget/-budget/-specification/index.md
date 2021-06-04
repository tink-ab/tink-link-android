[link](../../../index.md) / [com.tink.model.budget](../../index.md) / [Budget](../index.md) / [Specification](./index.md)

# Specification

`data class Specification : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Types

| Name | Summary |
|---|---|
| [Filter](-filter/index.md) | `data class Filter : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Specification(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, created: Instant, amount: `[`Amount`](../../../com.tink.model.misc/-amount/index.md)`, periodicity: Periodicity, archived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, filter: Filter)` |

### Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | `val amount: `[`Amount`](../../../com.tink.model.misc/-amount/index.md) |
| [archived](archived.md) | `val archived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [created](created.md) | `val created: Instant` |
| [filter](filter.md) | `val filter: Filter` |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodicity](periodicity.md) | `val periodicity: Periodicity` |
