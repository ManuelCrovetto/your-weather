package com.mopinion.yourweather.ui.viewmodel

import android.location.Location
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mopinion.yourweather.domain.GetCurrentLocationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrentWeatherLocationViewModel @Inject constructor(private val getCurrentLocationUseCase: GetCurrentLocationUseCase): ViewModel() {

    private val _channel = Channel<String>()
    val channelAsFlow = _channel.receiveAsFlow()

    private val _sharedFlow = MutableSharedFlow<String>()
    val sharedFlow = _sharedFlow.asSharedFlow()

    private val _stateFlow = MutableStateFlow<String?>(null)
    val stateFlow = _stateFlow.asStateFlow()


    init {
        getData()
    }

    fun getData() {
        viewModelScope.launch(Dispatchers.IO) {
            while (true) {
                _stateFlow.value = "hola"
                delay(500)
            }

            /*_sharedFlow.emit(getCurrentLocationUseCase.invoke())
            _stateFlow.value = getCurrentLocationUseCase.invoke()*/
        }
    }


}