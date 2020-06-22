[link](../../index.md) / [com.tink.service.transfer](../index.md) / [CreateBeneficiaryDescriptor](index.md) / [credentialsId](./credentials-id.md)

# credentialsId

`val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

The id of the [Credentials](#) used to add the beneficiary. Note that you can send in a different id here than the credentials id to which the account belongs. This functionality exists to support the case where you may have double credentials for one financial institution, due to PSD2 regulations.

