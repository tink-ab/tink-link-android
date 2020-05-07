[link](../../index.md) / [com.tink.model.credentials](../index.md) / [Credentials](./index.md)

# Credentials

`data class Credentials : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Credentials`](./index.md)`>, `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

This model represents how users are connected to a [Provider](../../com.tink.model.provider/-provider/index.md) to access their financial data.

### Types

| Name | Summary |
|---|---|
| [Status](-status/index.md) | Represents the status of the credentials.`enum class Status` |
| [Type](-type/index.md) | Represents the type of authentication used for the credentials.`enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This model represents how users are connected to a [Provider](../../com.tink.model.provider/-provider/index.md) to access their financial data.`Credentials(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: Type, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, status: Status? = null, statusPayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, supplementalInformation: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../../com.tink.model.misc/-field/index.md)`> = emptyList(), statusUpdated: Instant = Instant.EPOCH, updated: Instant = Instant.EPOCH, sessionExpiryDate: Instant? = null, thirdPartyAppAuthentication: `[`ThirdPartyAppAuthentication`](../../com.tink.model.authentication/-third-party-app-authentication/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [fields](fields.md) | The map of [Field](../../com.tink.model.misc/-field/index.md) name and value pairs for the [Provider](../../com.tink.model.provider/-provider/index.md).`val fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [id](id.md) | The unique identifier of the credentials.`val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [providerName](provider-name.md) | Identifier for the [Provider](../../com.tink.model.provider/-provider/index.md). See [Provider.name](../../com.tink.model.provider/-provider/name.md)`val providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [sessionExpiryDate](session-expiry-date.md) | The session expiration time of the credentials for a [Provider](../../com.tink.model.provider/-provider/index.md) with [Provider.accessType](../../com.tink.model.provider/-provider/access-type.md) set to [Provider.AccessType.OPEN_BANKING](../../com.tink.model.provider/-provider/-access-type/-o-p-e-n_-b-a-n-k-i-n-g.md)`val sessionExpiryDate: Instant?` |
| [status](status.md) | The current status of the credentials.`val status: Status?` |
| [statusPayload](status-payload.md) | A user-friendly text connected to the [Status](-status/index.md)`val statusPayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [statusUpdated](status-updated.md) | Indicates when the credentials' status was last updated`val statusUpdated: Instant` |
| [supplementalInformation](supplemental-information.md) | The list of [Field](../../com.tink.model.misc/-field/index.md) objects representing additional information required for the authentication flow`val supplementalInformation: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../../com.tink.model.misc/-field/index.md)`>` |
| [thirdPartyAppAuthentication](third-party-app-authentication.md) | The [ThirdPartyAppAuthentication](../../com.tink.model.authentication/-third-party-app-authentication/index.md) object containing information about the third party authentication flow`val thirdPartyAppAuthentication: `[`ThirdPartyAppAuthentication`](../../com.tink.model.authentication/-third-party-app-authentication/index.md)`?` |
| [type](type.md) | The authentication type used for the credentials.`val type: Type` |
| [updated](updated.md) | Indicates the last time when the [status](status.md) was [Status.UPDATED](-status/-u-p-d-a-t-e-d.md)`val updated: Instant` |

### Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Credentials`](./index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
