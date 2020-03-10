[link](../../index.md) / [com.tink.service.streaming.publisher](../index.md) / [StreamingHandler](./index.md)

# StreamingHandler

`interface StreamingHandler`

### Properties

| Name | Summary |
|---|---|
| [accountsStream](accounts-stream.md) | `abstract val accountsStream: Observable<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>>` |
| [credentialsStream](credentials-stream.md) | `abstract val credentialsStream: Observable<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>>` |
| [providersStream](providers-stream.md) | `abstract val providersStream: Observable<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>` |

### Functions

| Name | Summary |
|---|---|
| [onNext](on-next.md) | `abstract fun onNext(value: `[`StreamingEvent`](../../com.tink.service.streaming/-streaming-event/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [subscribeForAccounts](subscribe-for-accounts.md) | `abstract fun subscribeForAccounts(onNext: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`StreamSubscription`](../-stream-subscription/index.md) |
| [subscribeForCredentials](subscribe-for-credentials.md) | `abstract fun subscribeForCredentials(onNext: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`StreamSubscription`](../-stream-subscription/index.md) |
| [subscribeForProviders](subscribe-for-providers.md) | `abstract fun subscribeForProviders(onNext: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`StreamSubscription`](../-stream-subscription/index.md) |

### Inheritors

| Name | Summary |
|---|---|
| [StreamingHandlerImpl](../-streaming-handler-impl/index.md) | `class StreamingHandlerImpl : `[`StreamingHandler`](./index.md) |
