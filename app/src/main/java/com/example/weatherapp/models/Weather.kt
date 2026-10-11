package com.example.weatherapp.models

data class Weather (
    val date: String,
    val resourceId: Int,
    //val temperature: Temperature
    val temperature: String,
    val details: String
)