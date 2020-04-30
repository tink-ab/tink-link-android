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
import kotlinx.android.synthetic.main.fragment_credentials.*
import kotlinx.android.synthetic.main.layout_toolbar.toolbar
import timber.log.Timber

private const val PROVIDER_ARGS = "PROVIDER"

private const val UPDATE_ARGS = "UPDATE_ARGS"
private const val MANUAL_AUTH_ARGS = "MANUAL_AUTH_ARGS"

/**
 * Responsible for displaying the fields that the user should fill their credentials into
 * to authorize use of the [Provider].
 */
class CredentialsFragment : Fragment(R.layout.fragment_credentials) {

    private val provider: Provider by lazy {
        requireNotNull(arguments?.getParcelable<Provider>(PROVIDER_ARGS))
    }

    private val updateArgs: CredentialsUpdateArgs? by lazy {
        arguments?.getParcelable<CredentialsUpdateArgs>(UPDATE_ARGS)
    }

    private val manualAuthArgs: CredentialsManualAuthArgs? by lazy {
        arguments?.getParcelable<CredentialsManualAuthArgs>(MANUAL_AUTH_ARGS)
    }

    private val viewModel: CredentialsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.credentials_fragment_title)
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
            if (credentialsFields.childCount > 0) {
                credentialsFields.removeAllViews()
            }
            for (field in fields) {
                credentialsFields
                    .addView(CredentialsField(requireContext())
                        .also {
                            it.updatePadding(bottom = resources.dpToPixels(32))
                            it.setupField(field)
                        })
            }
        })

        createCredentialsBtn.setOnClickListener {
            when {
                updateArgs?.credentialsId?.isEmpty() == false -> updateCredentials()

                manualAuthArgs?.credentialsId?.isEmpty() == false -> authenticateCredentials()

                else -> createCredentials()

            }
        }

        viewModel.credentials.observe(viewLifecycleOwner, Observer {
            Timber.d(it.toString())
        })

        viewModel.createdCredentials.observe(viewLifecycleOwner, Observer { credentials ->
            Timber.d("Received update for credentials ${credentials.id}")
            status.text = "Status = ${credentials.status?.name}"
            statusPayload.text = credentials.statusPayload
        })

        viewModel.viewState.observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                CredentialsViewModel.ViewState.UPDATING -> loadingGroup.visibility = View.VISIBLE
                CredentialsViewModel.ViewState.UPDATED -> loadingProgress.visibility = View.GONE
                CredentialsViewModel.ViewState.NOT_LOADING -> loadingGroup.visibility = View.GONE
                else -> {
                }
            }
        })

        viewModel.thirdPartyAuthenticationEvent.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { thirdPartyAuthentication ->
                activity?.let {
                    thirdPartyAuthentication.launch(it) {
                        viewModel.updateViewState(CredentialsViewModel.ViewState.NOT_LOADING)
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
        credentialsFields.forEach {
            if (it is CredentialsField) {
                it.validateContent()
            }
        }
    }

    private fun areFieldsValid(): Boolean {
        return credentialsFields.children
            .filterIsInstance(CredentialsField::class.java)
            .all { it.validateContent() }
    }

    private fun createCredentials() {
        if (areFieldsValid()) {
            loadingGroup.visibility = View.VISIBLE
            hideKeyboard()

            val fields = credentialsFields.children
                .filterIsInstance(CredentialsField::class.java)
                .map { it.getFilledField() }
                .toList()

            // Pass the filled fields to the credentials repository to authorize the user.
            viewModel.createCredentials(provider, fields) { error ->
                view?.let { view ->
                    val message = error.localizedMessage ?: error.message
                    ?: "Something went wrong. Please try again later."
                    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun updateCredentials() {
        if (areFieldsValid()) {
            loadingGroup.visibility = View.VISIBLE
            hideKeyboard()
        }

        val fields = credentialsFields.children
            .filterIsInstance(CredentialsField::class.java)
            .map { it.getFilledField() }
            .toList()

        // Pass the filled fields to the credentials repository to authorize the user.
        viewModel.updateCredentials(
            requireNotNull(updateArgs).credentialsId,
            provider,
            fields
        ) { error ->
            view?.let { view ->
                val message = error.localizedMessage ?: error.message
                ?: "Something went wrong. Please try again later."
                Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun authenticateCredentials() {

        val id = requireNotNull(manualAuthArgs?.credentialsId)

        viewModel.authenticateCredentials(id) { error ->
            view?.let { view ->
                val message = error.localizedMessage ?: error.message
                ?: "Something went wrong. Please try again later."
                Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
            }
        }
    }

    companion object {
        fun getBundle(
            provider: Provider,
            credentialsUpdateArgs: CredentialsUpdateArgs? = null,
            credentialsManualAuthArgs: CredentialsManualAuthArgs? = null
        ) = bundleOf(
            PROVIDER_ARGS to provider,
            UPDATE_ARGS to credentialsUpdateArgs,
            MANUAL_AUTH_ARGS to credentialsManualAuthArgs
        )
    }

    @Parcelize
    data class CredentialsUpdateArgs(
        val credentialsId: String, val fields: Map<String, String>
    ) : Parcelable

    @Parcelize
    data class CredentialsManualAuthArgs(
        val credentialsId: String
    ) : Parcelable
}
