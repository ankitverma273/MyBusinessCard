package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.background_color)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(modifier = Modifier
        .padding(24.dp),
        horizontalAlignment = Alignment.Start
    ) {
        val latoFamily = FontFamily(
            Font(R.font.lato),
            Font(R.font.lato_bold)
        )
        Row( modifier = Modifier
            .align(Alignment.End)
            .padding(bottom = 12.dp)) {
            val share = painterResource(id = R.drawable.ic_share)
            Icon(painter = share, contentDescription = stringResource(R.string.share_profile))
        }
        Row(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(top = 12.dp)) {
            val image = painterResource(id = R.drawable.profile_image)
            Image(painter = image, contentDescription = stringResource(R.string.profile_image), modifier = Modifier
                .size(200.dp, 200.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
        }
        Row(
            modifier = Modifier
                .padding(top = 24.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = stringResource(R.string.name), fontFamily = latoFamily, fontWeight = FontWeight.Bold, fontSize = 36.sp, textAlign = TextAlign.Center)
        }
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = stringResource(R.string.designation), fontFamily = latoFamily, fontWeight = FontWeight.Normal, fontSize = 20.sp, textAlign = TextAlign.Center, modifier = Modifier.padding(top = 8.dp))
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.padding(top = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val twitter = painterResource(id = R.drawable.twitter)
                Image(painter = twitter, contentDescription = stringResource(R.string.twitter_id))
                Text(
                    text = stringResource(R.string.twitter_handle),
                    fontFamily = latoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Row(
                modifier = Modifier.padding(top = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val github = painterResource(id = R.drawable.github)
                Image(painter = github, contentDescription = stringResource(R.string.github_id))
                Text(
                    text = stringResource(R.string.github_handle),
                    fontFamily = latoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Row(
                modifier = Modifier.padding(top = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val whatsapp = painterResource(id = R.drawable.whatsapp)
                Image(painter = whatsapp, contentDescription = stringResource(R.string.whatsapp_number))
                Text(
                    text = stringResource(R.string.number),
                    fontFamily = latoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Row(
                modifier = Modifier.padding(top = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val linkedin = painterResource(id = R.drawable.linkedin)
                Image(painter = linkedin, contentDescription = stringResource(R.string.linkedin_id))
                Text(
                    text = "linkedin.com/in/ankit273",
                    fontFamily = latoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Row(
                modifier = Modifier.padding(top = 32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gmail = painterResource(id = R.drawable.gmail)
                Image(painter = gmail, contentDescription = stringResource(R.string.email_id))
                Text(
                    text = stringResource(R.string.gmail_id),
                    fontFamily = latoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name ="businessCardPreview")
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}