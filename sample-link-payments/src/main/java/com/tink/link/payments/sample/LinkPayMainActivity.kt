package com.tink.link.payments.sample

import android.net.Uri
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.tink.core.Tink
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.TransferFailure
import com.tink.link.payments.TransferMessage
import com.tink.link.payments.TransferStatus
import com.tink.link.payments.getTransferRepository
import com.tink.link.payments.sample.beneficiary.AddBeneficiaryDialog
import com.tink.link.payments.sample.configuration.Configuration
import com.tink.link.payments.sample.credentials.SupplementalInformationFragment
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
import retrofit2.HttpException
import timber.log.Timber
import java.util.regex.Pattern

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

    private lateinit var sourceAdapter: ArrayAdapter<AccountItem>
    private lateinit var destinationAdapter: ArrayAdapter<BeneficiaryItem>

    private var selectedAccount: AccountItem? = null
    private var selectedBeneficiary: BeneficiaryItem? = null

    private val accounts = MutableLiveData<List<Account>>().apply { value = emptyList() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link_pay_main)

        sourceAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item)
        destinationAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item)

        Tink.init(
            getConfigFromIntent() ?: configuration,
            applicationContext
        )

        statusMessage.observe(this, Observer { statusText.text = it })
        statusSubtitleMessage.observe(this, Observer { statusSubtitle.text = it })

        button.setOnClickListener { initiateTransfer() }

        sourceDropdown.setAdapter(sourceAdapter)
        destinationDropdown.setAdapter(destinationAdapter)

        sourceDropdown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position: Int, _ ->

                destinationAdapter.clear()

                val item = sourceAdapter.getItem(position) ?: return@OnItemClickListener
                val account = item.account

                val destinations = sourceDestinationUriMap[account] ?: emptyList()

                destinationAdapter.addAll(destinations.map { BeneficiaryItem(it) })
                destinationAdapter.notifyDataSetChanged()

                if (selectedAccount != item) {
                    selectedAccount = item
                    selectedBeneficiary = null
                    destinationDropdown.setText("")
                }
            }

        destinationDropdown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position: Int, _ ->
                val beneficiary = destinationAdapter.getItem(position) ?: return@OnItemClickListener
                selectedBeneficiary = beneficiary
            }

        val user = getUserFromIntent() ?: getUser()
        Tink.setUser(user)

        buildSourceDestinationMap()

        accounts.observe(this, Observer {
            addBeneficiaryButton.isEnabled = !it.isNullOrEmpty()
        })

        addBeneficiaryButton.setOnClickListener {
            accounts.value
                ?.takeIf { it.isNotEmpty() }
                ?.let {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)

                    AddBeneficiaryDialog.newInstance(it)
                        .show(transaction, null)
                }
        }
    }

    private fun getUser(): User {
        TODO("Replace with implementation for getting a User using your preferred method.")
    }

    private fun buildSourceDestinationMap() {
        loadAccounts { accounts ->
            this.accounts.postValue(accounts)

            loadBeneficiaries { beneficiaries ->

                val beneficiariesByAccountId = beneficiaries.groupBy { it.ownerAccountId }

                sourceDestinationUriMap = accounts.map {
                    it to (beneficiariesByAccountId[it.id] ?: emptyList())
                }.toMap()

                destinationDropdown.post {
                    destinationDropdown.clearListSelection()
                    sourceAdapter.clear()
                    sourceAdapter.addAll(sourceDestinationUriMap.keys.map { AccountItem(it) })
                    sourceAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    private fun loadAccounts(onAccountsLoaded: (List<Account>) -> Unit) {
        Tink.getTransferRepository()
            .fetchAccounts(ResultHandler(
                onAccountsLoaded,
                { handleError("Error when fetching accounts", it) }
            ))
    }

    private fun loadBeneficiaries(onBeneficiariesLoaded: (List<Beneficiary>) -> Unit) {
        Tink.getTransferRepository()
            .fetchBeneficiaries(ResultHandler(
                onBeneficiariesLoaded,
                { handleError("Error when fetching beneficiaries", it) }
            ))
    }

    private fun initiateTransfer() {

        val amount = amountInput.text.toString()
            .takeUnless { it.isBlank() }
            ?.let { Amount(ExactNumber(it.toDouble()), "EUR") }
            ?: return

        val sourceAccountUri = selectedAccount?.account?.identifiers?.firstOrNull() ?: return
        val beneficiaryUri = destinationDropdown.text.toString()
            .takeIf { Pattern.compile(".+://.+").matcher(it).matches() }
            ?: return


        Tink.getTransferRepository().initiateTransfer(
            amount,
            sourceAccountUri,
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

                    statusSubtitleMessage.postValue(
                        when(value) {
                            is TransferStatus.Success -> value.message
                            is TransferStatus.Loading -> value.message
                            is TransferStatus.AwaitingAuthentication -> null
                        } ?: ""
                    )

                    statusMessage.postValue(
                        when (value) {
                            is TransferStatus.Success -> "Transfer Succeeded"
                            is TransferStatus.Loading -> "Loading..."
                            is TransferStatus.AwaitingAuthentication -> "Awaiting authentication..."
                        }
                    )

                    if (value is (TransferStatus.AwaitingAuthentication)) {
                        handleAuthenticationTask(value.authenticationTask)
                    }
                }
            }
        )
    }

    private fun handleError(message: String, error: Throwable) {
        // Show error to user
        statusMessage.postValue(message)
        if (error is HttpException) {
            // Got some HttpException, show more details
            statusSubtitleMessage.postValue(error.toString())
        }

        Timber.e(error)
    }

    internal fun handleAuthenticationTask(authenticationTask: AuthenticationTask) {
        when (authenticationTask) {
            is AuthenticationTask.ThirdPartyAuthentication -> {
                val launchResult = authenticationTask.launch(this)

                if (launchResult !is AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Success) {
                    // Something went wrong when launching, show dialog prompt to install or upgrade app
                    Toast.makeText(this, "Couldn't launch third party app", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            is AuthenticationTask.SupplementalInformation -> {
                SupplementalInformationFragment.newInstance(authenticationTask)
                    .show(supportFragmentManager, null)
            }
        }
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

data class AccountItem(val account: Account) {
    override fun toString(): String = account.name
}
data class BeneficiaryItem(val beneficiary: Beneficiary) {
    override fun toString(): String = beneficiary.uri
}