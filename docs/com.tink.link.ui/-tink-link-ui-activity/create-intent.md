[link](../../index.md) / [com.tink.link.ui](../index.md) / [TinkLinkUiActivity](index.md) / [createIntent](./create-intent.md)

# createIntent

`@JvmOverloads fun createIntent(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`, linkUser: `[`LinkUser`](../-link-user/index.md)`, scopes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Scope`](../../com.tink.model.user/-scope/index.md)`>, styleResId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = R.style.TinkLinkUiStyle, providerSelection: `[`ProviderSelection`](../-provider-selection/index.md)` = ProviderSelection.ProviderList()): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Creates an intent for use when starting this activity.

This helper method makes sure that all required values are set.

### Parameters

`linkUser` - Information about the user to be used in the flow.

`scopes` - Needs to be a subset of the scopes enabled for the client id set
in the [TinkConfiguration](../../com.tink.service.network/-tink-configuration/index.md) that was used in [Tink.init](../../com.tink.core/-tink/init.md).

`styleResId` - Optional style for changing the appearance of the flow.
See our [configuration guide](https://docs.tink.com/resources/tutorials/tink-link-ui-sdk-android-tutorial#customizing-the-appearance).
The default value is [R.style.TinkLinkUiStyle](#).

`providerSelection` - Optional selection used to specify if you want to show a
[single provider](../-provider-selection/-single-provider/index.md) or a [list of providers](../-provider-selection/-provider-list/index.md).