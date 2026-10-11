package com.example.weatherapp.models

import android.health.connect.MedicalResourceId
import android.health.connect.datatypes.units.Temperature
import androidx.annotation.DrawableRes

data class Weather (
    val name: String,
    val resourceId: Int,
    //val temperature: Temperature
    val temperature: String
)