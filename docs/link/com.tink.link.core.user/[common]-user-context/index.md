---
title: [common]UserContext
---
//[link](../../../index.html)/[com.tink.link.core.user](../index.html)/[[common]UserContext](index.html)



# UserContext



[common]\
interface [UserContext](index.html)

Context for functionality that requires a user to be set.



## Functions


| Name | Summary |
|---|---|
| [authorize](authorize.html) | [common]<br>abstract fun [authorize](authorize.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[common]-scope/index.html)&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Authorize your user towards a new set of scopes. These scopes needs to be enabled for your [clientId](../../com.tink.service.network/[common]-tink-configuration/o-auth-client-id.html). |
| [handleUri](handle-uri.html) | [common]<br>abstract fun [handleUri](handle-uri.html)(uri: &lt;ERROR CLASS&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Handle a third-party callback. |


## Properties


| Name | Summary |
|---|---|
| [credentialsRepository](credentials-repository.html) | [common]<br>abstract val [credentialsRepository](credentials-repository.html): [CredentialsRepository](../../com.tink.link.core.credentials/[common]-credentials-repository/index.html) |
| [providerRepository](provider-repository.html) | [common]<br>abstract val [providerRepository](provider-repository.html): [ProviderRepository](../../com.tink.core.provider/[common]-provider-repository/index.html) |

