package com.github.razertexz

import android.content.Context
import android.widget.FrameLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context): RecyclerView.ViewHolder(FrameLayout(context)) {
    val name = TextView(context).apply {
        (itemView as FrameLayout).addView(this)
    }
}