package com.github.razertexz

import android.content.Context
import android.view.Gravity
import android.widget.GridLayout
import android.widget.TextView

import com.google.android.material.switchmaterial.SwitchMaterial
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : GridLayout(context, null, 0, R.i.UiKit_ViewGroup) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)
    val toggle = SwitchMaterial(context)
    val description = TextView(context, null, 0, R.i.UiKit_TextView_Subtext)

    init {
        addView(title.apply {
            textSize = 16.0f
        }, GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(0)))

        addView(toggle, GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(1, 1f)).apply {
            setGravity(Gravity.END)
        })

        addView(description, GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(0, 2)))
    }
}