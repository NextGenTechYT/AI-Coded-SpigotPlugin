package com.torben.aicodedplugin;

import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class WorldGenerator implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Create a new world with the given settings
        WorldCreator creator = new WorldCreator("flat");
        creator.generateStructures(false);
        creator.type(WorldType.FLAT);
        creator.generator(new ChunkGenerator() {
            // Override the default chunk generator to return empty chunks
            @Override
            public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
                return createChunkData(world);
            }
        });
        creator.createWorld();


        return false;
    }
}
