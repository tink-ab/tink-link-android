---
title: ValidationResult
---
//[link](../../../../index.html)/[com.tink.model.misc](../../index.html)/[[androidJvm]Field](../index.html)/[ValidationResult](index.html)



# ValidationResult



[androidJvm]\
sealed class [ValidationResult](index.html)

Represents the result of a validation of the user input for a field. It can be either one of two types depending upon whether the user input was valid or not. If the user input is valid, the result is [ValidationResult.Valid](-valid/index.html) If the user input is invalid, the result is [ValidationResult.ValidationError](-validation-error/index.html)



## Types


| Name | Summary |
|---|---|
| [Valid](-valid/index.html) | [androidJvm]<br>object [Valid](-valid/index.html) : [Field.ValidationResult](index.html)<br>Represents the type of [ValidationResult](index.html) when the user input is valid. |
| [ValidationError](-validation-error/index.html) | [androidJvm]<br>sealed class [ValidationError](-validation-error/index.html) : [Field.ValidationResult](index.html)<br>Represents the type of [ValidationResult](index.html) when the user input is invalid. |


## Inheritors


| Name |
|---|
| Valid |
| ValidationError |

