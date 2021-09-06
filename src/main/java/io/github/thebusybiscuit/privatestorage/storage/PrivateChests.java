package io.github.thebusybiscuit.privatestorage.storage;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.privatestorage.ChestProtectionLevel;
import io.github.thebusybiscuit.privatestorage.PrivateStorage;
import io.github.thebusybiscuit.privatestorage.SlimefunChest;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class PrivateChests {

    private SlimefunItemStack safeOak;
    private SlimefunItemStack safeBirch;
    private SlimefunItemStack safeSpruce;
    private SlimefunItemStack safeJungle;
    private SlimefunItemStack safeAcacia;
    private SlimefunItemStack safeDarkOak;

    private SlimefunItemStack safeIron;
    private SlimefunItemStack safeGold;
    private SlimefunItemStack safeDiamond;
    private SlimefunItemStack safeEmerald;

    private SlimefunItemStack safeObsidian;
    private SlimefunItemStack safeSteel;

    public PrivateChests(PrivateStorage plugin, ItemGroup itemGroup) {
        safeOak = new SlimefunItemStack("PRIVATE_SAFE_OAK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19", "&6橡木保險箱", getLore(2, false));
        safeBirch = new SlimefunItemStack("PRIVATE_SAFE_BIRCH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0=", "&6樺木保險箱", getLore(2, false));
        safeSpruce = new SlimefunItemStack("PRIVATE_SAFE_SPRUCE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0=", "&6杉木保險箱", getLore(2, false));
        safeJungle = new SlimefunItemStack("PRIVATE_SAFE_JUNGLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0=", "&6叢林木保險箱", getLore(2, false));
        safeAcacia = new SlimefunItemStack("PRIVATE_SAFE_ACACIA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0=", "&6相思木保險箱", getLore(2, false));
        safeDarkOak = new SlimefunItemStack("PRIVATE_SAFE_DARK_OAK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0=", "&6黑橡木保險箱", getLore(2, false));
        
        safeIron = new SlimefunItemStack("PRIVATE_SAFE_IRON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0=", "&6鐵保險箱", getLore(3, false));
        safeGold = new SlimefunItemStack("PRIVATE_SAFE_GOLD", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19", "&6金保險箱", getLore(4, false));
        safeDiamond = new SlimefunItemStack("PRIVATE_SAFE_DIAMOND", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0=", "&6鑽石保險箱", getLore(5, false));
        safeEmerald = new SlimefunItemStack("PRIVATE_SAFE_EMERALD", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ==", "&6綠寶石保險箱", getLore(6, false));
        
        safeObsidian = new SlimefunItemStack("PRIVATE_SAFE_OBSIDIAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19", "&6黑曜石保險箱", getLore(4, true));
        safeSteel = new SlimefunItemStack("PRIVATE_SAFE_STEEL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0=", "&6鋼保險箱", getLore(5, true));
        
        registerItems(plugin, itemGroup);
        registerResearches(plugin);
    }

    private String[] getLore(int size, boolean explosions) {
        if (explosions) {
            return new String[] {
                    "&7大小: &e" + size + "x9",
                    "&b可抗爆炸",
                    "",
                    "&r此箱子只能被你開啟"
            };
        }
        else {
            return new String[] {
                    "&7大小: &e" + size + "x9",
                    "",
                    "&r此箱子只能被你開啟"
            };
        }
    }

    public void registerItems(PrivateStorage plugin, ItemGroup itemGroup) {
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, itemGroup, safeOak, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, itemGroup, safeBirch, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, itemGroup, safeSpruce, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, itemGroup, safeJungle, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, itemGroup, safeAcacia, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, itemGroup, safeDarkOak, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 27, true, itemGroup, safeIron, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 36, true, itemGroup, safeGold, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, safeIron, SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 45, true, itemGroup, safeDiamond, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DIAMOND), safeGold, new ItemStack(Material.DIAMOND), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 54, true, itemGroup, safeEmerald, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.EMERALD), safeDiamond, new ItemStack(Material.EMERALD), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 36, false, itemGroup, safeObsidian, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), safeIron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PRIVATE, 45, false, itemGroup, safeSteel, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, safeObsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET)})
        .register(plugin);
    }

    public void registerResearches(PrivateStorage plugin) {
        new Research(new NamespacedKey(plugin, "wooden_safes"), 609, "魔法儲存", 8).addItems(safeOak, safeBirch, safeSpruce, safeJungle, safeAcacia, safeDarkOak).register();
        new Research(new NamespacedKey(plugin, "metal_safes"), 610, "更好的魔法儲存", 16).addItems(safeIron, safeGold, safeDiamond).register();
        new Research(new NamespacedKey(plugin, "gem_safes"), 611, "頂級魔法儲存", 20).addItems(safeEmerald).register();
        new Research(new NamespacedKey(plugin, "hardened_safes"), 612, "魔法硬化儲存", 24).addItems(safeObsidian, safeSteel).register();
    }

}
