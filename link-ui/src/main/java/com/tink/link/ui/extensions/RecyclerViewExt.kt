package com.tink.link.ui.extensions

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_DRAGGING
import java.lang.ref.WeakReference

fun RecyclerView.closeKeyboardOnScrollStart(fragment: WeakReference<Fragment>) = addOnScrollListener(object : RecyclerView.OnScrollListener() {
    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        if (newState == SCROLL_STATE_DRAGGING) {
            fragment.get()?.view?.hideKeyboard()
        }
    }
})
