package com.bramwel.learnit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import com.bramwel.learnit.navigation.AppNavHost
import com.bramwel.learnit.ui.theme.LearnItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnItTheme {
                AppNavHost()
            }
            // Ensure the system UI (status bar) is visible
            WindowCompat.setDecorFitsSystemWindows(window, true)
            }
        }
    }
