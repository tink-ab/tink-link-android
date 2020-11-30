package com.tink.link.ui.credentials

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.text.method.LinkMovementMethod
import android.view.View
import androidx.annotation.UiThread
import androidx.appcompat.app.AlertDialog
import androidx.core.view.children
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.squareup.picasso.Picasso
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.analytics.TinkLinkTracker
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.extensions.LinkInfo
import com.tink.link.ui.extensions.hideKeyboard
import com.tink.link.ui.extensions.setTextWithLinks
import com.tink.link.ui.extensions.setTextWithUrlMarkdown
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.extensions.toView
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.tink_fragment_credentials.*
import kotlinx.android.synthetic.main.tink_fragment_credentials.authenticateCredentialsLayout
import kotlinx.android.synthetic.main.tink_layout_credentials_authenticate.*
import kotlinx.android.synthetic.main.tink_layout_toolbar_with_logo.*
import kotlinx.android.synthetic.main.tink_layout_toolbar_with_logo.view.*

private const val BANK_ID_ACTION_SAME_DEVICE = 1
private const val BANK_ID_ACTION_OTHER_DEVICE = 2

/**
 * Responsible for displaying the fields that the user should fill their credentials into
 * to authorize use of the [Provider].
 */
internal class CredentialsFragment : Fragment(R.layout.tink_fragment_credentials) {

    private val arguments: CredentialsFragmentArgs by navArgs()

    private val credentialsOperationArgs: CredentialsOperationArgs by lazy { arguments.operationArgs }
    private val provider: Provider by lazy { credentialsOperationArgs.provider }

    private val viewModel: CredentialsViewModel by activityViewModels()
    private val consentViewModel: ConsentViewModel by viewModels()

    private var bankIdActionType: Int = BANK_ID_ACTION_SAME_DEVICE
    private var statusDialog: AlertDialog? = null
    private var statusDialogInfo: StatusDialogInfo? = null

