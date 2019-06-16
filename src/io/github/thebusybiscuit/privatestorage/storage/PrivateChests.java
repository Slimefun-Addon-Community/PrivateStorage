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

public class PrivateChests {
	
	private ItemStack safe_oak, safe_birch, safe_spruce, safe_jungle, safe_acacia, safe_dark_oak;
	private ItemStack safe_iron, safe_gold, safe_diamond, safe_emerald;
	private ItemStack safe_obsidian, safe_steel;

	public PrivateChests(Category category) throws Exception {
		safe_oak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19"), "&6Oak Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safe_birch = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0="), "&6Birch Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safe_spruce = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0="), "&6Spruce Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safe_jungle = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0="), "&6Jungle Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safe_acacia = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0="), "&6Acacia Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safe_dark_oak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0="), "&6Dark Oak Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		
		safe_iron = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&6Iron Safe", "&7Size: &e3x9", "", "&rThis Chest can only be opened by you");
		safe_gold = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19"), "&6Golden Safe", "&7Size: &e4x9", "", "&rThis Chest can only be opened by you");
		safe_diamond = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0="), "&6Diamond Safe", "&7Size: &e5x9", "", "&rThis Chest can only be opened by you");
		safe_emerald = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ=="), "&6Emerald Safe", "&7Size: &e6x9", "", "&rThis Chest can only be opened by you");
		
		safe_obsidian = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19"), "&6Obsidian Safe", "&7Size: &e4x9", "&bWithstands Explosions", "", "&rThis Chest can only be opened by you");
		safe_steel = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0="), "&6Steel Safe", "&7Size: &e5x9", "&bWithstands Explosions", "", "&rThis Chest can only be opened by you");
		
		registerItems(category);
		registerResearches();
	}

	public void registerItems(Category category) {
		new SlimefunItem(category, safe_oak, "PRIVATE_SAFE_OAK", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_OAK", 18, "&bOak Safe", true,  ChestProtectionLevel.PRIVATE);

		new SlimefunItem(category, safe_birch, "PRIVATE_SAFE_BIRCH", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_BIRCH", 18, "&bBirch Safe", true,  ChestProtectionLevel.PRIVATE);

		new SlimefunItem(category, safe_spruce, "PRIVATE_SAFE_SPRUCE", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_SPRUCE", 18, "&bSpruce Safe", true,  ChestProtectionLevel.PRIVATE);

		new SlimefunItem(category, safe_jungle, "PRIVATE_SAFE_JUNGLE", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_JUNGLE", 18, "&bJungle Safe", true,  ChestProtectionLevel.PRIVATE);

		new SlimefunItem(category, safe_acacia, "PRIVATE_SAFE_ACACIA", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_OAK", 18, "&bAcacia Safe", true,  ChestProtectionLevel.PRIVATE);

		new SlimefunItem(category, safe_dark_oak, "PRIVATE_SAFE_DARK_OAK", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_DARK_OAK", 18, "&bDark Oak Safe", true,  ChestProtectionLevel.PRIVATE);
		
		new SlimefunItem(category, safe_iron, "PRIVATE_SAFE_IRON", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_IRON", 27, "&bIron Safe", true,  ChestProtectionLevel.PRIVATE);
		
		new SlimefunItem(category, safe_gold, "PRIVATE_SAFE_GOLD", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, safe_iron, SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_GOLD", 36, "&bGolden Safe", true,  ChestProtectionLevel.PRIVATE);
		
		new SlimefunItem(category, safe_diamond, "PRIVATE_SAFE_DIAMOND", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DIAMOND), safe_gold, new ItemStack(Material.DIAMOND), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_DIAMOND", 45, "&bDiamond Safe", true,  ChestProtectionLevel.PRIVATE);
		
		new SlimefunItem(category, safe_emerald, "PRIVATE_SAFE_EMERALD", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.EMERALD), safe_diamond, new ItemStack(Material.EMERALD), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_EMERALD", 54, "&bEmerald Safe", true,  ChestProtectionLevel.PRIVATE);
		
		new SlimefunItem(category, safe_obsidian, "PRIVATE_SAFE_OBSIDIAN", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), safe_iron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_OBSIDIAN", 36, "&bObsidian Safe", false,  ChestProtectionLevel.PRIVATE);
		
		new SlimefunItem(category, safe_steel, "PRIVATE_SAFE_STEEL", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, safe_obsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET)})
		.register();
		PrivateStorage.applyChestTraits("PRIVATE_SAFE_STEEL", 45, "&bSteel Safe", false,  ChestProtectionLevel.PRIVATE);
	}
	
	public void registerResearches() {
		Slimefun.registerResearch(new Research(609, "Magical Storage", 8), safe_oak, safe_birch, safe_spruce, safe_jungle, safe_acacia, safe_dark_oak);
		Slimefun.registerResearch(new Research(610, "Upgraded Storage", 16), safe_iron, safe_gold, safe_diamond);
		Slimefun.registerResearch(new Research(611, "Top Tier Storage", 20), safe_emerald);
		Slimefun.registerResearch(new Research(612, "Hardened Storage", 24), safe_obsidian, safe_steel);
	}

}
