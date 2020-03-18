package com.tink.link.ui.profile

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tink.link.ui.R
import com.tink.link.ui.extensions.inflate
import com.tink.link.ui.viewholders.ClickableViewHolder
import com.tink.link.ui.viewholders.OnViewHolderClickedListener
import kotlinx.android.synthetic.main.tink_item_credential_row.view.*
import kotlin.properties.Delegates

class CredentialRowAdapter : RecyclerView.Adapter<CredentialRowViewHolder>(),
    OnViewHolderClickedListener {

    var connections: List<Connection> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }
    var onItemClickedListener: ((String) -> Unit)? = null

    override fun getItemCount(): Int = connections.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CredentialRowViewHolder {
        return CredentialRowViewHolder(
            parent.inflate(R.layout.tink_item_credential_row),
            clickListener = this
        )
    }

    override fun onBindViewHolder(holder: CredentialRowViewHolder, position: Int) {
        holder.bind(connections[position])
    }

    override fun onItemClicked(position: Int) {
        onItemClickedListener?.invoke(connections[position].id)
    }
}

class CredentialRowViewHolder(itemView: View, clickListener: OnViewHolderClickedListener) :
    ClickableViewHolder(itemView, clickListener) {
    fun bind(connection: Connection) {
        itemView.providerName.text = connection.providerName
        itemView.updatedTime.text = connection.lastUpdated

        itemView.logo.visibility = View.GONE
        connection.iconUri?.let {
            itemView.logo.visibility = View.VISIBLE
            Picasso.get().load(it).into(itemView.logo)
        }
    }
}
