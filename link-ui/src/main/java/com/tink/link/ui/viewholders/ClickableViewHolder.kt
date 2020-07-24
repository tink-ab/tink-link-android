package com.tink.link.ui.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView

internal abstract class ClickableViewHolder(
    itemView: View,
    onClickListener: OnViewHolderClickedListener
) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener(onClickListener)
    }
}

internal interface OnViewHolderClickedListener : View.OnClickListener {
    override fun onClick(view: View) {
        (view.parent as? RecyclerView)
            ?.findContainingViewHolder(view)
            ?.adapterPosition
            ?.takeIf { it != RecyclerView.NO_POSITION }
            ?.let { onItemClicked(it) }
    }

    fun onItemClicked(position: Int)
}
