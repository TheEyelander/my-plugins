package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView

import com.discord.utilities.color.ColorCompat
import com.google.android.material.switchmaterial.SwitchMaterial
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : LinearLayout(context) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)
    val toggle = SwitchMaterial(context)
    val description = TextView(context, null, 0, R.i.UiKit_TextView_Subtext)

    init {
        orientation = VERTICAL
        layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))

        addView(LinearLayout(context).apply {
            addView(title.apply {
                textSize = 16.0f
            }, LayoutParams(0, WRAP_CONTENT, 1f))
 
            addView(toggle)
        })

        addView(description)
    }
}