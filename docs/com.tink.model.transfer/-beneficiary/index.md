[link](../../index.md) / [com.tink.model.transfer](../index.md) / [Beneficiary](./index.md)

# Beneficiary

`data class Beneficiary : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

A beneficiary is a payment or transfer destination account which has been authorized by the bank.
Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary.

However, different banks treat beneficiaries in different ways.
Some treat them as fully trusted, meaning no signing at all is required when transferring money to the beneficiary.
Other banks treat them more as address books of registered recipients.

### Parameters

`ownerAccountId` - The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/-account/id.md)

`accountNumber` - The account number for the beneficiary. The structure of this field depends on the [accountNumberType](account-number-type.md).

`accountNumberType` - The type of the [accountNumber](account-number.md) that this beneficiary has. See [AccountNumberTypes](-account-number-types/index.md) for supported types.

`name` - The name chosen by the user for this beneficiary.

### Types

| Name | Summary |
|---|---|
| [AccountNumberTypes](-account-number-types/index.md) | The supported types for the [accountNumber](account-number.md) that this beneficiary has.`object AccountNumberTypes` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A beneficiary is a payment or transfer destination account which has been authorized by the bank. Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary.`Beneficiary(ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [accountNumber](account-number.md) | The account number for the beneficiary. The structure of this field depends on the [accountNumberType](account-number-type.md).`val accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [accountNumberType](account-number-type.md) | The type of the [accountNumber](account-number.md) that this beneficiary has. See [AccountNumberTypes](-account-number-types/index.md) for supported types.`val accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | The name chosen by the user for this beneficiary.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownerAccountId](owner-account-id.md) | The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/-account/id.md)`val ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [uri](uri.md) | `val uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
