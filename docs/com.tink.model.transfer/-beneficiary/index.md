[link](../../index.md) / [com.tink.model.transfer](../index.md) / [Beneficiary](./index.md)

# Beneficiary

`data class Beneficiary : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

A beneficiary of a transfer

### Parameters

`accountId` - The id of the source account this beneficiary belongs to, see [Account.id](../../com.tink.model.account/-account/id.md)

`accountNumber` - The account number of the beneficiary, for example the BG/PG number or the IBAN

`name` - The name of the beneficiary

`type` - The type of transfer that is used for this beneficiary, for example "iban"

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A beneficiary of a transfer`Beneficiary(ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [accountNumber](account-number.md) | The account number of the beneficiary, for example the BG/PG number or the IBAN`val accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [accountNumberType](account-number-type.md) | `val accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | The name of the beneficiary`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownerAccountId](owner-account-id.md) | `val ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [uri](uri.md) | `val uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
