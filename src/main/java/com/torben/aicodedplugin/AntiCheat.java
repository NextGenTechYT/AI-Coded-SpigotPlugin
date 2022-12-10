package com.torben.aicodedplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCheat extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register the "PlayerMove" event listener.
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        // Get the player who moved.
        Player player = event.getPlayer();

        // Check if the player is moving too quickly.
        if (player.getVelocity().length() > 1.5) {
            // Kick the player for cheating.
            player.kickPlayer("Cheating is not allowed on this server!");
        }
    }
}
