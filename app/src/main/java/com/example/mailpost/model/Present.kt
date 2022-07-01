package com.example.mailpost.model

import android.graphics.Bitmap
import java.io.Serializable

data class Present(
    var photo: Bitmap
) : Serializable {
}