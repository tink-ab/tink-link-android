package com.tink.link.ui.credentials

import android.content.Context
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tink.link.ui.R
import kotlinx.android.synthetic.main.tink_dialog_credentials_status.view.*

internal object CredentialsStatusDialog {

    enum class Type {
        LOADING,
        ERROR
    }

    fun create(
        context: Context,
        type: Type,
        message: String,
        onDismiss: (() -> Unit)? = null
    ): AlertDialog {
        return MaterialAlertDialogBuilder(context, R.style.Tink_MaterialAlertDialogStyle)
            .apply {
                val view = View.inflate(context, R.layout.tink_dialog_credentials_status, null)
                view.apply {
                    loadingMessage.text = message
                    cancelButton.text =
                        if (type == Type.LOADING) {
                            loadingProgress.visibility = View.VISIBLE
                            context.getString(R.string.tink_credentials_status_dialog_cancel_button)
                        } else {
                            loadingProgress.visibility = View.GONE
                            context.getString(R.string.tink_credentials_status_dialog_ok_button)
                        }
                    cancelButton.setOnClickListener {
                        onDismiss?.invoke()
                    }
                }
                setView(view)
                setCancelable(false)
            }
            .create()
    }
}