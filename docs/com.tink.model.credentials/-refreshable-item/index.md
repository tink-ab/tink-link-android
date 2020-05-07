[link](../../index.md) / [com.tink.model.credentials](../index.md) / [RefreshableItem](./index.md)

# RefreshableItem

`enum class RefreshableItem`

Refreshable items are a way to limit which types of data should be aggregated from a provider.

Tip: You can use collection operations to quickly define different sets of items, e.g.

```
val onlyAccounts = RefreshableItem.accounts()
val everythingExceptTransactions = RefreshableItem.all() - RefreshableItem.transactions()
val onlyCreditCardData = RefreshableItem.CREDITCARD_ACCOUNTS + RefreshableItem.CREDITCARD_TRANSACTIONS
```

### Enum Values

| Name | Summary |
|---|---|
| [CHECKING_ACCOUNTS](-c-h-e-c-k-i-n-g_-a-c-c-o-u-n-t-s.md) |  |
| [CHECKING_TRANSACTIONS](-c-h-e-c-k-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s.md) |  |
| [SAVING_ACCOUNTS](-s-a-v-i-n-g_-a-c-c-o-u-n-t-s.md) |  |
| [SAVING_TRANSACTIONS](-s-a-v-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s.md) |  |
| [CREDITCARD_ACCOUNTS](-c-r-e-d-i-t-c-a-r-d_-a-c-c-o-u-n-t-s.md) |  |
| [CREDITCARD_TRANSACTIONS](-c-r-e-d-i-t-c-a-r-d_-t-r-a-n-s-a-c-t-i-o-n-s.md) |  |
| [LOAN_ACCOUNTS](-l-o-a-n_-a-c-c-o-u-n-t-s.md) |  |
| [LOAN_TRANSACTIONS](-l-o-a-n_-t-r-a-n-s-a-c-t-i-o-n-s.md) |  |
| [INVESTMENT_ACCOUNTS](-i-n-v-e-s-t-m-e-n-t_-a-c-c-o-u-n-t-s.md) |  |
| [INVESTMENT_TRANSACTIONS](-i-n-v-e-s-t-m-e-n-t_-t-r-a-n-s-a-c-t-i-o-n-s.md) |  |
| [EINVOICES](-e-i-n-v-o-i-c-e-s.md) |  |
| [TRANSFER_DESTINATIONS](-t-r-a-n-s-f-e-r_-d-e-s-t-i-n-a-t-i-o-n-s.md) |  |
| [IDENTITY_DATA](-i-d-e-n-t-i-t-y_-d-a-t-a.md) |  |

### Properties

| Name | Summary |
|---|---|
| [item](item.md) | `val item: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [accounts](accounts.md) | `fun accounts(): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](./index.md)`>` |
| [all](all.md) | `fun all(): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](./index.md)`>` |
| [transactions](transactions.md) | `fun transactions(): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](./index.md)`>` |

### Extension Functions

| Name | Summary |
|---|---|
| [plus](../plus.md) | `operator fun `[`RefreshableItem`](./index.md)`.plus(other: `[`RefreshableItem`](./index.md)`): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`RefreshableItem`](./index.md)`>` |
