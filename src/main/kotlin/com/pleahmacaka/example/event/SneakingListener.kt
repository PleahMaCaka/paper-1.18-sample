package com.pleahmacaka.example.event

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerToggleSneakEvent

object SneakingListener : Listener {

    @EventHandler
    fun isPlayerSneaking(event: PlayerToggleSneakEvent) {
        event.player.sendMessage("Sneaking!")
    }

}