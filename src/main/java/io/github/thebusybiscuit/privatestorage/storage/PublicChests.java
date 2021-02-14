package io.github.thebusybiscuit.privatestorage.storage;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.privatestorage.ChestProtectionLevel;
import io.github.thebusybiscuit.privatestorage.PrivateStorage;
import io.github.thebusybiscuit.privatestorage.SlimefunChest;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

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

    public PublicChests(PrivateStorage plugin, Category category) {
        chestOak = new SlimefunItemStack("OAK_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19", "&6橡木箱", getLore(2, false));
        chestBirch = new SlimefunItemStack("BIRCH_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0=", "&6樺木箱", getLore(2, false));
        chestSpruce = new SlimefunItemStack("SPRUCE_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0=", "&6杉木箱", getLore(2, false));
        chestJungle = new SlimefunItemStack("JUNGLE_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0=", "&6叢林木箱", getLore(2, false));
        chestAcacia = new SlimefunItemStack("ACACIA_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0=", "&6相思木箱", getLore(2, false));
        chestDarkOak = new SlimefunItemStack("DARK_OAK_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0=", "&6黑橡木箱", getLore(2, false));

        chestIron = new SlimefunItemStack("IRON_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0=", "&6鐵箱", getLore(3, false));
        chestGold = new SlimefunItemStack("GOLDEN_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19", "&6金箱", getLore(4, false));
        chestDiamond = new SlimefunItemStack("DIAMOND_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0=", "&6鑽石箱", getLore(5, false));
        chestEmerald = new SlimefunItemStack("EMERALD_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ==", "&6綠寶石箱", getLore(6, false));

        chestObsidian = new SlimefunItemStack("OBSIDIAN_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19", "&6黑曜石箱", getLore(4, true));
        chestSteel = new SlimefunItemStack("STEEL_CHEST", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0=", "&6鋼箱", getLore(5, true));

        registerItems(plugin, category);
        registerResearches(plugin);
    }

    private String[] getLore(int size, boolean explosions) {
        if (explosions) {
            return new String[] {
                    "&7大小: &e" + size + "x9",
                    "&b可抗爆炸",
                    "",
                    "&r此箱子可以被你所在的區域內",
                    "&r可以打開箱子的人打開"
            };
        }
        else {
            return new String[] {
                    "&7大小: &e" + size + "x9",
                    "",
                    "&r此箱子可以被你所在的區域內",
                    "&r可以打開箱子的人打開"
            };
        }
    }

    public void registerItems(PrivateStorage plugin, Category category) {
        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestOak, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestBirch, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestSpruce, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestJungle, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestAcacia, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestDarkOak, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 27, true, category, chestIron, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 36, true, category, chestGold, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, chestIron, SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 45, true, category, chestDiamond, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DIAMOND), chestGold, new ItemStack(Material.DIAMOND), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 54, true, category, chestEmerald, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.EMERALD), chestDiamond, new ItemStack(Material.EMERALD), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 36, false, category, chestObsidian, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), chestIron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);

        new SlimefunChest(ChestProtectionLevel.PUBLIC, 45, false, category, chestSteel, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, chestObsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET)})
                .register(plugin);
    }

    public void registerResearches(PrivateStorage plugin) {
        new Research(new NamespacedKey(plugin, "wooden_chests"), 606, "高級儲存", 20).addItems(chestOak, chestBirch, chestSpruce, chestJungle, chestAcacia, chestDarkOak).register();
        new Research(new NamespacedKey(plugin, "metal_chests"), 608, "更加好的儲存", 16).addItems(chestIron, chestGold, chestDiamond, chestEmerald).register();
        new Research(new NamespacedKey(plugin, "hardened_chests"), 607, "硬化儲存", 24).addItems(chestObsidian, chestSteel).register();
    }

}
