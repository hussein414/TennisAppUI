@file:Suppress("UNUSED_EXPRESSION")

package com.example.tennisappui.page

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tennisappui.utils.Constance


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@ExperimentalMaterial3Api
@Preview(showSystemUi = true)
fun HomePageScreen() {
    Scaffold(modifier = Modifier.background(Color.White), topBar = {
        TopAppBar(modifier = Modifier.padding(20.dp), navigationIcon = {
            IconButton(modifier = Modifier
                .clip(shape = RoundedCornerShape(25))
                .background(Color.Black),
                onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menu Icon",
                    tint = Color.White
                )
            }

        }, title = { Text(text = "") })
    }, content = {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(start = 24.dp)
        ) {
            Text(
                text = "CLUBS", style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = MaterialTheme.typography.titleLarge.fontSize
                ), modifier = Modifier.padding(bottom = 20.dp)
            )
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(Constance.Clubs) { clubs ->
                    ClubItems(clubTennisModel = clubs)
                }
            }

            Spacer(modifier = Modifier.size(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Trains", style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    ), modifier = Modifier.padding(bottom = 20.dp)
                )

                Text(
                    text = "Alles", style = TextStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    ), modifier = Modifier.padding(bottom = 20.dp)
                )
            }
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(Constance.train){
                    TrainItem(trainTennisModel = it)
                }
            }
        }
    })
}