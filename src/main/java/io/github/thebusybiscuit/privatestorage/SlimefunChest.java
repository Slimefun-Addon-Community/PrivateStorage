package io.github.thebusybiscuit.privatestorage;

import java.util.List;
import java.util.Objects;

import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockPlaceHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction;

public class SlimefunChest extends SlimefunItem {

    public SlimefunChest(ChestProtectionLevel level, int size, boolean canExplode, Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        int[] slots = getSlotsArray(size);

        new BlockMenuPreset(getId(), item.getItemMeta().getDisplayName()) {

            @Override
            public void init() {
                setSize(size);
                addMenuOpeningHandler(p -> p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.8F, 1.6F));
                addMenuCloseHandler(p -> p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 1.8F, 1.6F));
            }

            @Override
            public boolean canOpen(Block b, Player p) {
                if (p.hasPermission("PrivateStorage.bypass")) {
                    return true;
                }

                switch (level) {
                    case PRIVATE:
                        return BlockStorage.getLocationInfo(b.getLocation(), "owner").equals(p.getUniqueId().toString());
                    default:
                        return SlimefunPlugin.getProtectionManager().hasPermission(p, b, ProtectableAction.INTERACT_BLOCK);
                }
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                if (level.equals(ChestProtectionLevel.PUBLIC)) {
                    return slots;
                } else {
                    return new int[0];
                }
            }
        };

        addItemHandler(onBlockPlace(), onBlockBreak(size, canExplode));
    }

    private BlockPlaceHandler onBlockPlace() {
        return new BlockPlaceHandler(false) {

            @Override
            public void onPlayerPlace(BlockPlaceEvent e) {
                BlockStorage.addBlockInfo(e.getBlock().getLocation(), "owner", e.getPlayer().getUniqueId().toString());
            }

        };
    }

    private BlockBreakHandler onBlockBreak(int size, boolean canExplode) {
        return new BlockBreakHandler(false, canExplode) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                boolean allow = true;
                Player p = e.getPlayer();
                Block b = e.getBlock();

                if (!p.hasPermission("PrivateStorage.bypass")) {
                    allow = Objects.equals(BlockStorage.getLocationInfo(b.getLocation(), "owner"), p.getUniqueId().toString());
                }

                if (allow) {
                    BlockMenu inv = BlockStorage.getInventory(b);

                    for (int slot = 0; slot < size; slot++) {
                        ItemStack stack = inv.getItemInSlot(slot);

                        if (stack != null && !stack.getType().isAir()) {
                            b.getWorld().dropItemNaturally(b.getLocation(), stack);
                        }
                    }
                } else {
                    e.setCancelled(true);
                }
            }

            @Override
            public void onExplode(Block b, List<ItemStack> drops) {
                BlockMenu inv = BlockStorage.getInventory(b);

                for (int slot = 0; slot < size; slot++) {
                    ItemStack stack = inv.getItemInSlot(slot);

                    if (stack != null && !stack.getType().isAir()) {
                        drops.add(stack);
                    }
                }
            }
        };
    }

    private int[] getSlotsArray(int size) {
        if (size == 9) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        } else if (size == 18) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        } else if (size == 27) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };
        } else if (size == 36) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35 };
        } else if (size == 45) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
        } else if (size == 54) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53 };
        } else {
            return new int[0];
        }
    }

}
