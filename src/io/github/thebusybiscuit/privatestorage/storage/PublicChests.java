package io.github.thebusybiscuit.privatestorage.storage;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.privatestorage.ChestProtectionLevel;
import io.github.thebusybiscuit.privatestorage.SlimefunChest;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public class PublicChests {
	
	private ItemStack chestOak;
	private ItemStack chestBirch;
	private ItemStack chestSpruce;
	private ItemStack chestJungle;
	private ItemStack chestAcacia;
	private ItemStack chestDarkOak;
	
	private ItemStack chestIron;
	private ItemStack chestGold;
	private ItemStack chestDiamond;
	private ItemStack chestEmerald;
	
	private ItemStack chestObsidian;
	private ItemStack chestSteel;

	public PublicChests(Category category) throws Exception {
		chestOak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19"), "&6Oak chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestBirch = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0="), "&6Birch chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestSpruce = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0="), "&6Spruce chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestJungle = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0="), "&6Jungle chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestAcacia = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0="), "&6Acacia chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestDarkOak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0="), "&6Dark Oak chest", "&7Size: &e2x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		
		chestIron = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&6Iron chest", "&7Size: &e3x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestGold = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19"), "&6Golden chest", "&7Size: &e4x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestDiamond = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0="), "&6Diamond chest", "&7Size: &e5x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestEmerald = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ=="), "&6Emerald chest", "&7Size: &e6x9", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		
		chestObsidian = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19"), "&6Obsidian chest", "&7Size: &e4x9", "&bWithstands Explosions", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		chestSteel = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0="), "&6Steel chest", "&7Size: &e5x9", "&bWithstands Explosions", "", "&rThis Chest can be opened by anyone", "&rwho can open Chests in your Area");
		
		registerItems(category);
		registerResearches();
	}

	public void registerItems(Category category) {
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestOak, "OAK_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestBirch, "BIRCH_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
	
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestSpruce, "SPRUCE_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
	
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestJungle, "JUNGLE_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestAcacia, "ACACIA_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 18, true, category, chestDarkOak, "DARK_OAK_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.CHEST), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.IRON_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 27, true, category, chestIron, "IRON_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_NUGGET)})
		.register();
				
		new SlimefunItem(category, chestGold, "GOLDEN_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, chestIron, SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET), SlimefunItems.GOLD_8K, new ItemStack(Material.IRON_NUGGET)})
		.register();
				
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 45, true, category, chestDiamond, "DIAMOND_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.DIAMOND), chestGold, new ItemStack(Material.DIAMOND), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
		.register();
				
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 54, true, category, chestEmerald, "EMERALD_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.EMERALD), chestDiamond, new ItemStack(Material.EMERALD), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.IRON_NUGGET)})
		.register();
				
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 36, false, category, chestObsidian, "OBSIDIAN_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), chestIron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.IRON_NUGGET)})
		.register();
				
		new SlimefunChest(ChestProtectionLevel.PUBLIC, 45, false, category, chestSteel, "STEEL_CHEST", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, chestObsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_NUGGET)})
		.register();
	}

	public void registerResearches() {
		Slimefun.registerResearch(new Research(606, "Top Tier Storage", 20), chestOak, chestBirch, chestSpruce, chestJungle, chestAcacia, chestDarkOak);
		Slimefun.registerResearch(new Research(608, "Improved Storage", 16), chestIron, chestGold, chestDiamond, chestEmerald);
		Slimefun.registerResearch(new Research(607, "Hardened Storage", 24), chestObsidian, chestSteel);
	}

}
