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
        return User.fromAccessToken("eyJhbGciOiJFUzI1NiIsImtpZCI6IjkyOGI2YjMwLTM2NDctNDdlZS1hN2VhLTE5Njk1N2FkY2M3NCIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODQ1MzcxMzEsImlhdCI6MTU4NDUyOTkzMSwiaXNzIjoidGluazovL2F1dGgiLCJqdGkiOiJlNzBiNGVlNC1jMTVkLTQ2MjMtODFkMC1iNDdkY2JjMzg5NTIiLCJvcmlnaW4iOiJtYWluIiwic2NvcGVzIjpbInByb3ZpZGVyczpyZWFkIiwic3VnZ2VzdGlvbnM6cmVhZCIsImludmVzdG1lbnRzOnJlYWQiLCJjcmVkZW50aWFsczp3cml0ZSIsImF1dGhvcml6YXRpb246cmVhZCIsImNyZWRlbnRpYWxzOnJlZnJlc2giLCJjYXRlZ29yaWVzOnJlYWQiLCJ1c2VyOnJlYWQiLCJzdGF0aXN0aWNzOnJlYWQiLCJhY2NvdW50czpyZWFkIiwiY3JlZGVudGlhbHM6cmVhZCIsInRyYW5zYWN0aW9uczpyZWFkIl0sInN1YiI6InRpbms6Ly9hdXRoL3VzZXIvZTBlNjA4MGNiZDY4NGVmZGJlOGE3ODdhZGQzNTk1NjUiLCJ0aW5rOi8vYXBwL2lkIjoiYjFmZjAxODY1YzZiNDRkMGI2ZTdmYzcyOTRhNzVhMmMifQ.pEVRraxoTRDfoNMWhNpsZnC4fmhCCo8Mnw3RM4V8Y0A153iyvPDQ6HehIXKioQwpN35EkHTsQLFY0SCrdg8XlQ")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //TODO("Do something with the result from the Tink Link UI")
    }

    companion object {
        const val REQUEST_CODE = 100
    }
}
