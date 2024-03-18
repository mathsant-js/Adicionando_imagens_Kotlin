package com.example.tech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tech.ui.theme.TechTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    techApp()
                }
            }
        }
    }
}

@Composable
fun techApp(){
    etecCard(
        shortText = stringResource(R.string.shortText),
        title = stringResource(R.string.title),
        imagePainter = painterResource(R.drawable.tech)
    )
}


@Composable
private fun etecCard(
    title: String,
    shortText: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier
    )
    {
        Text(color = Color.Transparent, text = title)
        Text(
            color = Color.Blue,
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortText,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
        Text(color = Color.Transparent, text = title)
        Image(
            painter = imagePainter,
            contentDescription = null,
            )
        Text(color = Color.Transparent,text = title)
    }
}

@Preview(showBackground = true)
@Composable
fun TechPreview() {
    TechTheme {

        techApp()
    }
}