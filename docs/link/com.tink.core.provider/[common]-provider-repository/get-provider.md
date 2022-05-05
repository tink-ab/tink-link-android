---
title: getProvider
---
//[link](../../../index.html)/[com.tink.core.provider](../index.html)/[[common]ProviderRepository](index.html)/[getProvider](get-provider.html)



# getProvider



[common]\
fun [getProvider](get-provider.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[Provider](../../com.tink.model.provider/[common]-provider/index.html)?&gt;)



Get the provider with the specified [name](../../com.tink.model.provider/[common]-provider/name.html). null will be passed to the [resultHandler](get-provider.html) in case no provider with this name could be found.




