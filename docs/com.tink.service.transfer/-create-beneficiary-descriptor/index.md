[link](../../index.md) / [com.tink.service.transfer](../index.md) / [CreateBeneficiaryDescriptor](./index.md)

# CreateBeneficiaryDescriptor

`data class CreateBeneficiaryDescriptor`

Descriptor to create a beneficiary of a transfer

### Parameters

`ownerAccountId` - The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/-account/id.md)

`credentialsId` - The id of the [Credentials](#) used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations.

`accountNumber` - The account number of the beneficiary, for example the BG/PG number or the IBAN

`name` - The name of the beneficiary

`accountNumberType` - The type of transfer that is used for the beneficiary, for example "iban"

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Descriptor to create a beneficiary of a transfer`CreateBeneficiaryDescriptor(ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [accountNumber](account-number.md) | The account number of the beneficiary, for example the BG/PG number or the IBAN`val accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [accountNumberType](account-number-type.md) | The type of transfer that is used for the beneficiary, for example "iban"`val accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [credentialsId](credentials-id.md) | The id of the [Credentials](#) used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations.`val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | The name of the beneficiary`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownerAccountId](owner-account-id.md) | The id of the source account the beneficiary belongs to, see [Account.id](../../com.tink.model.account/-account/id.md)`val ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
