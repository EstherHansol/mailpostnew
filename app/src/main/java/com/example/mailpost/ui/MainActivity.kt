package com.example.mailpost.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mailpost.R
import com.example.mailpost.databinding.ActivityMainBinding
import com.example.mailpost.ui.home.HomeFragment
import com.example.mailpost.ui.letterbox.LetterBoxFragment
import com.example.mailpost.ui.utils.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        with(binding) {
            navView.setOnNavigationItemSelectedListener(this@MainActivity)
            supportFragmentManager.beginTransaction().add(R.id.nav_host_fragment, HomeFragment())
                .commitAllowingStateLoss()
            writeBtn.setOnClickListener{
                intent = Intent(this@MainActivity, WriteActivity::class.java)
                startActivity(intent)
            }
            val title = intent.getStringExtra("title")
            val content = intent.getStringExtra("content")
            val from = intent.getStringExtra("from")
            val to = intent.getStringExtra("to")



            if(title != null && content != null && from != null && to != null) {
                if (pub) {
                    titleList[cnt] = title
                    contentList[cnt] = content
                    fromList[cnt] = from
                    toList[cnt] = to

                    ptitleList[pubcnt] = title
                    pcontentList[pubcnt] = content
                    pfromList[pubcnt] = from
                    ptoList[pubcnt] = to

                    pub = false
                }
                else
                {
                    titleList[cnt] = title
                    contentList[cnt] = content
                    fromList[cnt] = from
                    toList[cnt] = to
                }
            }


        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_home -> {

                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, HomeFragment()).commitAllowingStateLoss()
            }
            R.id.navigation_message -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, LetterBoxFragment()).commitAllowingStateLoss()
            }
            R.id.navigation_box -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, LetterBoxFragment()).commitAllowingStateLoss()
            }
        }

        return true
    }
}
