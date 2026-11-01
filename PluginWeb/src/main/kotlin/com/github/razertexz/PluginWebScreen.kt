package com.github.razertexz

import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.aliucord.fragments.SettingsPage

class PluginWebScreen : SettingsPage() {
    override fun onViewBound(view: View) {
        super.onViewBound(view)

        setActionBarTitle("Plugin Web")
        setActionBarSubtitle("A quick way to search for Aliucord plugins")
        removeScrollView()

        val items = listOf("Plugin 1", "Plugin 2", "Plugin 3", "Plugin 4", "Plugin 5")

        addView(RecyclerView(view.context).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
                override fun onCreateViewHolder(parent: ViewGroup, type: Int): RecyclerView.ViewHolder = object : RecyclerView.ViewHolder(object : GridLayout(parent.context) {
                    val nameText = TextView(context).apply {
                        addChild(this)
                    }
                }) {}

                override fun onBindViewHolder(holder: RecyclerView.ViewHolder, pos: Int) {
                    holder.itemView.nameText.text = items[pos]
                }

                override fun getItemCount(): Int = items.size
            }
        })
    }
}