[link](../../index.md) / [com.tink.link](../index.md) / [TinkLink](./index.md)

# TinkLink

`object TinkLink`

This is for Java compatibility only. Use extensions on [Tink](#) when using Kotlin

### Functions

| Name | Summary |
|---|---|
| [authenticateUser](authenticate-user.md)Since: `999999999.0.0` | Authenticate an existing user with an authentication code.`fun authenticateUser(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: ResultHandler<User>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getConsentContext](get-consent-context.md)Since: `999999999.0.0` | `fun getConsentContext(): `[`ConsentContext`](../../com.tink.link.consent/-consent-context/index.md) |
| [getUserContext](get-user-context.md)Since: `999999999.0.0` | Fetches the [UserContext](../../com.tink.link.core.user/-user-context/index.md) from Tink if a user is set.`fun getUserContext(): `[`UserContext`](../../com.tink.link.core.user/-user-context/index.md)`?` |
