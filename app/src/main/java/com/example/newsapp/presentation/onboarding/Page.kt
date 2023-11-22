package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "News App",
        description = "Be the first to know with our real-time news updates. Receive instant notifications for breaking stories, ensuring you never miss a crucial moment.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "News App",
        description = "Be the first to know with our real-time news updates. Receive instant notifications for breaking stories, ensuring you never miss a crucial moment.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "News App",
        description = "Be the first to know with our real-time news updates. Receive instant notifications for breaking stories, ensuring you never miss a crucial moment.",
        image = R.drawable.onboarding3
    )
)