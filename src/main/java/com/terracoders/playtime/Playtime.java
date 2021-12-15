package com.terracoders.playtime;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Playtime extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Playtime Plugin has been enabled!");
	}
	@Override
	public void onDisable() {
		getLogger().info("Playtime Plugin has been disabled");
	}
	public void onPlayerInteractBlock(PlayerInteractEvent event) {
	    Player player = event.getPlayer();
	    if (player.getItemInHand().getType() == Material.BONE) {
	        // Creates a bolt of lightning at a given location. In this case, that location is where the player is looking.
	        // Can only create lightning up to 200 blocks away.
	        player.getWorld().strikeLightning(player.getTargetBlock((Set<Material>) null, 200).getLocation());
	    }
	}


}
