package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.models.Weather
import com.example.weatherapp.R

@Composable
fun DailyForecast(){

    // Create a static list of weathers
    val weatherReport = listOf(
        Weather(
            date="Sun, Oct 11",
            resourceId = R.drawable.wind,
            temperature = "-2" + "\u00B0" + "C High  0" + "\u00B0" + "C Low",
            details = "Strong Winds, Wind gusts up to 16mph. Sunny conditions expected around 12:00pm. Humidity 80%"),
        Weather(
            date="Mon, Oct 12",
            resourceId = R.drawable.rain1,
            temperature ="5" + "\u00B0" + "C High  -1" + "\u00B0" + "C Low",
            details = "Light Drizzle. 54% chance of rain. Amount 20mm. Maximum winds 20mph. Humidity 96%"),
        Weather(
            date="Tue, Oct 13",
            resourceId = R.drawable.storm,
            temperature ="3" + "\u00B0" + "C High  -3" + "\u00B0" + "C Low",
            details = "Heavy rainfall expected. Thunder activity increasing through the afternoon. Wind gusts reaching 28mph. Visibility reduced to 2km. Humidity 92%"),
        Weather(
            date="Wed, Oct 14",
            resourceId = R.drawable.windstorm,
            temperature = "-7" + "\u00B0" + "C High  -12" + "\u00B0" + "C Low",
            details = "Strong Winds. Gusts peaking at 45mph. Blowing snow reducing visibility. Wind chill dropping temperatures to -15°C. Humidity 78%"),
        Weather(
            date="Thu, Oct 15",
            resourceId = R.drawable.snowy,
            temperature ="-10" + "\u00B0" + "C High  -14" + "\u00B0" + "C Low",
            details = "Moderate Snowfall. 70% chance of continued flurries. Accumulation around 8cm. Winds 12mph. Humidity 88%"),
        Weather(
            date="Fri, Oct 16",
            resourceId = R.drawable.snowflakes,
            temperature ="-8" + "\u00B0" + "C High  -10" + "\u00B0" + "C Low",
            details = "Light Snow Showers. 40% chance of heavier bursts. Accumulation 3–5cm. Calm winds around 6mph. Humidity 91%"),
        Weather(
            date="Sat, Oct 17",
            resourceId = R.drawable.sun,
            temperature ="13" + "\u00B0" + "C High  15" + "\u00B0" + "C Low",
            details ="Clear Skies. UV index high around midday. Light breezes up to 10mph. No precipitation expected. Humidity 42%"),
    )

    LazyColumn {
        items(weatherReport) { weather ->

            Row(
                modifier = Modifier
                    .padding(25.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    Text(weather.date,
                        style = MaterialTheme.typography.headlineSmall)

                    Spacer(modifier = Modifier.width(10.dp))

                    Image(
                        painter = painterResource(id = weather.resourceId),
                        contentDescription = weather.date,
                        modifier = Modifier.size(80.dp)
                    )

                    Spacer(modifier = Modifier.width(25.dp))
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(weather.temperature,
                        style = MaterialTheme.typography.headlineSmall)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(weather.details,
                        style = MaterialTheme.typography.bodyLarge)
                }
            }

            HorizontalDivider()
        }
    }
}