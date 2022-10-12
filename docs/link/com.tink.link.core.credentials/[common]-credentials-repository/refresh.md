---
title: refresh
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[refresh](refresh.html)



# refresh



[common]\
fun [refresh](refresh.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), statusChangeObserver: &lt;ERROR CLASS&gt;&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;&lt;ERROR CLASS&gt;&gt;? = null): &lt;ERROR CLASS&gt;



Refreshes the Credentials matching the [credentialsId](refresh.html).



## Parameters


common

| | |
|---|---|
| authenticate | Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional) |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in StreamObserver.onNext, whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via StreamObserver.onError. If the creation finished successfully, you will also receive a call to StreamObserver.onCompleted, after which there will be no other calls to this stream observer. |
| items | A list of RefreshableItem representing the data types to aggregate from the Provider. If omitted, all data types are aggregated. |




