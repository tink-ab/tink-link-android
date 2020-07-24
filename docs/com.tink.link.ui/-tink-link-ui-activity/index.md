[link](../../index.md) / [com.tink.link.ui](../index.md) / [TinkLinkUiActivity](./index.md)

# TinkLinkUiActivity

`class TinkLinkUiActivity : AppCompatActivity`

Activity used for displaying the full Tink Link UI flow.

Results will be passed with [setResult](#) and can be observed with the usual methods,
such as [onActivityResult](#). Possible results are [RESULT_SUCCESS](-r-e-s-u-l-t_-s-u-c-c-e-s-s.md), [RESULT_CANCELLED](-r-e-s-u-l-t_-c-a-n-c-e-l-l-e-d.md),
and [RESULT_FAILURE](-r-e-s-u-l-t_-f-a-i-l-u-r-e.md).

If a [temporary user](../-link-user/-temporary-user/index.md) is used for the flow,
the [successful result](-r-e-s-u-l-t_-s-u-c-c-e-s-s.md) will also have an authorization code (String) bundled
with the key [RESULT_KEY_AUTHORIZATION_CODE](-r-e-s-u-l-t_-k-e-y_-a-u-t-h-o-r-i-z-a-t-i-o-n_-c-o-d-e.md).

``` kotlin
Tink.init(testTinkLinkConfig, applicationContext)

val linkUser = getExistingUser()?.let { LinkUser.ExistingUser(it) }
    ?: LinkUser.TemporaryUser(market = "SE", locale = "sv_SE")

activity.startActivityForResult(
    TinkLinkUiActivity.createIntent(
        context = activity,
        linkUser = linkUser,
        scopes = listOf(Scope.AccountsRead),
        styleResId = R.style.TinkLinkUiStyle
    ),
    REQUEST_CODE
)
```

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Activity used for displaying the full Tink Link UI flow.`TinkLinkUiActivity()` |

### Functions

| Name | Summary |
|---|---|
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onNewIntent](on-new-intent.md) | `fun onNewIntent(intent: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [ARG_LOCALE](-a-r-g_-l-o-c-a-l-e.md) | `const val ARG_LOCALE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ARG_MARKET](-a-r-g_-m-a-r-k-e-t.md) | `const val ARG_MARKET: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ARG_SCOPES](-a-r-g_-s-c-o-p-e-s.md) | `const val ARG_SCOPES: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ARG_STYLE](-a-r-g_-s-t-y-l-e.md) | `const val ARG_STYLE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ARG_USER](-a-r-g_-u-s-e-r.md) | `const val ARG_USER: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [RESULT_CANCELLED](-r-e-s-u-l-t_-c-a-n-c-e-l-l-e-d.md) | `const val RESULT_CANCELLED: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [RESULT_FAILURE](-r-e-s-u-l-t_-f-a-i-l-u-r-e.md) | `const val RESULT_FAILURE: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [RESULT_KEY_AUTHORIZATION_CODE](-r-e-s-u-l-t_-k-e-y_-a-u-t-h-o-r-i-z-a-t-i-o-n_-c-o-d-e.md) | `const val RESULT_KEY_AUTHORIZATION_CODE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [RESULT_SUCCESS](-r-e-s-u-l-t_-s-u-c-c-e-s-s.md) | `const val RESULT_SUCCESS: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [createIntent](create-intent.md) | Creates an intent for use when starting this activity.`fun createIntent(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`, linkUser: `[`LinkUser`](../-link-user/index.md)`, scopes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Scope`](../../com.tink.model.user/-scope/index.md)`>, styleResId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = R.style.TinkLinkUiStyle): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html) |
