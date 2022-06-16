---
title: [androidJvm]Beneficiary
---
//[link](../../../index.html)/[com.tink.model.transfer](../index.html)/[[androidJvm]Beneficiary](index.html)



# Beneficiary



[androidJvm]\
data class [Beneficiary](index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

A beneficiary is a payment or transfer destination account which has been authorized by the bank. Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary.



However, different banks treat beneficiaries in different ways. Some treat them as fully trusted, meaning no signing at all is required when transferring money to the beneficiary. Other banks treat them more as address books of registered recipients.



## Parameters


androidJvm

| | |
|---|---|
| ownerAccountId | The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.html) |
| accountNumber | The account number for the beneficiary. The structure of this field depends on the [accountNumberType](account-number-type.html). |
| accountNumberType | The type of the [accountNumber](account-number.html) that this beneficiary has. See [AccountNumberTypes](-account-number-types/index.html) for supported types. |
| name | The name chosen by the user for this beneficiary. |



## Constructors


| | |
|---|---|
| [Beneficiary](-beneficiary.html) | [androidJvm]<br>fun [Beneficiary](-beneficiary.html)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Types


| Name | Summary |
|---|---|
| [AccountNumberTypes](-account-number-types/index.html) | [androidJvm]<br>object [AccountNumberTypes](-account-number-types/index.html)<br>The supported types for the [accountNumber](account-number.html) that this beneficiary has. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accountNumber](account-number.html) | [androidJvm]<br>val [accountNumber](account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [accountNumberType](account-number-type.html) | [androidJvm]<br>val [accountNumberType](account-number-type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownerAccountId](owner-account-id.html) | [androidJvm]<br>val [ownerAccountId](owner-account-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [uri](uri.html) | [androidJvm]<br>val [uri](uri.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

