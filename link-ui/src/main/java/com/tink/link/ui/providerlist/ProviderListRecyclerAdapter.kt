package com.tink.link.ui.providerlist

import android.content.Context
import android.content.res.ColorStateList
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tink.link.ui.R
import com.tink.link.ui.extensions.capabilitiesText
import com.tink.link.ui.extensions.getColorFromAttr
import com.tink.link.ui.extensions.inflate
import com.tink.link.ui.viewholders.ClickableViewHolder
import com.tink.link.ui.viewholders.OnViewHolderClickedListener
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
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
            parent.inflate(R.layout.tink_item_provider_list),
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
    private val logo: ImageView = itemView.findViewById(R.id.logo)

    fun bind(item: ProviderTreeNode) {
        title.text = when (item) {
            is ProviderTreeNode.FinancialInstitutionGroupNode -> item.name
            is ProviderTreeNode.FinancialInstitutionNode -> item.name
            is ProviderTreeNode.AccessTypeNode -> item.capabilitiesText(title.context)
            is ProviderTreeNode.CredentialsTypeNode -> item.name ?: item.type.getDescription(title.context)
            is ProviderTreeNode.ProviderNode -> item.name
        }

        if (item is ProviderTreeNode.CredentialsTypeNode) {
            val iconRes = when (item.type) {
                Credentials.Type.MOBILE_BANKID -> R.drawable.tink_bankid
                else -> R.drawable.tink_code
            }
            logo.apply {
                setImageResource(iconRes)
                imageTintList =
                    ColorStateList.valueOf(context.getColorFromAttr(R.attr.tink_colorOnPrimary))
                background = context.getDrawable(R.drawable.tink_rounded_background)
                visibility = View.VISIBLE
            }
        } else {
            item.icon?.let {
                Picasso.get().load(it).into(logo)
                logo.visibility = View.VISIBLE
            }
        }
    }
}

private fun Provider.AccessType.getDescription() =
    when (this) {
        Provider.AccessType.OPEN_BANKING -> "Open Banking"
        Provider.AccessType.UNKNOWN,
        Provider.AccessType.OTHER -> "Other"
    }

private fun Credentials.Type.getDescription(context: Context) =
    when (this) {
        Credentials.Type.UNKNOWN -> context.getString(R.string.provider_select_credentials_type_unknown_default_description)
        Credentials.Type.PASSWORD -> context.getString(R.string.provider_select_credentials_type_password_default_description)
        Credentials.Type.MOBILE_BANKID -> context.getString(R.string.provider_select_credentials_type_mobile_bank_id_default_description)
        Credentials.Type.THIRD_PARTY_AUTHENTICATION -> context.getString(R.string.provider_select_credentials_type_third_party_authentication_default_description)
        Credentials.Type.KEYFOB -> context.getString(R.string.provider_select_credentials_type_keyfob_default_description)
        Credentials.Type.FRAUD -> context.getString(R.string.provider_select_credentials_type_fraud_default_description)
    }
