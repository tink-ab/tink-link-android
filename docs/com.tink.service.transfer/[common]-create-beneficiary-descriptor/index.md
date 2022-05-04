---
title: [common]CreateBeneficiaryDescriptor
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[common]CreateBeneficiaryDescriptor](index.html)



# CreateBeneficiaryDescriptor



[common]\
data class [CreateBeneficiaryDescriptor](index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Descriptor to create a beneficiary of a transfer



## Parameters


common

| | |
|---|---|
| ownerAccountId | The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/[common]-account/id.html) |
| credentialsId | The id of the Credentials used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations. |
| accountNumber | The account number of the beneficiary, for example the BG/PG number or the IBAN |
| name | The name of the beneficiary |
| accountNumberType | The type of transfer that is used for the beneficiary, for example &quot;iban&quot; |



## Constructors


| | |
|---|---|
| [CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.html) | [common]<br>fun [CreateBeneficiaryDescriptor](-create-beneficiary-descriptor.html)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accountNumber](account-number.html) | [common]<br>val [accountNumber](account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [accountNumberType](account-number-type.html) | [common]<br>val [accountNumberType](account-number-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [credentialsId](credentials-id.html) | [common]<br>val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownerAccountId](owner-account-id.html) | [common]<br>val [ownerAccountId](owner-account-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

