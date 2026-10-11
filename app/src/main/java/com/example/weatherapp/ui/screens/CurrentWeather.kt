package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.models.Weather

//
// Search a pokemon character
//

@Composable
fun CurrentWeather()
{
    val weather = Weather(
        name="Sun",
        resourceId = R.drawable.sun,
        temperature = "15" + "\u00B0" + "C",
        details = "Feels like 17" + "\u00B0" + "C" + "\n" + "Wind speed = 9mph"
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(weather.resourceId),
            contentDescription = weather.name
        )

        Text(text = weather.name,
            style = MaterialTheme.typography.displayLarge)

        Spacer(modifier = Modifier
            .height(5.dp))

        Text(weather.temperature,
            style = MaterialTheme.typography.displaySmall)

        Spacer(modifier = Modifier
            .height(5.dp))

        Text(text = weather.details,
            style = MaterialTheme.typography.titleLarge)
    }
}