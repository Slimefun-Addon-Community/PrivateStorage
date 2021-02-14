package io.github.thebusybiscuit.privatestorage;

//import org.bstats.bukkit.Metrics;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.privatestorage.storage.PrivateChests;
import io.github.thebusybiscuit.privatestorage.storage.PublicChests;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Objects.Category;
//import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;

public class PrivateStorage extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {

        // Setting up bStats
        //new Metrics(this, 4912);

        /*if (getDescription().getVersion().startsWith("DEV - ")) {
            Updater updater = new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/PrivateStorage/master");
            // Only run the Updater if it has not been disabled
            if (cfg.getBoolean("options.auto-update")) {
                updater.start();
            }
        }*/

        Category category = new Category(new NamespacedKey(this, "private_storage"), new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&7私人倉庫 - 箱子和保險箱", "", "&a> 點擊開啟"));

        new PublicChests(this, category);
        new PrivateChests(this, category);
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/xMikux/PrivateStorage/issues";
    }
}
