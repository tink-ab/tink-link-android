---
title: update
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[androidJvm]CredentialsRepository](index.html)/[update](update.html)



# update



[androidJvm]\
fun [update](update.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/index.html)&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;): [StreamSubscription](../../com.tink.service.streaming.publisher/[android-jvm]-stream-subscription/index.html)



Updates the [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html) matching the [credentialsId](update.html).



You can only update the value of a [Field](../../com.tink.model.misc/[android-jvm]-field/index.html) that is mutable.



## Parameters


androidJvm

| | |
|---|---|
| fields | The map of [Field](../../com.tink.model.misc/[android-jvm]-field/index.html) name and value pairs for the [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html) |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-next.html), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-error.html). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[android-jvm]-stream-observer/on-completed.html), after which there will be no other calls to this stream observer. |




