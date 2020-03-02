[link](../../index.md) / [com.tink.model.budget](../index.md) / [BudgetCreateOrUpdateDescriptor](./index.md)

# BudgetCreateOrUpdateDescriptor

`data class BudgetCreateOrUpdateDescriptor : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

Descriptor for creating or updating a budget.
If we have an id, it means we're updating an already existing budget.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Descriptor for creating or updating a budget. If we have an id, it means we're updating an already existing budget.`BudgetCreateOrUpdateDescriptor(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, targetAmount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, filter: Filter, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, periodicity: Periodicity)` |

### Properties

| Name | Summary |
|---|---|
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [filter](filter.md) | `val filter: Filter` |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodicity](periodicity.md) | `val periodicity: Periodicity` |
| [targetAmount](target-amount.md) | `val targetAmount: `[`Amount`](../../com.tink.model.misc/-amount/index.md) |
