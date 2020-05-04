[link](../../index.md) / [com.tink.rest.apis](../index.md) / [AccountApi](./index.md)

# AccountApi

`@JvmSuppressWildcards interface AccountApi`

### Functions

| Name | Summary |
|---|---|
| [list](list.md) | `abstract suspend fun ~~list~~(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Account`](../../com.tink.rest.models/-account/index.md)`>` |
| [listAccounts](list-accounts.md) | List accounts Returns an object with a list of the authenticated user's accounts.`abstract suspend fun listAccounts(): `[`AccountListResponse`](../../com.tink.rest.models/-account-list-response/index.md) |
| [update](update.md) | Update an Account Updates mutable properties of an account. The following properties are possible to update: accountExclusion, accountNumber, excluded, favored, name, type`abstract suspend fun update(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, body: `[`Account`](../../com.tink.rest.models/-account/index.md)`): `[`Account`](../../com.tink.rest.models/-account/index.md) |
