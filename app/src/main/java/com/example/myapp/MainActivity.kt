package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainApp()
        }
    }
} //termina a classe da MainActivity



@Composable
fun MainApp(){
    MyAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            SaudarUsuario("Julia")
        }
        Text(text = "Novo texto")
    }
}

@Composable
fun SaudarUsuario(NomeDoUsuario: String) {
    Text(text = "Hello $NomeDoUsuario!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainApp()

    }
