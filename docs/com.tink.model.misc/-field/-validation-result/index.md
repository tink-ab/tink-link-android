[link](../../../index.md) / [com.tink.model.misc](../../index.md) / [Field](../index.md) / [ValidationResult](./index.md)

# ValidationResult

`sealed class ValidationResult`

Represents the result of a validation of the user input for a field.
It can be either one of two types depending upon whether the user input was valid or not.
If the user input is valid, the result is [ValidationResult.Valid](-valid.md)
If the user input is invalid, the result is [ValidationResult.ValidationError](-validation-error/index.md)

### Types

| Name | Summary |
|---|---|
| [Valid](-valid.md) | Represents the type of [ValidationResult](./index.md) when the user input is valid.`object Valid : ValidationResult` |
| [ValidationError](-validation-error/index.md) | Represents the type of [ValidationResult](./index.md) when the user input is invalid.`sealed class ValidationError : ValidationResult` |
