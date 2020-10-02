[link](../index.md) / [com.tink.link.ui](./index.md)

## Package com.tink.link.ui

### Types

| Name | Summary |
|---|---|
| [LinkUser](-link-user/index.md) | Use this to let Tink Link UI know if it should use an [existing user](-link-user/-existing-user/index.md) or create a [temporary user](-link-user/-temporary-user/index.md).`sealed class LinkUser : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [ProviderSelection](-provider-selection/index.md) | Used as an argument for the [TinkLinkUiActivity](-tink-link-ui-activity/index.md) to specify if you want to select a [single provider](-provider-selection/-single-provider/index.md) or a [list of providers](-provider-selection/-provider-list/index.md).`sealed class ProviderSelection : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [TinkLinkResult](-tink-link-result/index.md) | The result data that is returned from the Tink Link UI flow. Possible values are [TemporaryUser](-tink-link-result/-temporary-user/index.md) and [PermanentUser](-tink-link-result/-permanent-user/index.md)`sealed class TinkLinkResult : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [TinkLinkUiActivity](-tink-link-ui-activity/index.md) | Activity used for displaying the full Tink Link UI flow.`class TinkLinkUiActivity : AppCompatActivity` |

### Properties

| Name | Summary |
|---|---|
| [FRAGMENT_ARG_LINK_USER](-f-r-a-g-m-e-n-t_-a-r-g_-l-i-n-k_-u-s-e-r.md) | `const val FRAGMENT_ARG_LINK_USER: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [FRAGMENT_ARG_PROVIDER_SELECTION](-f-r-a-g-m-e-n-t_-a-r-g_-p-r-o-v-i-d-e-r_-s-e-l-e-c-t-i-o-n.md) | `const val FRAGMENT_ARG_PROVIDER_SELECTION: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
