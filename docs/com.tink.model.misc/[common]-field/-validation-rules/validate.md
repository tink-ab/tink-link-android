---
title: validate
---
//[link](../../../../index.html)/[com.tink.model.misc](../../index.html)/[[common]Field](../index.html)/[ValidationRules](index.html)/[validate](validate.html)



# validate



[common]\
fun [validate](validate.html)(fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Field.ValidationResult](../-validation-result/index.html)



Validates the user input for a field.



#### Return



An instance of [ValidationResult](../-validation-result/index.html), either [ValidationResult.Valid](../-validation-result/-valid/index.html) or [ValidationResult.ValidationError](../-validation-result/-validation-error/index.html).



## Parameters


common

| | |
|---|---|
| fieldName | The [name](../name.html) of the field being validated |
| value | The user input for the field |




