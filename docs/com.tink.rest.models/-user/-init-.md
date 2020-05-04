[link](../../index.md) / [com.tink.rest.models](../index.md) / [User](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`User(@Json("created") created: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, @Json("id") id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("profile") profile: `[`UserProfile`](../-user-profile/index.md)`, @Json("flags") flags: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, @Json("username") username: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("nationalId") nationalId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

The user model represents a unique Tink end-user and includes properties that defines the user, user profile information and user-modifiable settings. The user information can primarily be used whenever a Tink user signs up for a 3rd party service using her Tink account, or when user-modifiable settings, such as locale or currency, are needed in order to display or calculate the correct data in the 3rd party service.

