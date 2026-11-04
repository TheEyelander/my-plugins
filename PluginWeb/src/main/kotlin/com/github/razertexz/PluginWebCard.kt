package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Switch

import com.aliucord.utils.DimenUtils
import com.discord.utilities.color.ColorCompat
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : LinearLayout(context) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)
    val toggle = Switch(context)
    val description = TextView(context, null, 0, R.i.UiKit_TextView_Subtext)
    
    init {
        orientation = LinearLayout.VERTICAL
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))

        addView(LinearLayout(context).apply {
            setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondaryAlt))

            addView(title.apply {
                text = "Title"
            }, LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f))

            addView(toggle)
        }, layoutParams)

        addView(description.apply {
            text = "Description"
        })
    }
}