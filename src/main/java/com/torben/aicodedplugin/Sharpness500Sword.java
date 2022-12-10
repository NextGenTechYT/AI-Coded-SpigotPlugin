package com.example.plugins;

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

public class Sharpness500Sword extends JavaPlugin implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta meta = sword.getItemMeta();
            meta.setDisplayName(ChatColor.GOLD + "Sharpness 500 Sword");
            meta.addEnchant(Enchantment.DAMAGE_ALL, 500, true);
            sword.setItemMeta(meta);
            player.getInventory().addItem(sword);
        }
        return true;
    }
}
