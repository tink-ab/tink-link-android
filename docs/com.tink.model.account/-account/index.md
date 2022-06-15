[link](../../index.md) / [com.tink.model.account](../index.md) / [Account](./index.md)

# Account

`data class Account : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Types

| Name | Summary |
|---|---|
| [AccountExclusion](-account-exclusion/index.md) | `enum class AccountExclusion` |
| [Flags](-flags/index.md) | `enum class Flags` |
| [Type](-type/index.md) | `enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Account(accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, balance: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, excluded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, favored: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, closed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, holderName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, accountDetails: `[`AccountDetails`](../-account-details/index.md)`? = null, ownership: `[`ExactNumber`](../../com.tink.model.misc/-exact-number/index.md)`, type: Type, flags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Flags>, accountExclusion: AccountExclusion, refreshed: Instant = Instant.EPOCH, financialInstitutionID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, identifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, transferDestinations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [accountDetails](account-details.md) | `val accountDetails: `[`AccountDetails`](../-account-details/index.md)`?` |
| [accountExclusion](account-exclusion.md) | `val accountExclusion: AccountExclusion` |
| [accountNumber](account-number.md) | `val accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [balance](balance.md) | `val balance: `[`Amount`](../../com.tink.model.misc/-amount/index.md) |
| [closed](closed.md) | `val closed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [credentialsId](credentials-id.md) | `val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [excluded](excluded.md) | `val excluded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [favored](favored.md) | `val favored: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [financialInstitutionID](financial-institution-i-d.md) | `val financialInstitutionID: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [flags](flags.md) | `val flags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Flags>` |
| [holderName](holder-name.md) | `val holderName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [identifiers](identifiers.md) | `val identifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownership](ownership.md) | `val ownership: `[`ExactNumber`](../../com.tink.model.misc/-exact-number/index.md) |
| [refreshed](refreshed.md) | `val refreshed: Instant` |
| [transferDestinations](transfer-destinations.md) | `val transferDestinations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [type](type.md) | `val type: Type` |
