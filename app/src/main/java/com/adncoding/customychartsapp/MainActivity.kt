package com.adncoding.customychartsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.adncoding.customychartsapp.ui.theme.CustomYChartsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomYChartsAppTheme {

            }
        }
    }
}