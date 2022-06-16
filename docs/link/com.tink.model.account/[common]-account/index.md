---
title: [common]Account
---
//[link](../../../index.html)/[com.tink.model.account](../index.html)/[[common]Account](index.html)



# Account



[common]\
data class [Account](index.html)(val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val balance: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val excluded: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val favored: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val closed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val holderName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val accountDetails: [AccountDetails](../[common]-account-details/index.html)? = null, val ownership: [ExactNumber](../../com.tink.model.misc/[common]-exact-number/index.html), val type: [Account.Type](-type/index.html), val flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account.Flags](-flags/index.html)&gt;, val accountExclusion: [Account.AccountExclusion](-account-exclusion/index.html), val refreshed: &lt;ERROR CLASS&gt; = Instant.EPOCH, val financialInstitutionID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val identifiers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val transferDestinations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val firstSeen: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null)



## Constructors


| | |
|---|---|
| [Account](-account.html) | [common]<br>fun [Account](-account.html)(accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), balance: [Amount](../../com.tink.model.misc/[common]-amount/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), excluded: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), favored: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), closed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), holderName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, accountDetails: [AccountDetails](../[common]-account-details/index.html)? = null, ownership: [ExactNumber](../../com.tink.model.misc/[common]-exact-number/index.html), type: [Account.Type](-type/index.html), flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account.Flags](-flags/index.html)&gt;, accountExclusion: [Account.AccountExclusion](-account-exclusion/index.html), refreshed: &lt;ERROR CLASS&gt; = Instant.EPOCH, financialInstitutionID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, identifiers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, transferDestinations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, firstSeen: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [AccountExclusion](-account-exclusion/index.html) | [common]<br>enum [AccountExclusion](-account-exclusion/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Account.AccountExclusion](-account-exclusion/index.html)&gt; |
| [Flags](-flags/index.html) | [common]<br>enum [Flags](-flags/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Account.Flags](-flags/index.html)&gt; |
| [Type](-type/index.html) | [common]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Account.Type](-type/index.html)&gt; |


## Properties


| Name | Summary |
|---|---|
| [accountDetails](account-details.html) | [common]<br>val [accountDetails](account-details.html): [AccountDetails](../[common]-account-details/index.html)? = null |
| [accountExclusion](account-exclusion.html) | [common]<br>val [accountExclusion](account-exclusion.html): [Account.AccountExclusion](-account-exclusion/index.html) |
| [accountNumber](account-number.html) | [common]<br>val [accountNumber](account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [balance](balance.html) | [common]<br>val [balance](balance.html): [Amount](../../com.tink.model.misc/[common]-amount/index.html) |
| [closed](closed.html) | [common]<br>val [closed](closed.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [credentialsId](credentials-id.html) | [common]<br>val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [excluded](excluded.html) | [common]<br>val [excluded](excluded.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [favored](favored.html) | [common]<br>val [favored](favored.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [financialInstitutionID](financial-institution-i-d.html) | [common]<br>val [financialInstitutionID](financial-institution-i-d.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [firstSeen](first-seen.html) | [common]<br>val [firstSeen](first-seen.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null |
| [flags](flags.html) | [common]<br>val [flags](flags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account.Flags](-flags/index.html)&gt; |
| [holderName](holder-name.html) | [common]<br>val [holderName](holder-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [identifiers](identifiers.html) | [common]<br>val [identifiers](identifiers.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownership](ownership.html) | [common]<br>val [ownership](ownership.html): [ExactNumber](../../com.tink.model.misc/[common]-exact-number/index.html) |
| [refreshed](refreshed.html) | [common]<br>val [refreshed](refreshed.html): &lt;ERROR CLASS&gt; |
| [transferDestinations](transfer-destinations.html) | [common]<br>val [transferDestinations](transfer-destinations.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [type](type.html) | [common]<br>val [type](type.html): [Account.Type](-type/index.html) |

