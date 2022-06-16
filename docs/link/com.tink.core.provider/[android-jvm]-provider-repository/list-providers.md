---
title: listProviders
---
//[link](../../../index.html)/[com.tink.core.provider](../index.html)/[[androidJvm]ProviderRepository](index.html)/[listProviders](list-providers.html)



# listProviders



[androidJvm]\




@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)



fun [listProviders](list-providers.html)(handler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html)&gt;&gt;, filter: [ProviderFilter](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html)? = null)



List all providers on the current market. The result will already be filtered to only contain providers that are [enabled](../../com.tink.model.provider/[android-jvm]-provider/-status/-e-n-a-b-l-e-d/index.html)



## Parameters


androidJvm

| | |
|---|---|
| handler | the [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html) for processing error and success callbacks |
| filter | An optional filter that can be passed to modify the resulting list of providers |




