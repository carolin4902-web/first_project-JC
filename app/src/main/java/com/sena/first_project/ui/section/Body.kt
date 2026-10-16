package com.sena.first_project.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.first_project.ui.composable.Text_content

@Composable
fun Body1(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Green
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Box(modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .background(Color.Red)
            )

            Box(modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .background(Color.Red)
            )

            Box(modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .background(Color.Red)
            )
        }
    }
}