package com.tink.sample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tink.core.Tink
import com.tink.sample.configuration.Configuration
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.model.user.Scope
import com.tink.service.network.TinkConfiguration
import kotlinx.android.synthetic.main.activity_main_link_ui.*

private val MainLinkUiActivity.testTinkLinkConfig
    get() = TinkConfiguration(
        environment = Configuration.sampleEnvironment,
        oAuthClientId = Configuration.sampleOAuthClientId,
        redirectUri =
        Uri.Builder()
            .scheme(getString(R.string.tink_redirect_uri_scheme))
            .encodedAuthority(getString(R.string.tink_redirect_uri_host) + ":" + getString(
                R.string.tink_redirect_uri_port))
            .path(getString(R.string.tink_redirect_uri_path))
            .build()
    )

class MainLinkUiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_link_ui)

        Tink.init(testTinkLinkConfig, applicationContext)

        linkUiButton.setOnClickListener {
            startActivityForResult(
                TinkLinkUiActivity.createIntent(
                    context = this,
                    styleResId = R.style.TinkStyle_ChewingGum,
                    scopes = listOf(Scope.AccountsRead),
                    market = "SE",
                    locale = "sv_SE",
                    authorizeUser = SHOULD_AUTHORIZE_USER
                ),
                REQUEST_CODE
            )
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE) {
            handleResultFromLinkUi(resultCode, data?.extras)
        }
    }

    private fun handleResultFromLinkUi(resultCode: Int, data: Bundle?) {
        if (resultCode == TinkLinkUiActivity.RESULT_SUCCESS) {
            val authorizationCode =
                data?.getString(TinkLinkUiActivity.RESULT_KEY_AUTHORIZATION_CODE)
            if (!authorizationCode.isNullOrEmpty()) {
                Toast.makeText(
                    this,
                    "Received user authorization code: $authorizationCode",
                    Toast.LENGTH_LONG
                ).show()
            } else if (SHOULD_AUTHORIZE_USER) {
                Toast.makeText(this, "Error: Invalid authorization code", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Connection successful", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        const val REQUEST_CODE = 100
        const val SHOULD_AUTHORIZE_USER = false
    }
}
