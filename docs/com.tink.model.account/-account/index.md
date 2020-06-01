[link](../../index.md) / [com.tink.model.account](../index.md) / [Account](./index.md)

# Account

`data class Account : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

An account could either be a debit account, a credit card, a loan or mortgage.

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | An account could either be a debit account, a credit card, a loan or mortgage.`Account(accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, balance: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, excluded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, favored: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, transactional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, closed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, ownership: `[`ExactNumber`](../../com.tink.model.misc/-exact-number/index.md)`, type: Type, images: `[`Images`](../../com.tink.model/-images/index.md)`?, identifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, transferDestinations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [accountNumber](account-number.md) | The account number of the account. The format of the account numbers may differ between account types and banks. This property can be updated in a update account request.`val accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [balance](balance.md) | The current balance of the account. The definition of the balance property differs between account types. &#x60;SAVINGS&#x60;: the balance represent the actual amount of cash in the account, &#x60;INVESTMENT&#x60;: the balance represents the value of the investments connected to this accounts including any available cash, &#x60;MORTGAGE&#x60;: the balance represents the loan debt outstanding from this account, &#x60;CREDIT_CARD: the balance represent the outstanding balance on the account, it does not include any available credit or purchasing power the user has with the credit provider.`val balance: `[`Amount`](../../com.tink.model.misc/-amount/index.md) |
| [closed](closed.md) | A closed account indicates that it was no longer available from the connected financial institution, most likely due to it having been closed by the user.`val closed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [credentialsId](credentials-id.md) | The internal identifier of the credentials that the account belongs to.`val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [excluded](excluded.md) | Indicates if the user has excluded the account. Categorization and PFM Features are excluded, and transactions belonging to this account are not searchable. This property can be updated in a update account request.`val excluded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [favored](favored.md) | Indicates if the user has favored the account. This property can be updated in a update account request.`val favored: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [id](id.md) | The internal identifier of account.`val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [identifiers](identifiers.md) | All possible ways to uniquely identify this &#x60;Account&#x60;. An se-identifier is built up like: &#x60;se://{clearingnumber}{accountnumber}&#x60;.`val identifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [images](images.md) | `val images: `[`Images`](../../com.tink.model/-images/index.md)`?` |
| [name](name.md) | The display name of the account. This property can be updated in a update account request.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownership](ownership.md) | The ownership ratio indicating how much of the account is owned by the user. The ownership determine the percentage of the amounts on transactions belonging to this account, that should be attributed to the user when statistics are calculated. This property has a default value, and it can only be updated by you in a update account request.`val ownership: `[`ExactNumber`](../../com.tink.model.misc/-exact-number/index.md) |
| [transactional](transactional.md) | `val transactional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [transferDestinations](transfer-destinations.md) | The destinations this Account can transfer money to, be that payment or bank transfer recipients. This field is only populated if account data is requested via GET /transfer/accounts.`val transferDestinations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [type](type.md) | The type of the account. This property can be updated in a update account request.`val type: Type` |
