package com.example.mailpost.ui.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val count = state.itemCount
        val verticalOffset = 40
//        val horizontalOffset = 12

//        outRect.left = horizontalOffset
//        outRect.right = horizontalOffset

        if (position != 0) {
            outRect.top = verticalOffset
        }
    }
}