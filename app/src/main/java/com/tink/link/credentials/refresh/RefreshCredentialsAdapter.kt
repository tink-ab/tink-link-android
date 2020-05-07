package com.tink.link.credentials.refresh

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tink.link.R
import com.tink.link.extensions.inflate
import kotlinx.android.synthetic.main.item_credentials_refresh_row.view.*
import kotlinx.android.synthetic.main.item_credentials_row.view.providerName
import kotlin.properties.Delegates

class RefreshCredentialsAdapter : RecyclerView.Adapter<RefreshCredentialsRow>() {

    var models: List<RefreshModel> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }

    override fun getItemCount(): Int = models.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RefreshCredentialsRow {
        return RefreshCredentialsRow(
            parent.inflate(R.layout.item_credentials_refresh_row)
        )
    }

    override fun onBindViewHolder(holder: RefreshCredentialsRow, position: Int) {
        holder.bind(models[position])
    }
}

class RefreshCredentialsRow(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: RefreshModel) {
        itemView.providerName.text = model.label
        itemView.status.text = model.status

        val loading = model.state != CredentialsRefreshState.DONE

        itemView.loader.visibility = if (loading) View.VISIBLE else View.INVISIBLE
        itemView.logo.visibility = View.INVISIBLE

        model.iconUri?.takeUnless { loading }.let {
            itemView.logo.visibility = View.VISIBLE
            Picasso.get().load(it).into(itemView.logo)
        }
    }
}
