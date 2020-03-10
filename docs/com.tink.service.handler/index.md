[link](../index.md) / [com.tink.service.handler](./index.md)

## Package com.tink.service.handler

### Types

| Name | Summary |
|---|---|
| [ResultHandler](-result-handler/index.md) | This is the basic wrapper for asynchronous callbacks in TinkLink.`class ResultHandler<T>` |

### Functions

| Name | Summary |
|---|---|
| [toStreamObserver](to-stream-observer.md) | `fun <A, B> `[`ResultHandler`](-result-handler/index.md)`<A>.toStreamObserver(converter: (B) -> A): StreamObserver<B>`<br>`fun <T> `[`ResultHandler`](-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>.toStreamObserver(): StreamObserver<T>` |
