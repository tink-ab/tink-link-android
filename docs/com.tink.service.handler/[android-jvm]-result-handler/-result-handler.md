//[link](../../index.md)/[com.tink.service.handler](../index.md)/[[androidJvm]ResultHandler](index.md)/[ResultHandler](-result-handler.md)



# ResultHandler  
[androidJvm]  
Content  
fun <[T](index.md)> [ResultHandler](-result-handler.md)(onSuccess: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)<[T](index.md)>, onError: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)<[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)>)  
More info  


Convenience constructor for use in Java. Example usage:

new ResultHandler<String>(  
    value -> { handle value },  
    error -> { handle error }  
)  


[androidJvm]  
Content  
fun <[T](index.md)> [ResultHandler](-result-handler.md)(onSuccess: ([T](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin. From Java it is recommended to use the secondary constructor.

  



