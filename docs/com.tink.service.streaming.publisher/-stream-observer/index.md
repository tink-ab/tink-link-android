[link](../../index.md) / [com.tink.service.streaming.publisher](../index.md) / [StreamObserver](./index.md)

# StreamObserver

`interface StreamObserver<T>`

### Functions

| Name | Summary |
|---|---|
| [onCompleted](on-completed.md) | `open fun onCompleted(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onError](on-error.md) | `open fun onError(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onNext](on-next.md) | `open fun onNext(value: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| [toGrpcStreamObserver](../to-grpc-stream-observer.md) | `fun <A, B> `[`StreamObserver`](./index.md)`<A>.toGrpcStreamObserver(converter: (B) -> A): StreamObserver<B>` |
