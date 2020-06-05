[link](../../index.md) / [com.tink.model.provider](../index.md) / [Provider](./index.md)

# Provider

`data class Provider : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Provider`](./index.md)`>, `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

The provider model represents a way of connecting to different banks or other financial institutions in Tink.
Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from.
The model contains metadata about the provider which can be used to group and properly display the representations,
thus helping the end user make the correct decision on which provider to choose.

### Types

| Name | Summary |
|---|---|
| [AccessType](-access-type/index.md) | Describes how Tink will access a provider, for example whether open banking apis are used or not. See [Provider.accessType](access-type.md)`enum class AccessType` |
| [Capability](-capability/index.md) | Indicates what this provider is capable of, in terms of financial data it can aggregate and if it can execute payments.`enum class Capability` |
| [FinancialInstitution](-financial-institution/index.md) | Indicates which financial institution a provider belongs to. This can be used for grouping providers together: the [id](-financial-institution/id.md) should be used as a selector, whereas the [name](-financial-institution/name.md) should be used as the label for the group. See [Provider.financialInstitution](financial-institution.md)`data class FinancialInstitution : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [Status](-status/index.md) | Indicates the current status of the provider. It is only possible to perform credentials create or refresh actions on providers which are enabled. See [Provider.status](status.md)`enum class Status` |
| [Type](-type/index.md) | Indicates what type of financial institution the provider represents.`enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | creates a new provider object. This is usually done inside the Tink framework. It should normally not be necessary to create your own provider objects.`Provider(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, displayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, type: Type, status: Status, credentialsType: Type, helpText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, isPopular: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, fields: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../../com.tink.model.misc/-field/index.md)`>, groupDisplayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, displayDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, marketCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, images: `[`Images`](../../com.tink.model/-images/index.md)`? = null, financialInstitution: FinancialInstitution, accessType: AccessType, capabilities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Capability>)` |

### Properties

| Name | Summary |
|---|---|
| [accessType](access-type.md) | The access type of the provider. See [AccessType](-access-type/index.md)`val accessType: AccessType` |
| [capabilities](capabilities.md) | The list of capabilities for the provider. See [Capability](-capability/index.md)`val capabilities: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Capability>` |
| [credentialsType](credentials-type.md) | Indicates which method will be used to connect this provider, for example with username/password or a third party app.`val credentialsType: Type` |
| [displayDescription](display-description.md) | a short displayable description of the authentication type used`val displayDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [displayName](display-name.md) | the formatted name of this provider, meant for display to the end user`val displayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [fields](fields.md) | the list of inputs that need to be filled to connect to this provider. See also [Credentials.fields](../../com.tink.model.credentials/-credentials/fields.md)`val fields: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Field`](../../com.tink.model.misc/-field/index.md)`>` |
| [financialInstitution](financial-institution.md) | The financial institution the provider belongs to. See [FinancialInstitution](-financial-institution/index.md)`val financialInstitution: FinancialInstitution` |
| [groupDisplayName](group-display-name.md) | this can for example be used as a label for groups of providers`val groupDisplayName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [helpText](help-text.md) | a small help text that you can display to the user for further information on how to connect this provider`val helpText: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [images](images.md) | a wrapper class for images describing the provider, for example a bank logo`val images: `[`Images`](../../com.tink.model/-images/index.md)`?` |
| [isPopular](is-popular.md) | Indicates whether the provider is one of the major providers in a market. This can be used to provide shortcuts for the end user, for example by putting this provider on the top of the list.`val isPopular: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [marketCode](market-code.md) | The market of the provider. Each provider is unique per market.`val marketCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | the name of this provider. This serves as a human readable identifier`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [status](status.md) | The status of the provider. See [Status](-status/index.md)`val status: Status` |
| [type](type.md) | The type of the provider. See [Type](-type/index.md)`val type: Type` |

### Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Provider`](./index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
