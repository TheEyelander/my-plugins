package com.github.razertexz

import android.content.Context
import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.switchmaterial.SwitchMaterial

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(LinearLayout(context).apply {
    addView(name)
    addView(switch)
}) {
    val name = TextView(context).apply {
        setTextColor(Color.WHITE)
    }

    val switch = SwitchMaterial(context)

    /*init {
        with(itemView as LinearLayout) {
            addView(name)
            addView(switch)
        }
    }*/
}