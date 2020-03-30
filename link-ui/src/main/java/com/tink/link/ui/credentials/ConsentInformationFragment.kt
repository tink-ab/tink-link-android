package com.tink.link.ui.credentials

import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tink.link.ui.R
import com.tink.link.ui.extensions.inflate
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.tink_fragment_consent_information.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

private const val TOOLBAR_TITLE_ARG = "TOOLBAR_TITLE_ARG"
private const val SCOPES_LIST_ARGS = "SCOPES_LIST_ARGS"

internal class ConsentInformationFragment : Fragment(R.layout.tink_fragment_consent_information) {

    private val toolbarTitle by lazy {
        requireNotNull(arguments?.getString(TOOLBAR_TITLE_ARG))
    }

    private val scopesListArgs by lazy {
        requireNotNull(arguments?.getParcelable<ScopesListArgs>(SCOPES_LIST_ARGS))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.title = toolbarTitle
        with(scopesList) {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ScopesListAdapter().apply { data = scopesListArgs.scopeInfoList }
        }
    }

    companion object {
        fun getBundle(toolbarTitle: String, scopesListArgs: ScopesListArgs) =
            bundleOf(TOOLBAR_TITLE_ARG to toolbarTitle, SCOPES_LIST_ARGS to scopesListArgs)
    }
}

internal class ScopesListAdapter : RecyclerView.Adapter<ScopesListAdapter.ScopeItemViewHolder>() {

    var data: List<ScopeInfo> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScopeItemViewHolder {
        return ScopeItemViewHolder(parent.inflate(R.layout.tink_item_consent_scope))
    }

    override fun onBindViewHolder(holder: ScopeItemViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    internal class ScopeItemViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.scopeTitle)
        private val description: TextView = itemView.findViewById(R.id.scopeDescription)

        fun bind(item: ScopeInfo) {
            title.text = item.title
            description.text = item.description
        }
    }
}

@Parcelize
internal data class ScopesListArgs(val scopeInfoList: List<ScopeInfo>): Parcelable

@Parcelize
internal data class ScopeInfo(val title: String, val description: String): Parcelable