---
title: Invalid
---
//[link](../../../../../../index.html)/[com.tink.model.misc](../../../../index.html)/[[androidJvm]Field](../../../index.html)/[ValidationResult](../../index.html)/[ValidationError](../index.html)/[Invalid](index.html)



# Invalid



[androidJvm]\
data class [Invalid](index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val patternError: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Field.ValidationResult.ValidationError](../index.html)

Represents an error where the user input did not match the [ValidationRules.pattern](../../../-validation-rules/pattern.html).



## Constructors


| | |
|---|---|
| [Invalid](-invalid.html) | [androidJvm]<br>fun [Invalid](-invalid.html)(fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), patternError: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [errorMessage](../error-message.html) | [androidJvm]<br>val [errorMessage](../error-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A user-friendly message describing the validation error |
| [fieldName](field-name.html) | [androidJvm]<br>open override val [fieldName](field-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [name](../../../name.html) of the field |
| [patternError](pattern-error.html) | [androidJvm]<br>val [patternError](pattern-error.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [patternError](pattern-error.html) text to be shown to the user |

