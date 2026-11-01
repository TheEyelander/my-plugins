package com.github.razertexz

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.aliucord.fragments.SettingsPage

class PluginWebViewHolder(context: Context) : RecyclerView.ViewHolder(GridLayout(context).apply {
    layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
}) {
    val name = TextView(context).apply {
        (itemView as ViewGroup).addView(this)
    }
}

class PluginWebScreen : SettingsPage() {
    override fun onViewBound(view: View) {
        super.onViewBound(view)

        setActionBarTitle("Plugin Web")
        setActionBarSubtitle("A quick way to search for Aliucord plugins")
        removeScrollView()

        val items = listOf("Plugin 1", "Plugin 2", "Plugin 3", "Plugin 4", "Plugin 5")

        addView(RecyclerView(view.context).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = object : RecyclerView.Adapter<PluginWebViewHolder>() {
                override fun onCreateViewHolder(parent: ViewGroup, type: Int) = PluginWebViewHolder(parent.context)
                override fun onBindViewHolder(holder: PluginWebViewHolder, pos: Int) {
                    holder.name.text = items[pos]
                }

                override fun getItemCount() = items.size
            }
        })
    }
}