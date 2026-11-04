package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout

import com.discord.utilities.color.ColorCompat
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : LinearLayout(context) {
    init {
        orientation = VERTICAL
        setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))
    }
}