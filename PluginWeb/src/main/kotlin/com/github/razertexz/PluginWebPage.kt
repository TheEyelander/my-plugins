package com.github.razertexz

import android.view.View

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.aliucord.fragments.SettingsPage

private class PluginWebPage : SettingsPage() {
    override fun onViewBound(view: View) {
        super.onViewBound(view)

        setActionBarTitle("Plugin Web")
        setActionBarSubtitle("A quick way to search for Aliucord plugins")
        removeScrollView()

        addView(RecyclerView(view.context).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {}
        })
    }
}