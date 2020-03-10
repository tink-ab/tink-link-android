package com.tink.link.credentials

import android.os.Bundle
import android.os.Parcelable
import android.view.View
import androidx.core.os.bundleOf
import androidx.core.view.children
import androidx.core.view.forEach
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tink.link.R
import com.tink.link.TinkLinkConsumer
import com.tink.link.extensions.dpToPixels
import com.tink.link.extensions.hideKeyboard
import com.tink.link.extensions.launch
import com.tink.link.getRepositoryProvider
import com.tink.model.provider.Provider
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.fragment_credential.*
import kotlinx.android.synthetic.main.layout_toolbar.toolbar
import timber.log.Timber

private const val PROVIDER_ARGS = "PROVIDER"

private const val UPDATE_ARGS = "UPDATE_ARGS"

/**
 * Responsible for displaying the fields that the user should fill their credentials into
 * to authorize use of the [Provider].
 */
class CredentialFragment : Fragment(R.layout.fragment_credential), TinkLinkConsumer {

    private val provider: Provider by lazy {
        requireNotNull(arguments?.getParcelable<Provider>(PROVIDER_ARGS))
    }

    private val updateArgs: CredentialUpdateArgs? by lazy {
        arguments?.getParcelable<CredentialUpdateArgs>(UPDATE_ARGS)
    }

    private val viewModel: CredentialViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.credential_fragment_title)
        toolbar.title = provider.displayName
        toolbar.setNavigationOnClickListener {
            hideKeyboard()
            findNavController().navigateUp()
        }


        val fields = provider.fields.map { field ->
            updateArgs?.fields?.get(field.name)?.let { field.copy(value = it) } ?: field
        }

        viewModel.setFields(fields)

        viewModel.fields.observe(viewLifecycleOwner, Observer { fields ->
            if (credentialFields.childCount > 0) {
                credentialFields.removeAllViews()
            }
            for (field in fields) {
                credentialFields
                    .addView(CredentialField(requireContext())
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

        viewModel.credentials.observe(viewLifecycleOwner, Observer {
            Timber.d(it.toString())
        })

        viewModel.createdCredential.observe(viewLifecycleOwner, Observer { credential ->
            Timber.d("Received update for credential ${credential.id}")
            status.text = "Status = ${credential.status?.name}"
            statusPayload.text = credential.statusPayload
        })

        viewModel.viewState.observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                CredentialViewModel.ViewState.UPDATING -> loadingGroup.visibility = View.VISIBLE
                CredentialViewModel.ViewState.UPDATED -> loadingProgress.visibility = View.GONE
                CredentialViewModel.ViewState.NOT_LOADING -> loadingGroup.visibility = View.GONE
                else -> {
                }
            }
        })

        viewModel.thirdPartyAuthenticationEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { thirdPartyAuthentication ->
                activity?.let {
                    thirdPartyAuthentication.launch(it) {
                        viewModel.updateViewState(CredentialViewModel.ViewState.NOT_LOADING)
                        Snackbar.make(
                            view,
                            R.string.third_party_authentication_download_app_negative_error,
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

            getRepositoryProvider()?.credentialRepository?.let {
                // Pass the filled fields to the credential repository to authorize the user.
                viewModel.createCredential(provider, fields, it) { error ->
                    view?.let { view ->
                        val message = error.localizedMessage ?: error.message
                        ?: "Something went wrong. Please try again later."
                        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
                    }
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

        getRepositoryProvider()?.credentialRepository?.let {
            // Pass the filled fields to the credential repository to authorize the user.
            viewModel.updateCredential(
                requireNotNull(updateArgs).credentialId,
                fields,
                it
            ) { error ->
                view?.let { view ->
                    val message = error.localizedMessage ?: error.message
                    ?: "Something went wrong. Please try again later."
                    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
                }
            }
        }
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
