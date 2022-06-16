---
title: Beneficiary
---
//[link](../../../index.html)/[com.tink.model.transfer](../index.html)/[[common]Beneficiary](index.html)/[Beneficiary](-beneficiary.html)



# Beneficiary



[common]\
fun [Beneficiary](-beneficiary.html)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



## Parameters


common

| | |
|---|---|
| ownerAccountId | The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/[common]-account/id.html) |
| accountNumber | The account number for the beneficiary. The structure of this field depends on the accountNumberType. |
| accountNumberType | The type of the accountNumber that this beneficiary has. See [AccountNumberTypes](-account-number-types/index.html) for supported types. |
| name | The name chosen by the user for this beneficiary. |




