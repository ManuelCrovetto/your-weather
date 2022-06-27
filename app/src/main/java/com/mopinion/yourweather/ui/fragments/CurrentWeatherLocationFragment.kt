package com.mopinion.yourweather.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mopinion.yourweather.databinding.CurrentWeatherLocationFragmentBinding
import com.mopinion.yourweather.ui.viewmodel.CurrentWeatherLocationViewModel

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

    }
}