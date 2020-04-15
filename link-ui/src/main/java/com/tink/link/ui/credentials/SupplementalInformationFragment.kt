package com.tink.link.ui.credentials

import android.app.Dialog
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.core.view.children
import androidx.core.view.updatePadding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.tink.link.ui.R
import com.tink.model.misc.Field
import kotlinx.android.synthetic.main.tink_dialog_supplemental_information.*

private const val CREDENTIALS_ID_ARG = "CREDENTIALS_ID_ARG"

private const val SUPPLEMENTAL_FIELDS_ARG = "SUPPLEMENTAL_FIELDS_ARG"

class SupplementalInformationFragment : DialogFragment() {

    private val credentialsId: String by lazy {
        requireNotNull(arguments?.getString(CREDENTIALS_ID_ARG))
    }

    private val supplementalFields: ArrayList<Field> by lazy {
        requireNotNull(arguments?.getParcelableArrayList<Field>(SUPPLEMENTAL_FIELDS_ARG))
    }

    private val supplementalInformationViewModel: SupplementalInformationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Tink_MaterialAlertDialogStyle)
        supplementalInformationViewModel.setData(credentialsId, supplementalFields)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.apply {

            setContentView(R.layout.tink_dialog_supplemental_information)

            supplementalInformationViewModel.apply {
                supplementalFields.value?.let { fields ->
                    for (field in fields) {
                        supplementalFieldsContainer
                            .addView(
                                CredentialField(requireContext())
                                    .also {
                                        it.updatePadding(bottom = resources.getDimensionPixelSize(R.dimen.tink_credential_field_padding_bottom))
                                        it.setupField(field)
                                    })
                    }
                }

                submitButton.setOnClickListener {
                    val filledFields = supplementalFieldsContainer.children
                        .filterIsInstance(CredentialField::class.java)
                        .map { it.getFilledField() }
                        .toList()
                    supplementalInformationViewModel.sendSupplementalInformation(
                        filledFields,
                        { dismiss() },
                        {
                            // TODO: Do error handling without leaving dialog
                        }
                    )
                }

                cancelButton.setOnClickListener {
                    supplementalInformationViewModel.cancelSupplementalInformation()
                    dismiss()
                }
            }

            setCanceledOnTouchOutside(false)
        }

        return dialog
    }

    companion object {
        fun getBundle(credentialsId: String, supplementalFields: List<Field>) =
            bundleOf(
                CREDENTIALS_ID_ARG to credentialsId,
                SUPPLEMENTAL_FIELDS_ARG to supplementalFields
            )
    }
}