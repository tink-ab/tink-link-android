[link](../../index.md) / [com.tink.model.account](../index.md) / [Account](./index.md)

# Account

`data class Account : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Account(accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, balance: `[`Amount`](../../com.tink.model.misc/-amount/index.md)`, credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, excluded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, favored: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, transactional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, closed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, ownership: `[`ExactNumber`](../../com.tink.model.misc/-exact-number/index.md)`, type: Type, images: `[`Images`](../../com.tink.model/-images/index.md)`?, identifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, transferDestinations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [accountNumber](account-number.md) | `val accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [balance](balance.md) | `val balance: `[`Amount`](../../com.tink.model.misc/-amount/index.md) |
| [closed](closed.md) | `val closed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [credentialsId](credentials-id.md) | `val credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [excluded](excluded.md) | `val excluded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [favored](favored.md) | `val favored: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [id](id.md) | `val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [identifiers](identifiers.md) | `val identifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [images](images.md) | `val images: `[`Images`](../../com.tink.model/-images/index.md)`?` |
| [name](name.md) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ownership](ownership.md) | `val ownership: `[`ExactNumber`](../../com.tink.model.misc/-exact-number/index.md) |
| [transactional](transactional.md) | `val transactional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [transferDestinations](transfer-destinations.md) | `val transferDestinations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [type](type.md) | `val type: Type` |
