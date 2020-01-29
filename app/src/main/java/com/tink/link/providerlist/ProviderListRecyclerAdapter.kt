package com.tink.link.providerlist

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tink.link.R
import com.tink.link.extensions.inflate
import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.Provider
import com.tink.link.model.provider.ProviderTreeNode
import com.tink.link.viewholders.ClickableViewHolder
import com.tink.link.viewholders.OnViewHolderClickedListener
import kotlin.properties.Delegates

/**
 * RecyclerView adapter that shows a list of [ProviderTreeNode] objects.
 */
class ProviderListRecyclerAdapter : RecyclerView.Adapter<ProviderViewHolder>(),
    OnViewHolderClickedListener {

    var providers: List<ProviderTreeNode> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }
    var onItemClickedListener: ((ProviderTreeNode) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProviderViewHolder {
        return ProviderViewHolder(
            parent.inflate(R.layout.item_provider_list),
            this
        )
    }

    override fun getItemCount(): Int = providers.size

    override fun onBindViewHolder(holder: ProviderViewHolder, position: Int) {
        holder.bind(providers[position])
    }

    override fun onItemClicked(position: Int) {
        onItemClickedListener?.invoke(providers[position])
    }
}

/**
 * View holder for a [ProviderTreeNode].
 * Displays a user-friendly name based on the type of node.
 */
class ProviderViewHolder(itemView: View, clickListener: OnViewHolderClickedListener) :
    ClickableViewHolder(itemView, clickListener) {

    private val title: TextView = itemView.findViewById(R.id.title)

    fun bind(item: ProviderTreeNode) {
        title.text = when (item) {
            is ProviderTreeNode.FinancialInstitutionGroupNode -> item.name
            is ProviderTreeNode.FinancialInstitutionNode -> item.name
            is ProviderTreeNode.AccessTypeNode -> item.name ?: item.type.getDescription()
            is ProviderTreeNode.CredentialTypeNode -> item.name ?: item.type.getDescription()
            is ProviderTreeNode.ProviderNode -> item.name
        }
    }
}

private fun Provider.AccessType.getDescription() =
    when (this) {
        Provider.AccessType.OPEN_BANKING -> "Open Banking"
        Provider.AccessType.UNKNOWN,
        Provider.AccessType.OTHER -> "Other"
    }

private fun Credential.Type.getDescription() =
    when (this) {
        Credential.Type.UNKNOWN -> "Unknown"
        Credential.Type.PASSWORD -> "Password"
        Credential.Type.MOBILE_BANKID -> "Mobile BankID"
        Credential.Type.THIRD_PARTY_AUTHENTICATION -> "Third Party Authentication"
        Credential.Type.KEYFOB -> "Key Fob"
        Credential.Type.FRAUD -> "Fraud"
    }