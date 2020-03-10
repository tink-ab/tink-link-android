[link](../../index.md) / [com.tink.service.handler](../index.md) / [ResultHandler](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ResultHandler(onSuccess: Consumer<T>, onError: Consumer<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>)`

Convenience constructor for use in Java.
Example usage:

```
new ResultHandler<String>(
    value -> { handle value },
    error -> { handle error }
)
```

`ResultHandler(onSuccess: (T) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, onError: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin.
From Java it is recommended to use the secondary constructor.

**Constructor**
Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin.
From Java it is recommended to use the secondary constructor.

