[link](../../index.md) / [com.tink.rest.models](../index.md) / [Currency](./index.md)

# Currency

`@JsonClass(true) data class Currency`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Currency(code: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, factor: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, prefixed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, symbol: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [code](code.md) | The ISO 4217 code of the currency.`var code: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [factor](factor.md) | An approximate currency conversion factor to inversely scale triggers to the EUR currency.`var factor: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [prefixed](prefixed.md) | Indicates that the currency symbol should prefix the amount.`var prefixed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [symbol](symbol.md) | The symbol of the currency.`var symbol: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
