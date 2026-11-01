package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.switchmaterial.SwitchMaterial

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(LinearLayout(context)) {
    val name = TextView(context).apply {
        setTextColor(android.graphics.Color.WHITE)
    }

    val switch = SwitchMaterial(context)

    init {
        with(itemView as LinearLayout) {
            //layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)

            addView(name)
            addView(switch, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT).apply {
                gravity = Gravity.END
            })
        }
    }
}