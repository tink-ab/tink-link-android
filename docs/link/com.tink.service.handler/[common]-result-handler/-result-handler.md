---
title: ResultHandler
---
//[link](../../../index.html)/[com.tink.service.handler](../index.html)/[[common]ResultHandler](index.html)/[ResultHandler](-result-handler.html)



# ResultHandler



[common]\
fun &lt;[T](index.html)&gt; [ResultHandler](-result-handler.html)(onSuccess: &lt;ERROR CLASS&gt;&lt;[T](index.html)&gt;, onError: &lt;ERROR CLASS&gt;&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt;)



Convenience constructor for use in Java. Example usage:

new ResultHandler&lt;String&gt;(\
    value -&gt; { handle value },\
    error -&gt; { handle error }\
)



[common]\
fun &lt;[T](index.html)&gt; [ResultHandler](-result-handler.html)(onSuccess: ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin. From Java it is recommended to use the secondary constructor.




