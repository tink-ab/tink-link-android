package com.tink.link.ui.extensions

import androidx.test.platform.app.InstrumentationRegistry
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

private const val URL_TINK = "https://tink.com"
private const val TEXT_WITH_URL_MARKDOWN =
    "This is a text with url markdown. [Click here]($URL_TINK)"
private const val TEXT_WITHOUT_MARKDOWN = "This is a text without url markdown."

internal class StringExtensionsTest {

    private val context = InstrumentationRegistry.getInstrumentation().context

    @Test
    fun text_with_url_markdown_returns_SpannableString_with_TinkUrlSpan() {
        val spannableString = TEXT_WITH_URL_MARKDOWN.convertUrlMarkdownToSpan(context)
        val arrayOfTinkUrlSpansGenerated =
            spannableString.getSpans(0, spannableString.length - 1, TinkUrlSpan::class.java)
        assertThat(arrayOfTinkUrlSpansGenerated.size).isOne()
    }

    @Test
    fun text_without_url_markdown_returns_SpannableString_without_TinkUrlSpan() {
        val spannableString = TEXT_WITHOUT_MARKDOWN.convertUrlMarkdownToSpan(context)
        val arrayOfTinkUrlSpansGenerated =
            spannableString.getSpans(0, spannableString.length - 1, TinkUrlSpan::class.java)
        assertThat(arrayOfTinkUrlSpansGenerated).isEmpty()
    }

    @Test
    fun url_from_markdown_text_matches_the_url_set_in_the_TinkUrlSpan() {
        val spannableString = TEXT_WITH_URL_MARKDOWN.convertUrlMarkdownToSpan(context)
        val arrayOfTinkUrlSpansGenerated =
            spannableString.getSpans(0, spannableString.length - 1, TinkUrlSpan::class.java)
        val urlFromSpan = arrayOfTinkUrlSpansGenerated[0].url
        assertThat(urlFromSpan).isEqualTo(URL_TINK)
    }

    @Test
    fun text_without_url_markdown_matches_the_SpannableString_text() {
        val spannableString = TEXT_WITHOUT_MARKDOWN.convertUrlMarkdownToSpan(context)
        assertThat(spannableString.toString()).isEqualTo(TEXT_WITHOUT_MARKDOWN)
    }
}
