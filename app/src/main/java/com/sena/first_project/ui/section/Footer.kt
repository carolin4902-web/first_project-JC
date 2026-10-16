package com.sena.first_project.ui.section

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sena.first_project.ui.composable.Text_content

@Composable
fun Footer(){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text_content()
    }
}