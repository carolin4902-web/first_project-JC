package com.sena.first_project.ui.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Cuadro() {
    Box(
        modifier = Modifier
            .size(80.dp)
            .border(2.dp, Color.DarkGray, RoundedCornerShape(16.dp))
    )
}