package com.github.razertexz

import android.content.Context
import android.widget.GridLayout
import android.widget.TextView

import com.lytefast.flexinput.R

class PluginWebCard(context: Context) : GridLayout(context) {
    val title = TextView(context, null, 0, R.i.UiKit_TextView_Semibold).apply {
        addView(this)
    }
}