package com.practice.zuma.navigationarchitecturecomponentpractice

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NotifyRecyclerAdapter(private val list: List<NotifyItemEntity>, private val listener: ListListener) : RecyclerView.Adapter<NotifyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifyViewHolder {
        Log.d("Adapter", "onCreateViewHolder")
        val rowView: View = LayoutInflater.from(parent.context).inflate(R.layout.notify_list_item, parent, false)
        return NotifyViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: NotifyViewHolder, position: Int) {
        Log.d("Adapter", "onBindViewHolder")
        holder.titleView.text = list[position].title
        holder.bodyView.text = list[position].body
        holder.dateView.text = list[position].notifyDate
        holder.itemView.setOnClickListener {
            listener.onClickRow(it, list[position])
        }
    }

    override fun getItemCount(): Int {
        Log.d("Adapter", "getItemCount")
        return list.size
    }

    interface ListListener {
        fun onClickRow(tappedView: View, rowModel: NotifyItemEntity)
    }
}
