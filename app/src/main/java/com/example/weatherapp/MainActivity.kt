package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.content.*
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.weatherapp.ui.Navigation
import com.example.weatherapp.ui.theme.WeatherReportTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherReportTheme() {
                Navigation()
            }
        }
    }
}




