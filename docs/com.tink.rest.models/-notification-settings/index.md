[link](../../index.md) / [com.tink.rest.models](../index.md) / [NotificationSettings](./index.md)

# NotificationSettings

`@JsonClass(true) data class NotificationSettings`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `NotificationSettings(balance: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, budget: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, doubleCharge: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, income: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, largeExpense: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, summaryMonthly: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, summaryWeekly: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, transaction: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, unusualAccount: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, unusualCategory: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, einvoices: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, fraud: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, leftToSpend: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, loanUpdate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [balance](balance.md) | Indicates if the user wants to receive notifications with low or high balances alerts.`var balance: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [budget](budget.md) | Indicates if the user wants to receive notifications regarding her budgets.`var budget: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [doubleCharge](double-charge.md) | Indicates if the user wants to receive notifications with double-charge alerts.`var doubleCharge: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [einvoices](einvoices.md) | Indicates if the user wants to receive notifications for e-invoices.`var einvoices: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [fraud](fraud.md) | Indicates if the user wants to receive notifications for ID Control warnings.`var fraud: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [income](income.md) | Indicates if the user wants to receive notifications when an income is received.`var income: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [largeExpense](large-expense.md) | Indicates if the user wants to receive notifications when a large expense is detected.`var largeExpense: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [leftToSpend](left-to-spend.md) | Indicates if the user wants to receive left to spend notifications.`var leftToSpend: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [loanUpdate](loan-update.md) | Indicates if the user wants to receive notifications for loan updates.`var loanUpdate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [summaryMonthly](summary-monthly.md) | Indicates if the user wants to receive notifications with monthly summaries.`var summaryMonthly: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [summaryWeekly](summary-weekly.md) | Indicates if the user wants to receive notifications with weekly summaries.`var summaryWeekly: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [transaction](transaction.md) | Indicates if the user wants to receive notifications for every transaction.`var transaction: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [unusualAccount](unusual-account.md) | Indicates if the user wants to receive notifications when there is unusual activity on any of her accounts.`var unusualAccount: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [unusualCategory](unusual-category.md) | Indicates if the user wants to receive notifications when she has spent more than usual on something.`var unusualCategory: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
