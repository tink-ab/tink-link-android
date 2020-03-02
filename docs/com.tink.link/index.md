[link](../index.md) / [com.tink.link](./index.md)

## Package com.tink.link

### Types

| Name | Summary |
|---|---|
| [TinkLink](-tink-link/index.md) (Since: `999999999.0.0`) | This is for Java compatibility only. Use extensions on [Tink](../com.tink.core/-tink/index.md) when using Kotlin`object TinkLink` |

### Functions

| Name | Summary |
|---|---|
| [authenticateUser](authenticate-user.md) | Authenticate an existing user with an authentication code.`fun `[`Tink`](../com.tink.core/-tink/index.md)`.authenticateUser(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../com.tink.service.handler/-result-handler/index.md)`<`[`User`](../com.tink.service.authentication.user/-user/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getConsentContext](get-consent-context.md) | `fun `[`Tink`](../com.tink.core/-tink/index.md)`.getConsentContext(): `[`ConsentContext`](../com.tink.link.consent/-consent-context/index.md) |
| [getUserContext](get-user-context.md) | Fetches the [UserContext](../com.tink.link.core.user/-user-context/index.md) from Tink if a user is set.`fun `[`Tink`](../com.tink.core/-tink/index.md)`.getUserContext(): `[`UserContext`](../com.tink.link.core.user/-user-context/index.md)`?` |
