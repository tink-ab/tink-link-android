---
title: [androidJvm]Field
---
//[link](../../../index.html)/[com.tink.model.misc](../index.html)/[[androidJvm]Field](index.html)



# Field



[androidJvm]\
data class [Field](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val validationRules: [Field.ValidationRules](-validation-rules/index.html), val attributes: [Field.Attributes](-attributes/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.



## Constructors


| | |
|---|---|
| [Field](-field.html) | [androidJvm]<br>fun [Field](-field.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), validationRules: [Field.ValidationRules](-validation-rules/index.html), attributes: [Field.Attributes](-attributes/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Attributes](-attributes/index.html) | [androidJvm]<br>data class [Attributes](-attributes/index.html)(val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val hint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val inputType: [Field.InputType](-input-type/index.html), val selectOptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field.SelectOption](-select-option/index.html)&gt;) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Represents the attributes of the field used to set up the field input view for the user. |
| [InputType](-input-type/index.html) | [androidJvm]<br>data class [InputType](-input-type/index.html)(val isMasked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isNumeric: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isImmutable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Represents information about the input type for the field that can be applied to the field input view. |
| [SelectOption](-select-option/index.html) | [androidJvm]<br>data class [SelectOption](-select-option/index.html)(val iconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Represents an option that can be selected by the user. |
| [ValidationResult](-validation-result/index.html) | [androidJvm]<br>sealed class [ValidationResult](-validation-result/index.html)<br>Represents the result of a validation of the user input for a field. It can be either one of two types depending upon whether the user input was valid or not. If the user input is valid, the result is [ValidationResult.Valid](-validation-result/-valid/index.html) If the user input is invalid, the result is [ValidationResult.ValidationError](-validation-result/-validation-error/index.html) |
| [ValidationRules](-validation-rules/index.html) | [androidJvm]<br>data class [ValidationRules](-validation-rules/index.html)(val maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val minLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val patternError: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val isOptional: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Represents rules that determine whether the user input for a field is valid. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [validate](validate.html) | [androidJvm]<br>fun [validate](validate.html)(): [Field.ValidationResult](-validation-result/index.html)<br>Validates the [value](value.html) of the field using the [ValidationRules](-validation-rules/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [attributes](attributes.html) | [androidJvm]<br>val [attributes](attributes.html): [Field.Attributes](-attributes/index.html)<br>The attributes of the field used to set up the field input view for the user |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The name of the field, serving as an identifier |
| [validationRules](validation-rules.html) | [androidJvm]<br>val [validationRules](validation-rules.html): [Field.ValidationRules](-validation-rules/index.html)<br>The rules that determine whether the user input for the field is valid |
| [value](value.html) | [androidJvm]<br>val [value](value.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The current value for the field, fetched from the backend service |

