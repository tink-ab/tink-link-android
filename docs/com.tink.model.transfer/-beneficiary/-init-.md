[link](../../index.md) / [com.tink.model.transfer](../index.md) / [Beneficiary](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Beneficiary(ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

A beneficiary of a transfer

### Parameters

`accountId` - The id of the source account this beneficiary belongs to, see [Account.id](../../com.tink.model.account/-account/id.md)

`accountNumber` - The account number of the beneficiary, for example the BG/PG number or the IBAN

`name` - The name of the beneficiary

`type` - The type of transfer that is used for this beneficiary, for example "iban"