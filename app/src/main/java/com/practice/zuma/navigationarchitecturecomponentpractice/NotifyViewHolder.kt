package com.practice.zuma.navigationarchitecturecomponentpractice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotifyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val titleView: TextView = itemView.findViewById(R.id.notifyTitleLabel)
    val bodyView: TextView = itemView.findViewById(R.id.notifyBodyLabel)
    val dateView: TextView = itemView.findViewById(R.id.notifyDateLabel)
}