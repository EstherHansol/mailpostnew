package com.example.mailpost.model

import java.io.Serializable

data class Letter(
    var title: String,
    var content: String,
    var from: String,
    var to: String,
    var comments: List<Comment> = emptyList(),
    var present: Present? = null
): Serializable {

}
