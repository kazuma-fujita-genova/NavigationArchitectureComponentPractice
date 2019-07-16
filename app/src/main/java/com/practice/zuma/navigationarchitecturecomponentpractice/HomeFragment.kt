package com.practice.zuma.navigationarchitecturecomponentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val pager = view.findViewById<ViewPager>(R.id.pager)
        pager.adapter = TabAdapter(childFragmentManager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(pager)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: ログイン判定をしてnavigate出し分け
        val isLogin = true
        when(isLogin) {
            true -> {
                val navController = findNavController()
                bottom_nav_view.setupWithNavController(navController)
            }
            false -> {
                findNavController().navigate(R.id.topFragment)
            }
        }
    }
}
