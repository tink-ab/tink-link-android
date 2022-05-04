---
title: [androidJvm]Account
---
//[link](../../../index.html)/[com.tink.model.account](../index.html)/[[androidJvm]Account](index.html)



# Account



[androidJvm]\
data class [Account](index.html)(val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val balance: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val excluded: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val favored: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val closed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val holderName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val accountDetails: [AccountDetails](../[android-jvm]-account-details/index.html)? = null, val ownership: [ExactNumber](../../com.tink.model.misc/[android-jvm]-exact-number/index.html), val type: [Account.Type](-type/index.html), val flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account.Flags](-flags/index.html)&gt;, val accountExclusion: [Account.AccountExclusion](-account-exclusion/index.html), val refreshed: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, val financialInstitutionID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val identifiers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val transferDestinations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val firstSeen: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [Account](-account.html) | [androidJvm]<br>fun [Account](-account.html)(accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), balance: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), excluded: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), favored: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), closed: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), holderName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, accountDetails: [AccountDetails](../[android-jvm]-account-details/index.html)? = null, ownership: [ExactNumber](../../com.tink.model.misc/[android-jvm]-exact-number/index.html), type: [Account.Type](-type/index.html), flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account.Flags](-flags/index.html)&gt;, accountExclusion: [Account.AccountExclusion](-account-exclusion/index.html), refreshed: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, financialInstitutionID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, identifiers: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, transferDestinations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, firstSeen: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null) |


## Types


| Name | Summary |
|---|---|
| [AccountExclusion](-account-exclusion/index.html) | [androidJvm]<br>enum [AccountExclusion](-account-exclusion/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Account.AccountExclusion](-account-exclusion/index.html)&gt; |
| [Flags](-flags/index.html) | [androidJvm]<br>enum [Flags](-flags/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Account.Flags](-flags/index.html)&gt; |
| [Type](-type/index.html) | [androidJvm]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Account.Type](-type/index.html)&gt; |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accountDetails](account-details.html) | [androidJvm]<br>val [accountDetails](account-details.html): [AccountDetails](../[android-jvm]-account-details/index.html)? = null |
| [accountExclusion](account-exclusion.html) | [androidJvm]<br>val [accountExclusion](account-exclusion.html): [Account.AccountExclusion](-account-exclusion/index.html) |
| [accountNumber](account-number.html) | [androidJvm]<br>val [accountNumber](account-number.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [balance](balance.html) | [androidJvm]<br>val [balance](balance.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |
| [closed](closed.html) | [androidJvm]<br>val [closed](closed.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [credentialsId](credentials-id.html) | [androidJvm]<br>val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [excluded](excluded.html) | [androidJvm]<br>val [excluded](excluded.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [favored](favored.html) | [androidJvm]<br>val [favored](favored.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [financialInstitutionID](financial-institution-i-d.html) | [androidJvm]<br>val [financialInstitutionID](financial-institution-i-d.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [firstSeen](first-seen.html) | [androidJvm]<br>val [firstSeen](first-seen.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null |
| [flags](flags.html) | [androidJvm]<br>val [flags](flags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Account.Flags](-flags/index.html)&gt; |
| [holderName](holder-name.html) | [androidJvm]<br>val [holderName](holder-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [identifiers](identifiers.html) | [androidJvm]<br>val [identifiers](identifiers.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownership](ownership.html) | [androidJvm]<br>val [ownership](ownership.html): [ExactNumber](../../com.tink.model.misc/[android-jvm]-exact-number/index.html) |
| [refreshed](refreshed.html) | [androidJvm]<br>val [refreshed](refreshed.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [transferDestinations](transfer-destinations.html) | [androidJvm]<br>val [transferDestinations](transfer-destinations.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [type](type.html) | [androidJvm]<br>val [type](type.html): [Account.Type](-type/index.html) |

