package com.tink.link.ui.credentials

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.tink.link.ui.R
import com.tink.link.ui.TinkLinkUiActivity
import com.tink.link.ui.analytics.TinkLinkTracker
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ScreenEventData
import kotlinx.android.synthetic.main.tink_fragment_connection_successful.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.toolbar

internal class ConnectionSuccessfulFragment :
    Fragment(R.layout.tink_fragment_connection_successful) {

    private val arguments: ConnectionSuccessfulFragmentArgs by navArgs()

    private val providerDisplayName: String by lazy { arguments.providerDisplayName }

    private val isNewCredentialsCreated: Boolean by lazy { arguments.isNewCredentialsCreated }

    private val viewModel: CredentialsViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = getString(R.string.tink_credentials_authentication_title)
        toolbar.setNavigationOnClickListener {
            TinkLinkTracker.trackInteraction(
                InteractionEvent.CLOSE,
                ScreenEvent.SUCCESS_SCREEN,
                ScreenEventData(
                    providerName = viewModel.credentials.value?.providerName,
                    credentialsId = viewModel.credentials.value?.id
                )
            )
            (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(TinkLinkUiActivity.RESULT_SUCCESS)
        }

        TinkLinkTracker.trackScreen(
            ScreenEvent.SUCCESS_SCREEN,
            ScreenEventData(
                providerName = viewModel.credentials.value?.providerName,
                credentialsId = viewModel.credentials.value?.id
            )
        )

        successTitle.text =
            if (isNewCredentialsCreated) {
                getString(R.string.tink_connection_success_create_title)
            } else {
                getString(R.string.tink_connection_success_update_title)
            }

        successMessage.text =
            if (isNewCredentialsCreated) {
                getString(
                    R.string.tink_connection_success_create_description,
                    providerDisplayName
                )
            } else {
                getString(
                    R.string.tink_connection_success_update_description,
                    providerDisplayName
                )
            }

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

        activity
            ?.onBackPressedDispatcher
            ?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    TinkLinkTracker.trackInteraction(
                        InteractionEvent.BACK,
                        ScreenEvent.SUCCESS_SCREEN,
                        ScreenEventData(
                            providerName = viewModel.credentials.value?.providerName,
                            credentialsId = viewModel.credentials.value?.id
                        )
                    )
                    isEnabled = false
                    activity?.onBackPressed()
                }
            })
    }
}
