[link](../../../index.md) / [com.tink.model.misc](../../index.md) / [Field](../index.md) / [Attributes](./index.md)

# Attributes

`data class Attributes : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Represents the attributes of the field used to set up the field input view for the user.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Represents the attributes of the field used to set up the field input view for the user.`Attributes(description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, hint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, helpText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, inputType: InputType, selectOptions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<SelectOption>)` |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | The text explaining what should be inside the field.`val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [helpText](help-text.md) | Additional information, possibly longer, to guide the user in adding input. This might be empty.`val helpText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [hint](hint.md) | The text giving the user a suggestion of how the input would look (e.g. YYYYMMDDNNNN for SSN)`val hint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [inputType](input-type.md) | Contains information about the input type for this field that can be applied to the field input view.`val inputType: InputType` |
| [selectOptions](select-options.md) | A list of options where the user should select one.`val selectOptions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<SelectOption>` |
