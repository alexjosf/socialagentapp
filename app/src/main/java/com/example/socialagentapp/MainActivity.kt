package com.example.socialagentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialagentapp.ui.theme.SocialagentappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SocialagentappTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(color = Color.Blue)
                    ) {
                        Greeting()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    TopBar()
    CenterTab()
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .height(65.dp)
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Oppo",
                modifier = Modifier
                    .padding(start = 10.dp),
                fontSize = 24.sp
            )
            Icon(
                painter = painterResource(id = R.drawable.verified),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.density_large),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
    }

}

@Composable
fun CenterTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .size(height = 400.dp, width = 250.dp)
                .clip(RoundedCornerShape(600.dp))
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Mark Antony",
                    modifier = Modifier
                        .padding(start = 10.dp),
                    fontSize = 36.sp
                )
                Text(
                    text = "~",
                    modifier = Modifier
                        .padding(start = 10.dp),
                    fontSize = 24.sp
                )
                Text(
                    text = "Financial Advisor",
                    modifier = Modifier
                        .padding(start = 10.dp),
                    fontSize = 20.sp
                )
                Text(
                    text = "London, Uk",
                    modifier = Modifier
                        .padding(start = 10.dp),
                    fontSize = 20.sp
                )
            }
            Column {
                HorizontalDivider()
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "5.0 Rated by Clients\n Around Globe"
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.north_east),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .size(30.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color.Black)
                            .padding(5.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun CenterTab2() {
    Column() {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SocialagentappTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Greeting(Modifier.padding(innerPadding))
        }
    }
}