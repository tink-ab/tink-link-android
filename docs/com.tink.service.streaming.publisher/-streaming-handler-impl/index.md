[link](../../index.md) / [com.tink.service.streaming.publisher](../index.md) / [StreamingHandlerImpl](./index.md)

# StreamingHandlerImpl

`class StreamingHandlerImpl : `[`StreamingHandler`](../-streaming-handler/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StreamingHandlerImpl()` |

### Properties

| Name | Summary |
|---|---|
| [accountsStream](accounts-stream.md) | `val accountsStream: Observable<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>>` |
| [credentialsStream](credentials-stream.md) | `val credentialsStream: Observable<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>>` |
| [providersStream](providers-stream.md) | `val providersStream: Observable<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>>` |

### Functions

| Name | Summary |
|---|---|
| [onNext](on-next.md) | `fun onNext(value: `[`StreamingEvent`](../../com.tink.service.streaming/-streaming-event/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [subscribeForAccounts](subscribe-for-accounts.md) | `fun subscribeForAccounts(onNext: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`StreamSubscription`](../-stream-subscription/index.md) |
| [subscribeForCredentials](subscribe-for-credentials.md) | `fun subscribeForCredentials(onNext: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Credential`](../../com.tink.model.credential/-credential/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`StreamSubscription`](../-stream-subscription/index.md) |
| [subscribeForProviders](subscribe-for-providers.md) | `fun subscribeForProviders(onNext: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Provider`](../../com.tink.model.provider/-provider/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`StreamSubscription`](../-stream-subscription/index.md) |
