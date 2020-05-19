package com.tink.link.payments.sample

import android.net.Uri
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.tink.core.Tink
import com.tink.link.payments.TransferFailure
import com.tink.link.payments.TransferMessage
import com.tink.link.payments.TransferStatus
import com.tink.link.payments.getTransferRepository
import com.tink.link.payments.sample.configuration.Configuration
import com.tink.link.payments.sample.extensions.launch
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.model.misc.ExactNumber
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler
import com.tink.service.network.Environment
import com.tink.service.network.TinkConfiguration
import com.tink.service.streaming.publisher.StreamObserver
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

private val LinkPayMainActivity.configuration
    get() = TinkConfiguration(
        Configuration.sampleEnvironment,
        Configuration.sampleOAuthClientId,
        Uri.Builder()
            .scheme(getString(R.string.payments_redirect_uri_scheme))
            .authority(getString(R.string.payments_redirect_uri_host))
            .path(getString(R.string.payments_redirect_uri_path))
            .build()
    )

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
            getConfigFromIntent() ?: configuration,
            applicationContext
        )

        statusMessage.observe(this, Observer { statusText.text = it })
        statusSubtitleMessage.observe(this, Observer { statusSubtitle.text = it })

        loadAccountsButton.setOnClickListener { loadAccounts() }
        button.setOnClickListener { initiateTransfer() }

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

        val user = getUserFromIntent() ?: getUser()
        Tink.setUser(user)
    }

    private fun getUser(): User {
        TODO("Replace with implementation for getting a User using your preferred method.")
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

        }, { error ->
            statusMessage.postValue("Error loading accounts")
            error.message
                ?.takeUnless { it.isBlank() }
                ?.let(statusSubtitleMessage::postValue)
        }))
    }

    private fun initiateTransfer() {

        val amount = amountInput.text.toString().takeUnless { it.isBlank() }?.toDouble()?.let {
            val bigDecimal = BigDecimal.valueOf(it)
            Amount(
                ExactNumber(
                    bigDecimal.unscaledValue().toLong(),
                    bigDecimal.scale().toLong()
                ), "SEK"
            )
        } ?: return

        Tink.getTransferRepository().initiateTransfer(
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

    private fun getConfigFromIntent(): TinkConfiguration? =
        intent?.getStringExtra(CLIENT_ID_EXTRA)
            ?.takeUnless { it.isEmpty() }
            ?.let {
                TinkConfiguration(Environment.Production, it, configuration.redirectUri)
            }

    private fun getUserFromIntent(): User? =
        intent
            ?.getStringExtra(ACCESS_TOKEN_EXTRA)
            ?.takeUnless { it.isEmpty() }
            ?.let {
                User.fromAccessToken(it)
            }

    companion object {
        const val CLIENT_ID_EXTRA = "clientIdExtra"
        const val ACCESS_TOKEN_EXTRA = "accessTokenExtra"
    }
}
