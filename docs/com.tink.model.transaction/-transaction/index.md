[link](../../index.md) / [com.tink.model.transaction](../index.md) / [Transaction](./index.md)

# Transaction

`data class Transaction : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Transaction(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, amount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, date: Instant, accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, notes: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, tags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Tag`](../-tag/index.md)`>, upcoming: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, pending: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, originalDate: Instant, originalDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, originalAmount: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, inserted: Instant)` |

### Properties

| Name | Summary |
|---|---|
| [accountId](account-id.md) | `val accountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [amount](amount.md) | `val amount: `[`Amount`](../../com.tink.model.misc/-amount/index.md) |
| [categoryId](category-id.md) | `val categoryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [date](date.md) | `val date: Instant` |
| [description](description.md) | `val description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [inserted](inserted.md) | `val inserted: Instant` |
| [notes](notes.md) | `val notes: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [originalAmount](original-amount.md) | `val originalAmount: `[`Amount`](../../com.tink.model.misc/-amount/index.md) |
| [originalDate](original-date.md) | `val originalDate: Instant` |
| [originalDescription](original-description.md) | `val originalDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [pending](pending.md) | `val pending: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [tags](tags.md) | `val tags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Tag`](../-tag/index.md)`>` |
| [upcoming](upcoming.md) | `val upcoming: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
