[link](../../../index.md) / [com.tink.model.misc](../../index.md) / [Field](../index.md) / [ValidationRules](./index.md)

# ValidationRules

`data class ValidationRules : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Represents rules that determine whether the user input for a field is valid.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents rules that determine whether the user input for a field is valid.`ValidationRules(maxLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, minLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, patternError: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, isOptional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [isOptional](is-optional.md) | Indicates whether the user input is optional`val isOptional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [maxLength](max-length.md) | The maximum allowed length for the user input`val maxLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [minLength](min-length.md) | The minimum allowed length for the user input`val minLength: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [pattern](pattern.md) | The regex pattern allowed for the user input`val pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [patternError](pattern-error.md) | A user-friendly text describing an error where the user input did not match the [pattern](pattern.md)`val patternError: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [validate](validate.md) | Validates the user input for a field.`fun validate(fieldName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): ValidationResult` |
