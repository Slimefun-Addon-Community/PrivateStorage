package io.github.thebusybiscuit.privatestorage.storage;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.privatestorage.ChestProtectionLevel;
import io.github.thebusybiscuit.privatestorage.PrivateStorage;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public class PublicChests {
	
	private ItemStack chest_oak, chest_birch, chest_spruce, chest_jungle, chest_acacia, chest_dark_oak;
	private ItemStack chest_iron, chest_gold, chest_diamond, chest_emerald;
	private ItemStack chest_obsidian, chest_steel;

	public PublicChests(Category category) throws Exception {
		chest_oak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19"), "&6Oak chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_birch = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0="), "&6Birch chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_spruce = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0="), "&6Spruce chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_jungle = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0="), "&6Jungle chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_acacia = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0="), "&6Acacia chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_dark_oak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0="), "&6Dark Oak chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		
		chest_iron = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&6Iron chest", "&7Size: &e3x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_gold = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19"), "&6Golden chest", "&7Size: &e4x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_diamond = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0="), "&6Diamond chest", "&7Size: &e5x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_emerald = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ=="), "&6Emerald chest", "&7Size: &e6x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		
		chest_obsidian = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19"), "&6Obsidian chest", "&7Size: &e4x9", "&bWithstands Explosions", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chest_steel = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0="), "&6Steel chest", "&7Size: &e5x9", "&bWithstands Explosions", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		
		registerItems(category);
		registerResearches();
	}

	public void registerItems(Category category) {
		new SlimefunItem(category, chest_oak, "OAK_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("OAK_CHEST", 18, "&bOak Chest", true, ChestProtectionLevel.PUBLIC);

		new SlimefunItem(category, chest_birch, "BIRCH_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("BIRCH_CHEST", 18, "&bBirch Chest", true, ChestProtectionLevel.PUBLIC);

		new SlimefunItem(category, chest_spruce, "SPRUCE_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("SPRUCE_CHEST", 18, "&bSpruce Chest", true, ChestProtectionLevel.PUBLIC);

		new SlimefunItem(category, chest_jungle, "JUNGLE_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("JUNGLE_CHEST", 18, "&bJungle Chest", true, ChestProtectionLevel.PUBLIC);

		new SlimefunItem(category, chest_acacia, "ACACIA_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("ACACIA_CHEST", 18, "&bAcacia Chest", true, ChestProtectionLevel.PUBLIC);

		new SlimefunItem(category, chest_dark_oak, "DARK_OAK_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("DARK_OAK_CHEST", 18, "&bDark Oak Chest", true, ChestProtectionLevel.PUBLIC);
		
		new SlimefunItem(category, chest_iron, "IRON_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("IRON_CHEST", 27, "&bIron Chest", true,  ChestProtectionLevel.PUBLIC);
				
		new SlimefunItem(category, chest_gold, "GOLDEN_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, chest_iron, SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("GOLDEN_CHEST", 36, "&bGolden Chest", true,  ChestProtectionLevel.PUBLIC);
				
		new SlimefunItem(category, chest_diamond, "DIAMOND_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DIAMOND), chest_gold, new ItemStack(Material.DIAMOND), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("DIAMOND_CHEST", 45, "&bDiamond Chest", true,  ChestProtectionLevel.PUBLIC);
				
		new SlimefunItem(category, chest_emerald, "EMERALD_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.EMERALD), chest_diamond, new ItemStack(Material.EMERALD), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("EMERALD_CHEST", 54, "&bEmerald Chest", true,  ChestProtectionLevel.PUBLIC);
				
		new SlimefunItem(category, chest_obsidian, "OBSIDIAN_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), chest_iron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("OBSIDIAN_CHEST", 36, "&bObsidian Chest", false,  ChestProtectionLevel.PUBLIC);
				
		new SlimefunItem(category, chest_steel, "STEEL_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, chest_obsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("STEEL_CHEST", 45, "&bSteel Chest", false,  ChestProtectionLevel.PUBLIC);
	}

	public void registerResearches() {
		Slimefun.registerResearch(new Research(606, "Top Tier Storage", 20), chest_oak, chest_birch, chest_spruce, chest_jungle, chest_acacia, chest_dark_oak);
		Slimefun.registerResearch(new Research(608, "Improved Storage", 16), chest_iron, chest_gold, chest_diamond, chest_emerald);
		Slimefun.registerResearch(new Research(607, "Hardened Storage", 24), chest_obsidian, chest_steel);
	}

}
