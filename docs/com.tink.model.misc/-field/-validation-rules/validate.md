[link](../../../index.md) / [com.tink.model.misc](../../index.md) / [Field](../index.md) / [ValidationRules](index.md) / [validate](./validate.md)

# validate

`fun validate(fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): ValidationResult`

Validates the user input for a field.

### Parameters

`fieldName` - The [name](../name.md) of the field being validated

`value` - The user input for the field

**Return**
An instance of [ValidationResult](../-validation-result/index.md), either [ValidationResult.Valid](../-validation-result/-valid.md) or [ValidationResult.ValidationError](../-validation-result/-validation-error/index.md).

