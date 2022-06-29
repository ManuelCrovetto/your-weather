package com.mopinion.yourweather.domain

import android.location.Location
import com.mopinion.yourweather.data.location.LocationService
import javax.inject.Inject

class GetCurrentLocationUseCase @Inject constructor(private val locationService: LocationService) {

    suspend operator fun invoke() = locationService.retrieveLocation()
}