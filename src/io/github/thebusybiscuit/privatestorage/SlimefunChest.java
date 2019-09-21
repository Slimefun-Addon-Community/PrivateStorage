package io.github.thebusybiscuit.privatestorage;

import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

public class SlimefunChest extends SlimefunItem {

	public SlimefunChest(ChestProtectionLevel level, int size, boolean canExplode, Category category, ItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
		super(category, item, id, recipeType, recipe);
		
		new BlockMenuPreset(id, item.getItemMeta().getDisplayName()) {
			
			@Override
			public void newInstance(BlockMenu arg0, Block arg1) {
				// No need to do anything here
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
						return CSCoreLib.getLib().getProtectionManager().canAccessChest(p.getUniqueId(), b, true);
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
