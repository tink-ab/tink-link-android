package com.tink.link.ui.credentials

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.LinearLayout
import androidx.core.os.bundleOf
import androidx.core.view.children
import androidx.core.view.forEach
import androidx.core.view.setPadding
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.extensions.LinkInfo
import com.tink.link.ui.extensions.convertCallToActionText
import com.tink.link.ui.extensions.dpToPixels
import com.tink.link.ui.extensions.hideKeyboard
import com.tink.link.ui.extensions.launch
import com.tink.link.ui.extensions.setTextWithLinks
import com.tink.model.credential.Credential
import com.tink.model.provider.Provider
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.tink_fragment_credential.*
import kotlinx.android.synthetic.main.tink_layout_consent.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar
import timber.log.Timber

private const val PROVIDER_ARGS = "PROVIDER"

private const val UPDATE_ARGS = "UPDATE_ARGS"

/**
 * Responsible for displaying the fields that the user should fill their credentials into
 * to authorize use of the [Provider].
 */
class CredentialFragment : Fragment(R.layout.tink_fragment_credential) {

    private val provider: Provider by lazy {
        requireNotNull(arguments?.getParcelable<Provider>(PROVIDER_ARGS))
    }

    private val updateArgs: CredentialUpdateArgs? by lazy {
        arguments?.getParcelable<CredentialUpdateArgs>(UPDATE_ARGS)
    }

