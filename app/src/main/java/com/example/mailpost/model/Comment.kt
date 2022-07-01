package com.example.mailpost.model

data class Comment(
    val id: Int,
    val letterId: Int,
    val content: String,
    val timeInMills: Double,
)
