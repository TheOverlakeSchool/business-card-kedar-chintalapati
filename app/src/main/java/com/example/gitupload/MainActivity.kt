package com.example.gitupload

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gitupload.ui.theme.GitUploadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitUploadTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = MaterialTheme.colorScheme.background
                    color = androidx.compose.ui.graphics.Color(0xFFa8e6cf) //green background
                ) {
                    business_card()
                }
            }
        }
    }
}

@Composable
fun business_card() {
    val _info = hashMapOf(
        "n" to "Kedar Chintalapati",
        "t" to "Student of Jerone Mitchell"
    )
    val c_info = hashMapOf(
        "p" to Pair(Icons.Rounded.Phone, "425 890 2303"),
        "s" to Pair(Icons.Rounded.Share, "@AndroidDev"),
        "e" to Pair(Icons.Rounded.Email, "kchintalapati@overlake.org")
    )
    val p_vals = hashMapOf(
        "top_pad" to 16.dp,
        "side_pad" to 16.dp
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = _info["n"] ?: "",
            fontSize = 36.sp,
            modifier = Modifier.padding(p_vals["top_pad"] ?: 16.dp)
        )
        Text(
            text = _info["t"] ?: "",
            fontSize = 18.sp,
            modifier = Modifier.padding(p_vals["top_pad"] ?: 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        c_info.forEach { (_, v) -> contact_row(v.first, v.second) }
    }
}

@Composable
fun contact_row(icn: ImageVector, txt: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icn,
            contentDescription = null,
            modifier = Modifier.padding(end = 16.dp)
        )
        Text(text = txt, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun preview_card() {
    GitUploadTheme {
        business_card()
    }
}
