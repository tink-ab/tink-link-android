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
import kotlinx.android.synthetic.main.tink_fragment_credentials_status.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar
import timber.log.Timber

private const val PROVIDER_DISPLAY_NAME_ARG = "PROVIDER_DISPLAY_NAME"

class CredentialsStatusFragment : Fragment(R.layout.tink_fragment_credentials_status) {

    private val providerDisplayName: String by lazy {
        requireNotNull(arguments?.getString(PROVIDER_DISPLAY_NAME_ARG))
    }

    private val viewModel: CredentialsViewModel by activityViewModels()

    private var result: Int = TinkLinkUiActivity.RESULT_CANCELLED
    private fun close() = closeWithResult(result)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = providerDisplayName
        toolbar.setNavigationOnClickListener { close() }

        doneButton.setOnClickListener { close() }

        viewModel.viewState.observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                CredentialsViewModel.ViewState.UPDATED -> {
                    successIcon.visibility = View.VISIBLE
                    statusProgress.visibility = View.GONE
                    doneButton.visibility = View.VISIBLE
                    doneButton.text = getString(R.string.tink_credentials_status_button_success)
                    result = TinkLinkUiActivity.RESULT_SUCCESS
                }

                CredentialsViewModel.ViewState.ERROR -> {
                    successIcon.visibility = View.GONE
                    statusProgress.visibility = View.GONE
                    doneButton.visibility = View.VISIBLE
                    doneButton.text = getString(R.string.tink_credentials_status_button_failure)
                    result = TinkLinkUiActivity.RESULT_FAILURE
                }

                else -> {
                    successIcon.visibility = View.GONE
                    statusProgress.visibility = View.VISIBLE
                    doneButton.visibility = View.GONE
                    result = TinkLinkUiActivity.RESULT_CANCELLED
                }
            }
        })

        viewModel.createdCredential.observe(viewLifecycleOwner, Observer { credential ->
            credential.status?.let { status ->
                statusMessage.text =
                    when (status) {
                        Credential.Status.UPDATED ->
                            getString(
                                R.string.tink_credentials_status_success_description,
                                getString(R.string.tink_app_name)
                            )

                        Credential.Status.UPDATING ->
                            getString(
                                R.string.tink_credentials_status_updating_description,
                                getString(R.string.tink_app_name)
                            )

                        else -> credential.statusPayload ?: ""
                    }
            }
            Timber.d("Received update for credential ${credential.id}") // TODO: Remove
        })
    }

    private fun closeWithResult(result: Int) {
        (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(result)
    }

    companion object {
        fun getBundle(providerDisplayName: String) = bundleOf(PROVIDER_DISPLAY_NAME_ARG to providerDisplayName)
    }
}