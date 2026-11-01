package com.github.razertexz

import android.content.Context
import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Space
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.switchmaterial.SwitchMaterial

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(LinearLayout(context)) {
    val name = TextView(context).apply {
        setTextColor(Color.WHITE)
    }

    val switch = SwitchMaterial(context).apply {
    }

    init {
        with(itemView as LinearLayout) {
            addView(name)
            addView(Space(context), LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f))
            addView(switch)
        }
    }
}