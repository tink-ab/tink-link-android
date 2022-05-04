---
title: [common]Beneficiary
---
//[link](../../../index.html)/[com.tink.model.transfer](../index.html)/[[common]Beneficiary](index.html)



# Beneficiary



[common]\
data class [Beneficiary](index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

A beneficiary is a payment or transfer destination account which has been authorized by the bank. Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary.



However, different banks treat beneficiaries in different ways. Some treat them as fully trusted, meaning no signing at all is required when transferring money to the beneficiary. Other banks treat them more as address books of registered recipients.



## Parameters


common

| | |
|---|---|
| ownerAccountId | The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/[common]-account/id.html) |
| accountNumber | The account number for the beneficiary. The structure of this field depends on the [accountNumberType](account-number-type.html). |
| accountNumberType | The type of the [accountNumber](account-number.html) that this beneficiary has. See [AccountNumberTypes](-account-number-types/index.html) for supported types. |
| name | The name chosen by the user for this beneficiary. |



## Constructors


| | |
|---|---|
| [Beneficiary](-beneficiary.html) | [common]<br>fun [Beneficiary](-beneficiary.html)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [AccountNumberTypes](-account-number-types/index.html) | [common]<br>object [AccountNumberTypes](-account-number-types/index.html)<br>The supported types for the [accountNumber](account-number.html) that this beneficiary has. |


## Properties


| Name | Summary |
|---|---|
| [accountNumber](account-number.html) | [common]<br>val [accountNumber](account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [accountNumberType](account-number-type.html) | [common]<br>val [accountNumberType](account-number-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownerAccountId](owner-account-id.html) | [common]<br>val [ownerAccountId](owner-account-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [uri](uri.html) | [common]<br>val [uri](uri.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

