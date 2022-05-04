---
title: authenticate
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[authenticate](authenticate.html)



# authenticate



[common]\
fun [authenticate](authenticate.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusChangeObserver: &lt;ERROR CLASS&gt;&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;): &lt;ERROR CLASS&gt;



Manually authenticates the Credentials matching the [credentialsId](authenticate.html). This is only applicable for PSD2 credentials.



## Parameters


common

| | |
|---|---|
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in StreamObserver.onNext, whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via StreamObserver.onError. If the creation finished successfully, you will also receive a call to StreamObserver.onCompleted, after which there will be no other calls to this stream observer. |




