package com.github.razertexz

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.aliucord.fragments.SettingsPage
import com.discord.views.CheckedSetting

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
                    return object : RecyclerView.ViewHolder(CheckedSetting(parent.context, null)) {}
                }

                override fun onBindViewHolder(holder: RecyclerView.ViewHolder, pos: Int) {
                    with(holder.itemView as CheckedSetting) {
                        f(CheckedSetting.ViewType.SWITCH)
                        text = "This is the text"
                        subText = "This is the subtext"
                    }
                }

                override fun getItemCount(): Int {
                    return 5
                }
            }
        })
    }
}