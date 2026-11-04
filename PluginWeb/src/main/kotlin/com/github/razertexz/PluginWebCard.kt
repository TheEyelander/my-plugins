package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView

import com.discord.utilities.color.ColorCompat
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : LinearLayout(context) {
    init {
        orientation = VERTICAL
        //layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        //setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))

        addView(TextView(context).apply {
            text = "Hello!"
            setTextColor(android.graphics.Color.RED)
        })
    }
}