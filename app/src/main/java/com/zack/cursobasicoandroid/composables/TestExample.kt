package com.zack.cursobasicoandroid.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TestExample(name: String) {
    Text(
        text = name,
        fontSize = 40.sp,
        color = Color(0xFF4595DA),
        fontWeight = FontWeight.Thin
    )
}
