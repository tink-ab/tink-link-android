package com.tink.link.pay.sample

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.tink.core.Tink
import com.tink.link.createTemporaryUser
import com.tink.link.getUserContext
import com.tink.link.pay.TransferContext
import com.tink.link.pay.TransferStatus
import com.tink.link.pay.sample.configuration.Configuration
import com.tink.link.pay.sample.extensions.launch
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.model.misc.ExactNumber
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import kotlinx.android.synthetic.main.activity_main.*

class LinkPayMainActivity : AppCompatActivity() {

    val statusMessage = MutableLiveData<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tink.init(
            TinkConfiguration(
                Configuration.sampleEnvironment,
                Configuration.sampleOAuthClientId,
                Uri.parse("tinklink://sample/pay-callback")
            ),
            applicationContext
        )

        Tink.createTemporaryUser("SE", "en_US", ResultHandler({
            Log.d(localClassName, "User created");
            Tink.setUser(it)

            Tink.getUserContext()?.credentialsRepository?.create(
                "se-test-open-banking-redirect",
                Credentials.Type.THIRD_PARTY_AUTHENTICATION,
                emptyMap(),
                ResultHandler({}, {})
            )

            var credentialsSubscription: StreamSubscription? = null
            credentialsSubscription =
                Tink.getUserContext()?.credentialsRepository?.listStream()?.subscribe(
                    object : StreamObserver<List<Credentials>> {
                        override fun onNext(value: List<Credentials>) {
                            value.forEach {
                                Log.d("Jan", "$it");
                            }

                            value
                                .find { it.status == Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION }
                                ?.thirdPartyAppAuthentication
                                ?.launch(this@LinkPayMainActivity)
                                ?.also { credentialsSubscription?.unsubscribe() }
                        }
                    }
                )
        }, {
            Log.e(localClassName, "Error:", it)
        }))


        button.setOnClickListener {
            TransferContext(
                Tink.requireComponent().transferService,
                Tink.getUserContext()!!.credentialsRepository
            ).initiateTransfer(
                Amount(ExactNumber(100, 1), "SEK"),
                "", ""
            ) { status ->

                Log.d("Jan", "New status: $status")


                statusMessage.postValue(
                    when (status) {
                        TransferStatus.Done -> "Transfer Done"
                        TransferStatus.Failed -> "Transfer Failed"
                        TransferStatus.Loading -> "Loading..."
                        is TransferStatus.AwaitingAuthentication -> "Awaiting authentication"
                    }
                )

                (status as? TransferStatus.AwaitingAuthentication)
                    ?.takeIf { it.credentials.status == Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION }
                    ?.credentials
                    ?.thirdPartyAppAuthentication
                    ?.launch(this@LinkPayMainActivity)
            }
        }

        statusMessage.observe(this, Observer { statusText.text = it })


    }
}
