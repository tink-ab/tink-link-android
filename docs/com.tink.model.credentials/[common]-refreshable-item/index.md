---
title: [common]RefreshableItem
---
//[link](../../../index.html)/[com.tink.model.credentials](../index.html)/[[common]RefreshableItem](index.html)



# RefreshableItem



[common]\
enum [RefreshableItem](index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[RefreshableItem](index.html)&gt; 

Refreshable items are a way to limit which types of data should be aggregated from a provider.



Tip: You can use collection operations to quickly define different sets of items, e.g.

val onlyAccounts = RefreshableItem.accounts()\
val everythingExceptTransactions = RefreshableItem.all() - RefreshableItem.transactions()\
val onlyCreditCardData = RefreshableItem.CREDITCARD_ACCOUNTS + RefreshableItem.CREDITCARD_TRANSACTIONS



## Entries


| | |
|---|---|
| [IDENTITY_DATA](-i-d-e-n-t-i-t-y_-d-a-t-a/index.html) | [common]<br>[IDENTITY_DATA](-i-d-e-n-t-i-t-y_-d-a-t-a/index.html)(&quot;IDENTITY_DATA&quot;) |
| [TRANSFER_DESTINATIONS](-t-r-a-n-s-f-e-r_-d-e-s-t-i-n-a-t-i-o-n-s/index.html) | [common]<br>[TRANSFER_DESTINATIONS](-t-r-a-n-s-f-e-r_-d-e-s-t-i-n-a-t-i-o-n-s/index.html)(&quot;TRANSFER_DESTINATIONS&quot;) |
| [EINVOICES](-e-i-n-v-o-i-c-e-s/index.html) | [common]<br>[EINVOICES](-e-i-n-v-o-i-c-e-s/index.html)(&quot;EINVOICES&quot;) |
| [INVESTMENT_TRANSACTIONS](-i-n-v-e-s-t-m-e-n-t_-t-r-a-n-s-a-c-t-i-o-n-s/index.html) | [common]<br>[INVESTMENT_TRANSACTIONS](-i-n-v-e-s-t-m-e-n-t_-t-r-a-n-s-a-c-t-i-o-n-s/index.html)(&quot;INVESTMENT_TRANSACTIONS&quot;) |
| [INVESTMENT_ACCOUNTS](-i-n-v-e-s-t-m-e-n-t_-a-c-c-o-u-n-t-s/index.html) | [common]<br>[INVESTMENT_ACCOUNTS](-i-n-v-e-s-t-m-e-n-t_-a-c-c-o-u-n-t-s/index.html)(&quot;INVESTMENT_ACCOUNTS&quot;) |
| [LOAN_TRANSACTIONS](-l-o-a-n_-t-r-a-n-s-a-c-t-i-o-n-s/index.html) | [common]<br>[LOAN_TRANSACTIONS](-l-o-a-n_-t-r-a-n-s-a-c-t-i-o-n-s/index.html)(&quot;LOAN_TRANSACTIONS&quot;) |
| [LOAN_ACCOUNTS](-l-o-a-n_-a-c-c-o-u-n-t-s/index.html) | [common]<br>[LOAN_ACCOUNTS](-l-o-a-n_-a-c-c-o-u-n-t-s/index.html)(&quot;LOAN_ACCOUNTS&quot;) |
| [CREDITCARD_TRANSACTIONS](-c-r-e-d-i-t-c-a-r-d_-t-r-a-n-s-a-c-t-i-o-n-s/index.html) | [common]<br>[CREDITCARD_TRANSACTIONS](-c-r-e-d-i-t-c-a-r-d_-t-r-a-n-s-a-c-t-i-o-n-s/index.html)(&quot;CREDITCARD_TRANSACTIONS&quot;) |
| [CREDITCARD_ACCOUNTS](-c-r-e-d-i-t-c-a-r-d_-a-c-c-o-u-n-t-s/index.html) | [common]<br>[CREDITCARD_ACCOUNTS](-c-r-e-d-i-t-c-a-r-d_-a-c-c-o-u-n-t-s/index.html)(&quot;CREDITCARD_ACCOUNTS&quot;) |
| [SAVING_TRANSACTIONS](-s-a-v-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.html) | [common]<br>[SAVING_TRANSACTIONS](-s-a-v-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.html)(&quot;SAVING_TRANSACTIONS&quot;) |
| [SAVING_ACCOUNTS](-s-a-v-i-n-g_-a-c-c-o-u-n-t-s/index.html) | [common]<br>[SAVING_ACCOUNTS](-s-a-v-i-n-g_-a-c-c-o-u-n-t-s/index.html)(&quot;SAVING_ACCOUNTS&quot;) |
| [CHECKING_TRANSACTIONS](-c-h-e-c-k-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.html) | [common]<br>[CHECKING_TRANSACTIONS](-c-h-e-c-k-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.html)(&quot;CHECKING_TRANSACTIONS&quot;) |
| [CHECKING_ACCOUNTS](-c-h-e-c-k-i-n-g_-a-c-c-o-u-n-t-s/index.html) | [common]<br>[CHECKING_ACCOUNTS](-c-h-e-c-k-i-n-g_-a-c-c-o-u-n-t-s/index.html)(&quot;CHECKING_ACCOUNTS&quot;) |


## Types


| Name | Summary |
|---|---|
| [Companion](-companion/index.html) | [common]<br>object [Companion](-companion/index.html) |


## Properties


| Name | Summary |
|---|---|
| [item](item.html) | [common]<br>val [item](item.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-1713223439) | [common]<br>val [name](../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-1713223439): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-1713223439) | [common]<br>val [ordinal](../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-1713223439): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |


## Extensions


| Name | Summary |
|---|---|
| plus | [common, androidJvm]<br>[common]<br>operator fun [RefreshableItem](index.html).[plus](../[common]plus.html)(other: [RefreshableItem](index.html)): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[RefreshableItem](index.html)&gt;<br>[androidJvm]<br>operator fun [RefreshableItem](../[android-jvm]-refreshable-item/index.html).[plus](../[android-jvm]plus.html)(other: [RefreshableItem](../[android-jvm]-refreshable-item/index.html)): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[RefreshableItem](../[android-jvm]-refreshable-item/index.html)&gt; |

