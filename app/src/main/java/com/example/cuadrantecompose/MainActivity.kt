package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteComposeApp()
                }
            }
        }
    }
}

@Composable
fun CuadranteComposeApp() {
    Column (Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Cuadrante(
                titulo = stringResource(R.string.titulo1_text),
                descripcion = stringResource(R.string.descripcion1_text),
                colorFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            Cuadrante(
                titulo = stringResource(R.string.titulo2_text),
                descripcion = stringResource(R.string.descripcion2_text),
                colorFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuadrante(
                titulo = stringResource(R.string.titulo3_text),
                descripcion = stringResource(R.string.descripcion3_text),
                colorFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            Cuadrante(
                titulo = stringResource(R.string.titulo4_text),
                descripcion = stringResource(R.string.descripcion4_text),
                colorFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun Cuadrante(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CuadranteComposePreview() {
    CuadranteComposeTheme {
        CuadranteComposeApp()
    }
}