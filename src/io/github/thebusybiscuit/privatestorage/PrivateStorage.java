package io.github.thebusybiscuit.privatestorage;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.privatestorage.storage.PrivateChests;
import io.github.thebusybiscuit.privatestorage.storage.PublicChests;
import me.mrCookieSlime.CSCoreLibPlugin.PluginUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.CSCoreLibSetup.CSCoreLibLoader;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class PrivateStorage extends JavaPlugin {
	
	public final String prefix = ChatColor.GRAY + "[" + ChatColor.GOLD + "" + ChatColor.BOLD + "PrivateStorage" + ChatColor.GRAY + "] " + ChatColor.RESET;
	
	@Override
	public void onEnable() {
		CSCoreLibLoader loader = new CSCoreLibLoader(this);
		if (loader.load()) {
			PluginUtils utils = new PluginUtils(this);
			
			utils.setupMetrics();
			utils.setupUpdater(69105, getFile());
			
			Category category = null, category2 = null;
			
			try {
				category = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&7Private Storage - Chests and Safes", "", "&a> Click to open"));
				category2 = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUxOWQ4ZTdmYmU3ZjRlNmY0Nzg4OTc2NjJmODYyYWY0YjhmYzg3MmZmMjk4ZmRlZmM4ZDU3ODBkZDU1OTY4OSJ9fX0="), "&7Private Storage - Dust Silos", "", "&a> Click to open"));
				

				new PublicChests(category);
				new PrivateChests(category);
			} catch(Exception x) {
				x.printStackTrace();
			}
		}
	}
	
	public static void applyChestTraits(String id, final int size, String title, final boolean canExplode, final ChestProtectionLevel level) {
		new BlockMenuPreset(id, title) {
			
			@Override
			public void newInstance(BlockMenu arg0, Block arg1) {
			}
			
			@Override
			public void init() {
				setSize(size);
				
				addMenuOpeningHandler(new MenuOpeningHandler() {
					
					@Override
					public void onOpen(Player p) {
						p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.8F, 1.6F);
					}
				});
				
				addMenuCloseHandler(new MenuCloseHandler() {
					
					@Override
					public void onClose(Player p) {
						p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 1.8F, 1.6F);
					}
				});
			}
			
			@Override
			public boolean canOpen(Block b, Player p) {
				if (p.hasPermission("PrivateStorage.bypass")) return true;
				
				switch (level) {
					case PRIVATE:
						return BlockStorage.getLocationInfo(b.getLocation(), "owner").equals(p.getUniqueId().toString());
					default:
						return true;
				}
			}

			@Override
			public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
				if (level.equals(ChestProtectionLevel.PUBLIC)) {
					if (size == 9) return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
					else if (size == 18) return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
					else if (size == 27) return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
					else if (size == 36) return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
					else if (size == 45) return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44};
					else if (size == 54) return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};
				}
				return new int[0];
			}
		};
		
		SlimefunItem.registerBlockHandler(id, new SlimefunBlockHandler() {
			
			@Override
			public void onPlace(Player p, Block b, SlimefunItem item) {
				BlockStorage.addBlockInfo(b, "owner", p.getUniqueId().toString());
			}
			
			@Override
			public boolean onBreak(Player p, Block b, SlimefunItem item, UnregisterReason reason) {
				boolean allow = true;
				if (reason.equals(UnregisterReason.PLAYER_BREAK)) {
					if (!p.hasPermission("PrivateStorage.bypass")) { 
						allow = BlockStorage.getLocationInfo(b.getLocation(), "owner").equals(p.getUniqueId().toString());
					}
				}
				else if (reason.equals(UnregisterReason.EXPLODE)) {
					allow = canExplode;
				}
				
				if (allow) {
					for (int slot = 0; slot < size; slot++) {
						if (BlockStorage.getInventory(b).getItemInSlot(slot) != null) b.getWorld().dropItemNaturally(b.getLocation(), BlockStorage.getInventory(b).getItemInSlot(slot));
					}
				}
				
				return allow;
			}
		});
	}
}
