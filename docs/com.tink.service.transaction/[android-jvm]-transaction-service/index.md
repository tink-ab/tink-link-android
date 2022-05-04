---
title: [androidJvm]TransactionService
---
//[link](../../../index.html)/[com.tink.service.transaction](../index.html)/[[androidJvm]TransactionService](index.html)



# TransactionService



[androidJvm]\
interface [TransactionService](index.html)



## Functions


| Name | Summary |
|---|---|
| [categorizeTransactions](categorize-transactions.html) | [androidJvm]<br>abstract suspend fun [categorizeTransactions](categorize-transactions.html)(transactionIds: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, newCategoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [getSimilarTransactions](get-similar-transactions.html) | [androidJvm]<br>abstract suspend fun [getSimilarTransactions](get-similar-transactions.html)(transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Transaction](../../com.tink.model.transaction/[android-jvm]-transaction/index.html)&gt; |
| [getTransaction](get-transaction.html) | [androidJvm]<br>abstract suspend fun [getTransaction](get-transaction.html)(transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Transaction](../../com.tink.model.transaction/[android-jvm]-transaction/index.html) |
| [listTransactions](list-transactions.html) | [androidJvm]<br>abstract suspend fun [listTransactions](list-transactions.html)(accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, categoryId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, period: [Period](../../com.tink.model.time/[android-jvm]-period/index.html)? = null, offset: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Transaction](../../com.tink.model.transaction/[android-jvm]-transaction/index.html)&gt; |

