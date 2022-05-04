---
title: MaxLengthLimit
---
//[link](../../../../../../index.html)/[com.tink.model.misc](../../../../index.html)/[[common]Field](../../../index.html)/[ValidationResult](../../index.html)/[ValidationError](../index.html)/[MaxLengthLimit](index.html)



# MaxLengthLimit



[common]\
data class [MaxLengthLimit](index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](../index.html)

Represents an error where the user input was too long, above the maximum allowed length.



## Constructors


| | |
|---|---|
| [MaxLengthLimit](-max-length-limit.html) | [common]<br>fun [MaxLengthLimit](-max-length-limit.html)(fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [errorMessage](../error-message.html) | [common]<br>val [errorMessage](../error-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A user-friendly message describing the validation error |
| [fieldName](field-name.html) | [common]<br>open override val [fieldName](field-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [name](../../../name.html) of the field |
| [maxLength](max-length.html) | [common]<br>val [maxLength](max-length.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum allowed length for the user input |

