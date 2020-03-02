[link](../../../../../index.md) / [com.tink.model.misc](../../../../index.md) / [Field](../../../index.md) / [ValidationResult](../../index.md) / [ValidationError](../index.md) / [MinLengthLimit](./index.md)

# MinLengthLimit

`data class MinLengthLimit : ValidationError`

Represents an error where the user input was too short, below the minimum allowed length.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents an error where the user input was too short, below the minimum allowed length.`MinLengthLimit(fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, minLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [fieldName](field-name.md) | The [name](../../../name.md) of the field`val fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [minLength](min-length.md) | The minimum allowed length for the user input`val minLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
