package com.example.tennisappui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tennisappui.model.ClubTennisModel
import com.example.tennisappui.utils.Constance

@Composable
fun ClubItems(clubTennisModel: ClubTennisModel) {
    Box(
        Modifier
            .clip(shape = RoundedCornerShape(30.dp))
            .background(clubTennisModel.color)
            .size(width = 280.dp, height = 350.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .padding(start = 20.dp)
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.width(150.dp)) {
                Text(
                    modifier = Modifier.padding(bottom = 10.dp),
                    text = clubTennisModel.title,
                    color = Color.White,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Bold
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.textButtonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "ALL Levels", color = Color.Black)
                }
                Spacer(modifier = Modifier.height(150.dp))

                Text(
                    text = "2 Event",
                    color = Color.White,
                    fontSize = MaterialTheme.typography.labelLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 50.dp)
                )
            }

            Image(
                painter = painterResource(id = clubTennisModel.image),
                contentDescription = "iamge",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
