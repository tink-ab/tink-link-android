package com.tink.link.ui.credentials

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.core.view.children
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.ui.R
import com.tink.link.ui.analytics.TinkLinkTracker
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ScreenEventData
import com.tink.link.ui.extensions.toView
import kotlinx.android.synthetic.main.tink_dialog_supplemental_information.*

private const val ARG_AUTHENTICATION_TASK = "ARG_AUTHENTICATION_TASK"

internal class SupplementalInformationFragment : DialogFragment() {

    private val authenticationTask: AuthenticationTask.SupplementalInformation by lazy {
        requireNotNull(arguments?.getParcelable(ARG_AUTHENTICATION_TASK))
    }

    private val credentialsViewModel: CredentialsViewModel by activityViewModels()

    private val supplementalInformationViewModel: SupplementalInformationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Tink_MaterialAlertDialogStyle)
        supplementalInformationViewModel.setData(authenticationTask)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.apply {

            setContentView(R.layout.tink_dialog_supplemental_information)

            supplementalInformationViewModel.supplementalFields.value?.let { fields ->
                if (supplementalFieldsContainer.childCount > 0) {
                    supplementalFieldsContainer.removeAllViews()
                }
                for (field in fields) {
                    supplementalFieldsContainer.addView(field.toView(context))
                }
            }

            submitButton.setOnClickListener {
                val filledFields =
                    supplementalFieldsContainer
                        .children
                        .filterIsInstance(CredentialsField::class.java)
                        .map { it.getFilledField() }
                        .toList()
                supplementalInformationViewModel.sendSupplementalInformation(
                    fields = filledFields,
                    onSuccess = { dismiss() },
                    onError = {
                        TinkLinkTracker.trackScreen(
                            ScreenEvent.ERROR_SCREEN,
                            ScreenEventData(
                                providerName = credentialsViewModel.credentials.value?.providerName,
                                credentialsId = credentialsViewModel.credentials.value?.id
                            )
                        )
                    }
                )
            }

            cancelButton.setOnClickListener {
                supplementalInformationViewModel.cancelSupplementalInformation()
                dismiss()
            }

            setCanceledOnTouchOutside(false)
        }

        return dialog
    }

    override fun onDismiss(dialog: DialogInterface) {
        TinkLinkTracker.trackInteraction(
            InteractionEvent.BACK,
            ScreenEvent.SUPPLEMENTAL_INFORMATION_SCREEN,
            ScreenEventData(
                providerName = credentialsViewModel.credentials.value?.providerName,
                credentialsId = credentialsViewModel.credentials.value?.id
            )
        )
        super.onDismiss(dialog)
    }

    companion object {

        fun newInstance(authenticationTask: AuthenticationTask.SupplementalInformation) =
            SupplementalInformationFragment()
                .apply { arguments = bundleOf(ARG_AUTHENTICATION_TASK to authenticationTask) }
    }
}
