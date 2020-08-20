package me.esavojt.parkour;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class onPlayerJoin implements Listener {
    private Parkour main;

    public onPlayerJoin(Parkour main) {
        this.main = main;
    }
    @EventHandler
    public onJoin(PlayerJoinEvent e){
        BukkitRunnable b = new BukkitRunnable() {
            Player p = e.getPlayer();
            @Override
            public void run() {
                if(p.getLocation().subtract(0,1,1).getBlock().getType() == Material.GOLD_BLOCK){
                    if(main.parkourPlayers.containsKey(p)){
                        ParkourState ps = main.parkourPlayers.get(p);
                        Configuration config = main.getConfig();
                        int noCheckpoints = config.getInt("nocheckpoints");

                    }else {
                        main.parkourPlayers.put(p, new ParkourState(true, 0));
                    }
                }
            }
        }
        main.players.put(e.getPlayer())

    }
}
