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
import me.mrCookieSlime.Slimefun.api.Slimefun;

public class PrivateChests {
	
	private ItemStack safeOak;
	private ItemStack safeBirch;
	private ItemStack safeSpruce;
	private ItemStack safeJungle;
	private ItemStack safeAcacia;
	private ItemStack safeDarkOak;
	
	private ItemStack safeIron;
	private ItemStack safeGold;
	private ItemStack safeDiamond;
	private ItemStack safeEmerald;
	
	private ItemStack safeObsidian;
	private ItemStack safeSteel;

	public PrivateChests(Category category) throws Exception {
		safeOak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThjMTk4OGUzM2RjZGZlZmZkNjE5YjkyYWI5ZjQ3Y2Y1YzNjNmQ3ZGRhZDQyNjM3ZDNlYWFhYjI3NTcifX19"), "&6Oak Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safeBirch = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdmN2NiMmQ0ZWMwZTBjNjFlNzlhMDZjZjA0YjBkMTYxMDVmNzdkYTk2OTEzYTY4OWE0ZGM5NTI3N2I5MzczYiJ9fX0="), "&6Birch Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safeSpruce = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVmNWIwYTQ1MzA1MTE1N2JkNjRiY2Q4YzcyMGQwNmZlNzhlYmM0ODU1M2M0YzBlNWI5OTMxMjY1YjFhZTc1YyJ9fX0="), "&6Spruce Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safeJungle = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzMjIxMmE2ZTYwMzMwNzg5NmU3YTQzNTY1OTcyNjU3MDQwMTM2ZjZhODRhYjFhODgyOWVmMDA2MTIzOWNjNSJ9fX0="), "&6Jungle Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safeAcacia = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY2OGNkZDhiNDQ3OGM5OWVlNjM0NTA2YThjZjIyNzkyMTRkYjY2ZjUwNWRkOWFmMjU5YWVlN2ZlYTFlZGYwZSJ9fX0="), "&6Acacia Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		safeDarkOak = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmMzOGM5YjJmZDExYzliMDIwODEzYTg3MTBhNjdmYmVhYzU2YjYxZTkyMzVmNWQ3ZDg5ZWQ5YjdhMTU5ZDQ0NSJ9fX0="), "&6Dark Oak Safe", "&7Size: &e2x9", "", "&rThis Chest can only be opened by you");
		
		safeIron = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThlNTU0NGFmN2Y1NDg5Y2MyNzQ5MWNhNjhmYTkyMzg0YjhlYTVjZjIwYjVjODE5OGFkYjdiZmQxMmJjMmJjMiJ9fX0="), "&6Iron Safe", "&7Size: &e3x9", "", "&rThis Chest can only be opened by you");
		safeGold = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDUyY2VlZDA2NDgzNWVhMjMyZTY1NmE3M2Y4MmVkNzYxODI3ODU5YzkxMzQ0OTMxNGI4ZmQyMWIzZDExZDYifX19"), "&6Golden Safe", "&7Size: &e4x9", "", "&rThis Chest can only be opened by you");
		safeDiamond = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FkYmNmYjI4ODIxNWE4ZDE1M2RkZmRkYjM2YmQyZWQ3YTM3YWRkMzU2NjJmODYzM2Y3MTFkMmRmY2ViNDE3YyJ9fX0="), "&6Diamond Safe", "&7Size: &e5x9", "", "&rThis Chest can only be opened by you");
		safeEmerald = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFkMzVlYmRiMTI1ZmJhNDIxMjk4ZDQyYzIwMmM3N2M3NWI0MmNjOTljOTQ5MzlmNjM3NjQwYWMxODFmIn19fQ=="), "&6Emerald Safe", "&7Size: &e6x9", "", "&rThis Chest can only be opened by you");
		
		safeObsidian = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1YmU4NzM2NTJjYmZkZjRkODhmYTgxMjc2ZDI0OGQyYjdlZWY3YTZkNGYzZWRjYzkyZmU1NzU4NWJmNGQifX19"), "&6Obsidian Safe", "&7Size: &e4x9", "&bWithstands Explosions", "", "&rThis Chest can only be opened by you");
		safeSteel = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjljYjNkMTlkYjUyOWEyMTVjZjYyNjk3NTkxY2MxM2ZiOGM3ODZhOGYyN2I3NTI4YzMyYWMyOTg2Yjk2NzBjNCJ9fX0="), "&6Steel Safe", "&7Size: &e5x9", "&bWithstands Explosions", "", "&rThis Chest can only be opened by you");
		
		registerItems(category);
		registerResearches();
	}

	public void registerItems(Category category) {
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, category, safeOak, "PRIVATE_SAFE_OAK", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OAK_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, category, safeBirch, "PRIVATE_SAFE_BIRCH", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.BIRCH_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, category, safeSpruce, "PRIVATE_SAFE_SPRUCE", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.SPRUCE_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, category, safeJungle, "PRIVATE_SAFE_JUNGLE", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.JUNGLE_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, category, safeAcacia, "PRIVATE_SAFE_ACACIA", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.ACACIA_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 18, true, category, safeDarkOak, "PRIVATE_SAFE_DARK_OAK", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DARK_OAK_LOG), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 27, true, category, safeIron, "PRIVATE_SAFE_IRON", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.CHEST), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 36, true, category, safeGold, "PRIVATE_SAFE_GOLD", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, safeIron, SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_10K, new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 45, true, category, safeDiamond, "PRIVATE_SAFE_DIAMOND", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.DIAMOND), safeGold, new ItemStack(Material.DIAMOND), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 54, true, category, safeEmerald, "PRIVATE_SAFE_EMERALD", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.EMERALD), safeDiamond, new ItemStack(Material.EMERALD), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GLASS), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 36, false, category, safeObsidian, "PRIVATE_SAFE_OBSIDIAN", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), safeIron, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.GOLD_NUGGET)})
		.register();
		
		new SlimefunChest(ChestProtectionLevel.PRIVATE, 45, false, category, safeSteel, "PRIVATE_SAFE_STEEL", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, safeObsidian, SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET), SlimefunItems.STEEL_INGOT, new ItemStack(Material.GOLD_NUGGET)})
		.register();
	}
	
	public void registerResearches() {
		Slimefun.registerResearch(new Research(609, "Magical Storage", 8), safeOak, safeBirch, safeSpruce, safeJungle, safeAcacia, safeDarkOak);
		Slimefun.registerResearch(new Research(610, "Upgraded Storage", 16), safeIron, safeGold, safeDiamond);
		Slimefun.registerResearch(new Research(611, "Top Tier Storage", 20), safeEmerald);
		Slimefun.registerResearch(new Research(612, "Hardened Storage", 24), safeObsidian, safeSteel);
	}

}
