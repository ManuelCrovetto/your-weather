package com.mopinion.yourweather.ui.fragments

import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.mopinion.yourweather.databinding.CurrentWeatherLocationFragmentBinding
import com.mopinion.yourweather.ui.viewmodel.CurrentWeatherLocationViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CurrentWeatherLocationFragment: Fragment() {

    private var _binding: CurrentWeatherLocationFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CurrentWeatherLocationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CurrentWeatherLocationFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.stateFlow.collectLatest { string: String? ->
                        Log.d("TESTING 1:", string ?: "")
                    }


                }

                launch {
                    viewModel.stateFlow.collectLatest { string ->
                        Log.d("TESTING 2:", string ?: "")
                    }
                }
            }
        }
    }
}