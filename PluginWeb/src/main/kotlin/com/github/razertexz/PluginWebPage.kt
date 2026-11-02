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

        addView(RecyclerView(view.context).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
                override fun onCreateViewHolder(parent: ViewGroup, type: Int): RecyclerView.ViewHolder {
                    return object : RecyclerView.ViewHolder(PluginWebCard(parent.context)) {}
                }

                override fun onBindViewHolder(holder: RecyclerView.ViewHolder, pos: Int) {
                    val card = holder.itemView as PluginWebCard
                    card.title.text = "$pos"
                }

                override fun getItemCount(): Int {
                    return 3
                }
            }
        })
    }
}