package com.sena.first_project.ui.section

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header1() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .border(2.dp, Color.DarkGray, RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text("Title", fontSize = 24.sp)
    }
}