package com.akash.jetpack_compose_status_bar.util

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.provider.Settings
import android.widget.Toast
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import java.io.File
import kotlin.apply

object Utils {

    @Composable
    fun StatusBarSetup(
        color: Color,
        darkIcons: Boolean
    ) {
        StatusBarIconsColor(darkIcons)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsTopHeight(WindowInsets.statusBars)
                .background(color)
        )
    }


    @Composable
    private fun StatusBarIconsColor(darkIcons: Boolean) {
        val activity = LocalActivity.current
        val view = LocalView.current
        SideEffect {
            WindowCompat.getInsetsController(activity?.window, view).isAppearanceLightStatusBars = darkIcons
        }
    }

}