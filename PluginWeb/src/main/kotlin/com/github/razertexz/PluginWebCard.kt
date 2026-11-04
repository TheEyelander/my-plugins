package com.github.razertexz

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Switch
import androidx.cardview.widget.CardView

import com.aliucord.utils.DimenUtils
import com.discord.utilities.color.ColorCompat
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : CardView(context) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)
    val toggle = Switch(context)
    val description = TextView(context, null, 0, R.i.UiKit_TextView_Subtext)
    
    init {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        setCardBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))

        addView(LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL

            addView(LinearLayout(context).apply {
                setBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondaryAlt))

                addView(title.apply {
                    text = "Test"
                }, LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f))

                addView(toggle)
            }, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))

            addView(description.apply {
                text = "Test"
            })
        }, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
    }
}