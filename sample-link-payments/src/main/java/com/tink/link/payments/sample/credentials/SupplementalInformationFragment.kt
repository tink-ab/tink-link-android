package com.tink.link.payments.sample.credentials

import android.app.Dialog
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.core.view.children
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.sample.R
import kotlinx.android.synthetic.main.tink_dialog_supplemental_information.*

private const val ARG_AUTHENTICATION_TASK = "CREDENTIALS_ID_ARG"

class SupplementalInformationFragment : DialogFragment() {

    private val authenticationTask: AuthenticationTask.SupplementalInformation by lazy {
        requireNotNull(
            arguments?.getParcelable<AuthenticationTask.SupplementalInformation>(
                ARG_AUTHENTICATION_TASK
            )
        )
    }

    private val supplementalInformationViewModel: SupplementalInformationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.Theme_Material_Dialog_Alert)
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
                    onError = { }
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

    companion object {

        fun newInstance(authenticationTask: AuthenticationTask.SupplementalInformation) =
            SupplementalInformationFragment()
                .apply { arguments = bundleOf(ARG_AUTHENTICATION_TASK to authenticationTask) }
    }
}