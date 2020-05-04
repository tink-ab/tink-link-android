[link](../../index.md) / [com.tink.rest.apis](../index.md) / [UserApi](./index.md)

# UserApi

`@JvmSuppressWildcards interface UserApi`

### Functions

| Name | Summary |
|---|---|
| [createUser](create-user.md) | Create a new user Returns the ID of the created user.`abstract suspend fun createUser(body: `[`CreateUserRequest`](../../com.tink.rest.models/-create-user-request/index.md)`): `[`CreateUserResponse`](../../com.tink.rest.models/-create-user-response/index.md) |
| [delete](delete.md) | Delete user Completely deletes the currently authenticated user and its data.`abstract suspend fun delete(body: `[`DeleteUserRequest`](../../com.tink.rest.models/-delete-user-request/index.md)`): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [flagUserReadyForTestPSD2MigrationFlow](flag-user-ready-for-test-p-s-d2-migration-flow.md) | Flag user for test PSD2-migration Flag the currently authenticated user as ready for test PSD2-migration`abstract suspend fun flagUserReadyForTestPSD2MigrationFlow(): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [getMarketList](get-market-list.md) | List markets Returns an object with a list of all available markets in which a user could register with.`abstract suspend fun getMarketList(desired: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`MarketListResponse`](../../com.tink.rest.models/-market-list-response/index.md) |
| [getProfile](get-profile.md) | Get the user profile Returns the user profile.`abstract suspend fun getProfile(): `[`UserProfile`](../../com.tink.rest.models/-user-profile/index.md) |
| [getUser](get-user.md) | Get the user Returns the user object. Note that the password field is not stored in clear text nor populated when getting the user. It's only used for setting the password when registering a new user.`abstract suspend fun getUser(): `[`User`](../../com.tink.rest.models/-user/index.md) |
| [logout](logout.md) | Logout a user`abstract suspend fun logout(autologout: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): Response<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [updateProfile](update-profile.md) | Update the user profile Updates certain user modifiable properties of a user's profile. Please refer to the body schema to see which properties are modifiable by the user.`abstract suspend fun updateProfile(body: `[`UserProfile`](../../com.tink.rest.models/-user-profile/index.md)`): `[`UserProfile`](../../com.tink.rest.models/-user-profile/index.md) |
| [updateUser](update-user.md) | Update the user Updates certain user modifiable properties of a user. Please refer to the body schema to see which properties are modifiable by the user.`abstract suspend fun updateUser(body: `[`User`](../../com.tink.rest.models/-user/index.md)`): `[`User`](../../com.tink.rest.models/-user/index.md) |
