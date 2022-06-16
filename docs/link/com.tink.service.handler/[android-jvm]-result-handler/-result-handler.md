---
title: ResultHandler
---
//[link](../../../index.html)/[com.tink.service.handler](../index.html)/[[androidJvm]ResultHandler](index.html)/[ResultHandler](-result-handler.html)



# ResultHandler



[androidJvm]\
fun &lt;[T](index.html)&gt; [ResultHandler](-result-handler.html)(onSuccess: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)&lt;[T](index.html)&gt;, onError: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt;)



Convenience constructor for use in Java. Example usage:

new ResultHandler&lt;String&gt;(\
    value -&gt; { handle value },\
    error -&gt; { handle error }\
)



[androidJvm]\
fun &lt;[T](index.html)&gt; [ResultHandler](-result-handler.html)(onSuccess: ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin. From Java it is recommended to use the secondary constructor.




