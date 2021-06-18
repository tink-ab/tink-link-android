//[link](../../index.md)/[com.tink.service.transfer](../index.md)/[[androidJvm]CreateBeneficiaryDescriptor](index.md)/[CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.md)



# CreateBeneficiaryDescriptor  
[androidJvm]  
Content  
fun [CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.md)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>ownerAccountId| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>credentialsId| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>The id of the Credentials used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations.<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>accountNumber| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>The account number of the beneficiary, for example the BG/PG number or the IBAN<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>name| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>The name of the beneficiary<br><br>
| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>accountNumberType| <a name="com.tink.service.transfer/CreateBeneficiaryDescriptor/CreateBeneficiaryDescriptor/#kotlin.String#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a><br><br>The type of transfer that is used for the beneficiary, for example "iban"<br><br>
  
  



