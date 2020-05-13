package com.tink.link.ui.credentials

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.text.method.LinkMovementMethod
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.core.view.children
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.squareup.picasso.Picasso
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.extensions.LinkInfo
import com.tink.link.ui.extensions.convertCallToActionText
import com.tink.link.ui.extensions.hideKeyboard
import com.tink.link.ui.extensions.launch
import com.tink.link.ui.extensions.setTextWithUrlMarkdown
import com.tink.link.ui.extensions.setTextWithLinks
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.extensions.toView
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.tink_fragment_credentials.*
import kotlinx.android.synthetic.main.tink_layout_consent.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar
import timber.log.Timber

private const val PROVIDER_ARGS = "PROVIDER"

private const val UPDATE_ARGS = "UPDATE_ARGS"

private const val BANK_ID_ACTION_SAME_DEVICE = 1
private const val BANK_ID_ACTION_OTHER_DEVICE = 2

/**
 * Responsible for displaying the fields that the user should fill their credentials into
 * to authorize use of the [Provider].
 */
class CredentialsFragment : Fragment(R.layout.tink_fragment_credentials) {

    private val provider: Provider by lazy {
        requireNotNull(arguments?.getParcelable<Provider>(PROVIDER_ARGS))
    }

    private val updateArgs: CredentialsUpdateArgs? by lazy {
        arguments?.getParcelable<CredentialsUpdateArgs>(UPDATE_ARGS)
    }

    private val viewModel: CredentialsViewModel by activityViewModels()
    private val consentViewModel: ConsentViewModel by viewModels()

