package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

import com.aliucord.utils.DimenUtils
import com.discord.utilities.color.ColorCompat
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : CardView(context) {
    init {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        setCardBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))

        addView(LinearLayout(context).apply {
            setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondaryAlt))
        }, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
    }
}