[link](../../index.md) / [com.tink.service.transaction](../index.md) / [TransactionService](./index.md)

# TransactionService

`interface TransactionService`

### Functions

| Name | Summary |
|---|---|
| [categorizeTransactions](categorize-transactions.md) | `abstract suspend fun categorizeTransactions(transactionIds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, newCategoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getSimilarTransactions](get-similar-transactions.md) | `abstract suspend fun getSimilarTransactions(transactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Transaction`](../../com.tink.model.transaction/-transaction/index.md)`>` |
| [getTransaction](get-transaction.md) | `abstract suspend fun getTransaction(transactionId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Transaction`](../../com.tink.model.transaction/-transaction/index.md) |
| [listTransactions](list-transactions.md) | `abstract suspend fun listTransactions(accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, period: `[`Period`](../../com.tink.model.time/-period/index.md)`? = null, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Transaction`](../../com.tink.model.transaction/-transaction/index.md)`>` |
