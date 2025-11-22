package com.akash.jetpack_compose_status_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.akash.jetpack_compose_status_bar.util.Utils.StatusBarSetup

@Composable
fun BaseScreen(
    statusBarColor: Color = Color.White,
    darkIcons: Boolean = true,
    backgroundColor: Color = Color.White,
    topBar: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit
) {
    StatusBarSetup(statusBarColor, darkIcons)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsTopHeight(WindowInsets.statusBars)
                .background(statusBarColor)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()),
        ) {
            topBar?.invoke()
            content()
        }
    }
}




