---
title: [androidJvm]Provider
---
//[link](../../../index.html)/[com.tink.model.provider](../index.html)/[[androidJvm]Provider](index.html)



# Provider



[androidJvm]\
data class [Provider](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Provider.Type](-type/index.html), val status: [Provider.Status](-status/index.html), val releaseStatus: [Provider.ReleaseStatus](-release-status/index.html)? = null, val credentialsType: [Credentials.Type](../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html), val helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val isPopular: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, val fields: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt;, val groupDisplayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val displayDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val marketCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val images: [Images](../../com.tink.model/[android-jvm]-images/index.html)? = null, val financialInstitution: [Provider.FinancialInstitution](-financial-institution/index.html), val accessType: [Provider.AccessType](-access-type/index.html), val capabilities: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider.Capability](-capability/index.html)&gt;, val authenticationUserType: [Provider.AuthenticationUserType](-authentication-user-type/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[Provider](index.html)&gt; , [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

The provider model represents a way of connecting to different banks or other financial institutions in Tink. Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from. The model contains metadata about the provider which can be used to group and properly display the representations, thus helping the end user make the correct decision on which provider to choose.



## Constructors


| | |
|---|---|
| [Provider](-provider.html) | [androidJvm]<br>fun [Provider](-provider.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Provider.Type](-type/index.html), status: [Provider.Status](-status/index.html), releaseStatus: [Provider.ReleaseStatus](-release-status/index.html)? = null, credentialsType: [Credentials.Type](../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html), helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isPopular: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, fields: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt;, groupDisplayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), marketCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), images: [Images](../../com.tink.model/[android-jvm]-images/index.html)? = null, financialInstitution: [Provider.FinancialInstitution](-financial-institution/index.html), accessType: [Provider.AccessType](-access-type/index.html), capabilities: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider.Capability](-capability/index.html)&gt;, authenticationUserType: [Provider.AuthenticationUserType](-authentication-user-type/index.html))<br>creates a new provider object. This is usually done inside the Tink framework. It should normally not be necessary to create your own provider objects. |


## Types


| Name | Summary |
|---|---|
| [AccessType](-access-type/index.html) | [androidJvm]<br>enum [AccessType](-access-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Provider.AccessType](-access-type/index.html)&gt; <br>Describes how Tink will access a provider, for example whether open banking apis are used or not. See [Provider.accessType](access-type.html) |
| [AuthenticationUserType](-authentication-user-type/index.html) | [androidJvm]<br>enum [AuthenticationUserType](-authentication-user-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Provider.AuthenticationUserType](-authentication-user-type/index.html)&gt; <br>Indicates if a user authenticates toward the bank as a person or a business. |
| [Capability](-capability/index.html) | [androidJvm]<br>enum [Capability](-capability/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Provider.Capability](-capability/index.html)&gt; <br>Indicates what this provider is capable of, in terms of financial data it can aggregate and if it can execute payments. |
| [FinancialInstitution](-financial-institution/index.html) | [androidJvm]<br>data class [FinancialInstitution](-financial-institution/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>Indicates which financial institution a provider belongs to. This can be used for grouping providers together: the [id](-financial-institution/id.html) should be used as a selector, whereas the [name](-financial-institution/name.html) should be used as the label for the group. See [Provider.financialInstitution](financial-institution.html) |
| [ReleaseStatus](-release-status/index.html) | [androidJvm]<br>enum [ReleaseStatus](-release-status/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Provider.ReleaseStatus](-release-status/index.html)&gt; <br>Indicates the current release status of the provider, the only valid value currently is BETA indicating the provider is still in BETA. The absence of this enum or a value of UNKNOWN means the Provider is released. See [Provider.releaseStatus](release-status.html) |
| [Status](-status/index.html) | [androidJvm]<br>enum [Status](-status/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Provider.Status](-status/index.html)&gt; <br>Indicates the current status of the provider. It is only possible to perform credentials create or refresh actions on providers which are enabled. See [Provider.status](status.html) |
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Provider.Type](-type/index.html)&gt; <br>Indicates what type of financial institution the provider represents. |


## Functions


| Name | Summary |
|---|---|
| [compareTo](compare-to.html) | [androidJvm]<br>open operator override fun [compareTo](compare-to.html)(other: [Provider](index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accessType](access-type.html) | [androidJvm]<br>val [accessType](access-type.html): [Provider.AccessType](-access-type/index.html)<br>The access type of the provider. See [AccessType](-access-type/index.html) |
| [authenticationUserType](authentication-user-type.html) | [androidJvm]<br>val [authenticationUserType](authentication-user-type.html): [Provider.AuthenticationUserType](-authentication-user-type/index.html) |
| [capabilities](capabilities.html) | [androidJvm]<br>val [capabilities](capabilities.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider.Capability](-capability/index.html)&gt;<br>The list of capabilities for the provider. See [Capability](-capability/index.html) |
| [credentialsType](credentials-type.html) | [androidJvm]<br>val [credentialsType](credentials-type.html): [Credentials.Type](../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html)<br>Indicates which method will be used to connect this provider, for example with username/password or a third party app. |
| [displayDescription](display-description.html) | [androidJvm]<br>val [displayDescription](display-description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>a short displayable description of the authentication type used |
| [displayName](display-name.html) | [androidJvm]<br>val [displayName](display-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the formatted name of this provider, meant for display to the end user |
| [fields](fields.html) | [androidJvm]<br>val [fields](fields.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt;<br>the list of inputs that need to be filled to connect to this provider. See also [Credentials.fields](../../com.tink.model.credentials/[android-jvm]-credentials/fields.html) |
| [financialInstitution](financial-institution.html) | [androidJvm]<br>val [financialInstitution](financial-institution.html): [Provider.FinancialInstitution](-financial-institution/index.html)<br>The financial institution the provider belongs to. See [FinancialInstitution](-financial-institution/index.html) |
| [groupDisplayName](group-display-name.html) | [androidJvm]<br>val [groupDisplayName](group-display-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>this can for example be used as a label for groups of providers |
| [helpText](help-text.html) | [androidJvm]<br>val [helpText](help-text.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>a small help text that you can display to the user for further information on how to connect this provider |
| [images](images.html) | [androidJvm]<br>val [images](images.html): [Images](../../com.tink.model/[android-jvm]-images/index.html)? = null<br>a wrapper class for images describing the provider, for example a bank logo |
| [isPopular](is-popular.html) | [androidJvm]<br>val [isPopular](is-popular.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>Indicates whether the provider is one of the major providers in a market. This can be used to provide shortcuts for the end user, for example by putting this provider on the top of the list. |
| [marketCode](market-code.html) | [androidJvm]<br>val [marketCode](market-code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The market of the provider. Each provider is unique per market. |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the name of this provider. This serves as a human readable identifier |
| [releaseStatus](release-status.html) | [androidJvm]<br>val [releaseStatus](release-status.html): [Provider.ReleaseStatus](-release-status/index.html)? = null<br>The release status of the provider. See [ReleaseStatus](-release-status/index.html) |
| [status](status.html) | [androidJvm]<br>val [status](status.html): [Provider.Status](-status/index.html)<br>The status of the provider. See [Status](-status/index.html) |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [Provider.Type](-type/index.html)<br>The type of the provider. See [Type](-type/index.html) |

