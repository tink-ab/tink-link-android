---
title: [common]AddBeneficiaryStatus -
---
//[link](../../index.md)/[com.tink.link.payments](../index.md)/[[common]AddBeneficiaryStatus](index.md)



# AddBeneficiaryStatus  
 [common] sealed class [AddBeneficiaryStatus](index.md)

The status of a transfer. Possible values are [Success](-success/index.md), [Loading](-loading/index.md), and [AwaitingAuthentication](-awaiting-authentication/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/AddBeneficiaryStatus.AwaitingAuthentication///PointingToDeclaration/"></a>[AwaitingAuthentication](-awaiting-authentication/index.md)| <a name="com.tink.link.payments/AddBeneficiaryStatus.AwaitingAuthentication///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [AwaitingAuthentication](-awaiting-authentication/index.md)(**authenticationTask**: [AuthenticationTask](../../com.tink.link.authentication/[common]-authentication-task/index.md)) : [AddBeneficiaryStatus](index.md)  <br>More info  <br>There is an outstanding [authentication](-awaiting-authentication/authentication-task.md) waiting that needs to be completed by the user to proceed with adding the beneficiary.  <br><br><br>
| <a name="com.tink.link.payments/AddBeneficiaryStatus.Loading///PointingToDeclaration/"></a>[Loading](-loading/index.md)| <a name="com.tink.link.payments/AddBeneficiaryStatus.Loading///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Loading](-loading/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [AddBeneficiaryStatus](index.md)  <br>More info  <br>The beneficiary creation is being processed by Tink.  <br><br><br>
| <a name="com.tink.link.payments/AddBeneficiaryStatus.Success///PointingToDeclaration/"></a>[Success](-success/index.md)| <a name="com.tink.link.payments/AddBeneficiaryStatus.Success///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Success](-success/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [AddBeneficiaryStatus](index.md)  <br>More info  <br>The beneficiary creation was successfully sent to the user's bank for processing.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.payments/AddBeneficiaryStatus.Success///PointingToDeclaration/"></a>AddBeneficiaryStatus
| <a name="com.tink.link.payments/AddBeneficiaryStatus.Loading///PointingToDeclaration/"></a>AddBeneficiaryStatus
| <a name="com.tink.link.payments/AddBeneficiaryStatus.AwaitingAuthentication///PointingToDeclaration/"></a>AddBeneficiaryStatus

