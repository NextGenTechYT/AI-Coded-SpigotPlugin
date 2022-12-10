package com.torben.aicodedplugin;

import com.example.plugins.Sharpness500Sword;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new AntiCheat(), this);


        getCommand("sharp500").setExecutor(new Sharpness500Sword());
        getCommand("genworld").setExecutor(new WorldGenerator());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