    private data class StatusDialogInfo(
        val message: String,
        val type: CredentialsStatusDialogFactory.Type
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbarWithLogo.toolbarTitleView.text = provider.displayName
        toolbarWithLogo.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                TinkLinkUiActivity.RESULT_CANCELLED
            )
        }

        TinkLinkTracker.trackScreen(ScreenEvent.SUBMIT_CREDENTIALS_SCREEN)

        provider.images?.icon?.let {
            Picasso.get().load(it).into(toolbarWithLogo.logoView)
        }

        when (credentialsOperationArgs) {
            is CredentialsOperationArgs.Create,
            is CredentialsOperationArgs.Update -> { showFullCredentialsFlow() }

            is CredentialsOperationArgs.Authenticate,
            is CredentialsOperationArgs.Refresh -> { showAuthenticateFlow() }
        }

        (activity as? TinkLinkUiActivity)?.scopes?.let {
            consentViewModel.initialize(it)
            viewModel.scopes = it
        }

        (activity as? TinkLinkUiActivity)?.authorizeUser?.let {
            viewModel.authorizeUser = it
        }

        viewModel.viewState.observe(viewLifecycleOwner) { state ->
            when (state) {
                CredentialsViewModel.ViewState.WAITING_FOR_AUTHENTICATION -> {
                    showLoading(getString(R.string.tink_credentials_status_authorizing))
                }

                CredentialsViewModel.ViewState.UPDATING -> {
                    showLoading(
                        getString(
                            R.string.tink_credentials_status_updating,
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
        }

        viewModel.errorEvent.observe(viewLifecycleOwner) { event ->
            event.getContentIfNotHandled()?.let { statusPayload ->
                val message =
                    statusPayload.takeUnless { it.isBlank() } ?: getString(R.string.tink_error_unknown)
                showError(message)
            }
        }

        viewModel.authorizationCode.observe(viewLifecycleOwner) { code ->
            (activity as? TinkLinkUiActivity)?.let {
                it.authorizationCode = code
            }
        }

        viewModel.credentials.observe(viewLifecycleOwner) { credentials ->
            (activity as? TinkLinkUiActivity)?.let {
                it.credentials = credentials
            }
        }
    }

    private fun showFullCredentialsFlow() {
        authenticateCredentialsLayout.visibility = View.GONE
        addCredentialsLayout.visibility = View.VISIBLE
        consentViewModel.apply {
            clientDescription.observe(viewLifecycleOwner) {
                if (showTermsAndConsent(it)) {
                    termsAndConsentText.visibility = View.VISIBLE
                    setTermsAndConsentText(termsAndConditionsUrl, privacyPolicyUrl, it.clientName)
                } else {
                    termsAndConsentText.visibility = View.GONE
                }
            }
            isUnverified.observe(viewLifecycleOwner) {
                unverifiedWarning.visibility =
                    if (it == true) View.VISIBLE else View.GONE
            }
            showTinkLogo.observe(viewLifecycleOwner) {
                tinkLogo.isVisible = it
            }
        }

        if (provider.fields.isEmpty()) {
            showEmptyFieldsFlow()
        } else {
            emptyFieldsGroup.isVisible = false
            credentialsFieldsHelpTextGroup.isVisible = true
        }

        val fields = provider.fields.map { field ->
            credentialsOperationArgs
                .takeIf { it is CredentialsOperationArgs.Update }
                ?.let { operationArgs ->
                    (operationArgs as CredentialsOperationArgs.Update).credentials.fields[field.name]
                        ?.let { field.copy(value = it) }
                }
                ?: field
        }

        viewModel.setFields(fields)

        viewModel.fields.observe(viewLifecycleOwner) { fieldList ->
            if (credentialsFields.childCount > 0) {
                credentialsFields.removeAllViews()
            }
            for (field in fieldList) {
                credentialsFields.addView(field.toView(requireContext()))
            }
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

        if (provider.helpText.isNotBlank()) {
            providerHelpText.visibility = View.VISIBLE
            providerHelpText.setTextWithUrlMarkdown(provider.helpText)
            providerHelpText.movementMethod = LinkMovementMethod.getInstance()
        } else {
            providerHelpText.visibility = View.GONE
        }

        createCredentialsBtn.setOnClickListener { submitFilledFields() }

        footer.post {
            bottomSpacer.updateLayoutParams {
                height = footer.height
            }
        }
    }

    private fun showEmptyFieldsFlow() {
        credentialsFieldsHelpTextGroup.isVisible = false
        emptyFieldsGroup.isVisible = true
        provider.images?.icon?.let {
            Picasso.get().load(it).into(emptyFieldsBankLogo)
        }
        emptyFieldsLoginText.text =
            getString(R.string.tink_credentials_empty_fields_login, provider.displayName)
    }

    private fun showAuthenticateFlow() {
        addCredentialsLayout.visibility = View.GONE
        authenticateCredentialsLayout.visibility = View.VISIBLE
        statusMessage.text =
            getString(R.string.tink_credentials_status_updating, provider.displayName)
        cancelButton.setOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                TinkLinkUiActivity.RESULT_CANCELLED
            )
        }
        when (val operationArgs = credentialsOperationArgs) {
            is CredentialsOperationArgs.Authenticate -> {
                viewModel.authenticateCredentials(
                    id = operationArgs.credentials.id,
                    onAwaitingAuthentication = ::handleAuthenticationTask,
                    onError = { error ->
                        val message = error.localizedMessage ?: error.message
                            ?: getString(R.string.tink_error_unknown)
                        lifecycleScope.launchWhenStarted { showError(message) }
                    }
                )
            }

            is CredentialsOperationArgs.Refresh -> {
                viewModel.refreshCredentials(
                    credentials = operationArgs.credentials,
                    forceAuthenticate = operationArgs.authenticate,
                    onAwaitingAuthentication = ::handleAuthenticationTask,
                    onError = { error ->
                        val message = error.localizedMessage ?: error.message
                            ?: getString(R.string.tink_error_unknown)
                        lifecycleScope.launchWhenStarted { showError(message) }
                    }
                )
            }

            else -> { }
        }
    }

    private fun setTermsAndConsentText(
        termsAndConditionsUrl: Uri,
        privacyPolicyUrl: Uri,
        clientName: String?
    ) {
        val links = mutableListOf<LinkInfo>(
            LinkInfo.Url(
                getString(R.string.tink_credentials_terms_and_conditions),
                termsAndConditionsUrl.toString()
            ),
            LinkInfo.Url(
                getString(R.string.tink_credentials_privacy_policy),
                privacyPolicyUrl.toString(),
            )
        )
        val readMoreText = getString(R.string.tink_credentials_consent_information_read_more)
        var consentText = ""
        // Add consent text if client name is not null
        if (clientName != null) {
            consentText = getString(
                R.string.tink_credentials_consent_information_text,
                clientName,
                getString(R.string.tink_credentials_consent_information_read_more)
            )
            // Add CTA text to list of links to be shown in the final text
            links.add(
                LinkInfo.CallToAction(
                    displayText = readMoreText,
                    action = { showConsentInformation() }
                )
            )
        }
        val termsText = getString(
            R.string.tink_credentials_terms_text,
            getString(R.string.tink_credentials_terms_and_conditions),
            getString(R.string.tink_credentials_privacy_policy),
            consentText
        )
        termsAndConsentText.setTextWithLinks(
            fullText = termsText,
            links = links
        )
        termsAndConsentText.movementMethod = LinkMovementMethod.getInstance()
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

    private fun submitFilledFields() {
        when (val operationArgs = credentialsOperationArgs) {
            is CredentialsOperationArgs.Create -> createCredentials()
            is CredentialsOperationArgs.Update -> updateCredentials(operationArgs.credentials.id)
            else -> { }
        }
    }

    private fun areFieldsValid(): Boolean {
        return credentialsFields.children
            .filterIsInstance(CredentialsField::class.java)
            .all { it.validateContent() }
    }

    private fun createCredentials() {
        if (areFieldsValid()) {
            showLoading(getString(R.string.tink_credentials_status_authorizing))
            hideKeyboard()

            TinkLinkTracker.trackInteraction(
                InteractionEvent.SUBMIT_CREDENTIALS,
                ScreenEvent.SUBMIT_CREDENTIALS_SCREEN
            )

            val fields = credentialsFields.children
                .filterIsInstance(CredentialsField::class.java)
                .map { it.getFilledField() }
                .toList()

            viewModel.createCredentials(
                provider = provider,
                fields = fields,
                onAwaitingAuthentication = ::handleAuthenticationTask,
                onError = { error ->
                    val message = error.localizedMessage ?: error.message
                        ?: getString(R.string.tink_error_unknown)
                    lifecycleScope.launchWhenStarted { showError(message) }
                }
            )
        }
    }

    @UiThread
    private fun showStatusDialog(message: String, type: CredentialsStatusDialogFactory.Type) {
        val newStatusDialogInfo = StatusDialogInfo(message, type)

        // Don't dismiss and show same dialog if it's already showing
        if (statusDialog?.isShowing == true && statusDialogInfo == newStatusDialogInfo) return

        statusDialog?.dismiss()
        statusDialog = CredentialsStatusDialogFactory
            .createDialog(
                requireContext(),
                type,
                message
            ) {
                statusDialog?.dismiss()
            }
            .also { it.show() }
        statusDialogInfo = newStatusDialogInfo
    }

    @UiThread
    private fun showError(message: String) {
        showStatusDialog(message, CredentialsStatusDialogFactory.Type.ERROR)
        TinkLinkTracker.trackScreen(ScreenEvent.ERROR)
    }

    @UiThread
    private fun showLoading(message: String) =
        showStatusDialog(message, CredentialsStatusDialogFactory.Type.LOADING)

    private fun updateCredentials(credentialsId: String) {
        if (areFieldsValid()) {
            showLoading(getString(R.string.tink_credentials_status_authorizing))
            hideKeyboard()

            TinkLinkTracker.trackInteraction(
                InteractionEvent.SUBMIT_CREDENTIALS,
                ScreenEvent.SUBMIT_CREDENTIALS_SCREEN
            )

            val fields = credentialsFields.children
                .filterIsInstance(CredentialsField::class.java)
                .map { it.getFilledField() }
                .toList()

            viewModel.updateCredentials(
                id = credentialsId,
                provider = provider,
                fields = fields,
                onAwaitingAuthentication = ::handleAuthenticationTask,
                onError = { error ->
                    val message = error.localizedMessage ?: error.message
                    ?: getString(R.string.tink_error_unknown)
                    lifecycleScope.launchWhenStarted { showError(message) }
                }
            )
        }
    }

    private fun handleAuthenticationTask(authenticationTask: AuthenticationTask) {
        lifecycleScope.launchWhenResumed {
            when (authenticationTask) {
                is AuthenticationTask.ThirdPartyAuthentication -> {
                    handleThirdPartyAuthentication(authenticationTask)
                }

                is AuthenticationTask.SupplementalInformation -> {
                    SupplementalInformationFragment.newInstance(authenticationTask)
                        .show(childFragmentManager, null)
                    TinkLinkTracker.trackScreen(ScreenEvent.SUPPLEMENTAL_INFORMATION_SCREEN)
                }
            }
        }
    }

    private fun handleThirdPartyAuthentication(
        authenticationTask: AuthenticationTask.ThirdPartyAuthentication
    ) {
        val androidData = authenticationTask.thirdPartyAppAuthentication.android!!

        if (androidData.intent.startsWith("bankid://")) {
            // Handle Mobile BankID separately.
            launchBankIdAuthentication(authenticationTask)
            return
        }

        authenticationTask.launch(requireActivity())
            .also { handleLaunchResult(it) }
    }

    private fun launchBankIdAuthentication(authenticationTask: AuthenticationTask.ThirdPartyAuthentication) {
        // Currently this is always TRUE. But it can be removed once the BankID button UX is properly updated
        if (bankIdActionType == BANK_ID_ACTION_SAME_DEVICE) {
            authenticationTask.launch(requireActivity())
                .also {
                    handleBankIdLaunchResult(
                        bankIdUri = authenticationTask.thirdPartyAppAuthentication.android!!.intent,
                        result = it
                    )
                }
        } else {
            val intent = authenticationTask.thirdPartyAppAuthentication.android?.intent
            if (!intent.isNullOrEmpty()) {
                BankIdOtherDeviceFragment
                    .newInstance(intent)
                    .show(childFragmentManager, null)
            } else {
                showError(getString(R.string.tink_error_unknown))
            }
        }
    }

    private fun handleBankIdLaunchResult(bankIdUri: String, result: LaunchResult) {
        if (result is LaunchResult.Error) {
            // Something went wrong when launching the BankID app, show QR code instead
            BankIdOtherDeviceFragment
                .newInstance(bankIdUri)
                .show(childFragmentManager, null)
            viewModel.updateViewState(CredentialsViewModel.ViewState.NOT_LOADING)
        }
    }

    private fun handleLaunchResult(result: LaunchResult) {
        if (result is LaunchResult.Error) {
            // Something went wrong when launching, show dialog prompt to install or upgrade app
            showInstallDialog(
                title = result.title,
                message = result.message,
                packageName = result.packageName
            ) {
                viewModel.updateViewState(CredentialsViewModel.ViewState.NOT_LOADING)
            }
        }
    }

    @UiThread
    private fun showInstallDialog(
        title: String,
        message: String,
        packageName: String,
        onCancel: (() -> Unit)? = null
    ) {
        lifecycleScope.launchWhenStarted {
            val activity = requireActivity()
            MaterialAlertDialogBuilder(activity)
                .apply {
                    setTitle(title)
                    setMessage(message)
                    setPositiveButton(
                        activity.getString(R.string.tink_third_party_authentication_download_app_button)
                    ) { _, _ ->
                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = Uri.parse("https://play.google.com/store/apps/details?id=$packageName")
                            setPackage("com.android.vending")
                        }
                        activity.startActivity(intent)
                    }
                    setNegativeButton(
                        activity.getString(R.string.tink_cancel_button)
                    ) { _, _ -> onCancel?.invoke() }
                }
                .show()
        }
    }

    private fun showConnectionSuccessfulScreen() {
        findNavController().navigate(
            CredentialsFragmentDirections.actionCredentialsFragmentToConnectionSuccessfulFragment(
                providerDisplayName = provider.displayName,
                isNewCredentialsCreated = credentialsOperationArgs is CredentialsOperationArgs.Create
            )
        )
    }
}

sealed class CredentialsOperationArgs : Parcelable {

    abstract val provider: Provider

    @Parcelize
    data class Create(override val provider: Provider) : CredentialsOperationArgs()

    @Parcelize
    data class Update(override val provider: Provider, val credentials: Credentials) :
        CredentialsOperationArgs()

    @Parcelize
    data class Refresh(
        override val provider: Provider,
        val credentials: Credentials,
        val authenticate: Boolean
    ) :
        CredentialsOperationArgs()

    @Parcelize
    data class Authenticate(override val provider: Provider, val credentials: Credentials) :
        CredentialsOperationArgs()
}
