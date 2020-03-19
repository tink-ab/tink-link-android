package com.tink.link

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tink.core.Tink
import com.tink.link.configuration.Configuration
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.service.authentication.user.User
import com.tink.service.network.TinkConfiguration
import kotlinx.android.synthetic.main.activity_main_link_ui.*

private val MainLinkUiActivity.testTinkLinkConfig
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

class MainLinkUiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_link_ui)

        Tink.init(testTinkLinkConfig, applicationContext)

        // Set a user on the Tink instance:
        Tink.setUser(getUser())

        linkUiButton.setOnClickListener {
            Tink.getUserContext()?.let {
                startActivityForResult(
                    Intent(this, TinkLinkUiActivity::class.java),
                    REQUEST_CODE
                )
            }
        }
    }

    private fun getUser(): User {
        TODO("Replace with implementation for getting a User using your preferred method.")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //TODO("Do something with the result from the Tink Link UI")
    }

    companion object {
        const val REQUEST_CODE = 100
    }
}
