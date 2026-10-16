package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sena.first_project.ui.composable.Text_content
import com.sena.first_project.ui.section.Body1
import com.sena.first_project.ui.section.Footer

@Composable
fun Home(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Body1()
        Text_content()
        Footer()
    }
}