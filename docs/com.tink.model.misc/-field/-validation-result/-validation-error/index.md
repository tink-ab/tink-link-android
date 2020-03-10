[link](../../../../index.md) / [com.tink.model.misc](../../../index.md) / [Field](../../index.md) / [ValidationResult](../index.md) / [ValidationError](./index.md)

# ValidationError

`sealed class ValidationError : ValidationResult`

Represents the type of [ValidationResult](../index.md) when the user input is invalid.

### Types

| Name | Summary |
|---|---|
| [Invalid](-invalid/index.md) | Represents an error where the user input did not match the [ValidationRules.pattern](../../-validation-rules/pattern.md).`data class Invalid : ValidationError` |
| [MaxLengthLimit](-max-length-limit/index.md) | Represents an error where the user input was too long, above the maximum allowed length.`data class MaxLengthLimit : ValidationError` |
| [MinLengthLimit](-min-length-limit/index.md) | Represents an error where the user input was too short, below the minimum allowed length.`data class MinLengthLimit : ValidationError` |

### Properties

| Name | Summary |
|---|---|
| [errorMessage](error-message.md) | A user-friendly message describing the validation error`val errorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [fieldName](field-name.md) | The [name](../../name.md) of the field`abstract val fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
