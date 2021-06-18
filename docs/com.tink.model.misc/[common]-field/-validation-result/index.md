---
title: ValidationResult -
---
//[link](../../../index.md)/[com.tink.model.misc](../../index.md)/[[common]Field](../index.md)/[ValidationResult](index.md)



# ValidationResult  
 [common] sealed class [ValidationResult](index.md)

Represents the result of a validation of the user input for a field. It can be either one of two types depending upon whether the user input was valid or not. If the user input is valid, the result is [ValidationResult.Valid](-valid/index.md) If the user input is invalid, the result is [ValidationResult.ValidationError](-validation-error/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/Field.ValidationResult.Valid///PointingToDeclaration/"></a>[Valid](-valid/index.md)| <a name="com.tink.model.misc/Field.ValidationResult.Valid///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Valid](-valid/index.md) : [Field.ValidationResult](index.md)  <br>More info  <br>Represents the type of [ValidationResult](index.md) when the user input is valid.  <br><br><br>
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError///PointingToDeclaration/"></a>[ValidationError](-validation-error/index.md)| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError///PointingToDeclaration/"></a>[common]  <br>Content  <br>sealed class [ValidationError](-validation-error/index.md) : [Field.ValidationResult](index.md)  <br>More info  <br>Represents the type of [ValidationResult](index.md) when the user input is invalid.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.model.misc/Field.ValidationResult.Valid///PointingToDeclaration/"></a>Field.ValidationResult
| <a name="com.tink.model.misc/Field.ValidationResult.ValidationError///PointingToDeclaration/"></a>Field.ValidationResult

