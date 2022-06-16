---
title: [common]PollingHandler
---
//[link](../../../index.html)/[com.tink.service.streaming](../index.html)/[[common]PollingHandler](index.html)



# PollingHandler



[common]\
class [PollingHandler](index.html)&lt;[T](index.html)&gt;(pollingAction: suspend ([StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[T](index.html)&gt;) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) : [Stream](../../com.tink.service.streaming.publisher/[common]-stream/index.html)&lt;[T](index.html)&gt;



## Constructors


| | |
|---|---|
| [PollingHandler](-polling-handler.html) | [common]<br>fun &lt;[T](index.html)&gt; [PollingHandler](-polling-handler.html)(pollingAction: suspend ([StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[T](index.html)&gt;) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [subscribe](subscribe.html) | [common]<br>open override fun [subscribe](subscribe.html)(observer: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[T](index.html)&gt;): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.html) |

