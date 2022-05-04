---
title: CreateBeneficiaryDescriptor
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[common]CreateBeneficiaryDescriptor](index.html)/[CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.html)



# CreateBeneficiaryDescriptor



[common]\
fun [CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.html)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Parameters


common

| | |
|---|---|
| ownerAccountId | The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/[common]-account/id.html) |
| credentialsId | The id of the Credentials used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations. |
| accountNumber | The account number of the beneficiary, for example the BG/PG number or the IBAN |
| name | The name of the beneficiary |
| accountNumberType | The type of transfer that is used for the beneficiary, for example &quot;iban&quot; |




