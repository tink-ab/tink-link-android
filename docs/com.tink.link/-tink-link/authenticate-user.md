[link](../../index.md) / [com.tink.link](../index.md) / [TinkLink](index.md) / [authenticateUser](./authenticate-user.md)

# authenticateUser

`@JvmStatic fun authenticateUser(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultHandler: ResultHandler<User>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Authenticate an existing user with an authentication code.

On a successful result, your resultHandler should call [Tink.setUser](#) to set this user to Tink.

