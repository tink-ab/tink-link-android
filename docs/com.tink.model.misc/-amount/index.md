[link](../../index.md) / [com.tink.model.misc](../index.md) / [Amount](./index.md)

# Amount

`data class Amount : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Amount(value: `[`ExactNumber`](../-exact-number/index.md)`, currencyCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [currencyCode](currency-code.md) | `val currencyCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [value](value.md) | `val value: `[`ExactNumber`](../-exact-number/index.md) |

### Extension Functions

| Name | Summary |
|---|---|
| [toDto](../../com.tink.service.misc/to-dto.md) | `fun `[`Amount`](./index.md)`.toDto(): CurrencyDenominatedAmount` |
