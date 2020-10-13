[link](../../../index.md) / [com.tink.link.ui](../../index.md) / [CredentialsOperation](../index.md) / [Refresh](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Refresh(credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, authenticate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false)`

Pass this to [TinkLinkUiActivity.createIntent](../../-tink-link-ui-activity/create-intent.md) function to refresh credentials.

### Parameters

`credentialsId` - Id of the [Credentials](../../../com.tink.model.credentials/-credentials/index.md) to be refreshed

`authenticate` - Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional)