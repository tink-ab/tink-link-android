package com.tink.link.profile

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tink.link.R
import com.tink.link.extensions.inflate
import kotlinx.android.synthetic.main.item_credential_row.view.*
import kotlin.properties.Delegates

class CredentialRowAdapter : RecyclerView.Adapter<CredentialRowViewHolder>() {

    var connections: List<Connection> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }

    override fun getItemCount(): Int = connections.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CredentialRowViewHolder {
        return CredentialRowViewHolder(
            parent.inflate(R.layout.item_credential_row)
        )
    }

    override fun onBindViewHolder(holder: CredentialRowViewHolder, position: Int) {
        holder.bind(connections[position])
    }
}

class CredentialRowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(connection: Connection) {
        itemView.providerName.text = connection.providerName
        itemView.updatedTime.text = connection.lastUpdated //TODO
    }
}
