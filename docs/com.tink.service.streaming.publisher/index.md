[link](../index.md) / [com.tink.service.streaming.publisher](./index.md)

## Package com.tink.service.streaming.publisher

### Types

| Name | Summary |
|---|---|
| [Stream](-stream/index.md) | `interface Stream<T>` |
| [StreamingHandler](-streaming-handler/index.md) | `interface StreamingHandler` |
| [StreamingHandlerImpl](-streaming-handler-impl/index.md) | `class StreamingHandlerImpl : `[`StreamingHandler`](-streaming-handler/index.md) |
| [StreamObserver](-stream-observer/index.md) | `interface StreamObserver<T>` |
| [StreamSubscription](-stream-subscription/index.md) | `interface StreamSubscription` |

### Functions

| Name | Summary |
|---|---|
| [toGrpcStreamObserver](to-grpc-stream-observer.md) | `fun <A, B> `[`StreamObserver`](-stream-observer/index.md)`<A>.toGrpcStreamObserver(converter: (B) -> A): StreamObserver<B>` |
