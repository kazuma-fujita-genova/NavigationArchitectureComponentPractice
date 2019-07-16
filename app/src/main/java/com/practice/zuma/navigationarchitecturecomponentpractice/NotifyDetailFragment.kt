package com.practice.zuma.navigationarchitecturecomponentpractice

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_notify_detail.*


class NotifyDetailFragment : Fragment() {


    private val notifyItemEntity by lazy {
        val args: NotifyDetailFragmentArgs by navArgs()
        args.notifyItemEntity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notify_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("lifeCycle", "onViewCreated")

        notifyTitle.text = notifyItemEntity.title
        notifyBody.text = notifyItemEntity.body
        notifyDate.text = notifyItemEntity.notifyDate
    }
}
