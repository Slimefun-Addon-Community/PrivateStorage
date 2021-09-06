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

public class PublicChests {
    
    private SlimefunItemStack chestOak;
    private SlimefunItemStack chestBirch;
    private SlimefunItemStack chestSpruce;
    private SlimefunItemStack chestJungle;
    private SlimefunItemStack chestAcacia;
    private SlimefunItemStack chestDarkOak;
    
    private SlimefunItemStack chestIron;
    private SlimefunItemStack chestGold;
    private SlimefunItemStack chestDiamond;
    private SlimefunItemStack chestEmerald;
    
    private SlimefunItemStack chestObsidian;
    private SlimefunItemStack chestSteel;

    public PublicChests(PrivateStorage plugin, ItemGroup itemGroup) {
        chestOak = new SlimefunItemStack("OAK_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19", "&6Oak chest", getLore(2, false));
        chestBirch = new SlimefunItemStack("BIRCH_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0=", "&6Birch chest", getLore(2, false));
        chestSpruce = new SlimefunItemStack("SPRUCE_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0=", "&6Spruce chest", getLore(2, false));
        chestJungle = new SlimefunItemStack("JUNGLE_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0=", "&6Jungle chest", getLore(2, false));
        chestAcacia = new SlimefunItemStack("ACACIA_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0=", "&6Acacia chest", getLore(2, false));
        chestDarkOak = new SlimefunItemStack("DARK_OAK_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0=", "&6Dark Oak chest", getLore(2, false));
        
        chestIron = new SlimefunItemStack("IRON_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0=", "&6Iron chest", getLore(3, false));
        chestGold = new SlimefunItemStack("GOLDEN_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19", "&6Golden chest", getLore(4, false));
        chestDiamond = new SlimefunItemStack("DIAMOND_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0=", "&6Diamond chest", getLore(5, false));
        chestEmerald = new SlimefunItemStack("EMERALD_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ==", "&6Emerald chest", getLore(6, false));
        
        chestObsidian = new SlimefunItemStack("OBSIDIAN_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19", "&6Obsidian chest", getLore(4, true));
        chestSteel = new SlimefunItemStack("STEEL_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0=", "&6Steel chest", getLore(5, true));
        
        registerItems(plugin, itemGroup);
        registerResearches(plugin);
    }
    
    private String[] getLore(int size, boolean explosions) {
        if (explosions) {
            return new String[] {
                "&7Size: &e" + size + "x9",
                "&bWithstands Explosions",
                "", 
                "&rThis Chest can be opened by anyone", 
                "&rwho can open Chests in your Area"
            };
        }
        else {
            return new String[] {
                "&7Size: &e" + size + "x9",
                "", 
                "&rThis Chest can be opened by anyone", 
                "&rwho can open Chests in your Area"
            };
        }
    }

    public void registerItems(PrivateStorage plugin, ItemGroup itemGroup) {
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, itemGroup, chestOak, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, itemGroup, chestBirch, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
    
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, itemGroup, chestSpruce, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
    
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, itemGroup, chestJungle, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, itemGroup, chestAcacia, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, itemGroup, chestDarkOak, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
        
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 27, true, itemGroup, chestIron, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
                
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 36, true, itemGroup, chestGold, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, chestIron, SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
                
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 45, true, itemGroup, chestDiamond, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DIAMOND), chestGold, new ItemStack(Material.DIAMOND), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
                
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 54, true, itemGroup, chestEmerald, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.EMERALD), chestDiamond, new ItemStack(Material.EMERALD), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
                
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 36, false, itemGroup, chestObsidian, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), chestIron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
                
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 45, false, itemGroup, chestSteel, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, chestObsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET)})
        .register(plugin);
    }

    public void registerResearches(PrivateStorage plugin) {
        new Research(new NamespacedKey(plugin, "wooden_chests"), 606, "Top Tier Storage", 20).addItems(chestOak, chestBirch, chestSpruce, chestJungle, chestAcacia, chestDarkOak).register();
        new Research(new NamespacedKey(plugin, "metal_chests"), 608, "Improved Storage", 16).addItems(chestIron, chestGold, chestDiamond, chestEmerald).register();
        new Research(new NamespacedKey(plugin, "hardened_chests"), 607, "Hardened Storage", 24).addItems(chestObsidian, chestSteel).register();
    }

}
