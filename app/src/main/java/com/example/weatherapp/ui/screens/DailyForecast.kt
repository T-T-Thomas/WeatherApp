package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.models.Weather
import com.example.weatherapp.R

//
// Display a list of Pokemon characters
//

@Composable
fun DailyForecast(){

    // Create a static list of Pokemon characters
    val weatherReport = listOf(
        Weather(
            name="Windy",
            resourceId = R.drawable.wind,
            temperature = "-2" + "\u00B0" + "C"),
        Weather(
            name="Rainy",
            resourceId = R.drawable.rain1,
            temperature ="5" + "\u00B0" + "C"),
        Weather(
            name="Stormy",
            resourceId = R.drawable.storm,
            temperature ="3" + "\u00B0" + "C"),
        Weather(
            name="Extremely Windy",
            resourceId = R.drawable.windstorm,
            temperature = "-7" + "\u00B0" + "C"),
        Weather(
            name="Snowing",
            resourceId = R.drawable.snowy,
            temperature ="-10" + "\u00B0" + "C"),
        Weather(
            name="Snow",
            resourceId = R.drawable.snowflakes,
            temperature ="-8" + "\u00B0" + "C"),
        Weather(
            name="Sunny",
        resourceId = R.drawable.sun,
        temperature ="13" + "\u00B0" + "C")
    )

    LazyColumn() {
        items(weatherReport) { weather ->

            Row(modifier = Modifier.padding(25.dp)) {
                Image(
                    painter = painterResource(id = weather.resourceId),
                    contentDescription = weather.name,
                    modifier = Modifier.size(80.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column() {
                    Text(weather.name,
                        style = MaterialTheme.typography.headlineSmall)

                    Text(weather.temperature,
                        style = MaterialTheme.typography.bodyLarge)
                }

            }

            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        }
    }
}