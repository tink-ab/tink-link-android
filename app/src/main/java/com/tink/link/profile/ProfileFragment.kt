package com.tink.link.profile

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.MainActivity
import com.tink.link.R
import com.tink.link.credentials.CredentialFragment
import com.tink.link.providerlist.ProviderListFragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var viewModel: ProfileViewModel

    private val adapter = CredentialRowAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this)[ProfileViewModel::class.java].also {
            it.initialize((activity as MainActivity).tinkLink)
        }

        adapter.onItemClickedListener = { credentialsId ->
            AlertDialog.Builder(context)
                .setItems(arrayOf("Update", "Delete")) { _, selected: Int ->
                    when (selected) {
                        0 -> updateCredential(credentialsId)
                        1 -> deleteCredential(credentialsId)
                    }
                }
                .show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.connections.observe(viewLifecycleOwner, Observer {
            adapter.connections = it
        })

        viewModel.providers.observe(viewLifecycleOwner, Observer { providerList ->
            addBankButton.post {
                if (providerList.isNotEmpty()) {

                    addBankButton.isEnabled = true
                    addBankButton.setOnClickListener {
                        findNavController().navigate(
                            R.id.action_profileFragment_to_providerListFragment,
                            ProviderListFragment.getBundle(providerList)
                        )
                    }
                } else {
                    addBankButton.isEnabled = false
                }
            }
        })
        loadingBackground.setOnTouchListener { _, _ -> true } // Prevent click-through
        refreshButton.setOnClickListener { findNavController().navigate(R.id.refreshCredentialsFragment) }
    }

    private fun deleteCredential(id: String) {
        loader.visibility = View.VISIBLE
        loadingBackground.visibility = View.VISIBLE
        viewModel.deleteCredential(id) {
            loader.post {
                loader.visibility = View.GONE
                loadingBackground.visibility = View.GONE
            }
        }
    }

    private fun updateCredential(id: String) {
        viewModel.getUpdateDataForCredential(id)?.let {
            findNavController().navigate(
                R.id.credentialFragment,
                CredentialFragment.getBundle(
                    it.provider,
                    CredentialFragment.CredentialUpdateArgs(id, it.currentValues)
                )
            )
        }
    }
}
