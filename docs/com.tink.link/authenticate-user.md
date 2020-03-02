[link](../index.md) / [com.tink.link](index.md) / [authenticateUser](./authenticate-user.md)

# authenticateUser

`fun `[`Tink`](../com.tink.core/-tink/index.md)`.authenticateUser(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: `[`ResultHandler`](../com.tink.service.handler/-result-handler/index.md)`<`[`User`](../com.tink.service.authentication.user/-user/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Authenticate an existing user with an authentication code.

On a successful result, your resultHandler should call [Tink.setUser](../com.tink.core/-tink/set-user.md) to set this user to Tink.

