package com.akash.jetpack_compose_status_bar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen() {
    BaseScreen(
        statusBarColor = Color.Red,
        darkIcons = false,
        backgroundColor = Color.White
    ) {
        Column(
            Modifier.fillMaxSize()
        ) {
            Text("Home Screen")
        }
    }
}