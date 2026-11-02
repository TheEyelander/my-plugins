package com.github.razertexz

import android.content.Context
import android.widget.GridLayout
import android.widget.TextView

import com.google.android.material.switchmaterial.SwitchMaterial
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : GridLayout(context) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)
    val toggle = SwitchMaterial(context)
    val description = TextView(context, null, 0, R.i.UiKit_TextView_Subtext)

    init {
        rowCount = 2
        columnCount = 2

        title.textSize = 16.0f

        addView(title)
        addView(toggle)
        addView(description)
    }
}