package com.zvonimirplivelic.businesscard

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zvonimirplivelic.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        Arrangement.Bottom,

                    ) {
                        PersonalInformation()
                        ContactInformation()
                    }
                }
            }
        }
    }
}

@Composable
fun PersonalInformation() {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = image,
            contentDescription = "Android Logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = stringResource(R.string.owner_name),
            fontSize = 24.sp,
            color = Color.LightGray
        )
        Text(
            text = stringResource(R.string.owner_title),
            fontSize = 16.sp,
            color = Color.LightGray
        )
    }
}

@Composable
fun ContactInformation() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight().padding(top = 48.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .border(1.dp, Color.LightGray, shape = RectangleShape),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                Icons.Filled.Phone,
                stringResource(R.string.telephone_number_description),
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp),
                Color.LightGray
            )
            Text(
                text = stringResource(R.string.telephone_number),
                color = Color.LightGray,
                modifier = Modifier.padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .border(1.dp, Color.LightGray, shape = RectangleShape),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_computer),
                stringResource(R.string.linked_in_profile_description),
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp),
                Color.LightGray,
            )
            Text(
                text = stringResource(R.string.linked_in_profile),
                color = Color.LightGray,
                modifier = Modifier.padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .border(1.dp, Color.LightGray, shape = RectangleShape),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                Icons.Filled.Email,
                stringResource(R.string.email_description),
                modifier = Modifier
                    .wrapContentSize()
                    .padding(16.dp),
                Color.LightGray
            )
            Text(
                text = stringResource(R.string.email_address),
                color = Color.LightGray,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        PersonalInformation()
    }
}