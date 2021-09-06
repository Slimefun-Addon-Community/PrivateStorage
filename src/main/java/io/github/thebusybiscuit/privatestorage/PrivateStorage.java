package io.github.thebusybiscuit.privatestorage;

//import org.bstats.bukkit.Metrics;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.privatestorage.storage.PrivateChests;
import io.github.thebusybiscuit.privatestorage.storage.PublicChests;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
//import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
//import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;

public class PrivateStorage extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        //Config cfg = new Config(this);
		
        // Setting up bStats
        //new Metrics(this, 4912);

        /*if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/PrivateStorage/master").start();
        }*/

        ItemGroup itemGroup = new ItemGroup(new NamespacedKey(this, "private_storage"), new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0=")), "&7私人倉庫 - 箱子和保險箱", "", "&a> 點擊開啟"));

        new PublicChests(this, itemGroup);
        new PrivateChests(this, itemGroup);
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimeTraditionalTranslation/PrivateStorage/issues";
    }
}
