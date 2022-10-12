---
title: [androidJvm]CredentialsRepository
---
//[link](../../../index.html)/[com.tink.link.core.credentials](../index.html)/[[androidJvm]CredentialsRepository](index.html)



# CredentialsRepository



[androidJvm]\
class [CredentialsRepository](index.html)@Injectconstructor(service: CredentialsService, tinkConfiguration: TinkConfiguration)

Repository for creating, accessing and modifying credentials.



## Constructors


| | |
|---|---|
| [CredentialsRepository](-credentials-repository.html) | [androidJvm]<br>@Inject<br>fun [CredentialsRepository](-credentials-repository.html)(service: CredentialsService, tinkConfiguration: TinkConfiguration)<br>Create a new repository instance from a CredentialsService This is usually done inside the Tink framework and it should normally not be necessary to create your own instance. |


## Functions


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [androidJvm]<br>fun [authenticate](authenticate.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;): StreamSubscription<br>Manually authenticates the Credentials matching the [credentialsId](authenticate.html). This is only applicable for PSD2 credentials. |
| [cancelSupplementalInformation](cancel-supplemental-information.html) | [androidJvm]<br>fun [cancelSupplementalInformation](cancel-supplemental-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), handler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Cancels the supplemental information submission flow. The backend service is informed to stop waiting for the supplemental information. This method should be called if you want to dismiss the supplemental information flow. |
| [create](create.html) | [androidJvm]<br>fun [create](create.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), credentialsType: Credentials.Type, fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;RefreshableItem&gt;? = null): StreamSubscription<br>Creates a new Credentials object. |
| [delete](delete.html) | [androidJvm]<br>fun [delete](delete.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Deletes the Credentials matching the [credentialsId](delete.html). |
| [getCredentials](get-credentials.html) | [androidJvm]<br>fun [getCredentials](get-credentials.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;Credentials&gt;)<br>Gets the Credentials matching the [credentialsId](get-credentials.html). |
| [listStream](list-stream.html) | [androidJvm]<br>fun [listStream](list-stream.html)(): Stream&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;Credentials&gt;&gt;<br>Returns a Stream containing the list of Credentials objects. |
| [refresh](refresh.html) | [androidJvm]<br>fun [refresh](refresh.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;, items: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;RefreshableItem&gt;? = null): StreamSubscription<br>Refreshes the Credentials matching the [credentialsId](refresh.html). |
| [supplementInformation](supplement-information.html) | [androidJvm]<br>fun [supplementInformation](supplement-information.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), information: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, handler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Submits the supplemental information required to authenticate the Credentials matching the [credentialsId](supplement-information.html). |
| [thirdPartyCallback](third-party-callback.html) | [androidJvm]<br>fun [thirdPartyCallback](third-party-callback.html)(state: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parameters: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, handler: ResultHandler&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;)<br>Sends the third party callback information from an Account Servicing Payment Service Provider (ASPSP). |
| [update](update.html) | [androidJvm]<br>fun [update](update.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, statusChangeObserver: StreamObserver&lt;[CredentialsStatus](../[android-jvm]-credentials-status/index.html)&gt;): StreamSubscription<br>Updates the Credentials matching the [credentialsId](update.html). |

