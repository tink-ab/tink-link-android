package com.tink.link.ui.credentials

import android.content.Context
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tink.link.ui.R
import kotlinx.android.synthetic.main.tink_dialog_credentials_status.view.*

internal object CredentialsStatusDialogFactory {

    enum class Type {
        LOADING,
        ERROR
    }

    fun createDialog(
        context: Context,
        type: Type,
        message: String,
        onDismiss: (() -> Unit)? = null
    ): AlertDialog {
        val view = View
            .inflate(context, R.layout.tink_dialog_credentials_status, null)
            .apply {
                loadingMessage.text = message
                cancelButton.text =
                    if (type == Type.LOADING) {
                        loadingProgress.visibility = View.VISIBLE
                        context.getString(R.string.tink_cancel_button)
                    } else {
                        loadingProgress.visibility = View.GONE
                        context.getString(R.string.tink_ok_button)
                    }
                cancelButton.setOnClickListener {
                    onDismiss?.invoke()
                }
            }
        return MaterialAlertDialogBuilder(context, R.style.Tink_MaterialAlertDialogStyle)
            .setView(view)
            .setCancelable(false)
            .create()
    }
}
