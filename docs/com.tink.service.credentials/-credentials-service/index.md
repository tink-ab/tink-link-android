[link](../../index.md) / [com.tink.service.credentials](../index.md) / [CredentialsService](./index.md)

# CredentialsService

`interface CredentialsService`

### Functions

| Name | Summary |
|---|---|
| [authenticate](authenticate.md) | `abstract suspend fun authenticate(descriptor: `[`CredentialsAuthenticateDescriptor`](../-credentials-authenticate-descriptor/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [cancelSupplementalInformation](cancel-supplemental-information.md) | `abstract suspend fun cancelSupplementalInformation(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [create](create.md) | `abstract suspend fun create(descriptor: `[`CredentialsCreationDescriptor`](../-credentials-creation-descriptor/index.md)`): `[`Credentials`](../../com.tink.model.credentials/-credentials/index.md) |
| [delete](delete.md) | `abstract suspend fun delete(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [disable](disable.md) | `abstract suspend fun disable(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [enable](enable.md) | `abstract suspend fun enable(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getCredentials](get-credentials.md) | `abstract suspend fun getCredentials(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Credentials`](../../com.tink.model.credentials/-credentials/index.md) |
| [list](list.md) | `abstract fun list(): `[`Stream`](../../com.tink.service.streaming.publisher/-stream/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Credentials`](../../com.tink.model.credentials/-credentials/index.md)`>>` |
| [refresh](refresh.md) | `abstract suspend fun refresh(descriptor: `[`CredentialsRefreshDescriptor`](../-credentials-refresh-descriptor/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [supplementInformation](supplement-information.md) | `abstract suspend fun supplementInformation(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, information: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [thirdPartyCallback](third-party-callback.md) | `abstract suspend fun thirdPartyCallback(state: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameters: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [update](update.md) | `abstract suspend fun update(descriptor: `[`CredentialsUpdateDescriptor`](../-credentials-update-descriptor/index.md)`): `[`Credentials`](../../com.tink.model.credentials/-credentials/index.md) |
