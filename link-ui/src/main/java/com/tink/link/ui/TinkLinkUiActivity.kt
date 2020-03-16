package com.tink.link.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tink.core.Tink
import com.tink.core.provider.ProviderRepository
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.getUserContext

class TinkLinkUiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Confirm how and where this is done (perhaps in the activity that launches this one?)
        //Tink.init(testTinkLinkConfig, applicationContext)

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
