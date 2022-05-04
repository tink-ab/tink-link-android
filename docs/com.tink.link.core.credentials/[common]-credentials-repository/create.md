---
title: create
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)/[create](create.html)



# create



[common]\
fun [create](create.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsType: [Credentials.Type](../../com.tink.model.credentials/[common]-credentials/-type/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: [StreamObserver](../../com.tink.service.streaming.publisher/[common]-stream-observer/index.html)&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[RefreshableItem](../../com.tink.model.credentials/[common]-refreshable-item/index.html)&gt;? = null): [StreamSubscription](../../com.tink.service.streaming.publisher/[common]-stream-subscription/index.html)



Creates a new [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html) object.



## Parameters


common

| | |
|---|---|
| providerName | Identifier for the [Provider](../../com.tink.model.provider/[common]-provider/index.html). See [Provider.name](../../com.tink.model.provider/[common]-provider/name.html) |
| credentialsType | The [Credentials.Type](../../com.tink.model.credentials/[common]-credentials/-type/index.html) used to authenticate the user to the financial institution |
| fields | The map of [Field](../../com.tink.model.misc/[common]-field/index.html) name and value pairs for the [Provider](../../com.tink.model.provider/[common]-provider/index.html) |
| statusChangeObserver | An observer which will receive callbacks when there are updates to the status of the credentials. Successful and intermediate status will be posted in [onNext](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-next.html), whereas failures and errors will be passed as [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) via [onError](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-error.html). If the creation finished successfully, you will also receive a call to [onCompleted](../../com.tink.service.streaming.publisher/[common]-stream-observer/on-completed.html), after which there will be no other calls to this stream observer. |
| items | A list of [RefreshableItem](../../com.tink.model.credentials/[common]-refreshable-item/index.html) representing the data types to aggregate from the provider. If omitted, all data types are aggregated. |




