package me.esavojt.parkour;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;

public final class Parkour extends JavaPlugin {

    public HashMap<Player, ParkourState> parkourPlayers = new HashMap<>();
    public HashMap<Player, BukkitRunnable> players = new HashMap<>();
    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getLogger().info("Parkour was loaded");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
