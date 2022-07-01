package com.example.mailpost.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mailpost.R
import com.example.mailpost.databinding.ItemLetterBoxBinding
import com.example.mailpost.model.Letter

class LetterBoxRvAdapter(private val context: Context, private var letterList: ArrayList<Letter>) :
    RecyclerView.Adapter<LetterBoxRvAdapter.LetterBoxViewHolder>() {

    inner class LetterBoxViewHolder(private val binding: ItemLetterBoxBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Letter) {
            with(binding) {
                val fromToText = context.getString(R.string.from_to, item.from, item.to)

                titleTv.text = item.title
                contentTv.text = item.content
                fromToTv.text = fromToText

                // 해당 편지에 유저간 쪽지 기록이 있다면 시각화
                if (item.comments.isNotEmpty()) {
                    messageIv.visibility = View.VISIBLE
                    messageCountTv.visibility = View.VISIBLE
                    messageCountTv.text = item.comments.size.toString()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterBoxViewHolder {
        val binding: ItemLetterBoxBinding =
            ItemLetterBoxBinding.inflate(LayoutInflater.from(parent.context))
        return LetterBoxViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LetterBoxViewHolder, position: Int) {
        holder.bind(letterList[position])
    }

    override fun getItemCount(): Int {
        return letterList.count()
    }

}