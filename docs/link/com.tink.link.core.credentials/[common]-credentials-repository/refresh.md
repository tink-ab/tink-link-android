---
title: refresh
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[refresh](refresh.html)



# refresh



[common]\
fun [refresh](refresh.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[RefreshableItem](../../com.tink.model.credentials/[common]-refreshable-item/index.html)&gt;? = null): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.html)



Refreshes the [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html) matching the [credentialsId](refresh.html).



## Parameters


common

| | |
|---|---|
| authenticate | Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional) |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-next.html), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-error.html). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-completed.html), after which there will be no other calls to this stream observer. |
| items | A list of [RefreshableItem](../../com.tink.model.credentials/[common]-refreshable-item/index.html) representing the data types to aggregate from the Provider. If omitted, all data types are aggregated. |




