package com.example.mailpost.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mailpost.R
import com.example.mailpost.databinding.ActivityLetterDetailBinding

class LetterDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLetterDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_letter_detail)

        with(binding) {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayShowTitleEnabled(false)
            backBtn.setOnClickListener {
                finish()
            }
        }
    }

}