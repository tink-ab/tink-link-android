---
title: [common]Transaction
---
//[link](../../../index.html)/[com.tink.model.transaction](../index.html)/[[common]Transaction](index.html)



# Transaction



[common]\
data class [Transaction](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val amount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val categoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val date: &lt;ERROR CLASS&gt;, val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val notes: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../[common]-tag/index.html)&gt;, val upcoming: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val pending: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val originalDate: &lt;ERROR CLASS&gt;, val originalDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val originalAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), val inserted: &lt;ERROR CLASS&gt;, val categoryType: [CategoryType](../[common]-category-type/index.html))



## Constructors


| | |
|---|---|
| [Transaction](-transaction.html) | [common]<br>fun [Transaction](-transaction.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), amount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), categoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), date: &lt;ERROR CLASS&gt;, accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), notes: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../[common]-tag/index.html)&gt;, upcoming: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), pending: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), originalDate: &lt;ERROR CLASS&gt;, originalDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), originalAmount: [Amount](../../com.tink.model.misc/[common]-amount/index.html), inserted: &lt;ERROR CLASS&gt;, categoryType: [CategoryType](../[common]-category-type/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [accountId](account-id.html) | [common]<br>val [accountId](account-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [amount](amount.html) | [common]<br>val [amount](amount.html): [Amount](../../com.tink.model.misc/[common]-amount/index.html) |
| [categoryId](category-id.html) | [common]<br>val [categoryId](category-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [categoryType](category-type.html) | [common]<br>val [categoryType](category-type.html): [CategoryType](../[common]-category-type/index.html) |
| [date](date.html) | [common]<br>val [date](date.html): &lt;ERROR CLASS&gt; |
| [description](description.html) | [common]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [inserted](inserted.html) | [common]<br>val [inserted](inserted.html): &lt;ERROR CLASS&gt; |
| [notes](notes.html) | [common]<br>val [notes](notes.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [originalAmount](original-amount.html) | [common]<br>val [originalAmount](original-amount.html): [Amount](../../com.tink.model.misc/[common]-amount/index.html) |
| [originalDate](original-date.html) | [common]<br>val [originalDate](original-date.html): &lt;ERROR CLASS&gt; |
| [originalDescription](original-description.html) | [common]<br>val [originalDescription](original-description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [pending](pending.html) | [common]<br>val [pending](pending.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [tags](tags.html) | [common]<br>val [tags](tags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../[common]-tag/index.html)&gt; |
| [upcoming](upcoming.html) | [common]<br>val [upcoming](upcoming.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |


## Extensions


| Name | Summary |
|---|---|
| toTransactionUpdateObject | [common, androidJvm]<br>[common]<br>fun [Transaction](index.html).[toTransactionUpdateObject](../../com.tink.service.transaction/[common]to-transaction-update-object.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Transaction](../[android-jvm]-transaction/index.html).[toTransactionUpdateObject](../../com.tink.service.transaction/[android-jvm]to-transaction-update-object.html)(): TransactionUpdateObject |

