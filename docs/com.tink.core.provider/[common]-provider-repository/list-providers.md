---
title: listProviders -
---
//[link](../../index.md)/[com.tink.core.provider](../index.md)/[[common]ProviderRepository](index.md)/[listProviders](list-providers.md)



# listProviders  
[common]  
Content  
fun [listProviders](list-providers.md)(handler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Provider](../../com.tink.model.provider/[common]-provider/index.md)>>, filter: [ProviderFilter](../../com.tink.service.provider/[common]-provider-filter/index.md)? = null)  
More info  


List all providers on the current market. The result will already be filtered to only contain providers that are [enabled](../../com.tink.model.provider/[common]-provider/-status/-e-n-a-b-l-e-d/index.md)



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.core.provider/ProviderRepository/listProviders/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.provider.Provider]]#com.tink.service.provider.ProviderFilter?/PointingToDeclaration/"></a>handler| <a name="com.tink.core.provider/ProviderRepository/listProviders/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.provider.Provider]]#com.tink.service.provider.ProviderFilter?/PointingToDeclaration/"></a><br><br>the [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md) for processing error and success callbacks<br><br>
| <a name="com.tink.core.provider/ProviderRepository/listProviders/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.provider.Provider]]#com.tink.service.provider.ProviderFilter?/PointingToDeclaration/"></a>filter| <a name="com.tink.core.provider/ProviderRepository/listProviders/#com.tink.service.handler.ResultHandler[kotlin.collections.List[com.tink.model.provider.Provider]]#com.tink.service.provider.ProviderFilter?/PointingToDeclaration/"></a><br><br>An optional filter that can be passed to modify the resulting list of providers<br><br>
  
  



