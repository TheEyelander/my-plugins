package com.github.razertexz

import android.content.Context
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import androidx.cardview.widget.CardView

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(CardView(context)) {
    val title = TextView(context).apply {
        setTextColor(android.graphics.Color.WHITE)
    }

    init {
        with(itemView as CardView) {
            addView(title)
        }
    }
}