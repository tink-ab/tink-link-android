package com.tink.link.payments.sample

import android.net.Uri
import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.tink.core.Tink
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.TransferFailure
import com.tink.link.payments.TransferMessage
import com.tink.link.payments.TransferStatus
import com.tink.link.payments.getTransferRepository
import com.tink.link.payments.sample.configuration.Configuration
import com.tink.model.account.Account
import com.tink.model.misc.Amount
import com.tink.model.misc.ExactNumber
import com.tink.model.transfer.Beneficiary
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler
import com.tink.service.network.Environment
import com.tink.service.network.TinkConfiguration
import com.tink.service.streaming.publisher.StreamObserver
import kotlinx.android.synthetic.main.activity_link_pay_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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

    private var sourceDestinationUriMap: Map<Account, List<Beneficiary>> = emptyMap()

    private lateinit var sourceAdapter: DropdownItemAdapter<Account>
    private lateinit var destinationAdapter: DropdownItemAdapter<Beneficiary>

    private var selectedAccount: Account? = null
    private var selectedBeneficiary: Beneficiary? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link_pay_main)

        sourceAdapter =
            DropdownItemAdapter(this, android.R.layout.simple_spinner_dropdown_item) {
                it?.name ?: ""
            }
        destinationAdapter =
            DropdownItemAdapter(this, android.R.layout.simple_spinner_dropdown_item) {
                it?.name ?: ""
            }

        Tink.init(
            getConfigFromIntent() ?: configuration,
            applicationContext
        )

        statusMessage.observe(this, Observer { statusText.text = it })
        statusSubtitleMessage.observe(this, Observer { statusSubtitle.text = it })

        loadAccountsButton.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                buildSourceDestinationMap()
            }
        }
        button.setOnClickListener { initiateTransfer() }

        sourceDropdown.setAdapter(sourceAdapter)
        destinationDropdown.setAdapter(destinationAdapter)

        sourceDropdown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position: Int, _ ->

                destinationAdapter.clear()

                val account = sourceAdapter.getItem(position) ?: return@OnItemClickListener

                val destinations = sourceDestinationUriMap[account] ?: emptyList()

                destinationAdapter.addAll(destinations)
                destinationAdapter.notifyDataSetChanged()

                sourceDropdown.setText(account.name)
                selectedAccount = account
            }

        destinationDropdown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position: Int, _ ->

                val beneficiary = destinationAdapter.getItem(position) ?: return@OnItemClickListener

                destinationDropdown.setText(beneficiary.name)
                selectedBeneficiary = beneficiary
            }

        val user = getUserFromIntent() ?: getUser()
        Tink.setUser(user)
    }

    private fun getUser(): User {
        TODO("Replace with implementation for getting a User using your preferred method.")
    }

    private fun buildSourceDestinationMap() {
        loadAccounts { accounts ->
            loadBeneficiaries { beneficiaries ->

                val beneficiariesByAccountId = beneficiaries.groupBy { it.accountId }

                sourceDestinationUriMap = accounts.map {
                    it to (beneficiariesByAccountId[it.id] ?: emptyList())
                }.toMap()

                destinationDropdown.post {
                    destinationDropdown.clearListSelection()
                    sourceAdapter.clear()
                    sourceAdapter.addAll(sourceDestinationUriMap.keys)
                    sourceAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    private fun loadAccounts(onAccountsLoaded: (List<Account>) -> Unit) {
        Tink.getTransferRepository()
            .fetchAccounts(ResultHandler(onAccountsLoaded, ::handleError))
    }

    private fun loadBeneficiaries(onBeneficiariesLoaded: (List<Beneficiary>) -> Unit) {
        Tink.getTransferRepository()
            .fetchBeneficiaries(ResultHandler(onBeneficiariesLoaded, ::handleError))
    }

    private fun initiateTransfer() {

        val amount = amountInput.text.toString()
            .takeUnless { it.isBlank() }
            ?.let { Amount(ExactNumber(it.toDouble()), "EUR") }
            ?: return

        val sourceUri = selectedAccount?.identifiers?.firstOrNull() ?: return
        val beneficiaryUri = selectedBeneficiary?.uri ?: return

        Tink.getTransferRepository().initiateTransfer(
            amount,
            sourceUri,
            beneficiaryUri,
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
                        ?.let { it.operation as? AuthenticationTask.ThirdPartyAuthentication }
                        ?.launch(
                            this@LinkPayMainActivity,
                            {},
                            {}
                        )
                }
            }
        )
    }

    private fun handleError(error: Throwable) {
        // handle error
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
