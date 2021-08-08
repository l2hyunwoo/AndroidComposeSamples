package com.nunu.composesamples

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Hyun Woo", "Hello World !"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun TextCard(
    name: String
) {
    Text(text = name)
}

@Composable
fun MessageCard(
    messsage: Message
) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Android",
            modifier = Modifier.size(40.dp).clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = messsage.author)
            Spacer(Modifier.height(8.dp))
            Text(text = messsage.body)
        }
    }

}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        messsage = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
    )
}

@Preview
@Composable
fun Preview() {
    TextCard("HyunWoo")
}