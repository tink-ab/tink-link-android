---
title: [androidJvm]Credentials
---
//[link](../../../index.html)/[com.tink.model.credentials](../index.html)/[[androidJvm]Credentials](index.html)



# Credentials



[androidJvm]\
data class [Credentials](index.html)(val providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Credentials.Type](-type/index.html), val fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val status: [Credentials.Status](-status/index.html)? = null, val statusPayload: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val supplementalInformation: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt; = emptyList(), val statusUpdated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, val updated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, val sessionExpiryDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null, val thirdPartyAppAuthentication: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.html)? = null) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[Credentials](index.html)&gt; , [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

This model represents how users are connected to a [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html) to access their financial data.



## Constructors


| | |
|---|---|
| [Credentials](-credentials.html) | [androidJvm]<br>fun [Credentials](-credentials.html)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Credentials.Type](-type/index.html), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), status: [Credentials.Status](-status/index.html)? = null, statusPayload: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, supplementalInformation: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt; = emptyList(), statusUpdated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, updated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, sessionExpiryDate: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null, thirdPartyAppAuthentication: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [Status](-status/index.html) | [androidJvm]<br>enum [Status](-status/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Credentials.Status](-status/index.html)&gt; <br>Represents the status of the credentials. |
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Credentials.Type](-type/index.html)&gt; <br>Represents the type of authentication used for the credentials. |


## Functions


| Name | Summary |
|---|---|
| [compareTo](compare-to.html) | [androidJvm]<br>open operator override fun [compareTo](compare-to.html)(other: [Credentials](index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [hasError](has-error.html) | [androidJvm]<br>fun [hasError](has-error.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [fields](fields.html) | [androidJvm]<br>val [fields](fields.html): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>The map of [Field](../../com.tink.model.misc/[android-jvm]-field/index.html) name and value pairs for the [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html). |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The unique identifier of the credentials. |
| [providerName](provider-name.html) | [androidJvm]<br>val [providerName](provider-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Identifier for the [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html). See [Provider.name](../../com.tink.model.provider/[android-jvm]-provider/name.html) |
| [sessionExpiryDate](session-expiry-date.html) | [androidJvm]<br>val [sessionExpiryDate](session-expiry-date.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null<br>The session expiration time of the credentials for a [Provider](../../com.tink.model.provider/[android-jvm]-provider/index.html) with [Provider.accessType](../../com.tink.model.provider/[android-jvm]-provider/access-type.html) set to [Provider.AccessType.OPEN_BANKING](../../com.tink.model.provider/[android-jvm]-provider/-access-type/-o-p-e-n_-b-a-n-k-i-n-g/index.html) |
| [status](status.html) | [androidJvm]<br>val [status](status.html): [Credentials.Status](-status/index.html)? = null<br>The current status of the credentials. |
| [statusPayload](status-payload.html) | [androidJvm]<br>val [statusPayload](status-payload.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>A user-friendly text connected to the [Status](-status/index.html) |
| [statusUpdated](status-updated.html) | [androidJvm]<br>val [statusUpdated](status-updated.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)<br>Indicates when the credentials' status was last updated |
| [supplementalInformation](supplemental-information.html) | [androidJvm]<br>val [supplementalInformation](supplemental-information.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt;<br>The list of [Field](../../com.tink.model.misc/[android-jvm]-field/index.html) objects representing additional information required for the authentication flow |
| [thirdPartyAppAuthentication](third-party-app-authentication.html) | [androidJvm]<br>val [thirdPartyAppAuthentication](third-party-app-authentication.html): [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.html)? = null<br>The [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.html) object containing information about the third party authentication flow |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [Credentials.Type](-type/index.html)<br>The authentication type used for the credentials. |
| [updated](updated.html) | [androidJvm]<br>val [updated](updated.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)<br>Indicates the last time when the [status](status.html) was [Status.UPDATED](-status/-u-p-d-a-t-e-d/index.html) |

