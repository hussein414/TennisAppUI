package com.example.tennisappui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tennisappui.R
import com.example.tennisappui.model.TrainTennisModel

@Composable
fun TrainItem(trainTennisModel: TrainTennisModel) {
    Row(
        modifier = Modifier
            .padding(vertical = 10.dp, horizontal = 15.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.size(40.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = trainTennisModel.image),
                contentDescription = null, contentScale = ContentScale.Crop
            )

        }
        Spacer(modifier = Modifier.size(8.dp))
        Column(Modifier.padding(start = 10.dp)) {
            Text(
                text = trainTennisModel.title, style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = MaterialTheme.typography.titleLarge.fontSize
                )
            )
            Text(
                text = trainTennisModel.date, style = TextStyle(
                    color = Color.Gray, fontWeight = FontWeight.Medium, fontSize = 12.sp
                ), modifier = Modifier.padding(top = 5.dp)
            )

        }
        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = trainTennisModel.price,
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Test() {
    TrainItem(
        trainTennisModel = TrainTennisModel(
            "yoga & tennis", "Feb 27 |10:00am-11:00", "10$", R.drawable.yoga
        )
    )
}