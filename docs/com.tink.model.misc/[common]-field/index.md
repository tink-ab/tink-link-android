---
title: [common]Field -
---
//[link](../../index.md)/[com.tink.model.misc](../index.md)/[[common]Field](index.md)



# Field  
 [common] data class [Field](index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **validationRules**: [Field.ValidationRules](-validation-rules/index.md), **attributes**: [Field.Attributes](-attributes/index.md))

This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field/Field/#kotlin.String#kotlin.String#com.tink.model.misc.Field.ValidationRules#com.tink.model.misc.Field.Attributes/PointingToDeclaration/"></a>[Field](-field.md)| <a name="com.tink.model.misc/Field/Field/#kotlin.String#kotlin.String#com.tink.model.misc.Field.ValidationRules#com.tink.model.misc.Field.Attributes/PointingToDeclaration/"></a> [common] fun [Field](-field.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), validationRules: [Field.ValidationRules](-validation-rules/index.md), attributes: [Field.Attributes](-attributes/index.md))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field.Attributes///PointingToDeclaration/"></a>[Attributes](-attributes/index.md)| <a name="com.tink.model.misc/Field.Attributes///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Attributes](-attributes/index.md)(**description**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **hint**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **helpText**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **inputType**: [Field.InputType](-input-type/index.md), **selectOptions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field.SelectOption](-select-option/index.md)>)  <br>More info  <br>Represents the attributes of the field used to set up the field input view for the user.  <br><br><br>
| <a name="com.tink.model.misc/Field.InputType///PointingToDeclaration/"></a>[InputType](-input-type/index.md)| <a name="com.tink.model.misc/Field.InputType///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InputType](-input-type/index.md)(**isMasked**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isNumeric**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **isImmutable**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br>More info  <br>Represents information about the input type for the field that can be applied to the field input view.  <br><br><br>
| <a name="com.tink.model.misc/Field.SelectOption///PointingToDeclaration/"></a>[SelectOption](-select-option/index.md)| <a name="com.tink.model.misc/Field.SelectOption///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [SelectOption](-select-option/index.md)(**iconUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **text**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Represents an option that can be selected by the user.  <br><br><br>
| <a name="com.tink.model.misc/Field.ValidationResult///PointingToDeclaration/"></a>[ValidationResult](-validation-result/index.md)| <a name="com.tink.model.misc/Field.ValidationResult///PointingToDeclaration/"></a>[common]  <br>Content  <br>sealed class [ValidationResult](-validation-result/index.md)  <br>More info  <br>Represents the result of a validation of the user input for a field.  <br><br><br>
| <a name="com.tink.model.misc/Field.ValidationRules///PointingToDeclaration/"></a>[ValidationRules](-validation-rules/index.md)| <a name="com.tink.model.misc/Field.ValidationRules///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [ValidationRules](-validation-rules/index.md)(**maxLength**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **minLength**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **pattern**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **patternError**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **isOptional**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br>More info  <br>Represents rules that determine whether the user input for a field is valid.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.model.misc/Field/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.misc/Field/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.model.misc/Field/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.misc/Field/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.model.misc/Field/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component3](component3.md)(): [Field.ValidationRules](-validation-rules/index.md)  <br><br><br>
| <a name="com.tink.model.misc/Field/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.tink.model.misc/Field/component4/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component4](component4.md)(): [Field.Attributes](-attributes/index.md)  <br><br><br>
| <a name="com.tink.model.misc/Field/copy/#kotlin.String#kotlin.String#com.tink.model.misc.Field.ValidationRules#com.tink.model.misc.Field.Attributes/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.model.misc/Field/copy/#kotlin.String#kotlin.String#com.tink.model.misc.Field.ValidationRules#com.tink.model.misc.Field.Attributes/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), validationRules: [Field.ValidationRules](-validation-rules/index.md), attributes: [Field.Attributes](-attributes/index.md)): [Field](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.misc/Field/validate/#/PointingToDeclaration/"></a>[validate](validate.md)| <a name="com.tink.model.misc/Field/validate/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [validate](validate.md)(): [Field.ValidationResult](-validation-result/index.md)  <br>More info  <br>Validates the [value](value.md) of the field using the [ValidationRules](-validation-rules/index.md)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field/attributes/#/PointingToDeclaration/"></a>[attributes](attributes.md)| <a name="com.tink.model.misc/Field/attributes/#/PointingToDeclaration/"></a> [common] val [attributes](attributes.md): [Field.Attributes](-attributes/index.md)The attributes of the field used to set up the field input view for the user   <br>
| <a name="com.tink.model.misc/Field/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.tink.model.misc/Field/name/#/PointingToDeclaration/"></a> [common] val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The name of the field, serving as an identifier   <br>
| <a name="com.tink.model.misc/Field/validationRules/#/PointingToDeclaration/"></a>[validationRules](validation-rules.md)| <a name="com.tink.model.misc/Field/validationRules/#/PointingToDeclaration/"></a> [common] val [validationRules](validation-rules.md): [Field.ValidationRules](-validation-rules/index.md)The rules that determine whether the user input for the field is valid   <br>
| <a name="com.tink.model.misc/Field/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.tink.model.misc/Field/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The current value for the field, fetched from the backend service   <br>

