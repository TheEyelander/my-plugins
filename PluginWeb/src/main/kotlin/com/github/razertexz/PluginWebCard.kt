package com.github.razertexz

import android.content.Context
import android.widget.GridLayout
import android.widget.TextView

import com.google.android.material.switchmaterial.SwitchMaterial
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : GridLayout(context, null, 0, R.i.UiKit_ViewGroup) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)
    val toggle = SwitchMaterial(context)
    val description = TextView(context, null, 0, R.i.UiKit_TextView_Subtext)

    init {
        columnCount = 2
        title.textSize = 16.0f

        addView(title, GridLayout.LayoutParams(GridLayout.spec(0),GridLayout.spec(0, 1f)))
        addView(toggle, GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(1)))
        addView(description, GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(0, 2)))
    }
}