package com.mopinion.yourweather.data.location

import android.content.Context
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class LocationService @Inject constructor(@ApplicationContext private val context: Context) {

    private val fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)
    


    suspend fun retrieveLocation() {

    }

}