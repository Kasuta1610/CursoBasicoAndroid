package com.zack.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zack.cursobasicoandroid.R

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFF1CABC0)),
            verticalAlignment = Alignment.CenterVertically
    ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )

        Column(modifier = Modifier) {
            Text("Kasuta1610", color = Color.White)
            Text("Mobile Developer", color = Color.White)
        }

        Button(onClick = {}) {
            Text("Galleta")
        }
      }
    }

}
