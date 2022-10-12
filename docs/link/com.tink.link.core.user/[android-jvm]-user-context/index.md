---
title: [androidJvm]UserContext
---
//[link](../../../index.html)/[com.tink.link.core.user](../index.html)/[[androidJvm]UserContext](index.html)



# UserContext



[androidJvm]\
interface [UserContext](index.html)

Context for functionality that requires a user to be set.



## Functions


| Name | Summary |
|---|---|
| [authorize](authorize.html) | [androidJvm]<br>abstract fun [authorize](authorize.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;Scope&gt;, resultHandler: ResultHandler&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Authorize your user towards a new set of scopes. These scopes needs to be enabled for your clientId. |
| [handleUri](handle-uri.html) | [androidJvm]<br>abstract fun [handleUri](handle-uri.html)(uri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), resultHandler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;? = null): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Handle a third-party callback. |


## Properties


| Name | Summary |
|---|---|
| [credentialsRepository](credentials-repository.html) | [androidJvm]<br>abstract val [credentialsRepository](credentials-repository.html): [CredentialsRepository](../../com.tink.link.core.credentials/[android-jvm]-credentials-repository/index.html) |
| [providerRepository](provider-repository.html) | [androidJvm]<br>abstract val [providerRepository](provider-repository.html): ProviderRepository |

