package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(LinearLayout(context)) {
    val root = itemView as LinearLayout
    val name = TextView(context).apply {
        textSize = 32.0f
        setTextColor(android.graphics.Color.RED

        root.addView(this)
    }
}