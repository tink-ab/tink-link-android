---
title: [common]Credentials
---
//[link](../../../index.html)/[com.tink.model.credentials](../index.html)/[[common]Credentials](index.html)



# Credentials



[common]\
data class [Credentials](index.html)(val providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Credentials.Type](-type/index.html), val fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val status: [Credentials.Status](-status/index.html)? = null, val statusPayload: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val supplementalInformation: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[common]-field/index.html)&gt; = emptyList(), val statusUpdated: &lt;ERROR CLASS&gt; = Instant.EPOCH, val updated: &lt;ERROR CLASS&gt; = Instant.EPOCH, val sessionExpiryDate: &lt;ERROR CLASS&gt;? = null, val thirdPartyAppAuthentication: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.html)? = null) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[Credentials](index.html)&gt; 

This model represents how users are connected to a [Provider](../../com.tink.model.provider/[common]-provider/index.html) to access their financial data.



## Constructors


| | |
|---|---|
| [Credentials](-credentials.html) | [common]<br>fun [Credentials](-credentials.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Credentials.Type](-type/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), status: [Credentials.Status](-status/index.html)? = null, statusPayload: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, supplementalInformation: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[common]-field/index.html)&gt; = emptyList(), statusUpdated: &lt;ERROR CLASS&gt; = Instant.EPOCH, updated: &lt;ERROR CLASS&gt; = Instant.EPOCH, sessionExpiryDate: &lt;ERROR CLASS&gt;? = null, thirdPartyAppAuthentication: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [Status](-status/index.html) | [common]<br>enum [Status](-status/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Credentials.Status](-status/index.html)&gt; <br>Represents the status of the credentials. |
| [Type](-type/index.html) | [common]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Credentials.Type](-type/index.html)&gt; <br>Represents the type of authentication used for the credentials. |


## Functions


| Name | Summary |
|---|---|
| [compareTo](compare-to.html) | [common]<br>open operator override fun [compareTo](compare-to.html)(other: [Credentials](index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [hasError](has-error.html) | [common]<br>fun [hasError](has-error.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |


## Properties


| Name | Summary |
|---|---|
| [fields](fields.html) | [common]<br>val [fields](fields.html): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>The map of [Field](../../com.tink.model.misc/[common]-field/index.html) name and value pairs for the [Provider](../../com.tink.model.provider/[common]-provider/index.html). |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The unique identifier of the credentials. |
| [providerName](provider-name.html) | [common]<br>val [providerName](provider-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Identifier for the [Provider](../../com.tink.model.provider/[common]-provider/index.html). See [Provider.name](../../com.tink.model.provider/[common]-provider/name.html) |
| [sessionExpiryDate](session-expiry-date.html) | [common]<br>val [sessionExpiryDate](session-expiry-date.html): &lt;ERROR CLASS&gt;? = null<br>The session expiration time of the credentials for a [Provider](../../com.tink.model.provider/[common]-provider/index.html) with [Provider.accessType](../../com.tink.model.provider/[common]-provider/access-type.html) set to [Provider.AccessType.OPEN_BANKING](../../com.tink.model.provider/[common]-provider/-access-type/-o-p-e-n_-b-a-n-k-i-n-g/index.html) |
| [status](status.html) | [common]<br>val [status](status.html): [Credentials.Status](-status/index.html)? = null<br>The current status of the credentials. |
| [statusPayload](status-payload.html) | [common]<br>val [statusPayload](status-payload.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>A user-friendly text connected to the [Status](-status/index.html) |
| [statusUpdated](status-updated.html) | [common]<br>val [statusUpdated](status-updated.html): &lt;ERROR CLASS&gt;<br>Indicates when the credentials' status was last updated |
| [supplementalInformation](supplemental-information.html) | [common]<br>val [supplementalInformation](supplemental-information.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[common]-field/index.html)&gt;<br>The list of [Field](../../com.tink.model.misc/[common]-field/index.html) objects representing additional information required for the authentication flow |
| [thirdPartyAppAuthentication](third-party-app-authentication.html) | [common]<br>val [thirdPartyAppAuthentication](third-party-app-authentication.html): [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.html)? = null<br>The [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.html) object containing information about the third party authentication flow |
| [type](type.html) | [common]<br>val [type](type.html): [Credentials.Type](-type/index.html)<br>The authentication type used for the credentials. |
| [updated](updated.html) | [common]<br>val [updated](updated.html): &lt;ERROR CLASS&gt;<br>Indicates the last time when the [status](status.html) was [Status.UPDATED](-status/-u-p-d-a-t-e-d/index.html) |

