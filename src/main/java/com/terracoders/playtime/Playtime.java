package com.terracoders.playtime;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
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

	public void onPlayerJoinEvent(Player playerJoined) {
		//DIAMOND CHEAT -- IF USER HOLDING DIAMOND MATERIAL OBJECT IN MAIN HAND
		//ALL ARMOR BECOMES DIAMOND ARMOR
	    Player player = playerJoined.getPlayer();
	    PlayerInventory inventory = player.getInventory();
	    ItemStack itemstack = new ItemStack(Material.DIAMOND, 64);
	    inventory.addItem(itemstack);
	    player.sendMessage("Diamonds for your journey!");

	}


}
