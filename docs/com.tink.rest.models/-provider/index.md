[link](../../index.md) / [com.tink.rest.models](../index.md) / [Provider](./index.md)

# Provider

`@JsonClass(true) data class Provider`

The provider model represents financial institutions to where Tink can connect. It specifies how Tink accesses the financial institution, metadata about the financialinstitution, and what financial information that can be accessed.

### Types

| Name | Summary |
|---|---|
| [AccessTypeEnum](-access-type-enum/index.md) | What Tink uses to access the data. Values: OPEN_BANKING, OTHER`enum class AccessTypeEnum` |
| [AuthenticationFlowEnum](-authentication-flow-enum/index.md) | For providers with access type `OPEN_BANKING`, indicates what type of authentication flow is used to access the data. Values: EMBEDDED, REDIRECT, DECOUPLED`enum class AuthenticationFlowEnum` |
| [CapabilitiesEnum](-capabilities-enum/index.md) | Indicates what this provider is capable of, in terms of financial data it can aggregate and if it can execute payments. Values: UNKNOWN, TRANSFERS, EINVOICES, MORTGAGE_AGGREGATION, CHECKING_ACCOUNTS, SAVINGS_ACCOUNTS, CREDIT_CARDS, LOANS, INVESTMENTS, PAYMENTS, IDENTITY_DATA`enum class CapabilitiesEnum` |
| [StatusEnum](-status-enum/index.md) | Indicates the current status of the provider. It is only possible to perform credentials create or refresh actions on providers which are enabled. Values: ENABLED, TEMPORARY_DISABLED, DISABLED`enum class StatusEnum` |
| [TypeEnum](-type-enum/index.md) | Indicates what type of financial institution the provider represents. Values: BANK, CREDIT_CARD, BROKER, TEST, OTHER`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The provider model represents financial institutions to where Tink can connect. It specifies how Tink accesses the financial institution, metadata about the financialinstitution, and what financial information that can be accessed.`Provider(accessType: AccessTypeEnum, capabilities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<CapabilitiesEnum>, credentialsType: TypeEnum, currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, displayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fields: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../-field/index.md)`>, financialInstitutionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, financialInstitutionName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, multiFactor: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, popular: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, status: StatusEnum, transactional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, type: TypeEnum, authenticationFlow: AuthenticationFlowEnum? = null, displayDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, groupDisplayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, images: `[`ImageUrls`](../-image-urls/index.md)`? = null, passwordHelpText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [accessType](access-type.md) | What Tink uses to access the data.`var accessType: AccessTypeEnum` |
| [authenticationFlow](authentication-flow.md) | For providers with access type &#x60;OPEN_BANKING&#x60;, indicates what type of authentication flow is used to access the data.`var authenticationFlow: AuthenticationFlowEnum?` |
| [capabilities](capabilities.md) | Indicates what this provider is capable of, in terms of financial data it can aggregate and if it can execute payments.`var capabilities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<CapabilitiesEnum>` |
| [credentialsType](credentials-type.md) | When creating a new credential connected to the provider this will be the credentials type.`var credentialsType: TypeEnum` |
| [currency](currency.md) | The default currency of the provider.`var currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [displayDescription](display-description.md) | Short displayable description of the authentication type used.`var displayDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [displayName](display-name.md) | The display name of the provider.`var displayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [fields](fields.md) | List of fields which need to be provided when creating a credential connected to the provider.`var fields: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../-field/index.md)`>` |
| [financialInstitutionId](financial-institution-id.md) | A unique identifier to group providers belonging the same financial institution.`var financialInstitutionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [financialInstitutionName](financial-institution-name.md) | The name of the financial institution.`var financialInstitutionName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [groupDisplayName](group-display-name.md) | A display name for providers which are branches of a bigger group.`var groupDisplayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [images](images.md) | Image urls for the provider.`var images: `[`ImageUrls`](../-image-urls/index.md)`?` |
| [market](market.md) | The market of the provider. Each provider is unique per market.`var market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [multiFactor](multi-factor.md) | Indicates if the provider requires multi-factor authentication.`var multiFactor: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [name](name.md) | The unique identifier of the provider. This is used when creating new credentials.`var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [passwordHelpText](password-help-text.md) | Short description of how to authenticate when creating a new credential for connected to the provider.`var passwordHelpText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [popular](popular.md) | Indicates if the provider is popular. This is normally set to true for the biggest financial institutions on a market.`var popular: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [status](status.md) | Indicates the current status of the provider. It is only possible to perform credentials create or refresh actions on providers which are enabled.`var status: StatusEnum` |
| [transactional](transactional.md) | Indicates if Tink can aggregate transactions for this provider.`var transactional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [type](type.md) | Indicates what type of financial institution the provider represents.`var type: TypeEnum` |
