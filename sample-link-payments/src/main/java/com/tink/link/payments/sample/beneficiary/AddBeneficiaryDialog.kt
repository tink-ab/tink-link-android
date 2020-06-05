package com.tink.link.payments.sample.beneficiary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import com.tink.core.Tink
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.AddBeneficiaryStatus
import com.tink.link.payments.getTransferRepository
import com.tink.link.payments.sample.AccountItem
import com.tink.link.payments.sample.R
import com.tink.model.account.Account
import com.tink.service.streaming.publisher.StreamObserver
import kotlinx.android.synthetic.main.dialog_add_beneficiary.*
import kotlin.properties.Delegates


private const val ADD_BENEFICIARY_ACCOUNTS = "ADD_BENEFICIARY_ACCOUNTS"

class AddBeneficiaryDialog : DialogFragment() {

    private val accounts: List<Account> by lazy {
        requireNotNull(arguments?.getParcelableArrayList<Account>(ADD_BENEFICIARY_ACCOUNTS))
    }

    private lateinit var sourceAdapter: ArrayAdapter<AccountItem>
    private lateinit var selectedAccount: AccountItem
    private var loading by Delegates.observable(false) { _, oldValue, newValue ->
        // TODO: show loading status
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.Theme_Material_NoActionBar_Fullscreen)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_add_beneficiary, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (accounts.isEmpty()) {
            Toast.makeText(requireContext(), "Accounts list was empty", Toast.LENGTH_SHORT).show()
            dismiss()
            return
        }

        sourceAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item)
        sourceAdapter.addAll(accounts.map { AccountItem(it) })
        ownerAccountDropdown.setAdapter(sourceAdapter)

        ownerAccountDropdown.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position: Int, _ ->
                val item = sourceAdapter.getItem(position)
                addBeneficiaryButton.isEnabled = item != null

                if (item == null) return@OnItemClickListener

                selectedAccount = item
            }

        addBeneficiaryButton.setOnClickListener {
            if (loading) return@setOnClickListener

            Tink.getTransferRepository().addBeneficiary(
                ownerAccountId = selectedAccount.account.id,
                credentialsId = selectedAccount.account.credentialsId,
                accountNumberType = accountNumberType.text.toString(),
                accountNumber = accountNumber.text.toString(),
                name = name.text.toString(),
                streamObserver = object : StreamObserver<AddBeneficiaryStatus> {
                    override fun onNext(value: AddBeneficiaryStatus) {
                        when (value) {
                            is AddBeneficiaryStatus.Loading -> loading = true
                            is AddBeneficiaryStatus.Success -> {
                                loading = false
                                dismiss()
                            }
                            is AddBeneficiaryStatus.AwaitingAuthentication -> {
                                loading = true
                                val launchResult = (value.authenticationTask as? AuthenticationTask.ThirdPartyAuthentication)
                                    ?.launch(requireActivity())

                                if (launchResult !is AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Success) {
                                    // Something went wrong when launching, show dialog prompt to install or upgrade app
                                }
                            }
                        }
                    }
                }
            )
        }

        cancelButton.setOnClickListener {
            dismiss()
        }
        // set onclick
    }

    companion object {
        fun newInstance(accounts: List<Account>): AddBeneficiaryDialog {
            return AddBeneficiaryDialog().also {
                it.arguments = bundleOf(ADD_BENEFICIARY_ACCOUNTS to ArrayList(accounts))
            }
        }
    }

}