[link](../../index.md) / [com.tink.rest.models](../index.md) / [CurrencyDenominatedAmount](./index.md)

# CurrencyDenominatedAmount

`@JsonClass(true) data class CurrencyDenominatedAmount`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CurrencyDenominatedAmount(unscaledValue: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, scale: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, currencyCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [currencyCode](currency-code.md) | The ISO 4217 currency code of the amount`var currencyCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [scale](scale.md) | The scale of the amount.`var scale: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [unscaledValue](unscaled-value.md) | The unscaled value of the amount`var unscaledValue: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
