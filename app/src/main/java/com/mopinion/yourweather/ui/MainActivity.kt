package com.mopinion.yourweather.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mopinion.yourweather.R
import com.mopinion.yourweather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}