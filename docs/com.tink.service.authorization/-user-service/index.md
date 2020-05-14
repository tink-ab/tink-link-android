[link](../../index.md) / [com.tink.service.authorization](../index.md) / [UserService](./index.md)

# UserService

`interface UserService`

### Functions

| Name | Summary |
|---|---|
| [authenticate](authenticate.md) | `abstract suspend fun authenticate(authenticationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [authorize](authorize.md) | `abstract suspend fun authorize(scopes: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Scope`](../../com.tink.model.user/-scope/index.md)`>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [createAnonymousUser](create-anonymous-user.md) | `abstract suspend fun createAnonymousUser(arguments: `[`UserCreationDescriptor`](../-user-creation-descriptor/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
