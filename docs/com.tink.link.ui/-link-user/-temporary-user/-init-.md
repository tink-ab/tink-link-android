[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [LinkUser](../index.md) / [TemporaryUser](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TemporaryUser(market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Pass this to the [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to create a temporary user to be
used in the flow. The [market](market.md) determines what providers will be available to the user,
and the [locale](locale.md) determines which language is used on a backend level.

We recommend that the [locale](locale.md) is set to the same as is used in the user's phone so that the
user is not faced with a mix of languages.

### Parameters

`locale` - Locale for the user. Defaults to default locale for the user's market. Example: "sv_SE"

`market` - Market specific code for the user as a ISO 3166-1 country code. Example: "SE"