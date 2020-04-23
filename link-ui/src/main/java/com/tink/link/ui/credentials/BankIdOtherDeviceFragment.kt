package com.tink.link.ui.credentials

import android.app.Dialog
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.tink.link.ui.R
import kotlinx.android.synthetic.main.tink_dialog_bank_id_other_device.*

private const val BANK_ID_URI_ARG = "BANK_ID_URI_ARG"

class BankIdOtherDeviceFragment : DialogFragment() {

    private val bankIdUri: String by lazy {
        requireNotNull(arguments?.getString(BANK_ID_URI_ARG))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Tink_MaterialAlertDialogStyle)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.apply {
            setContentView(R.layout.tink_dialog_bank_id_other_device)
            // TODO: Check how it works if we use the image from the QR code endpoint
            setQrCode(qrCode)
        }
        return dialog
    }

    private fun setQrCode(imageView: ImageView) {
        val multiFormatWriter = MultiFormatWriter()
        try {
            val bitMatrix = multiFormatWriter.encode(
                bankIdUri,
                BarcodeFormat.QR_CODE,
                resources.getDimensionPixelSize(R.dimen.tink_credentials_qr_code_size),
                resources.getDimensionPixelSize(R.dimen.tink_credentials_qr_code_size)
            )
            val bitmap =
                Bitmap.createBitmap(bitMatrix.width, bitMatrix.height, Bitmap.Config.ARGB_8888)
            val width = bitmap.width
            val height = bitmap.height
            for (i in 0 until width) {
                for (j in 0 until height) {
                    bitmap.setPixel(i, j, if (bitMatrix.get(i, j)) Color.BLACK else Color.WHITE)
                }
            }
            imageView.setImageBitmap(bitmap)

        } catch (exception: WriterException) {
            Toast
                .makeText(
                    imageView.context,
                    getString(R.string.tink_credentials_qr_code_error_message),
                    Toast.LENGTH_SHORT
                )
                .show()
        }
    }

    companion object {
        fun getBundle(bankIdUri: String) =
            bundleOf(
                BANK_ID_URI_ARG to bankIdUri
            )
    }
}