---
title: MinLengthLimit
---
//[link](../../../../../../index.html)/[com.tink.model.misc](../../../../index.html)/[[androidJvm]Field](../../../index.html)/[ValidationResult](../../index.html)/[ValidationError](../index.html)/[MinLengthLimit](index.html)



# MinLengthLimit



[androidJvm]\
data class [MinLengthLimit](index.html)(val fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val minLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](../index.html)

Represents an error where the user input was too short, below the minimum allowed length.



## Constructors


| | |
|---|---|
| [MinLengthLimit](-min-length-limit.html) | [androidJvm]<br>fun [MinLengthLimit](-min-length-limit.html)(fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), minLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [errorMessage](../error-message.html) | [androidJvm]<br>val [errorMessage](../error-message.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>A user-friendly message describing the validation error |
| [fieldName](field-name.html) | [androidJvm]<br>open override val [fieldName](field-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [name](../../../name.html) of the field |
| [minLength](min-length.html) | [androidJvm]<br>val [minLength](min-length.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The minimum allowed length for the user input |

