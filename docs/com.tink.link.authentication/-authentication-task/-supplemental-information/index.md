[link](../../../index.md) / [com.tink.link.authentication](../../index.md) / [AuthenticationTask](../index.md) / [SupplementalInformation](./index.md)

# SupplementalInformation

`data class SupplementalInformation : `[`AuthenticationTask`](../index.md)

Indicates that there is additional information required from the user to proceed. This can
for example be an OTP sent via SMS or authentication app.
First the [fields](fields.md) should be made accessible to the user for example as text input fields.
Then [submit](submit.md) should be called as soon as the fields have been validated and the user is
ready to send the information.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Indicates that there is additional information required from the user to proceed. This can for example be an OTP sent via SMS or authentication app. First the [fields](fields.md) should be made accessible to the user for example as text input fields. Then [submit](submit.md) should be called as soon as the fields have been validated and the user is ready to send the information.`SupplementalInformation(credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [fields](fields.md) | The fields that need to be displayed to the user for input`val fields: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../../../com.tink.model.misc/-field/index.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [cancel](cancel.md) | Cancel the ongoing supplemental information task. This can be used to fail the authentication should the user back out of the authentication. If not called, the authentication will time out on its own. This is a shortcut to be able to get into a failed state faster and thus be able to retry more quickly.`fun cancel(resultHandler: `[`ResultHandler`](../../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [submit](submit.md) | Submit supplemental information for the authentication to Tink. Should be called as soon as the fields have been validated and the user is ready to send the information.`fun submit(filledFields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
