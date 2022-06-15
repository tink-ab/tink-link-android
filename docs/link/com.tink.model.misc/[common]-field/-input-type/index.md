---
title: InputType
---
//[link](../../../../index.html)/[com.tink.model.misc](../../index.html)/[[common]Field](../index.html)/[InputType](index.html)



# InputType



[common]\
data class [InputType](index.html)(val isMasked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isNumeric: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val isImmutable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))

Represents information about the input type for the field that can be applied to the field input view.



## Constructors


| | |
|---|---|
| [InputType](-input-type.html) | [common]<br>fun [InputType](-input-type.html)(isMasked: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isNumeric: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isImmutable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [isImmutable](is-immutable.html) | [common]<br>val [isImmutable](is-immutable.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether the field input view is editable. |
| [isMasked](is-masked.html) | [common]<br>val [isMasked](is-masked.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether the user input for the field should be masked (e.g. A password field) |
| [isNumeric](is-numeric.html) | [common]<br>val [isNumeric](is-numeric.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether the expected input for the field is only numeric, so that a numeric keyboard can be shown to the user |

