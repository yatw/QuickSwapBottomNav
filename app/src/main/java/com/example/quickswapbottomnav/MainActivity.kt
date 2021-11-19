package com.example.quickswapbottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // connect the bottomNavigationView with the navigation graph

        // How to set BottomNavigationView inside Fragment
        //https://stackoverflow.com/questions/65375389/how-to-set-bottomnavigationview-inside-fragment
        val navFragment = supportFragmentManager.findFragmentById(R.id.content_nav_host) as NavHostFragment

        val navController = navFragment.findNavController()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setupWithNavController(navController)
    }
}