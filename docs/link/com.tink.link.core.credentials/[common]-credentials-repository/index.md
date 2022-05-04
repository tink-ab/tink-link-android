---
title: [common]CredentialsRepository
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[common]CredentialsRepository](index.html)



# CredentialsRepository



[common]\
class [CredentialsRepository](index.html)constructor(service: &lt;ERROR CLASS&gt;, tinkConfiguration: &lt;ERROR CLASS&gt;)

Repository for creating, accessing and modifying credentials.



## Constructors


| | |
|---|---|
| [CredentialsRepository](-credentials-repository.html) | [common]<br>fun [CredentialsRepository](-credentials-repository.html)(service: &lt;ERROR CLASS&gt;, tinkConfiguration: &lt;ERROR CLASS&gt;)<br>Create a new repository instance from a CredentialsService This is usually done inside the Tink framework and it should normally not be necessary to create your own instance. |


## Functions


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [common]<br>fun [authenticate](authenticate.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusChangeObserver: &lt;ERROR CLASS&gt;&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;): &lt;ERROR CLASS&gt;<br>Manually authenticates the Credentials matching the [credentialsId](authenticate.html). This is only applicable for PSD2 credentials. |
| [cancelSupplementalInformation](cancel-supplemental-information.html) | [common]<br>fun [cancelSupplementalInformation](cancel-supplemental-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Cancels the supplemental information submission flow. The backend service is informed to stop waiting for the supplemental information. This method should be called if you want to dismiss the supplemental information flow. |
| [create](create.html) | [common]<br>fun [create](create.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsType: &lt;ERROR CLASS&gt;, fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: &lt;ERROR CLASS&gt;&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;&lt;ERROR CLASS&gt;&gt;? = null): &lt;ERROR CLASS&gt;<br>Creates a new Credentials object. |
| [delete](delete.html) | [common]<br>fun [delete](delete.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Deletes the Credentials matching the [credentialsId](delete.html). |
| [getCredentials](get-credentials.html) | [common]<br>fun [getCredentials](get-credentials.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: &lt;ERROR CLASS&gt;&lt;&lt;ERROR CLASS&gt;&gt;)<br>Gets the Credentials matching the [credentialsId](get-credentials.html). |
| [listStream](list-stream.html) | [common]<br>fun [listStream](list-stream.html)(): &lt;ERROR CLASS&gt;&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;&lt;ERROR CLASS&gt;&gt;&gt;<br>Returns a Stream containing the list of Credentials objects. |
| [refresh](refresh.html) | [common]<br>fun [refresh](refresh.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), statusChangeObserver: &lt;ERROR CLASS&gt;&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;&lt;ERROR CLASS&gt;&gt;? = null): &lt;ERROR CLASS&gt;<br>Refreshes the Credentials matching the [credentialsId](refresh.html). |
| [supplementInformation](supplement-information.html) | [common]<br>fun [supplementInformation](supplement-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), information: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, handler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Submits the supplemental information required to authenticate the Credentials matching the [credentialsId](supplement-information.html). |
| [thirdPartyCallback](third-party-callback.html) | [common]<br>fun [thirdPartyCallback](third-party-callback.html)(state: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parameters: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, handler: &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Sends the third party callback information from an Account Servicing Payment Service Provider (ASPSP). |
| [update](update.html) | [common]<br>fun [update](update.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: &lt;ERROR CLASS&gt;&lt;[CredentialsStatus](../[common]-credentials-status/index.html)&gt;): &lt;ERROR CLASS&gt;<br>Updates the Credentials matching the [credentialsId](update.html). |

