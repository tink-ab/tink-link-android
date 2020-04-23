package com.tink.link.ui

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException

internal object QrCodeGenerator {

    fun getQrCodeImage(
        context: Context,
        text: String,
        size: Int = context.resources.getDimensionPixelSize(R.dimen.tink_qr_code_size)
    ): Bitmap? {
        val multiFormatWriter = MultiFormatWriter()
        try {
            val bitMatrix = multiFormatWriter.encode(
                text,
                BarcodeFormat.QR_CODE,
                size,
                size
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
            return bitmap

        } catch (exception: WriterException) {
            return null
        }
    }
}