[link](../../index.md) / [com.tink.link.ui](../index.md) / [TinkLinkUiActivity](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TinkLinkUiActivity()`

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

