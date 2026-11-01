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

    val switch = TextView(context).apply {
        text = "Switch"
        setTextColor(Color.WHITE)
    }

    val authors = TextView(context).apply {
        text = "Authors"
        setTextColor(Color.WHITE)
    }

    val description = TextView(context).apply {
        text = "Description"
        setTextColor(Color.WHITE)
    }

    init {
        with(itemView as GridLayout) {
            rowCount = 2
            columnCount = 2

            addView(name)
            addView(switch)
            addView(authors)
            addView(description)
        }
    }
}