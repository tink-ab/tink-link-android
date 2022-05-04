---
title: MaxLengthLimit
---
//[link](../../../../../../index.html)/[com.tink.model.misc](../../../../index.html)/[[androidJvm]Field](../../../index.html)/[ValidationResult](../../index.html)/[ValidationError](../index.html)/[MaxLengthLimit](index.html)



# MaxLengthLimit



[androidJvm]\
data class [MaxLengthLimit](index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](../index.html)

Represents an error where the user input was too long, above the maximum allowed length.



## Constructors


| | |
|---|---|
| [MaxLengthLimit](-max-length-limit.html) | [androidJvm]<br>fun [MaxLengthLimit](-max-length-limit.html)(fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [errorMessage](../error-message.html) | [androidJvm]<br>val [errorMessage](../error-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A user-friendly message describing the validation error |
| [fieldName](field-name.html) | [androidJvm]<br>open override val [fieldName](field-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [name](../../../name.html) of the field |
| [maxLength](max-length.html) | [androidJvm]<br>val [maxLength](max-length.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum allowed length for the user input |

