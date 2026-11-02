package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView

class PluginWebCard(context: Context) : LinearLayout(context) {
    val title = TextView(context).apply {
        setTextColor(android.graphics.Color.RED)
        addView(this)
    }
}