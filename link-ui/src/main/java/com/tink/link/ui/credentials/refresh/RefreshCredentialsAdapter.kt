package com.tink.link.ui.credentials.refresh

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tink.link.ui.extensions.inflate
import com.tink.link.ui.R
import kotlinx.android.synthetic.main.item_credential_refresh_row.view.*
import kotlinx.android.synthetic.main.item_credential_row.view.logo
import kotlinx.android.synthetic.main.item_credential_row.view.providerName
import kotlin.properties.Delegates

class RefreshCredentialsAdapter : RecyclerView.Adapter<RefreshCredentialsRow>() {

    var models: List<RefreshModel> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }

    override fun getItemCount(): Int = models.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RefreshCredentialsRow {
        return RefreshCredentialsRow(
            parent.inflate(R.layout.item_credential_refresh_row)
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

        val loading = model.state != CredentialRefreshState.DONE

        itemView.loader.visibility = if (loading) View.VISIBLE else View.INVISIBLE
        itemView.logo.visibility = View.INVISIBLE

        model.iconUri?.takeUnless { loading }.let {
            itemView.logo.visibility = View.VISIBLE
            Picasso.get().load(it).into(itemView.logo)
        }
    }
}
