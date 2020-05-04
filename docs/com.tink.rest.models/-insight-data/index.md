[link](../../index.md) / [com.tink.rest.models](../index.md) / [InsightData](./index.md)

# InsightData

`@JsonClass(true) data class InsightData`

### Types

| Name | Summary |
|---|---|
| [TypeEnum](-type-enum/index.md) | The insight type Values: ACCOUNT_BALANCE_LOW, BUDGET_OVERSPENT, BUDGET_CLOSE_NEGATIVE, BUDGET_CLOSE_POSITIVE, BUDGET_SUCCESS, BUDGET_SUMMARY_ACHIEVED, BUDGET_SUMMARY_OVERSPENT, LARGE_EXPENSE, SINGLE_UNCATEGORIZED_TRANSACTION, DOUBLE_CHARGE, WEEKLY_UNCATEGORIZED_TRANSACTIONS, WEEKLY_SUMMARY_EXPENSES_BY_CATEGORY, WEEKLY_SUMMARY_EXPENSES_BY_DAY, MONTHLY_SUMMARY_EXPENSES_BY_CATEGORY, LEFT_TO_SPEND_NEGATIVE`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InsightData(type: TypeEnum? = null)` |

### Properties

| Name | Summary |
|---|---|
| [type](type.md) | The insight type`var type: TypeEnum?` |
