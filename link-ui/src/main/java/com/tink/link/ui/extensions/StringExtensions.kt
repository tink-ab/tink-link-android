package com.tink.link.ui.extensions

import android.content.Context
import android.net.Uri
import android.text.SpannableString
import android.text.Spanned
import android.text.SpannedString
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.text.style.URLSpan
import android.view.View
import android.widget.TextView
import androidx.annotation.VisibleForTesting
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.res.ResourcesCompat
import com.tink.link.ui.R
import java.util.regex.Pattern

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

internal fun TextView.setTextWithLinks(fullText: String, links: List<LinkInfo>) {
    val spannableString = SpannableString.valueOf(fullText)
        .apply {
            for (link in links) {
                val startIndex = indexOf(link.linkText)
                setSpan(
                    TinkUrlSpan(link.url, context),
                    startIndex,
                    startIndex + link.linkText.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
        }
    text = SpannedString(spannableString)
}

internal fun TextView.setTextWithUrlMarkdown(markdownText: String) {
    text = markdownText.convertUrlMarkdownToSpan(context)
}

internal fun String.convertUrlMarkdownToSpan(context: Context): SpannableString {
    val matcher = Pattern.compile("\\[([^]]*)]\\(([^\\s^)]*)[\\s)]").matcher(this)
    if (matcher.find()) {
        val linkText = matcher.toMatchResult().group(1)
        val url = matcher.toMatchResult().group(2)
        val startIndex = matcher.start(1) - 1
        if (!url.isNullOrEmpty() && !linkText.isNullOrEmpty()) {
            val linkInfo = LinkInfo(url, linkText)
            val fullText = matcher.replaceAll(linkText)
            return SpannableString.valueOf(fullText).apply {
                setSpan(
                    TinkUrlSpan(linkInfo.url, context),
                    startIndex,
                    startIndex + linkInfo.linkText.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
        }
    }
    return SpannableString(this)
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

@VisibleForTesting
class TinkUrlSpan(url: String, val context: Context) : URLSpan(url) {
    override fun updateDrawState(textPaint: TextPaint) {
        textPaint.apply {
            isUnderlineText = true
            color = context.getColorFromAttr(R.attr.tink_textColorSecondary)
            typeface = ResourcesCompat.getFont(context, R.font.tink_font_regular)
        }
    }

    override fun onClick(widget: View) {
        CustomTabsIntent.Builder()
            .setToolbarColor(context.getColorFromAttr(R.attr.tink_colorPrimary))
            .build()
            .launchUrl(context, Uri.parse(url))
    }
}

internal data class LinkInfo(val url: String, val linkText: String)
