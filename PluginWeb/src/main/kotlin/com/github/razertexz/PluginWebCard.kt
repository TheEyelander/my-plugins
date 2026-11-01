package com.github.razertexz

import android.content.Context
import android.widget.FrameLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PluginWebCard(context: Context): RecyclerView.ViewHolder(FrameLayout(context)) {
    val root = (itemView as FrameLayout).apply {
        layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
    }

    val name = TextView(context).apply {
        textSize = 32.0f
        root.addView(this)
    }
}