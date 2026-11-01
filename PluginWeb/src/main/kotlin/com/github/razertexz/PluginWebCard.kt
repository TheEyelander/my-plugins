package com.github.razertexz

import android.content.Context
import android.graphics.Color
import android.widget.GridLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(GridLayout(context)) {
    itemView = itemView as GridLayout

    val name = TextView(context).apply {
        setTextColor(Color.WHITE)
        itemView.addView(this, GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(0)))
    }
}