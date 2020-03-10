[link](../../index.md) / [com.tink.model.misc](../index.md) / [ExactNumber](./index.md)

# ExactNumber

`data class ExactNumber : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`ExactNumber`](./index.md)`>, `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ExactNumber(unscaledValue: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, scale: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [scale](scale.md) | `val scale: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [unscaledValue](unscaled-value.md) | `val unscaledValue: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

### Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | `fun compareTo(other: `[`ExactNumber`](./index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toBigDecimal](to-big-decimal.md) | `fun toBigDecimal(): `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html) |