    private val viewModel: CredentialsViewModel by activityViewModels()
    private val consentViewModel: ConsentViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = provider.displayName
        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                TinkLinkUiActivity.RESULT_CANCELLED
            )
        }

        consentViewModel.apply {
            user.observe(viewLifecycleOwner, Observer { user ->
                username.text = user
                username.visibility = if (user.isNullOrBlank()) View.GONE else View.VISIBLE
            })
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
            if (credentialFields.childCount > 0) {
                credentialFields.removeAllViews()
            }
            for (field in fieldList) {
                credentialFields
                    .addView(
                        CredentialField(requireContext())
                        .also {
                            it.updatePadding(bottom = resources.dpToPixels(32))
                            it.setupField(field)
                        })
            }
        })

        createCredentialBtn.setOnClickListener {
            if (updateArgs?.credentialId.isNullOrEmpty()) {
                createCredential()
            } else {
                updateCredential()
            }
        }

        if (provider.credentialType == Credential.Type.MOBILE_BANKID) {
            createCredentialBtn.visibility = View.GONE
            bankIdButtonGroup.visibility = View.VISIBLE
        }

        bankIdButton.setOnClickListener {
            // TODO: Add button logic
        }

        bankIdOtherDeviceButton.setOnClickListener {
            // TODO: Add button logic
        }

        viewModel.credentials.observe(viewLifecycleOwner, Observer {
            Timber.d(it.toString())
        })

        viewModel.createdCredential.observe(viewLifecycleOwner, Observer { credential ->
            // TODO: Remove
            Timber.d("Received update for credential ${credential.id}")
            Timber.d("Status = ${credential.status?.name}")
            Timber.d("Status = ${credential.statusPayload}")
        })

        viewModel.viewState.observe(viewLifecycleOwner, Observer { state ->
            loadingGroup.visibility = View.GONE
            when (state) {
                CredentialsViewModel.ViewState.UPDATING,
                CredentialsViewModel.ViewState.UPDATED,
                CredentialsViewModel.ViewState.ERROR -> {
                    navigateToCredentialStatusScreen()
                }

                CredentialsViewModel.ViewState.THIRD_PARTY_AUTHENTICATION -> {
                    // TODO: Show third party authentication screen
                }

                CredentialsViewModel.ViewState.SUPPLEMENTAL_INFO -> {
                    viewModel.credentialId.value?.let { showSupplementalInfoDialog(it) }
                }

                else -> {}
            }
        })

        viewModel.thirdPartyAuthenticationEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { thirdPartyAuthentication ->
                activity?.let {
                    thirdPartyAuthentication.launch(it) {
                        viewModel.updateViewState(CredentialsViewModel.ViewState.NOT_LOADING)
                        Snackbar.make(
                            view,
                            R.string.tink_third_party_authentication_download_app_negative_error,
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                }
            }
        })

        viewModel.errorEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { statusPayload ->
                Snackbar.make(view, statusPayload, Snackbar.LENGTH_LONG).show()
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
                arrayListOf() //TODO: Add scope list data here
            )
        )
    }

    private fun showSupplementalInfoDialog(credentialId: String) {
        viewModel.supplementalFields.value?.let { fields ->
            val supplementalFields = LinearLayout(requireContext()).apply {
                layoutParams =
                    LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )
                setPadding(resources.dpToPixels(24))
                orientation = LinearLayout.VERTICAL
            }

            for (field in fields) {
                supplementalFields
                    .addView(
                        CredentialField(requireContext())
                            .also {
                                it.updatePadding(bottom = resources.dpToPixels(32))
                                it.setupField(field)
                            })
            }

            MaterialAlertDialogBuilder(requireContext(), R.style.Tink_MaterialAlertDialogStyle)
                .setPositiveButton(getString(R.string.tink_credential_supplemental_information_submit_button)) { _, _ ->

                    val filledFields = supplementalFields.children
                        .filterIsInstance(CredentialField::class.java)
                        .map { it.getFilledField() }
                        .toList()

                    viewModel.sendSupplementalInformation(credentialId, filledFields) { error ->
                        view?.let { view ->
                            val message = error.localizedMessage ?: error.message
                            ?: getString(R.string.tink_error_unknown)
                            Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
                        }
                    }
                }
                .setNegativeButton(getString(R.string.tink_credential_supplemental_information_cancel_button)) { _, _ ->
                    viewModel.cancelSupplementalInformation(credentialId)
                }
                .setTitle(R.string.tink_credential_supplemental_information)
                .setView(supplementalFields)
                .show()
        }
    }

    private fun validateFields() {
        credentialFields.forEach {
            if (it is CredentialField) {
                it.validateContent()
            }
        }
    }

    private fun areFieldsValid(): Boolean {
        return credentialFields.children
            .filterIsInstance(CredentialField::class.java)
            .all { it.validateContent() }
    }

    private fun createCredential() {
        if (areFieldsValid()) {
            loadingGroup.visibility = View.VISIBLE
            hideKeyboard()

            val fields = credentialFields.children
                .filterIsInstance(CredentialField::class.java)
                .map { it.getFilledField() }
                .toList()

            viewModel.createCredential(provider, fields) { error ->
                view?.let { view ->
                    val message = error.localizedMessage ?: error.message
                    ?: getString(R.string.tink_error_unknown)
                    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun updateCredential() {
        if (areFieldsValid()) {
            loadingGroup.visibility = View.VISIBLE
            hideKeyboard()
        }

        val fields = credentialFields.children
            .filterIsInstance(CredentialField::class.java)
            .map { it.getFilledField() }
            .toList()

        viewModel.updateCredential(requireNotNull(updateArgs).credentialId, fields) { error ->
            view?.let { view ->
                val message = error.localizedMessage ?: error.message
                ?: getString(R.string.tink_error_unknown)
                Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun navigateToCredentialStatusScreen() {
        findNavController().navigate(
            R.id.credentialsStatusFragment,
            CredentialsStatusFragment.getBundle(provider.displayName)
        )
    }

    companion object {
        fun getBundle(provider: Provider, credentialUpdateArgs: CredentialUpdateArgs? = null) =
            bundleOf(PROVIDER_ARGS to provider, UPDATE_ARGS to credentialUpdateArgs)
    }

    @Parcelize
    data class CredentialUpdateArgs(
        val credentialId: String, val fields: Map<String, String>
    ) : Parcelable
}
