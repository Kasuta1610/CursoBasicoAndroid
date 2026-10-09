package com.zack.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zack.cursobasicoandroid.composables.ButtonExample
import com.zack.cursobasicoandroid.composables.ImageExample
import com.zack.cursobasicoandroid.composables.TestExample
import com.zack.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme {
               TestExample(name = "Pepe")
                ImageExample()
                ButtonExample()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Example(){
    Text(text = "hola, es", fontSize = 40.sp)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoBasicoAndroidTheme {
        Greeting("Android")
    }
}