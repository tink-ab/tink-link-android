[link](../../index.md) / [com.tink.model.misc](../index.md) / [Field](./index.md)

# Field

`data class Field : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.

### Types

| Name | Summary |
|---|---|
| [Attributes](-attributes/index.md) | Represents the attributes of the field used to set up the field input view for the user.`data class Attributes : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [InputType](-input-type/index.md) | Represents information about the input type for the field that can be applied to the field input view.`data class InputType : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [ValidationResult](-validation-result/index.md) | Represents the result of a validation of the user input for a field. It can be either one of two types depending upon whether the user input was valid or not. If the user input is valid, the result is [ValidationResult.Valid](-validation-result/-valid.md) If the user input is invalid, the result is [ValidationResult.ValidationError](-validation-result/-validation-error/index.md)`sealed class ValidationResult` |
| [ValidationRules](-validation-rules/index.md) | Represents rules that determine whether the user input for a field is valid.`data class ValidationRules : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.`Field(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, validationRules: ValidationRules, attributes: Attributes)` |

### Properties

| Name | Summary |
|---|---|
| [attributes](attributes.md) | The attributes of the field used to set up the field input view for the user`val attributes: Attributes` |
| [name](name.md) | The name of the field, serving as an identifier`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [validationRules](validation-rules.md) | The rules that determine whether the user input for the field is valid`val validationRules: ValidationRules` |
| [value](value.md) | The current value for the field, fetched from the backend service`val value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [validate](validate.md) | Validates the [value](value.md) of the field using the [ValidationRules](-validation-rules/index.md)`fun validate(): ValidationResult` |
