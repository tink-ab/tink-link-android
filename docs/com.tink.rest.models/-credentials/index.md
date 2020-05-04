[link](../../index.md) / [com.tink.rest.models](../index.md) / [Credentials](./index.md)

# Credentials

`@JsonClass(true) data class Credentials`

The credentials model represents a user's connected providers from where financial data is accessed.

### Types

| Name | Summary |
|---|---|
| [StatusEnum](-status-enum/index.md) | The status indicates the state of the credentials. For some states there are actions which need to be performed on the credentials. Values: CREATED, AUTHENTICATING, AWAITING_MOBILE_BANKID_AUTHENTICATION, AWAITING_SUPPLEMENTAL_INFORMATION, UPDATING, UPDATED, AUTHENTICATION_ERROR, TEMPORARY_ERROR, PERMANENT_ERROR, AWAITING_THIRD_PARTY_APP_AUTHENTICATION, DELETED, SESSION_EXPIRED`enum class StatusEnum` |
| [SupplementalInfoWrapper](-supplemental-info-wrapper/index.md) | `data class SupplementalInfoWrapper` |
| [ThirdPartyAuthentication](-third-party-authentication/index.md) | `data class ThirdPartyAuthentication` |
| [TypeEnum](-type-enum/index.md) | Indicates how Tink authenticates the user to the financial institution. Values: PASSWORD, MOBILE_BANKID, KEYFOB, THIRD_PARTY_APP`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The credentials model represents a user's connected providers from where financial data is accessed.`Credentials(providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, type: TypeEnum? = null, status: StatusEnum? = null, statusUpdated: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, statusPayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, updated: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, supplementalInformation: SupplementalInfoWrapper? = null, sessionExpiryDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [fields](fields.md) | This is a key-value map of &#x60;Field&#x60; name and value found on the &#x60;Provider&#x60; to which the credentials belongs to. This parameter is required when creating credentials.`var fields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [id](id.md) | The unique identifier of the credentials.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [providerName](provider-name.md) | The provider (financial institution) that the credentials is connected to.`var providerName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [sessionExpiryDate](session-expiry-date.md) | For credentials with access type of &#x60;OPEN_BANKING&#x60;, indicates when the session for the currently stored credentials will expire. The session can be renewed before or after this date by triggering manual authentication of credentials. After this date automatic refreshes will not be possible without new authentication from the user.`var sessionExpiryDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [status](status.md) | The status indicates the state of the credentials. For some states there are actions which need to be performed on the credentials.`var status: StatusEnum?` |
| [statusPayload](status-payload.md) | A user-friendly message connected to the status. Could be an error message or text describing what is currently going on in the refresh process.`var statusPayload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [statusUpdated](status-updated.md) | A timestamp of when the credentials&#39; status was last modified.`var statusUpdated: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [supplementalInformation](supplemental-information.md) | A key-value structure to handle if status of credentials are &#x60;AWAITING_SUPPLEMENTAL_INFORMATION&#x60; or &#x60;AWAITING_THIRD_PARTY_APP_AUTHENTICATION&#x60;.`var supplementalInformation: SupplementalInfoWrapper?` |
| [type](type.md) | Indicates how Tink authenticates the user to the financial institution.`var type: TypeEnum?` |
| [updated](updated.md) | A timestamp of when the credentials was the last time in status &#x60;UPDATED&#x60;.`var updated: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [userId](user-id.md) | The ID of the user that the credentials belongs to.`var userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
