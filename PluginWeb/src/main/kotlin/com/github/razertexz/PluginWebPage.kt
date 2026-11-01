package com.github.razertexz

import android.view.View
import com.discord.app.AppFragment

class PluginWebPage : AppFragment() {
    override fun onViewBound(view: View) {
        super.onViewBound(view)

        setActionBarTitle("Plugin Web")
        setActionBarSubtitle("A quick way to search for Aliucord plugins")
        setActionBarDisplayHomeAsUpEnabled(false)
    }
}