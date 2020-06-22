[link](../../index.md) / [com.tink.link.payments](../index.md) / [AddBeneficiaryStatus](./index.md)

# AddBeneficiaryStatus

`sealed class AddBeneficiaryStatus`

The status of a transfer.
Possible values are [Success](-success/index.md), [Loading](-loading/index.md), and [AwaitingAuthentication](-awaiting-authentication/index.md)

### Types

| Name | Summary |
|---|---|
| [AwaitingAuthentication](-awaiting-authentication/index.md) | There is an outstanding [authentication](-awaiting-authentication/authentication-task.md) waiting that needs to be completed by the user to proceed with adding the beneficiary.`class AwaitingAuthentication : `[`AddBeneficiaryStatus`](./index.md) |
| [Loading](-loading/index.md) | The beneficiary creation is being processed by Tink. There is currently no user action required.`data class Loading : `[`AddBeneficiaryStatus`](./index.md) |
| [Success](-success/index.md) | The beneficiary creation was successfully sent to the user's bank for processing.`data class Success : `[`AddBeneficiaryStatus`](./index.md) |
