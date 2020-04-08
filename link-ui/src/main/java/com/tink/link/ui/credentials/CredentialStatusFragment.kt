package com.tink.link.ui.credentials

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.model.credential.Credential
import kotlinx.android.synthetic.main.tink_fragment_credential_status.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar
import timber.log.Timber

private const val PROVIDER_NAME_ARG = "PROVIDER_NAME"

class CredentialStatusFragment : Fragment(R.layout.tink_fragment_credential_status) {

    private val providerName: String by lazy {
        requireNotNull(arguments?.getString(PROVIDER_NAME_ARG))
    }

    private val viewModel: CredentialViewModel by activityViewModels()

    private var onCloseAction: (() -> Unit)? =
        { closeWithResult(TinkLinkUiActivity.RESULT_CANCELLED) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = providerName
        toolbar.setNavigationOnClickListener { onCloseAction?.invoke() }

        doneButton.setOnClickListener { onCloseAction?.invoke() }

        viewModel.viewState.observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                CredentialViewModel.ViewState.UPDATED -> {
                    successIcon.visibility = View.VISIBLE
                    statusProgress.visibility = View.GONE
                    doneButton.visibility = View.VISIBLE
                    doneButton.text = getString(R.string.tink_credential_status_button_success)
                    onCloseAction = { closeWithResult(TinkLinkUiActivity.RESULT_SUCCESS) }
                }

                CredentialViewModel.ViewState.NOT_LOADING -> {
                    successIcon.visibility = View.GONE
                    statusProgress.visibility = View.GONE
                    doneButton.visibility = View.VISIBLE
                    doneButton.text = getString(R.string.tink_credential_status_button_failure)
                    onCloseAction = { closeWithResult(TinkLinkUiActivity.RESULT_FAILURE) }
                }

                else -> {
                    successIcon.visibility = View.GONE
                    statusProgress.visibility = View.VISIBLE
                    doneButton.visibility = View.GONE
                    onCloseAction = { closeWithResult(TinkLinkUiActivity.RESULT_CANCELLED) }
                }
            }
        })

        viewModel.createdCredential.observe(viewLifecycleOwner, Observer { credential ->
            credential.status?.let { status ->
                if (status == Credential.Status.UPDATED) {
                    statusTitle.text = getString(R.string.tink_credential_status_success_title)
                    statusDescription.text =
                        getString(
                            R.string.tink_credential_status_success_description,
                            getString(R.string.tink_app_name)
                        )
                } else {
                    statusTitle.text = status.name
                    statusDescription.text = credential.statusPayload ?: ""
                }
            }
            Timber.d("Received update for credential ${credential.id}") // TODO: Remove
        })
    }

    private fun closeWithResult(result: Int) {
        (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(result)
    }

    companion object {
        fun getBundle(providerName: String) = bundleOf(PROVIDER_NAME_ARG to providerName)
    }
}