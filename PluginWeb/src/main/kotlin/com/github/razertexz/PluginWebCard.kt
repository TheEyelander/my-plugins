package com.github.razertexz

import android.content.Context
import android.widget.FrameLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

import com.aliucord.utils.DimenUtils
import com.discord.utilities.color.ColorCompat
import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : RecyclerView.ViewHolder(CardView(context)) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold)

    init {
        with(itemView as CardView) {
            layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT).apply {
                topMargin = DimenUtils.defaultPadding / 2
            }

            radius = DimenUtils.defaultCardRadius.toFloat()
            setCardBackgroundColor(ColorCompat.getThemedColor(context, R.b.colorBackgroundSecondary))

            addView(title)
        }
    }
}