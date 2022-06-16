[link](../../index.md) / [com.tink.service.account](../index.md) / [AccountService](./index.md)

# AccountService

`interface AccountService`

### Functions

| Name | Summary |
|---|---|
| [listAccounts](list-accounts.md) | `abstract suspend fun listAccounts(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.model.account/-account/index.md)`>` |
| [update](update.md) | `abstract suspend fun update(descriptor: `[`UpdateAccountDescriptor`](../-update-account-descriptor/index.md)`): `[`Account`](../../com.tink.model.account/-account/index.md) |

### Inheritors

| Name | Summary |
|---|---|
| [AccountServiceImpl](../-account-service-impl/index.md) | `class AccountServiceImpl : `[`AccountService`](./index.md) |
