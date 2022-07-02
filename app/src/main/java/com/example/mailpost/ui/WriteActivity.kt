package com.example.mailpost.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mailpost.R
import com.example.mailpost.databinding.ActivityWriteBinding
import com.example.mailpost.model.Letter
import com.example.mailpost.ui.utils.cnt
import com.example.mailpost.ui.utils.pub
import com.example.mailpost.ui.utils.pubcnt

class WriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            backIb.setOnClickListener {
                intent = Intent(this@WriteActivity, MainActivity::class.java)
                startActivity(intent)
            }

            pubCb.setOnCheckedChangeListener { buttonView, isChecked ->
                pub = isChecked
            }

            doneIb.setOnClickListener {

                intent = Intent(this@WriteActivity, MainActivity::class.java)

                intent.putExtra("title", titleEt.text.toString())
                intent.putExtra("content", contentEt.text.toString())
                intent.putExtra("from", fromEt.text.toString())
                intent.putExtra("to", toEt.text.toString())

                if(pub) {
                    pubcnt++
                    cnt++
                }
                else { cnt++ }

                startActivity(intent)
            }


        }

    }

}