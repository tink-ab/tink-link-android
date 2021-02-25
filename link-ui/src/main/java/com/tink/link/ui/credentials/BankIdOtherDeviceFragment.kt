package com.tink.link.ui.credentials

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.tink.link.ui.QrCodeGenerator
import com.tink.link.ui.R
import com.tink.link.ui.analytics.TinkLinkTracker
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ScreenEventData
import kotlinx.android.synthetic.main.tink_dialog_bank_id_other_device.*

private const val BANK_ID_URI_ARG = "BANK_ID_URI_ARG"

internal class BankIdOtherDeviceFragment : DialogFragment() {

    private val bankIdUri: String by lazy {
        requireNotNull(arguments?.getString(BANK_ID_URI_ARG))
    }

    private val credentialsViewModel: CredentialsViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Tink_MaterialAlertDialogStyle)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.apply {
            setContentView(R.layout.tink_dialog_bank_id_other_device)
            // TODO: Check how it works if we use the image from the QR code endpoint
            val qrCodeImage = QrCodeGenerator.getQrCodeImage(context, bankIdUri)
            if (qrCodeImage == null) {
                Toast
                    .makeText(
                        context,
                        getString(R.string.tink_supplemental_information_qr_code_error),
                        Toast.LENGTH_SHORT
                    )
                    .show()
                TinkLinkTracker.trackScreen(
                    ScreenEvent.ERROR_SCREEN,
                    ScreenEventData(
                        providerName = credentialsViewModel.credentials.value?.providerName,
                        credentialsId = credentialsViewModel.credentials.value?.id
                    )
                )
            } else {
                qrCode.setImageBitmap(qrCodeImage)
            }
        }
        return dialog
    }

    companion object {
        fun newInstance(bankIdUri: String) =
            BankIdOtherDeviceFragment().apply {
                arguments = bundleOf(BANK_ID_URI_ARG to bankIdUri)
            }
    }
}
