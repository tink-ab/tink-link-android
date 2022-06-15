[link](../../index.md) / [com.tink.service.streaming](../index.md) / [PollingHandler](./index.md)

# PollingHandler

`class PollingHandler<T> : `[`Stream`](../../com.tink.service.streaming.publisher/-stream/index.md)`<T>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PollingHandler(pollingAction: suspend (`[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<T>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Functions

| Name | Summary |
|---|---|
| [subscribe](subscribe.md) | `fun subscribe(observer: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<T>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md) |
