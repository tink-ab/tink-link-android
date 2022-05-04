---
title: listProviders
---
//[link](../../../index.html)/[com.tink.core.provider](../index.html)/[[common]ProviderRepository](index.html)/[listProviders](list-providers.html)



# listProviders



[common]\
fun [listProviders](list-providers.html)(handler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider](../../com.tink.model.provider/[common]-provider/index.html)&gt;&gt;, filter: [ProviderFilter](../../com.tink.service.provider/[common]-provider-filter/index.html)? = null)



List all providers on the current market. The result will already be filtered to only contain providers that are [enabled](../../com.tink.model.provider/[common]-provider/-status/-e-n-a-b-l-e-d/index.html)



## Parameters


common

| | |
|---|---|
| handler | the [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html) for processing error and success callbacks |
| filter | An optional filter that can be passed to modify the resulting list of providers |




