package com.github.razertexz

import android.content.Context
import android.graphics.Color
import android.widget.GridLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(GridLayout(context)) {
    val name = TextView(context).apply {
        setTextColor(Color.WHITE)
    }

    init {
        with(itemView as GridLayout) {
            rowCount = 2
            columnCount = 2

            addView(name)
        }
    }
}