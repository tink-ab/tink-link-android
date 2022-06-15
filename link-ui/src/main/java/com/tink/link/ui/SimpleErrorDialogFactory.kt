package com.tink.link.ui

import android.content.Context
import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tink.link.ui.extensions.visibleIf
import kotlinx.android.synthetic.main.tink_dialog_simple_error.view.*

internal object SimpleErrorDialogFactory {

    fun createDialog(
        context: Context,
        @StringRes title: Int = R.string.tink_error_unknown,
        @StringRes message: Int?,
        @StringRes buttonLabel: Int = R.string.tink_close,
        onDismiss: (() -> Unit)? = null
    ): AlertDialog {
        val view = View
            .inflate(context, R.layout.tink_dialog_simple_error, null)
            .apply {
                errorTitle.text = context.getString(title)
                message?.let {
                    errorMessage.text = context.getString(it)
                }
                errorMessage.visibleIf { message != null }
                errorButton.text = context.getString(buttonLabel)
                errorButton.setOnClickListener {
                    onDismiss?.invoke()
                }
            }
        return MaterialAlertDialogBuilder(context, R.style.Tink_MaterialAlertDialogStyle)
            .setView(view)
            .setCancelable(false)
            .create()
    }
}
