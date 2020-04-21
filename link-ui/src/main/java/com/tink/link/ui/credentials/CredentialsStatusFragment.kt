package com.tink.link.ui.credentials

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import kotlinx.android.synthetic.main.tink_fragment_credentials_status.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar

private const val PROVIDER_DISPLAY_NAME_ARG = "PROVIDER_DISPLAY_NAME"

class CredentialsStatusFragment : Fragment(R.layout.tink_fragment_credentials_status) {

    private val providerDisplayName: String by lazy {
        requireNotNull(arguments?.getString(PROVIDER_DISPLAY_NAME_ARG))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = providerDisplayName
        toolbar.setNavigationOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_SUCCESS)
        }

        successMessage.text =
            getString(
                R.string.tink_credentials_status_success_description,
                getString(R.string.tink_app_name)
            )

        doneButton.setOnClickListener {
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_SUCCESS)
        }
    }

    companion object {
        fun getBundle(providerDisplayName: String) =
            bundleOf(PROVIDER_DISPLAY_NAME_ARG to providerDisplayName)
    }
}