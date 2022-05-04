---
title: update
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[update](update.html)



# update



[common]\
fun [update](update.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.html)



Updates the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html) matching the [credentialsId](update.html).



You can only update the value of a [Field](../../com.tink.model.misc/[common]-field/index.html) that is mutable.



## Parameters


common

| | |
|---|---|
| fields | The map of [Field](../../com.tink.model.misc/[common]-field/index.html) name and value pairs for the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html) |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-next.html), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-error.html). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-completed.html), after which there will be no other calls to this stream observer. |




