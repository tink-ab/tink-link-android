[link](../../../index.md) / [com.tink.model.misc](../../index.md) / [Field](../index.md) / [InputType](./index.md)

# InputType

`data class InputType : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Represents information about the input type for the field that can be applied to the field input view.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents information about the input type for the field that can be applied to the field input view.`InputType(isMasked: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, isNumeric: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, isImmutable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [isImmutable](is-immutable.md) | Indicates whether the field input view is editable.`val isImmutable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isMasked](is-masked.md) | Indicates whether the user input for the field should be masked (e.g. A password field)`val isMasked: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isNumeric](is-numeric.md) | Indicates whether the expected input for the field is only numeric, so that a numeric keyboard can be shown to the user`val isNumeric: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
