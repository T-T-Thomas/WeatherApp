package com.example.weatherapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = NightBlue,
    onPrimary = OnNightBlue,
    primaryContainer = NightBlue.copy(alpha = 0.3f),
    onPrimaryContainer = OnNightBlue,

    secondary = StormGrey,
    tertiary = MoonYellow,

    background = DarkBackground,
    surface = DarkSurface
)


private val LightColorScheme = lightColorScheme(
    primary = SkyBlue,
    onPrimary = OnSkyBlue,
    primaryContainer = SkyBlue.copy(alpha = 0.2f),
    onPrimaryContainer = OnSkyBlue,

    secondary = CloudGrey,
    tertiary = SunYellow,

    background = LightBackground,
    surface = LightSurface
)

//private val LightColorScheme = lightColorScheme(
//    primary = Purple40,
//    secondary = PurpleGrey40,
//    tertiary = Pink40
//    primary = BluePrimary,
//    secondary = BlueSecondary,
//    tertiary = BlueTertiary
//
//
//
///* Other default colors to override
//background = Color(0xFFFFFBFE),
//surface = Color(0xFFFFFBFE),
//onPrimary = Color.White,
//onSecondary = Color.White,
//onTertiary = Color.White,
//onBackground = Color(0xFF1C1B1F),
//onSurface = Color(0xFF1C1B1F),
//*/
//)

@Composable
fun WeatherReportTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}