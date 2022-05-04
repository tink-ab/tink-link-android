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
| [authorize](authorize.html) | [common]<br>abstract fun [authorize](authorize.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;&lt;ERROR CLASS&gt;&gt;, resultHandler: &lt;ERROR CLASS&gt;&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Authorize your user towards a new set of scopes. These scopes needs to be enabled for your TinkConfiguration.oAuthClientId. |
| [handleUri](handle-uri.html) | [common]<br>abstract fun [handleUri](handle-uri.html)(uri: &lt;ERROR CLASS&gt;, resultHandler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Handle a third-party callback. |


## Properties


| Name | Summary |
|---|---|
| [credentialsRepository](credentials-repository.html) | [common]<br>abstract val [credentialsRepository](credentials-repository.html): [CredentialsRepository](../../com.tink.link.core.credentials/[common]-credentials-repository/index.html) |
| [providerRepository](provider-repository.html) | [common]<br>abstract val [providerRepository](provider-repository.html): &lt;ERROR CLASS&gt; |

