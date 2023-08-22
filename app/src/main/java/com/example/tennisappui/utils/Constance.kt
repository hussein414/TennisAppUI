package com.example.tennisappui.utils

import com.example.tennisappui.R
import com.example.tennisappui.model.ClubTennisModel
import com.example.tennisappui.model.TrainTennisModel
import com.example.tennisappui.ui.theme.Blue
import com.example.tennisappui.ui.theme.Green
import com.example.tennisappui.ui.theme.Orange

object Constance {
    val Clubs = listOf(
        ClubTennisModel("Clay court \n tennis", Orange, R.drawable.player1),
        ClubTennisModel("Floor \n tennis", Blue, R.drawable.player2),
        ClubTennisModel("Lawn\n tennis", Green, R.drawable.player3),
    )
    val train = listOf(
        TrainTennisModel("yoga and Tennis", "Feb 12 | 15:00Pm-17:00Pm", "30$", R.drawable.yoga),
        TrainTennisModel("Training Tennis", "Sat 13 | 16:00Pm-18:00Pm", "100$", R.drawable.tennis),
        TrainTennisModel("bodybuilding & Tennis", "Mon 15 | 16:00Pm-18:00Pm", "50$", R.drawable.bodybuilding),
        TrainTennisModel("yoga and Tennis", "Feb 12 | 15:00Pm-17:00Pm", "30$", R.drawable.yoga),
        TrainTennisModel("Training Tennis", "Sat 13 | 16:00Pm-18:00Pm", "100$", R.drawable.tennis),
        TrainTennisModel("bodybuilding & Tennis", "Mon 15 | 16:00Pm-18:00Pm", "50$", R.drawable.bodybuilding),
    )
}