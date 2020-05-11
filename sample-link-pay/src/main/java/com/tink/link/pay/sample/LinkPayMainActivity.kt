package com.tink.link.pay.sample

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tink.core.Tink
import com.tink.link.createTemporaryUser
import com.tink.link.pay.sample.configuration.Configuration
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration

class LinkPayMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tink.init(
            TinkConfiguration(
                Configuration.sampleEnvironment,
                Configuration.sampleOAuthClientId,
                Uri.parse("tinklink://sample/pay")
            ),
            applicationContext
        )

        Tink.createTemporaryUser("SE", "en_US", ResultHandler({
            Log.d(localClassName, "User created");
            Tink.setUser(it)
        }, {
            Log.e(localClassName, "Error:", it);
        }))
    }
}
