package com.github.razertexz

import android.content.Context
import android.view.View

import com.aliucord.Utils
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin
import com.aliucord.patcher.after

import com.discord.widgets.settings.WidgetSettings

@AliucordPlugin
class PluginWeb : Plugin() {
    override fun start(context: Context) {
        patcher.after<WidgetSettings>("onViewBound", View::class.java) {
            Utils.openPage(it.args[0] as View, PluginWebSettings::class.java)
        }
    }

    override fun stop(context: Context) {
        patcher.unpatchAll()
    }
}