package com.example.gitupload

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gitupload.ui.theme.GitUploadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitUploadTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = stringResource(R.string.android_logo_description),
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Text(
            text = stringResource(R.string.name_text),
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)

        )
        Text(
            text = stringResource(R.string.comp_sci_teacher),
                    fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)

        )
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = stringResource(R.string.phone_logo)
            )
            Text(
                text = stringResource(R.string.phone_number),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(end = 16.dp)

            )
        }
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = stringResource(R.string.phone_logo)
            )
            Text(
                text = stringResource(R.string.phone_number),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(end = 16.dp)

            )
        }
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = stringResource(R.string.phone_logo)
            )
            Text(
                text = stringResource(R.string.phone_number),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(end = 16.dp)

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitUploadTheme {
        BusinessCard("Android")
    }
}