[link](../../index.md) / [com.tink.core](../index.md) / [Tink](./index.md)

# Tink

`object Tink`

### Functions

| Name | Summary |
|---|---|
| [getUser](get-user.md) | `fun getUser(): `[`User`](../../com.tink.service.authentication.user/-user/index.md)`?` |
| [init](init.md) | `fun init(config: `[`TinkConfiguration`](../../com.tink.service.network/-tink-configuration/index.md)`, context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [providerRepository](provider-repository.md) | `fun providerRepository(): `[`ProviderRepository`](../../com.tink.core.provider/-provider-repository/index.md) |
| [requireComponent](require-component.md) | `fun requireComponent(): `[`TinkComponent`](../-tink-component/index.md) |
| [setUser](set-user.md) | `fun setUser(user: `[`User`](../../com.tink.service.authentication.user/-user/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| [authenticateUser](../../com.tink.link/authenticate-user.md) | Authenticate an existing user with an authentication code.`fun `[`Tink`](./index.md)`.authenticateUser(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`User`](../../com.tink.service.authentication.user/-user/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getConsentContext](../../com.tink.link/get-consent-context.md) | `fun `[`Tink`](./index.md)`.getConsentContext(): `[`ConsentContext`](../../com.tink.link.consent/-consent-context/index.md) |
| [getUserContext](../../com.tink.link/get-user-context.md) | Fetches the [UserContext](../../com.tink.link.core.user/-user-context/index.md) from Tink if a user is set.`fun `[`Tink`](./index.md)`.getUserContext(): `[`UserContext`](../../com.tink.link.core.user/-user-context/index.md)`?` |
