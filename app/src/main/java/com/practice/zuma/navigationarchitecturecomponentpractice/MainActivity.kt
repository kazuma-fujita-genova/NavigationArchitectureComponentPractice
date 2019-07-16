package com.practice.zuma.navigationarchitecturecomponentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    //val navController: NavController by lazy { findNavController(R.id.main_nav_host) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val isLogin = true
//        if (isLogin) {
//
//            bottom_nav_view.visibility = View.VISIBLE
//            // TabLayout
//            //pager.adapter = TabAdapter(supportFragmentManager)
//            //tab_layout.setupWithViewPager(pager)
//
//            val navController = findNavController(R.id.main_nav_host)
//            // ActionBarを連動させる
////        val appBarConfiguration = AppBarConfiguration(navController.graph)
////        setupActionBarWithNavController(navController, appBarConfiguration)
//            findViewById<BottomNavigationView>(R.id.bottom_nav_view)?.apply {
//                setupWithNavController(navController)
//            }
//        }
//        else {
//            bottom_nav_view.visibility = View.GONE
//        }
    }

    // override fun onSupportNavigateUp() = findNavController(R.id.main_nav_host).navigateUp()
}
