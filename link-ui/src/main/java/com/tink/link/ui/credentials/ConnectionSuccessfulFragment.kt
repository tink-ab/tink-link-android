package com.tink.link.ui.credentials

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import kotlinx.android.synthetic.main.tink_fragment_connection_successful.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar

private const val PROVIDER_DISPLAY_NAME_ARG = "PROVIDER_DISPLAY_NAME"

internal class ConnectionSuccessfulFragment : Fragment(R.layout.tink_fragment_connection_successful) {

    private val providerDisplayName: String by lazy {
        requireNotNull(arguments?.getString(PROVIDER_DISPLAY_NAME_ARG))
    }

    private val viewModel: CredentialsViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = providerDisplayName
        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_SUCCESS)
        }

        successMessage.text =
            getString(
                R.string.tink_connection_success_create_description,
                getString(R.string.tink_app_name)
            )

        doneButton.setOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_SUCCESS)
        }

        viewModel.authorizationCode.observe(
            viewLifecycleOwner,
            Observer { code ->
                (activity as? TinkLinkUiActivity)?.let {
                    it.authorizationCode = code
                }
            }
        )
    }

    companion object {
        fun getBundle(providerDisplayName: String) =
            bundleOf(PROVIDER_DISPLAY_NAME_ARG to providerDisplayName)
    }
}
