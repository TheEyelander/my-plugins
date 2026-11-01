package com.github.razertexz

import android.content.Context

import com.aliucord.Utils
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin

@AliucordPlugin
class PluginWeb : Plugin() {
    override fun start(context: Context) {
        Utils.openPage(context, PluginWebSettings::class.java)
    }

    override fun stop(context: Context) {
        patcher.unpatchAll()
    }
}