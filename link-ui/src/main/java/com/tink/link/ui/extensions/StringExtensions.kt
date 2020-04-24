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
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.res.ResourcesCompat
import com.tink.link.ui.R
import io.noties.markwon.AbstractMarkwonPlugin
import io.noties.markwon.Markwon
import io.noties.markwon.MarkwonSpansFactory
import io.noties.markwon.core.CoreProps
import org.commonmark.node.Link

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

internal fun TextView.setMarkdownText(markdownText: String) =
    Markwon
        .builder(context)
        .usePlugin(object : AbstractMarkwonPlugin() {
            override fun configureSpansFactory(builder: MarkwonSpansFactory.Builder) {
                builder.setFactory(Link::class.java) { _, props ->
                    TinkUrlSpan(CoreProps.LINK_DESTINATION.require(props), context)
                }
            }
        })
        .build()
        .setMarkdown(this, markdownText)

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

private class TinkUrlSpan(url: String, val context: Context) : URLSpan(url) {
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
