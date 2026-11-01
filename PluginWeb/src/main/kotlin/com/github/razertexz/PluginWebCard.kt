package com.github.razertexz

import android.content.Context
import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(LinearLayout(context)) {
    val name = TextView(context).apply {
        setTextColor(Color.WHITE)
    }

    val description = TextView(context).apply {
        text = "This is a description"
        setTextColor(Color.WHITE)
    }

    init {
        with(itemView as LinearLayout) {
            addView(name)
            addView(description)
        }
    }
}