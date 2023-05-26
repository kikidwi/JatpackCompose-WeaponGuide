package com.kiki.weaponguide.About

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.kiki.weaponguide.ui.theme.WeaponGuideTheme

class AboutPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeaponGuideTheme {
                AboutScreen()
            }
            AppBar()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppBar(){
    TopAppBar(
        title = { Text(text = "About Me") }
    )
}


