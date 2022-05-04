---
title: create
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[androidJvm]CredentialsRepository](index.html)/[create](create.html)



# create



[androidJvm]\
fun [create](create.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsType: Credentials.Type, fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;RefreshableItem&gt;? = null): StreamSubscription



Creates a new Credentials object.



## Parameters


androidJvm

| | |
|---|---|
| providerName | Identifier for the Provider. See Provider.name |
| credentialsType | The Credentials.Type used to authenticate the user to the financial institution |
| fields | The map of Field name and value pairs for the Provider |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in onNext, whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via onError. If the creation finished successfully, you will also receive a call to onCompleted, after which there will be no other calls to this stream observer. |
| items | A list of RefreshableItem representing the data types to aggregate from the provider. If omitted, all data types are aggregated. |




