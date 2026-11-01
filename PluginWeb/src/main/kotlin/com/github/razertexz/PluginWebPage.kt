package com.github.razertexz

import android.view.View
import com.aliucord.fragments.SettingsPage

class PluginWebPage : SettingsPage() {
    override fun onViewBound(view: View) {
        super.onViewBound(view)

        setActionBarTitle("Plugin Web")
        setActionBarSubtitle("A quick way to search for Aliucord plugins")
        removeScrollView()
    }
}