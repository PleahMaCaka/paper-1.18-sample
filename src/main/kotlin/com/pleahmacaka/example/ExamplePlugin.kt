package com.pleahmacaka.example

import com.pleahmacaka.example.event.SneakingListener
import net.md_5.bungee.api.ChatColor
import org.bukkit.command.ConsoleCommandSender
import org.bukkit.plugin.java.JavaPlugin

val sender: ConsoleCommandSender = JavaPlugin.getPlugin(ExamplePlugin::class.java).server.consoleSender

class ExamplePlugin : JavaPlugin() {
    /**
     * @author PleahMaCaka
     */

    override fun onEnable() {
        sender.sendMessage("${ChatColor.AQUA}!!!Example Plugin is Enabled!!!")

        val listeners = listOf(SneakingListener)
        listeners.forEach { server.pluginManager.registerEvents(it, this) }
    }

}