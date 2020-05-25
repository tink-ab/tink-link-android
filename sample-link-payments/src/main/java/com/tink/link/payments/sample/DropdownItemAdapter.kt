package com.tink.link.payments.sample

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class DropdownItemAdapter<T>(context: Context, resId: Int, private val getName: (T?) -> String) :
    ArrayAdapter<T>(context, resId) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View =
        super.getView(position, convertView, parent).also {
            (it as? TextView)?.text = getName(getItem(position))
        }
}

