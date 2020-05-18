package com.tink.link.payments.sample

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.tink.core.Tink
import com.tink.link.createTemporaryUser
import com.tink.link.getUserContext
import com.tink.link.payments.TransferFailure
import com.tink.link.payments.TransferMessage
import com.tink.link.payments.TransferStatus
import com.tink.link.payments.getTransferRepository
import com.tink.link.payments.sample.configuration.Configuration
import com.tink.link.payments.sample.extensions.launch
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.model.misc.ExactNumber
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class LinkPayMainActivity : AppCompatActivity() {

    private val statusMessage = MutableLiveData<String>()
    private val statusSubtitleMessage = MutableLiveData<String>()

    private var sourceDestinationUriMap: Map<String, List<String>> = emptyMap()

    private lateinit var sourceAdapter: ArrayAdapter<String>
    private lateinit var destinationAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sourceAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item)
        destinationAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item)

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

            val amount = amountInput.text.toString().takeUnless { it.isBlank() }?.toDouble()?.let {
                val bigDecimal = BigDecimal.valueOf(it)
                Amount(
                    ExactNumber(
                        bigDecimal.unscaledValue().toLong(),
                        bigDecimal.scale().toLong()
                    ), "SEK"
                )
            } ?: return@setOnClickListener

            val subscription = Tink.getTransferRepository().initiateTransfer(
                amount,
                sourceDropdown.text.toString(),
                destinationDropdown.text.toString(),
                TransferMessage(messageInput.text.toString()),
                object : StreamObserver<TransferStatus> {

                    override fun onError(error: Throwable) {
                        statusMessage.postValue("Transfer Failed")

                        statusSubtitleMessage.postValue(
                            if (error is TransferFailure) {
                                error.reason.message ?: ""
                            } else {
                                ""
                            }
                        )
                    }

                    override fun onNext(value: TransferStatus) {

                        statusSubtitleMessage.postValue("")

                        statusMessage.postValue(
                            when (value) {
                                TransferStatus.Success -> "Transfer Succeeded"
                                TransferStatus.Loading -> "Loading..."
                                is TransferStatus.AwaitingAuthentication -> "Awaiting authentication"
                            }
                        )

                        (value as? TransferStatus.AwaitingAuthentication)
                            ?.takeIf { it.credentials.status == Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION }
                            ?.credentials
                            ?.thirdPartyAppAuthentication
                            ?.launch(this@LinkPayMainActivity)
                    }
                }
            )
        }

        statusMessage.observe(this, Observer { statusText.text = it })
        statusSubtitleMessage.observe(this, Observer { statusSubtitle.text = it })

        loadAccountsButton.setOnClickListener { loadAccounts() }

        sourceDropdown.setAdapter(sourceAdapter)
        destinationDropdown.setAdapter(destinationAdapter)

        sourceDropdown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position: Int, _ ->

                destinationAdapter.clear()
                val destinations =
                    sourceDestinationUriMap[sourceAdapter.getItem(position)] ?: emptyList()

                destinationAdapter.addAll(destinations)
                destinationAdapter.notifyDataSetChanged()
            }
    }

    private fun loadAccounts() {

        Tink.getTransferRepository().fetchAccounts(ResultHandler({ accounts ->

            sourceDestinationUriMap =
                accounts.mapNotNull {
                    it.identifiers.firstOrNull()
                        ?.let { sourceUri -> sourceUri to it.transferDestinations }
                }.toMap()

            destinationDropdown.post {
                destinationDropdown.clearListSelection()
                sourceAdapter.clear()
                sourceAdapter.addAll(sourceDestinationUriMap.keys)
                sourceAdapter.notifyDataSetChanged()
            }

        }, {
            statusMessage.postValue("Error loading accounts")
        }))
    }
}
