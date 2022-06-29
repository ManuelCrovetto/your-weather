package com.mopinion.yourweather.data.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class LocationService @Inject constructor(@ApplicationContext private val context: Context) {

    private val fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)

    @SuppressLint("MissingPermission")
    suspend fun retrieveLocation(): Location {
        return fusedLocationProviderClient.lastLocation.await()
    }

}