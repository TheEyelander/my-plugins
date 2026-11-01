package com.github.razertexz

import android.content.Context
import android.graphics.Color
import android.widget.GridLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(GridLayout(context)) {
    val root = itemView as GridLayout
    val name = TextView(context).apply {
        setTextColor(Color.WHITE)
        root.addView(this)
    }
}