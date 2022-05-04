---
title: Attributes
---
//[link](../../../../index.html)/[com.tink.model.misc](../../index.html)/[[common]Field](../index.html)/[Attributes](index.html)



# Attributes



[common]\
data class [Attributes](index.html)(val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val hint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val inputType: [Field.InputType](../-input-type/index.html), val selectOptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field.SelectOption](../-select-option/index.html)&gt;)

Represents the attributes of the field used to set up the field input view for the user.



## Constructors


| | |
|---|---|
| [Attributes](-attributes.html) | [common]<br>fun [Attributes](-attributes.html)(description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), hint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), inputType: [Field.InputType](../-input-type/index.html), selectOptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field.SelectOption](../-select-option/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [description](description.html) | [common]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The text explaining what should be inside the field. |
| [helpText](help-text.html) | [common]<br>val [helpText](help-text.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Additional information, possibly longer, to guide the user in adding input. This might be empty. |
| [hint](hint.html) | [common]<br>val [hint](hint.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The text giving the user a suggestion of how the input would look (e.g. YYYYMMDDNNNN for SSN) |
| [inputType](input-type.html) | [common]<br>val [inputType](input-type.html): [Field.InputType](../-input-type/index.html)<br>Contains information about the input type for this field that can be applied to the field input view. |
| [selectOptions](select-options.html) | [common]<br>val [selectOptions](select-options.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field.SelectOption](../-select-option/index.html)&gt;<br>A list of options where the user should select one. |

