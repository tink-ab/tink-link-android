[link](../../../../../index.md) / [com.tink.model.misc](../../../../index.md) / [Field](../../../index.md) / [ValidationResult](../../index.md) / [ValidationError](../index.md) / [MaxLengthLimit](./index.md)

# MaxLengthLimit

`data class MaxLengthLimit : ValidationError`

Represents an error where the user input was too long, above the maximum allowed length.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents an error where the user input was too long, above the maximum allowed length.`MaxLengthLimit(fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, maxLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [fieldName](field-name.md) | The [name](../../../name.md) of the field`val fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [maxLength](max-length.md) | The maximum allowed length for the user input`val maxLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
