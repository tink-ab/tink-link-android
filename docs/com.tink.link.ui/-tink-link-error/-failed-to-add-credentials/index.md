[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [TinkLinkError](../index.md) / [FailedToAddCredentials](./index.md)

# FailedToAddCredentials

`data class FailedToAddCredentials : `[`TinkLinkError`](../index.md)

Tink Link UI failed to add one or more credentials.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Tink Link UI failed to add one or more credentials.`FailedToAddCredentials(errorsByCredentialsId: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`TinkLinkErrorInfo`](../../-tink-link-error-info/index.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [errorsByCredentialsId](errors-by-credentials-id.md) | A map of failed credentials ids to [errors](../../-tink-link-error-info/index.md)`val errorsByCredentialsId: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`TinkLinkErrorInfo`](../../-tink-link-error-info/index.md)`>` |
