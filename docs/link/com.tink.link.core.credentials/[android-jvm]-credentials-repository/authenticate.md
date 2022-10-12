---
title: authenticate
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[androidJvm]CredentialsRepository](index.html)/[authenticate](authenticate.html)



# authenticate



[androidJvm]\
fun [authenticate](authenticate.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;): StreamSubscription



Manually authenticates the Credentials matching the [credentialsId](authenticate.html). This is only applicable for PSD2 credentials.



## Parameters


androidJvm

| | |
|---|---|
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in onNext, whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via onError. If the creation finished successfully, you will also receive a call to onCompleted, after which there will be no other calls to this stream observer. |




