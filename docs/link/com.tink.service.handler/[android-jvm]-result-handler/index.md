---
title: [androidJvm]ResultHandler
---
//[link](../../../index.html)/[com.tink.service.handler](../index.html)/[[androidJvm]ResultHandler](index.html)



# ResultHandler



[androidJvm]\
class [ResultHandler](index.html)&lt;[T](index.html)&gt;(val onSuccess: ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), val onError: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

This is the basic wrapper for asynchronous callbacks in TinkLink.



## Constructors


| | |
|---|---|
| [ResultHandler](-result-handler.html) | [androidJvm]<br>fun &lt;[T](index.html)&gt; [ResultHandler](-result-handler.html)(onSuccess: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)&lt;[T](index.html)&gt;, onError: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt;)<br>Convenience constructor for use in Java. Example usage: |
| [ResultHandler](-result-handler.html) | [androidJvm]<br>fun &lt;[T](index.html)&gt; [ResultHandler](-result-handler.html)(onSuccess: ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Creates a new result handler with success and error callbacks. Use this default constructor from Kotlin. From Java it is recommended to use the secondary constructor. |


## Properties


| Name | Summary |
|---|---|
| [onError](on-error.html) | [androidJvm]<br>val [onError](on-error.html): ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSuccess](on-success.html) | [androidJvm]<br>val [onSuccess](on-success.html): ([T](index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

