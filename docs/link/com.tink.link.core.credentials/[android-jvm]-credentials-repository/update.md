---
title: update
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[androidJvm]CredentialsRepository](index.html)/[update](update.html)



# update



[androidJvm]\
fun [update](update.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;): StreamSubscription



Updates the Credentials matching the [credentialsId](update.html).



You can only update the value of a Field that is mutable.



## Parameters


androidJvm

| | |
|---|---|
| fields | The map of Field name and value pairs for the Credentials |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in onNext, whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via onError. If the creation finished successfully, you will also receive a call to onCompleted, after which there will be no other calls to this stream observer. |




