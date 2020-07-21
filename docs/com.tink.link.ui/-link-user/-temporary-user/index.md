[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [LinkUser](../index.md) / [TemporaryUser](./index.md)

# TemporaryUser

`data class TemporaryUser : `[`LinkUser`](../index.md)

Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to create a temporary user to be
used in the flow. The [market](market.md) determines what providers will be available to the user,
and the [locale](locale.md) determines which language is used on a backend level.

We recommend that the [locale](locale.md) is set to the same as is used in the user's phone so that the
user is not faced with a mix of languages.

### Parameters

`locale` - Locale for the user. Defaults to default locale for the user's market. Example: "sv_SE"

`market` - Market specific code for the user as a ISO 3166-1 country code. Example: "SE"

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to create a temporary user to be used in the flow. The [market](market.md) determines what providers will be available to the user, and the [locale](locale.md) determines which language is used on a backend level.`TemporaryUser(market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [locale](locale.md) | Locale for the user. Defaults to default locale for the user's market. Example: "sv_SE"`val locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [market](market.md) | Market specific code for the user as a ISO 3166-1 country code. Example: "SE"`val market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
