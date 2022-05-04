---
title: authenticate
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[authenticate](authenticate.html)



# authenticate



[common]\
fun [authenticate](authenticate.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.html)



Manually authenticates the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html) matching the [credentialsId](authenticate.html). This is only applicable for PSD2 credentials.



## Parameters


common

| | |
|---|---|
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-next.html), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-error.html). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-completed.html), after which there will be no other calls to this stream observer. |




