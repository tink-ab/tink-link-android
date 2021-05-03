package com.tink.link.sample.profile

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.sample.R
import com.tink.link.sample.credentials.CredentialsFragment
import com.tink.link.sample.providerlist.ProviderListFragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val viewModel: ProfileViewModel by viewModels()

    private val adapter = CredentialsRowAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        adapter.onItemClickedListener = { credentialsId ->
            AlertDialog.Builder(context)
                .setItems(arrayOf("Update", "Authenticate", "Delete")) { _, selected: Int ->
                    when (selected) {
                        0 -> updateCredentials(credentialsId)
                        1 -> authenticateCredentials(credentialsId)
                        2 -> deleteCredentials(credentialsId)
                    }
                }
                .show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.connections.observe(
            viewLifecycleOwner,
            Observer {
                adapter.connections = it
            }
        )

        viewModel.providers.observe(
            viewLifecycleOwner,
            Observer { providerList ->
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
            }
        )
        loadingBackground.setOnTouchListener { _, _ -> true } // Prevent click-through
        refreshButton.setOnClickListener { findNavController().navigate(R.id.refreshCredentialsFragment) }
    }

    private fun deleteCredentials(id: String) {
        loader.visibility = View.VISIBLE
        loadingBackground.visibility = View.VISIBLE
        viewModel.deleteCredentials(id) {
            loader.post {
                loader.visibility = View.GONE
                loadingBackground.visibility = View.GONE
            }
        }
    }

    private fun authenticateCredentials(id: String) {
        viewModel.getProviderForCredentials(id)?.let {
            findNavController().navigate(
                R.id.credentialsFragment,
                CredentialsFragment.getBundle(
                    provider = it,
                    credentialsManualAuthArgs = CredentialsFragment.CredentialsManualAuthArgs(id)
                )
            )
        }
    }

    private fun updateCredentials(id: String) {
        viewModel.getUpdateDataForCredentials(id)?.let {
            findNavController().navigate(
                R.id.credentialsFragment,
                CredentialsFragment.getBundle(
                    it.provider,
                    CredentialsFragment.CredentialsUpdateArgs(id, it.currentValues)
                )
            )
        }
    }
}
