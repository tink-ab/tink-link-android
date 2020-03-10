[link](../../../../../index.md) / [com.tink.model.misc](../../../../index.md) / [Field](../../../index.md) / [ValidationResult](../../index.md) / [ValidationError](../index.md) / [Invalid](./index.md)

# Invalid

`data class Invalid : ValidationError`

Represents an error where the user input did not match the [ValidationRules.pattern](../../../-validation-rules/pattern.md).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents an error where the user input did not match the [ValidationRules.pattern](../../../-validation-rules/pattern.md).`Invalid(fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, patternError: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [fieldName](field-name.md) | The [name](../../../name.md) of the field`val fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [patternError](pattern-error.md) | The [patternError](pattern-error.md) text to be shown to the user`val patternError: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
