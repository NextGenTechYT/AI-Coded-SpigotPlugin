package com.torben.aicodedplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PunchBow implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ItemStack bow = new ItemStack(Material.BOW);

        ItemMeta meta = bow.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Punch 10 Bow");
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 10, true);
        bow.setItemMeta(meta);

        player.getInventory().addItem(bow);
    }
}

