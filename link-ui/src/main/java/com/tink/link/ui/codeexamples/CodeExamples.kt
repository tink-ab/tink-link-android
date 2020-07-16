package com.tink.link.ui.codeexamples

import android.app.Activity
import android.content.Context
import com.tink.core.Tink
import com.tink.link.ui.LinkUser
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.model.user.Scope
import com.tink.model.user.User
import com.tink.service.network.TinkConfiguration

private val applicationContext: Context = TODO()
private val testTinkLinkConfig: TinkConfiguration = TODO()
private const val REQUEST_CODE = 123
private val activity: Activity = TODO()

internal fun tinkLinkUIExample() {
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
}

private fun getExistingUser(): User? = TODO()
