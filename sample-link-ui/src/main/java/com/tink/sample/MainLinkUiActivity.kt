package com.tink.sample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tink.core.Tink
import com.tink.link.ui.CredentialsOperation
import com.tink.link.ui.LinkUser
import com.tink.link.ui.ProviderSelection
import com.tink.link.ui.TinkLinkError
import com.tink.link.ui.TinkLinkResult
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.model.user.Scope
import com.tink.model.user.User
import com.tink.sample.configuration.Configuration
import com.tink.service.network.TinkConfiguration
import kotlinx.android.synthetic.main.activity_main_link_ui.*

private val MainLinkUiActivity.testTinkLinkConfig
    get() = TinkConfiguration(
        environment = Configuration.sampleEnvironment,
        oAuthClientId = Configuration.sampleOAuthClientId,
        redirectUri =
            Uri.Builder()
                .scheme(getString(R.string.redirect_uri_scheme))
                .encodedAuthority(getString(R.string.redirect_uri_host))
                .build()
    )

class MainLinkUiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_link_ui)

        Tink.init(testTinkLinkConfig, applicationContext)

        linkUiButton.setOnClickListener {
            val linkUser = createdUser()?.let { LinkUser.ExistingUser(it) }
                ?: authorizationCode()?.let { LinkUser.UnauthenticatedUser(it) }
                ?: LinkUser.TemporaryUser(market = "SE", locale = "sv_SE")

            startActivityForResult(
                TinkLinkUiActivity.createIntent(
                    context = this,
                    linkUser = linkUser,
                    scopes = listOf(Scope.AccountsRead),
                    styleResId = R.style.TinkLinkUiStyle,
                    credentialsOperation = CredentialsOperation.Create(ProviderSelection.ProviderList())
                ),
                REQUEST_CODE
            )
        }
    }

    private fun createdUser(): User? {
        // This can be replaced with a created user for testing permanent user scenarios, etc.
        return null
    }

    private fun authorizationCode(): String? {
        // This can be replaced with an authorization code from delegate for authenticating a permanent user.
        return null
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE) {
            handleResultFromLinkUi(resultCode, data?.extras)
        }
    }

    private fun handleResultFromLinkUi(resultCode: Int, data: Bundle?) {
        when (resultCode) {
            TinkLinkUiActivity.RESULT_SUCCESS -> {
                when (
                    val result =
                        data?.getParcelable<TinkLinkResult>(TinkLinkUiActivity.RESULT_DATA)
                ) {
                    is TinkLinkResult.TemporaryUser -> {
                        Toast.makeText(
                            this,
                            "credentialsId: ${result.credentials.id}, authorizationCode: ${result.authorizationCode}",
                            Toast.LENGTH_LONG
                        ).show()
                    }

                    is TinkLinkResult.PermanentUser -> {
                        Toast.makeText(
                            this,
                            "credentialsId: ${result.credentials.id}",
                            Toast.LENGTH_LONG
                        ).show()
                    }

                    else -> Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show()
                }
            }

            TinkLinkUiActivity.RESULT_FAILURE -> {
                when (
                    val result =
                        data?.getParcelable<TinkLinkError>(TinkLinkUiActivity.ERROR_DATA)
                ) {
                    is TinkLinkError.FailedToAddCredentials -> {
                        for ((id, error) in result.errorsByCredentialsId) {
                            // Handling logic such as deleting the credentials matching the id
                            return
                        }
                    }
                }
            }

            TinkLinkUiActivity.RESULT_CANCELLED -> { /* Handle cancellation */ }
        }
    }

    companion object {
        const val REQUEST_CODE = 100
    }
}
