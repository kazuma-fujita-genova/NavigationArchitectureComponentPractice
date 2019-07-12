package com.practice.zuma.navigationarchitecturecomponentpractice

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> { return CardPageFragment() }
            else ->  { return CardPageFragment() }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> { return "tab_01" }
            else ->  { return "tab_02" }
        }
    }

    override fun getCount(): Int {
        return 2
    }
}

