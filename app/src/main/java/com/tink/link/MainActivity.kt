package com.tink.link

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tink.core.Tink
import com.tink.core.provider.ProviderRepository
import com.tink.link.configuration.Configuration
import com.tink.link.core.credentials.CredentialRepository
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

        Tink.init(testTinkLinkConfig, applicationContext)

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
}

interface TinkLinkConsumer

interface TinkRepositoryProvider {
    val providerRepository: ProviderRepository?
    val credentialRepository: CredentialRepository?
}

fun <T> T.getRepositoryProvider() where T : Fragment, T : TinkLinkConsumer =
    object : TinkRepositoryProvider {
        override val providerRepository: ProviderRepository?
            get() = Tink.getUserContext()?.providerRepository
        override val credentialRepository: CredentialRepository?
            get() = Tink.getUserContext()?.credentialRepository
    }
