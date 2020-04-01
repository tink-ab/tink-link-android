package com.tink.link.ui.extensions

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.SpannedString
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.tink.link.ui.R

internal fun String.convertCallToActionText(
    ctaText: String,
    action: () -> Unit,
    context: Context
): CharSequence {
    val startIndex = indexOf(ctaText)
    val spannableString = SpannableString.valueOf(this)
        .apply {
            setSpan(
                TinkCallToActionSpan(context, action),
                startIndex,
                startIndex + ctaText.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
    return SpannedString(spannableString)
}

private class TinkCallToActionSpan(
    val context: Context,
    val action: () -> Unit
) : ClickableSpan() {

    override fun updateDrawState(textPaint: TextPaint) {
        textPaint.apply {
            isUnderlineText = false
            color = context.getColorFromAttr(R.attr.tink_colorPrimary)
            typeface = ResourcesCompat.getFont(context, R.font.tink_font_semi_bold)
        }
    }

    override fun onClick(widget: View) {
        action()
    }
}
