---
title: ValidationError
---
//[link](../../../../../index.html)/[com.tink.model.misc](../../../index.html)/[[common]Field](../../index.html)/[ValidationResult](../index.html)/[ValidationError](index.html)



# ValidationError



[common]\
sealed class [ValidationError](index.html) : [Field.ValidationResult](../index.html)

Represents the type of [ValidationResult](../index.html) when the user input is invalid.



## Types


| Name | Summary |
|---|---|
| [Invalid](-invalid/index.html) | [common]<br>data class [Invalid](-invalid/index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val patternError: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Field.ValidationResult.ValidationError](index.html)<br>Represents an error where the user input did not match the [ValidationRules.pattern](../../-validation-rules/pattern.html). |
| [MaxLengthLimit](-max-length-limit/index.html) | [common]<br>data class [MaxLengthLimit](-max-length-limit/index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](index.html)<br>Represents an error where the user input was too long, above the maximum allowed length. |
| [MinLengthLimit](-min-length-limit/index.html) | [common]<br>data class [MinLengthLimit](-min-length-limit/index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val minLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](index.html)<br>Represents an error where the user input was too short, below the minimum allowed length. |


## Properties


| Name | Summary |
|---|---|
| [errorMessage](error-message.html) | [common]<br>val [errorMessage](error-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A user-friendly message describing the validation error |
| [fieldName](field-name.html) | [common]<br>abstract val [fieldName](field-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [name](../../name.html) of the field |


## Inheritors


| Name |
|---|
| MinLengthLimit |
| MaxLengthLimit |
| Invalid |

