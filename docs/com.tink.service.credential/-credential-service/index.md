[link](../../index.md) / [com.tink.service.credential](../index.md) / [CredentialService](./index.md)

# CredentialService

`interface CredentialService`

### Functions

| Name | Summary |
|---|---|
| [cancelSupplementalInformation](cancel-supplemental-information.md) | `abstract fun cancelSupplementalInformation(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [create](create.md) | `abstract fun create(descriptor: `[`CredentialCreationDescriptor`](../-credential-creation-descriptor/index.md)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [delete](delete.md) | `abstract fun delete(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [disable](disable.md) | `abstract fun disable(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [enable](enable.md) | `abstract fun enable(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [list](list.md) | `abstract fun list(): `[`Stream`](../../com.tink.service.streaming.publisher/-stream/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>>` |
| [refresh](refresh.md) | `abstract fun refresh(credentialIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [supplementInformation](supplement-information.md) | `abstract fun supplementInformation(credentialId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, information: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [thirdPartyCallback](third-party-callback.md) | `abstract fun thirdPartyCallback(state: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameters: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [update](update.md) | `abstract fun update(descriptor: `[`CredentialUpdateDescriptor`](../-credential-update-descriptor/index.md)`, handler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [CredentialServiceImpl](../-credential-service-impl/index.md) | `class CredentialServiceImpl : `[`CredentialService`](./index.md) |
