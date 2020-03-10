[link](../../index.md) / [com.tink.service.handler](../index.md) / [ResultHandler](./index.md)

# ResultHandler

`class ResultHandler<T>`

This is the basic wrapper for asynchronous callbacks in TinkLink.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Convenience constructor for use in Java. Example usage:`ResultHandler(onSuccess: Consumer<T>, onError: Consumer<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>)`<br>Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin. From Java it is recommended to use the secondary constructor.`ResultHandler(onSuccess: (T) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, onError: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [onError](on-error.md) | `val onError: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSuccess](on-success.md) | `val onSuccess: (T) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| [toStreamObserver](../to-stream-observer.md) | `fun <A, B> `[`ResultHandler`](./index.md)`<A>.toStreamObserver(converter: (B) -> A): StreamObserver<B>`<br>`fun <T> `[`ResultHandler`](./index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>.toStreamObserver(): StreamObserver<T>` |
