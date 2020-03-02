[link](../../index.md) / [com.tink.link.core.user](../index.md) / [UserContext](./index.md)

# UserContext

`interface UserContext`

Context for functionality that requires a user to be set.

### Properties

| Name | Summary |
|---|---|
| [credentialRepository](credential-repository.md) | `abstract val credentialRepository: `[`CredentialRepository`](../../com.tink.link.core.credentials/-credential-repository/index.md) |
| [providerRepository](provider-repository.md) | `abstract val providerRepository: `[`ProviderRepository`](../../com.tink.core.provider/-provider-repository/index.md) |

### Functions

| Name | Summary |
|---|---|
| [authorize](authorize.md) | Authorize your user towards a new set of scopes. These scopes needs to be enabled for your [clientId](../../com.tink.service.network/-tink-configuration/o-auth-client-id.md).`abstract fun authorize(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.service.authorization/-scope/index.md)`>, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [handleUri](handle-uri.md) | Handle a third-party callback.`abstract fun handleUri(uri: `[`Uri`](https://developer.android.com/reference/android/net/Uri.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>? = null): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
