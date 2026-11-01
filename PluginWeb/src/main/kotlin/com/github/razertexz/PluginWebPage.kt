package com.github.razertexz

import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.aliucord.fragments.SettingsPage

class PluginWebPage : SettingsPage() {
    override fun onViewBound(view: View) {
        super.onViewBound(view)

        setActionBarTitle("Plugin Web")
        setActionBarSubtitle("A quick way to search for Aliucord plugins")
        removeScrollView()

        val items = listOf("Plugin 1", "Plugin 2", "Plugin 3", "Plugin 4", "Plugin 5")

        addView(RecyclerView(view.context).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = object : RecyclerView.Adapter<PluginWebCard>() {
                override fun onCreateViewHolder(parent: ViewGroup, type: Int) {
                    return PluginWebCard(parent.context)
                }

                override fun onBindViewHolder(card: PluginWebCard, pos: Int) {
                    card.name.text = items[pos]
                }

                override fun getItemCount() {
                    return items.size
                }
            }
        })
    }
}