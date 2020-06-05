[link](../../index.md) / [com.tink.link](../index.md) / [TinkLink](./index.md)

# TinkLink

`object TinkLink`

This is for Java compatibility only. Use extensions on [Tink](../../com.tink.core/-tink/index.md) when using Kotlin

### Functions

| Name | Summary |
|---|---|
| [authenticateUser](authenticate-user.md)Since: `999999999.0.0` | Authenticate an existing user with an authentication code.`fun authenticateUser(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`User`](../../com.tink.model.user/-user/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [createTemporaryUser](create-temporary-user.md)Since: `999999999.0.0` | Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.`fun createTemporaryUser(market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../../com.tink.service.handler/-result-handler/index.md)`<`[`User`](../../com.tink.model.user/-user/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getConsentContext](get-consent-context.md)Since: `999999999.0.0` | `fun getConsentContext(): `[`ConsentContext`](../../com.tink.link.consent/-consent-context/index.md) |
| [getUserContext](get-user-context.md)Since: `999999999.0.0` | Fetches the [UserContext](../../com.tink.link.core.user/-user-context/index.md) from Tink if a user is set.`fun getUserContext(): `[`UserContext`](../../com.tink.link.core.user/-user-context/index.md)`?` |
| [requireUserContext](require-user-context.md)Since: `999999999.0.0` | Fetches the [UserContext](../../com.tink.link.core.user/-user-context/index.md) from Tink if a user is set.`fun requireUserContext(): `[`UserContext`](../../com.tink.link.core.user/-user-context/index.md) |