    private var bankIdActionType: Int = BANK_ID_ACTION_SAME_DEVICE
    private var statusDialog: AlertDialog? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = provider.displayName
        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                TinkLinkUiActivity.RESULT_CANCELLED
            )
        }

        (activity as? TinkLinkUiActivity)?.scopes?.let {
            consentViewModel.initialize(it)
            viewModel.setScopes(it)
        }

        (activity as? TinkLinkUiActivity)?.authorizeUser?.let {
            viewModel.authorizeUser = it
        }

        consentViewModel.apply {
            showConsentInformation.observe(viewLifecycleOwner, Observer {
                userGroup.visibility =
                    if (it == true) View.VISIBLE else View.GONE
            })
            showTermsAndConditions.observe(viewLifecycleOwner, Observer {
                termsAndConditionsText.visibility =
                    if (it == true) {
                        setTermsAndConditions(termsAndConditionsUrl, privacyPolicyUrl)
                        View.VISIBLE
                    } else {
                        View.GONE
                    }
            })
            isUnverified.observe(viewLifecycleOwner, Observer {
                unverifiedWarning.visibility =
                    if (it == true) View.VISIBLE else View.GONE
            })
        }

        provider.images?.icon?.let {
            Picasso.get().load(it).into(logo)
        }

        bankName.text = provider.displayName

        val readMoreText = getString(R.string.tink_consent_information_read_more)
        consentInformation.text =
            getString(
                R.string.tink_consent_information,
                getString(R.string.tink_app_name),
                readMoreText
            ).convertCallToActionText(
                ctaText = readMoreText,
                action = { showConsentInformation() },
                context = requireContext()
            )
        consentInformation.movementMethod = LinkMovementMethod.getInstance()

        val fields = provider.fields.map { field ->
            updateArgs?.fields?.get(field.name)?.let { field.copy(value = it) } ?: field
        }

        viewModel.setFields(fields)

        viewModel.fields.observe(viewLifecycleOwner, Observer { fieldList ->
            if (credentialsFields.childCount > 0) {
                credentialsFields.removeAllViews()
            }
            for (field in fieldList) {
                credentialsFields.addView(field.toView(requireContext()))
            }
        })

        if (provider.helpText.isNotBlank()) {
            providerHelpText.visibility = View.VISIBLE
            providerHelpTextBackground.visibility = View.VISIBLE
            providerHelpText.setTextWithUrlMarkdown(provider.helpText)
            providerHelpText.movementMethod = LinkMovementMethod.getInstance()
        } else {
            providerHelpText.visibility = View.GONE
            providerHelpTextBackground.visibility = View.GONE
        }

        if (provider.credentialsType == Credentials.Type.MOBILE_BANKID) {
            createCredentialsBtn.visibility = View.GONE
            bankIdButtonGroup.visibility = View.VISIBLE
        }

        bankIdButton.setOnClickListener {
            bankIdActionType = BANK_ID_ACTION_SAME_DEVICE
            submitFilledFields()
        }

        bankIdOtherDeviceButton.setOnClickListener {
            bankIdActionType = BANK_ID_ACTION_OTHER_DEVICE
            submitFilledFields()
        }

        createCredentialsBtn.setOnClickListener { submitFilledFields() }

        footer.post {
            bottomSpacer.updateLayoutParams {
                height = footer.height
            }
        }

        viewModel.credentials.observe(viewLifecycleOwner, Observer {
            Timber.d(it.toString())
        })

        viewModel.createdCredentials.observe(viewLifecycleOwner, Observer { credentials ->
            // TODO: Remove
            Timber.d("Received update for credentials ${credentials.id}")
            Timber.d("Status = ${credentials.status?.name}")
            Timber.d("Status = ${credentials.statusPayload}")
        })

        viewModel.viewState.observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                CredentialsViewModel.ViewState.WAITING_FOR_AUTHENTICATION -> {
                    showLoading(getString(R.string.tink_credentials_status_authorizing_text))
                }

                CredentialsViewModel.ViewState.UPDATING -> {
                    showLoading(
                        getString(
                            R.string.tink_credentials_status_updating_text,
                            provider.displayName
                        )
                    )
                }

                CredentialsViewModel.ViewState.UPDATED -> {
                    statusDialog?.dismiss()
                    showConnectionSuccessfulScreen()
                }

                CredentialsViewModel.ViewState.NOT_LOADING -> {
                    statusDialog?.dismiss()
                }

                else -> { }
            }
        })

        viewModel.thirdPartyAuthenticationEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { thirdPartyAuthentication ->
                activity?.let {
                    thirdPartyAuthentication.launch(it) {
                        viewModel.updateViewState(CredentialsViewModel.ViewState.NOT_LOADING)
                        showError(getString(R.string.tink_third_party_authentication_download_app_negative_error))
                    }
                }
            }
        })

        viewModel.mobileBankIdAuthenticationEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { thirdPartyAuthentication ->
                launchBankIdAuthentication(thirdPartyAuthentication)
            }
        })

        viewModel.supplementalInformationEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { supplementalInformation ->
                viewModel.credentialsId.value?.let { credentialsId ->
                    showSupplementalInfoDialog(credentialsId, supplementalInformation)
                }
            }
        })

        viewModel.errorEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { statusPayload ->
                val message =
                    statusPayload.takeUnless { it.isBlank() } ?: getString(R.string.tink_error_unknown)
                showError(message)
            }
        })

        viewModel.authorizationCode.observe(viewLifecycleOwner, Observer { code ->
            (activity as? TinkLinkUiActivity)?.let {
                it.authorizationCode = code
                viewModel.authorizationCodeSaved = true
            }
        })
    }

    private fun setTermsAndConditions(termsAndConditionsUrl: Uri, privacyPolicyUrl: Uri) {
        val termsText = getString(
            R.string.tink_terms_policy_information,
            getString(R.string.tink_terms_and_conditions),
            getString(R.string.tink_privacy_policy)
        )
        termsAndConditionsText.setTextWithLinks(
            fullText = termsText,
            links = listOf(
                LinkInfo(
                    termsAndConditionsUrl.toString(),
                    getString(R.string.tink_terms_and_conditions)
                ),
                LinkInfo(
                    privacyPolicyUrl.toString(),
                    getString(R.string.tink_privacy_policy)
                )
            )
        )
        termsAndConditionsText.movementMethod = LinkMovementMethod.getInstance()
    }

    private fun showConsentInformation() {
        findNavController().navigate(
            R.id.consentInformationFragment,
            ConsentInformationFragment.getBundle(
                provider.displayName,
                consentViewModel.scopeDescriptions.toArrayList()
            )
        )
    }

    private fun showSupplementalInfoDialog(credentialsId: String, supplementalFields: List<Field>) {
        SupplementalInformationFragment
            .newInstance(credentialsId, supplementalFields)
            .show(childFragmentManager, null)
    }

    private fun submitFilledFields() {
        val credentialsId = updateArgs?.credentialsId ?: viewModel.credentialsId.value
        if (credentialsId.isNullOrEmpty()) {
            createCredentials()
        } else {
            updateCredentials(credentialsId)
        }
    }

    private fun areFieldsValid(): Boolean {
        return credentialsFields.children
            .filterIsInstance(CredentialsField::class.java)
            .all { it.validateContent() }
    }

    private fun createCredentials() {
        if (areFieldsValid()) {
            showLoading(getString(R.string.tink_credentials_status_authorizing_text))
            hideKeyboard()

            val fields = credentialsFields.children
                .filterIsInstance(CredentialsField::class.java)
                .map { it.getFilledField() }
                .toList()

            viewModel.createCredentials(provider, fields) { error ->
                val message = error.localizedMessage ?: error.message
                ?: getString(R.string.tink_error_unknown)
                showError(message)
            }
        }
    }

    private fun showError(message: String) {
        statusDialog?.dismiss()
        statusDialog = CredentialsStatusDialogFactory
            .createDialog(
                requireContext(),
                CredentialsStatusDialogFactory.Type.ERROR,
                message
            ) {
                statusDialog?.dismiss()
            }
            .also { it.show() }
    }

    private fun showLoading(message: String, onCancel: (() -> Unit)? = null) {
        statusDialog?.dismiss()
        statusDialog = CredentialsStatusDialogFactory
            .createDialog(
                requireContext(),
                CredentialsStatusDialogFactory.Type.LOADING,
                message
            ) {
                onCancel?.invoke()
                statusDialog?.dismiss()
            }
            .also { it.show() }
    }

    private fun updateCredentials(credentialsId: String) {
        if (areFieldsValid()) {
            showLoading(getString(R.string.tink_credentials_status_authorizing_text))
            hideKeyboard()
        }

        val fields = credentialsFields.children
            .filterIsInstance(CredentialsField::class.java)
            .map { it.getFilledField() }
            .toList()

        viewModel.updateCredentials(credentialsId, fields) { error ->
            val message = error.localizedMessage ?: error.message
            ?: getString(R.string.tink_error_unknown)
            showError(message)
        }
    }

    private fun launchBankIdAuthentication(thirdPartyAppAuthentication: ThirdPartyAppAuthentication) {
        if (bankIdActionType == BANK_ID_ACTION_SAME_DEVICE) {
            thirdPartyAppAuthentication.launch(requireActivity(), {})
        } else {
            val intent = thirdPartyAppAuthentication.android?.intent
            if (!intent.isNullOrEmpty()) {
                BankIdOtherDeviceFragment
                    .newInstance(intent)
                    .show(childFragmentManager, null)
            } else {
                showError(getString(R.string.tink_error_unknown))
            }
        }
    }
    private fun showConnectionSuccessfulScreen() {
        findNavController().navigate(
            R.id.connectionSuccessfulFragment,
            ConnectionSuccessfulFragment.getBundle(provider.displayName)
        )
    }

    companion object {
        fun getBundle(provider: Provider, credentialsUpdateArgs: CredentialsUpdateArgs? = null) =
            bundleOf(PROVIDER_ARGS to provider, UPDATE_ARGS to credentialsUpdateArgs)
    }

    @Parcelize
    data class CredentialsUpdateArgs(
        val credentialsId: String, val fields: Map<String, String>
    ) : Parcelable
}
