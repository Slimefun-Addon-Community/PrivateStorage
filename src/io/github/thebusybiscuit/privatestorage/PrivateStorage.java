package io.github.thebusybiscuit.privatestorage;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.cscorelib2.config.Config;
import io.github.thebusybiscuit.cscorelib2.updater.BukkitUpdater;
import io.github.thebusybiscuit.cscorelib2.updater.GitHubBuildsUpdater;
import io.github.thebusybiscuit.cscorelib2.updater.Updater;
import io.github.thebusybiscuit.privatestorage.storage.PrivateChests;
import io.github.thebusybiscuit.privatestorage.storage.PublicChests;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.Category;

public class PrivateStorage extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Config cfg = new Config(this);

		// Setting up bStats
		new Metrics(this);

		// Setting up the Auto-Updater
		Updater updater;

		if (!getDescription().getVersion().startsWith("DEV - ")) {
			// We are using an official build, use the BukkitDev Updater
			updater = new BukkitUpdater(this, getFile(), 69105);
		}
		else {
			// If we are using a development build, we want to switch to our custom 
			updater = new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/PrivateStorage/master");
		}
		
		// Only run the Updater if it has not been disabled
		if (cfg.getBoolean("options.auto-update")) updater.start();
		
		Category category = null;
		
		try {
			category = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&7Private Storage - Chests and Safes", "", "&a> Click to open"));
			
			new PublicChests(category);
			new PrivateChests(category);
		} catch(Exception x) {
			x.printStackTrace();
		}
	}
}
