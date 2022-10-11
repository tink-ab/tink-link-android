---
title: [common]TransactionService
---
//[link](../../../index.html)/[com.tink.service.transaction](../index.html)/[[common]TransactionService](index.html)



# TransactionService



[common]\
interface [TransactionService](index.html)



## Functions


| Name | Summary |
|---|---|
| [categorizeTransactions](categorize-transactions.html) | [common]<br>abstract suspend fun [categorizeTransactions](categorize-transactions.html)(transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, newCategoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [getSimilarTransactions](get-similar-transactions.html) | [common]<br>abstract suspend fun [getSimilarTransactions](get-similar-transactions.html)(transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Transaction](../../com.tink.model.transaction/[common]-transaction/index.html)&gt; |
| [getTransaction](get-transaction.html) | [common]<br>abstract suspend fun [getTransaction](get-transaction.html)(transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Transaction](../../com.tink.model.transaction/[common]-transaction/index.html) |
| [listTransactions](list-transactions.html) | [common]<br>abstract suspend fun [listTransactions](list-transactions.html)(accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, categoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, period: [Period](../../com.tink.model.time/[common]-period/index.html)? = null, offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, includeUpcoming: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, sort: &lt;ERROR CLASS&gt; = SearchQuery.SortEnum.DATE): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Transaction](../../com.tink.model.transaction/[common]-transaction/index.html)&gt; |
| [updateTransaction](update-transaction.html) | [common]<br>abstract suspend fun [updateTransaction](update-transaction.html)(transaction: [Transaction](../../com.tink.model.transaction/[common]-transaction/index.html)): &lt;ERROR CLASS&gt;&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt; |

