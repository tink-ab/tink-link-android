---
title: ValidationError -
---
//[link](../../../../index.md)/[com.tink.model.misc](../../../index.md)/[[androidJvm]Field](../../index.md)/[ValidationResult](../index.md)/[ValidationError](index.md)



# ValidationError  
 [androidJvm] sealed class [ValidationError](index.md) : [Field.ValidationResult](../index.md)

Represents the type of [ValidationResult](../index.md) when the user input is invalid.

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.Invalid///PointingToDeclaration/"></a>[Invalid](-invalid/index.md)| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.Invalid///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [Invalid](-invalid/index.md)(**fieldName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **patternError**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Field.ValidationResult.ValidationError](index.md)  <br>More info  <br>Represents an error where the user input did not match the [ValidationRules.pattern](../../-validation-rules/pattern.md).  <br><br><br>
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.MaxLengthLimit///PointingToDeclaration/"></a>[MaxLengthLimit](-max-length-limit/index.md)| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.MaxLengthLimit///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [MaxLengthLimit](-max-length-limit/index.md)(**fieldName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **maxLength**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](index.md)  <br>More info  <br>Represents an error where the user input was too long, above the maximum allowed length.  <br><br><br>
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.MinLengthLimit///PointingToDeclaration/"></a>[MinLengthLimit](-min-length-limit/index.md)| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.MinLengthLimit///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [MinLengthLimit](-min-length-limit/index.md)(**fieldName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **minLength**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Field.ValidationResult.ValidationError](index.md)  <br>More info  <br>Represents an error where the user input was too short, below the minimum allowed length.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError/errorMessage/#/PointingToDeclaration/"></a>[errorMessage](error-message.md)| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError/errorMessage/#/PointingToDeclaration/"></a> [androidJvm] val [errorMessage](error-message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?A user-friendly message describing the validation error   <br>
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError/fieldName/#/PointingToDeclaration/"></a>[fieldName](field-name.md)| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError/fieldName/#/PointingToDeclaration/"></a> [androidJvm] abstract val [fieldName](field-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The [name](../../name.md) of the field   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.MinLengthLimit///PointingToDeclaration/"></a>Field.ValidationResult.ValidationError
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.MaxLengthLimit///PointingToDeclaration/"></a>Field.ValidationResult.ValidationError
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError.Invalid///PointingToDeclaration/"></a>Field.ValidationResult.ValidationError

