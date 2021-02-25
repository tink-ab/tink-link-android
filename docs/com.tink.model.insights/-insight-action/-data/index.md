[link](../../../index.md) / [com.tink.model.insights](../../index.md) / [InsightAction](../index.md) / [Data](./index.md)

# Data

`sealed class Data : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

All subclasses should be data classes or provide a meaningful `equals()` function

### Types

| Name | Summary |
|---|---|
| [Acknowledge](-acknowledge.md) | `object Acknowledge : Data` |
| [CategorizeExpense](-categorize-expense/index.md) | `data class CategorizeExpense : Data` |
| [CreateBudget](-create-budget/index.md) | `data class CreateBudget : Data` |
| [CreateTransfer](-create-transfer/index.md) | `data class CreateTransfer : Data` |
| [Dismiss](-dismiss.md) | `object Dismiss : Data` |
| [NoData](-no-data.md) | `object NoData : Data` |
| [ViewBudget](-view-budget/index.md) | `data class ViewBudget : Data` |
| [ViewTransactions](-view-transactions/index.md) | `data class ViewTransactions : Data` |
| [ViewTransactionsByCategory](-view-transactions-by-category/index.md) | `data class ViewTransactionsByCategory : Data` |
