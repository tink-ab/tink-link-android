package com.tink.link.sample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tink.core.Tink
import com.tink.link.sample.configuration.Configuration
import com.tink.link.getUserContext
import com.tink.service.network.Environment
import com.tink.service.network.TinkConfiguration

private val MainActivity.testTinkLinkConfig
    get() = TinkConfiguration(
        environment = Configuration.sampleEnvironment,
        oAuthClientId = Configuration.sampleOAuthClientId,
        redirectUri =
        Uri.Builder()
            .scheme(getString(R.string.redirect_uri_scheme))
            .encodedAuthority(getString(R.string.redirect_uri_host) + ":" + getString(R.string.redirect_uri_port))
            .path(getString(R.string.redirect_uri_path))
            .build()
    )

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config = getConfigFromIntent() ?: testTinkLinkConfig

        Tink.init(config, applicationContext)

        redirectIfAppropriate(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        redirectIfAppropriate(intent)
    }

    private fun redirectIfAppropriate(intent: Intent?) {
        intent?.data?.let { uri ->
            Tink.getUserContext()?.handleUri(uri)
        }
    }

    private fun getConfigFromIntent(): TinkConfiguration? =
        intent?.getStringExtra(CLIENT_ID_EXTRA)
            ?.takeUnless { it.isEmpty() }
            ?.let {
                TinkConfiguration(Environment.Production, it, testTinkLinkConfig.redirectUri)
            }

    companion object {
        const val CLIENT_ID_EXTRA = "clientIdExtra"
        const val ACCESS_TOKEN_EXTRA = "accessTokenExtra"
    }
}

interface TinkLinkConsumer
