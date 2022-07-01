package com.example.mailpost.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mailpost.R
import com.example.mailpost.databinding.ActivityMainBinding
import com.example.mailpost.ui.home.HomeFragment
import com.example.mailpost.ui.letterbox.LetterBoxFragment
import com.example.mailpost.ui.message.MessageFragment
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
                    .replace(R.id.nav_host_fragment, MessageFragment()).commitAllowingStateLoss()
            }
            R.id.navigation_box -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, LetterBoxFragment()).commitAllowingStateLoss()
            }
        }

        return true
    }
}
