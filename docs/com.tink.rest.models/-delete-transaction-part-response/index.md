[link](../../index.md) / [com.tink.rest.models](../index.md) / [DeleteTransactionPartResponse](./index.md)

# DeleteTransactionPartResponse

`@JsonClass(true) data class DeleteTransactionPartResponse`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DeleteTransactionPartResponse(transaction: `[`Transaction`](../-transaction/index.md)`, counterpartTransaction: `[`Transaction`](../-transaction/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [counterpartTransaction](counterpart-transaction.md) | Counterpart transaction affected due to bilateral link being removed.`var counterpartTransaction: `[`Transaction`](../-transaction/index.md)`?` |
| [transaction](transaction.md) | The transaction to which the part belonged.`var transaction: `[`Transaction`](../-transaction/index.md) |
