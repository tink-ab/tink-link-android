---
title: [androidJvm]CreateBeneficiaryDescriptor -
---
//[link](../../index.md)/[com.tink.service.transfer](../index.md)/[[androidJvm]CreateBeneficiaryDescriptor](index.md)



# CreateBeneficiaryDescriptor  
 [androidJvm] data class [CreateBeneficiaryDescriptor](index.md)(**ownerAccountId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **credentialsId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **accountNumber**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **accountNumberType**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Descriptor to create a beneficiary of a transfer

   


## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a>ownerAccountId| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a><br><br>The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a>credentialsId| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a><br><br>The id of the Credentials used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations.<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a>accountNumber| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a><br><br>The account number of the beneficiary, for example the BG/PG number or the IBAN<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a>name| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a><br><br>The name of the beneficiary<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a>accountNumberType| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor///PointingToDeclaration/"></a><br><br>The type of transfer that is used for the beneficiary, for example "iban"<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a> [androidJvm] fun [CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.md)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component3/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component3](component3.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component4/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component4](component4.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component5/#/PointingToDeclaration/"></a>[component5](component5.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/component5/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component5](component5.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/copy/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/copy/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [CreateBeneficiaryDescriptor](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/accountNumber/#/PointingToDeclaration/"></a>[accountNumber](account-number.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/accountNumber/#/PointingToDeclaration/"></a> [androidJvm] val [accountNumber](account-number.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The account number of the beneficiary, for example the BG/PG number or the IBAN   <br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/accountNumberType/#/PointingToDeclaration/"></a>[accountNumberType](account-number-type.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/accountNumberType/#/PointingToDeclaration/"></a> [androidJvm] val [accountNumberType](account-number-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The type of transfer that is used for the beneficiary, for example "iban"   <br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/credentialsId/#/PointingToDeclaration/"></a>[credentialsId](credentials-id.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/credentialsId/#/PointingToDeclaration/"></a> [androidJvm] val [credentialsId](credentials-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The id of the Credentials used to add the beneficiary.   <br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/name/#/PointingToDeclaration/"></a> [androidJvm] val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The name of the beneficiary   <br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/ownerAccountId/#/PointingToDeclaration/"></a>[ownerAccountId](owner-account-id.md)| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/ownerAccountId/#/PointingToDeclaration/"></a> [androidJvm] val [ownerAccountId](owner-account-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)   <br>

