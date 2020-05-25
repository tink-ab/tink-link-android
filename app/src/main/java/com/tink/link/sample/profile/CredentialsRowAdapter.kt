package com.tink.link.sample.profile

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tink.link.sample.R
import com.tink.link.sample.extensions.inflate
import com.tink.link.sample.viewholders.ClickableViewHolder
import com.tink.link.sample.viewholders.OnViewHolderClickedListener
import kotlinx.android.synthetic.main.item_credentials_row.view.*
import kotlin.properties.Delegates

class CredentialsRowAdapter : RecyclerView.Adapter<CredentialsRowViewHolder>(),
    OnViewHolderClickedListener {

    var connections: List<Connection> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }
    var onItemClickedListener: ((String) -> Unit)? = null

    override fun getItemCount(): Int = connections.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CredentialsRowViewHolder {
        return CredentialsRowViewHolder(
            parent.inflate(R.layout.item_credentials_row),
            clickListener = this
        )
    }

    override fun onBindViewHolder(holder: CredentialsRowViewHolder, position: Int) {
        holder.bind(connections[position])
    }

    override fun onItemClicked(position: Int) {
        onItemClickedListener?.invoke(connections[position].id)
    }
}

class CredentialsRowViewHolder(itemView: View, clickListener: OnViewHolderClickedListener) :
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
