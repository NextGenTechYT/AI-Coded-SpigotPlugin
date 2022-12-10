package com.torben.aicodedplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class OPSword implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("op_sword")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                // Create a new sword
                ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

                // Add enchantments to the sword
                sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1000);
                sword.addEnchantment(Enchantment.FIRE_ASPECT, 1);
                sword.addEnchantment(Enchantment.KNOCKBACK, 2);
                sword.addUnsafeEnchantment(Enchantment.DURABILITY, 1000);
                sword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 1000);

                // Set the sword's display name
                ItemMeta meta = sword.getItemMeta();
                meta.setDisplayName(ChatColor.GOLD + "OP Sword");
                sword.setItemMeta(meta);

                // Give the player the sword
                player.getInventory().addItem(sword);

                // Send a confirmation message to the player
                player.sendMessage(ChatColor.GOLD + "You have been given an overpowered sword!");

                return true;
            }
        }
        return false;
    }
}
