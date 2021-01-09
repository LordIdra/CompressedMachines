package me.idra.compressedmachines;



import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import misc_items.InformationItem;
import slimefun_machines.CompressedX4AutoDrier;
import slimefun_machines.CompressedX8AutoDrier;
import slimefun_machines.CompressedElectricDustWasher;
import slimefun_machines.CompressedElectricGoldPan;
import slimefun_machines.CompressedElectricSmeltery;



public class CompressedMachines extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
    	
        // Read the config file
        Config cfg = new Config(this);

    	
        // Create a category to put our items into
        ItemStack categoryItem = new CustomItem(Material.OBSIDIAN, "Compressed Machines", "", "&aSpace and lag efficient machine variants");
        NamespacedKey categoryId = new NamespacedKey(this, "compressed_machines");
        Category category = new Category(categoryId, categoryItem);
        
        
        // Display an arbitrary item to tell the players that they can deconstruct machines in an enhanced crafting table
        SlimefunItemStack compressedInformationItem = new SlimefunItemStack(
        		"compressedInformationItem",
        		Material.NETHER_STAR,
        		"&4&lINFORMATION",
        		"&aCompressed machines can be converted back into their", "&anormal variants by putting them in the &2&lfirst slot &aof an", "&aenhanced crafting table");
        ItemStack[] compressedInformationRecipe = { 
        		null, null, null,
        		null, null, null,
        		null, null, null
        };
        
        InformationItem compressedInformation = new InformationItem(
        		category, 
        		compressedInformationItem,
        		RecipeType.NULL, 
        		compressedInformationRecipe);
        
        compressedInformation.register(this);
        
        
        // Load the SF items we're going to compress
        ItemStack auto_drier = SlimefunItems.AUTO_DRIER;
        ItemStack carbon_press = SlimefunItems.CARBON_PRESS_3;
        ItemStack dust_washer = SlimefunItems.ELECTRIC_DUST_WASHER_3;
        ItemStack furnace = SlimefunItems.ELECTRIC_FURNACE_3;
        ItemStack gold_pan = SlimefunItems.ELECTRIC_GOLD_PAN_3;
        ItemStack ingot_factory = SlimefunItems.ELECTRIC_INGOT_FACTORY_3;
        ItemStack ingot_pulverizer = SlimefunItems.ELECTRIC_INGOT_PULVERIZER;
        ItemStack ore_grinder = SlimefunItems.ELECTRIC_ORE_GRINDER_2;
        ItemStack press = SlimefunItems.ELECTRIC_PRESS_2;
        ItemStack smeltery = SlimefunItems.ELECTRIC_SMELTERY_2;
        ItemStack crucible = SlimefunItems.ELECTRIFIED_CRUCIBLE_3;
        ItemStack food_composter = SlimefunItems.FOOD_COMPOSTER_2;
        ItemStack food_fabricator = SlimefunItems.FOOD_FABRICATOR_2;
        ItemStack geo_miner = SlimefunItems.GEO_MINER;
        ItemStack heated_pressure_chamber = SlimefunItems.HEATED_PRESSURE_CHAMBER_2;
        ItemStack oil_pump = SlimefunItems.OIL_PUMP;
        ItemStack refinery = SlimefunItems.REFINERY;

        
        
        
        
        
        

        /*
         * 
         *  
         *  MACHINE REPRESENTATIONS
         *  
         *  
         */
        
        /*
         * AUTO DRIERS
         */
        
        SlimefunItemStack itemCompressedAutoDrier4 = new SlimefunItemStack(
        		"COMPRESSED_AUTO_DRIER_4",
        		Material.SMOKER,
        		"&7&l[&2&l4x&7&l] &r&6Auto Drier",
        		"", "&5Compressed Machine", LoreBuilder.speed(1), LoreBuilder.powerPerSecond(48));
        SlimefunItemStack itemCompressedAutoDrier8 = new SlimefunItemStack(
        		"COMPRESSED_AUTO_DRIER_8",
        		Material.SMOKER,
        		"&7&l[&2&l8x&7&l] &r&6Auto Drier",
        		"", "&5Compressed Machine", LoreBuilder.speed(1), LoreBuilder.powerPerSecond(96));
        
        
        /*
         * GOLD PANS
         */
        
        SlimefunItemStack itemCompressedGoldPan4 = new SlimefunItemStack(
        		"COMPRESSED_ELECTRIC_GOLD_PAN_4",
        		Material.BROWN_TERRACOTTA,
        		"&7&l[&2&l4x&7&l] &r&6Electric Gold Pan &7(&eIII&7)",
        		"", "&5Compressed Machine", LoreBuilder.speed(10), LoreBuilder.powerPerSecond(56));
        SlimefunItemStack itemCompressedGoldPan8 = new SlimefunItemStack(
        		"COMPRESSED_ELECTRIC_GOLD_PAN_8",
        		Material.BROWN_TERRACOTTA,
        		"&7&l[&2&l8x&7&l] &r&6Electric Gold Pan &7(&eIII&7)",
        		"", "&5Compressed Machine", LoreBuilder.speed(10), LoreBuilder.powerPerSecond(112));
        
        
        /*
         * DUST WASHERS
         */
        
        SlimefunItemStack itemCompressedDustWasher4 = new SlimefunItemStack(
        		"COMPRESSED_ELECTRIC_DUST_WASHER_4",
        		Material.BLUE_STAINED_GLASS,
        		"&7&l[&2&l4x&7&l] &r&9Electric Dust Washer &7(&eIII&7)",
        		"", "&5Compressed Machine", LoreBuilder.speed(10), LoreBuilder.powerPerSecond(120));
        SlimefunItemStack itemCompressedDustWasher8 = new SlimefunItemStack(
        		"COMPRESSED_ELECTRIC_DUST_WASHER_8",
        		Material.BLUE_STAINED_GLASS,
        		"&7&l[&2&l8x&7&l] &r&9Electric Dust Washer &7(&eIII&7)",
        		"", "&5Compressed Machine", LoreBuilder.speed(10), LoreBuilder.powerPerSecond(240));
        
        
        /*
         * SMELTERIES
         */
        
        SlimefunItemStack itemCompressedSmeltery4 = new SlimefunItemStack(
        		"COMPRESSED_ELECTRIC_SMELTERY_4",
        		Material.FURNACE,
        		"&7&l[&2&l4x&7&l] &r&cElectric Smeltery &7 - &eII",
        		"", "&4Alloys only, doesn't smelt Dust into Ingots", "", "&5Compressed Machine", LoreBuilder.speed(3), LoreBuilder.powerPerSecond(160));
        SlimefunItemStack itemCompressedSmeltery8 = new SlimefunItemStack(
        		"COMPRESSED_ELECTRIC_SMELTERY_8",
        		Material.FURNACE,
        		"&7&l[&2&l8x&7&l] &r&cElectric Smeltery &7 - &eII",
        		"", "&4Alloys only, doesn't smelt Dust into Ingots", "", "&5Compressed Machine", LoreBuilder.speed(3), LoreBuilder.powerPerSecond(320));
        
        
        
        
        
        
        
        /*
         * 
         *  
         *  CRAFTING RECIPES
         *  
         *  
         */
        
        /*
         * AUTO DRIER
         */
        
        ItemStack[] recipeCompressedAutoDrier4 = { 
        		auto_drier, auto_drier, null, 
        		auto_drier, auto_drier, null, 
        		null,	  null, 	null 
        };
        ItemStack[] recipeCompressedAutoDrier8 = { 
        		auto_drier, auto_drier, auto_drier, 
        		auto_drier, null,	 	auto_drier, 
        		auto_drier, auto_drier, auto_drier 
        };
        
        
        /*
         * GOLD PANS
         */
        
        ItemStack[] recipeCompressedGoldPan4 = { 
        		gold_pan, gold_pan, null, 
        		gold_pan, gold_pan, null, 
        		null,	  null, 	null 
        };
        ItemStack[] recipeCompressedGoldPan8 = { 
        		gold_pan, gold_pan, gold_pan, 
        		gold_pan, null,	 	gold_pan, 
        		gold_pan, gold_pan, gold_pan 
        };
        
        
        /*
         * DUST WASHERS
         */
        
        ItemStack[] recipeCompressedDustWasher4 = { 
        		dust_washer, dust_washer, null, 
        		dust_washer, dust_washer, null, 
        		null,	  null, 	null 
        };
        ItemStack[] recipeCompressedDustWasher8 = { 
        		dust_washer, dust_washer, dust_washer,
        		dust_washer, null, 		  dust_washer,
        		dust_washer, dust_washer, dust_washer
        };
        
        
        /*
         * SMELTERIES
         */
        
        ItemStack[] recipeCompressedSmeltery4 = { 
        		smeltery, smeltery, null, 
        		smeltery, smeltery, null, 
        		null,	  null, 	null 
        };
        ItemStack[] recipeCompressedSmeltery8 = { 
        		smeltery, smeltery, smeltery,
        		smeltery, null, 	smeltery,
        		smeltery, smeltery, smeltery
        };
        
        
        
        
        
        
        
        
        /*
         * 
         *  
         *  FINAL OBJECTS
         *  
         *  
         */

        /*
         * AUTO DRIERS
         */
        
        CompressedX4AutoDrier compressedAutoDrier4 = new CompressedX4AutoDrier(
        		category, 
        		itemCompressedAutoDrier4, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedAutoDrier4);
        
        CompressedX8AutoDrier compressedAutoDrier8 = new CompressedX8AutoDrier(
        		category, 
        		itemCompressedAutoDrier8, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedAutoDrier8);
        
        compressedAutoDrier4.setCapacity(500);
        compressedAutoDrier4.setEnergyConsumption(48);
        compressedAutoDrier4.setProcessingSpeed(1);
        
        compressedAutoDrier8.setCapacity(1000);
        compressedAutoDrier8.setEnergyConsumption(96);
        compressedAutoDrier8.setProcessingSpeed(1);
        
        
        /*
         * GOLD PANS
         */
        
        CompressedElectricGoldPan compressedGoldPan4 = new CompressedElectricGoldPan(
        		category, 
        		itemCompressedGoldPan4, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedGoldPan4, 
        		4);
        
        CompressedElectricGoldPan compressedGoldPan8 = new CompressedElectricGoldPan(
        		category, 
        		itemCompressedGoldPan8, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedGoldPan8, 
        		8);
        
        compressedGoldPan4.setCapacity(500);
        compressedGoldPan4.setEnergyConsumption(56);
        compressedGoldPan4.setProcessingSpeed(10);
        
        compressedGoldPan8.setCapacity(1000);
        compressedGoldPan8.setEnergyConsumption(112);
        compressedGoldPan8.setProcessingSpeed(10);
        
        
        /*
         * DUST WASHERS
         */
        
        CompressedElectricDustWasher compressedDustWasher4 = new CompressedElectricDustWasher(
        		category, 
        		itemCompressedDustWasher4, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedDustWasher4, 
        		4);
        
        CompressedElectricDustWasher compressedDustWasher8 = new CompressedElectricDustWasher(
        		category, 
        		itemCompressedDustWasher8, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedDustWasher8, 
        		8);
        
        compressedDustWasher4.setCapacity(500);
        compressedDustWasher4.setEnergyConsumption(120);
        compressedDustWasher4.setProcessingSpeed(10);
        
        compressedDustWasher8.setCapacity(1000);
        compressedDustWasher8.setEnergyConsumption(240);
        compressedDustWasher8.setProcessingSpeed(10);

        
        /*
         * SMELTERIES
         */
        
        CompressedElectricSmeltery compressedSmeltery4 = new CompressedElectricSmeltery(
        		category, 
        		itemCompressedSmeltery4, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedSmeltery4, 
        		4);
        
        CompressedElectricSmeltery compressedSmeltery8 = new CompressedElectricSmeltery(
        		category, 
        		itemCompressedSmeltery8, 
        		RecipeType.ENHANCED_CRAFTING_TABLE, 
        		recipeCompressedSmeltery8,
        		8);
        
        compressedSmeltery4.setCapacity(500);
        compressedSmeltery4.setEnergyConsumption(160);
        compressedSmeltery4.setProcessingSpeed(3);
        
        compressedSmeltery8.setCapacity(1000);
        compressedSmeltery8.setEnergyConsumption(320);
        compressedSmeltery8.setProcessingSpeed(3);
        
        
        
        // Add the items to slimefun
        ((SlimefunItem)compressedAutoDrier4).register(this);
        ((SlimefunItem)compressedAutoDrier8).register(this);
        
        ((SlimefunItem)compressedGoldPan4).register(this);
        ((SlimefunItem)compressedGoldPan8).register(this);
        
        ((SlimefunItem)compressedDustWasher4).register(this);
        ((SlimefunItem)compressedDustWasher8).register(this);
        
        ((SlimefunItem)compressedSmeltery4).register(this);
        ((SlimefunItem)compressedSmeltery8).register(this);
        
        
        
        
        
        
        
        
        /*
         * 
         * 
         * REGISTER DECONSTRUCTION RECIPES
         *  
         *  
         */
        
        SlimefunItemStack output;
        ItemStack[] input;
        
        
        output = new SlimefunItemStack(SlimefunItems.AUTO_DRIER, 8);
        input = new ItemStack[] { itemCompressedAutoDrier4, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        output = new SlimefunItemStack(SlimefunItems.AUTO_DRIER, 8);
        input = new ItemStack[] { itemCompressedAutoDrier8, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        
        output = new SlimefunItemStack(SlimefunItems.ELECTRIC_DUST_WASHER_3, 8);
        input = new ItemStack[] { itemCompressedDustWasher4, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        output = new SlimefunItemStack(SlimefunItems.ELECTRIC_DUST_WASHER_3, 8);
        input = new ItemStack[] { itemCompressedDustWasher8, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        
        output = new SlimefunItemStack(SlimefunItems.ELECTRIC_GOLD_PAN_3, 8);
        input = new ItemStack[] { itemCompressedGoldPan4, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        output = new SlimefunItemStack(SlimefunItems.ELECTRIC_GOLD_PAN_3, 8);
        input = new ItemStack[] { itemCompressedGoldPan8, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        
        output = new SlimefunItemStack(SlimefunItems.ELECTRIC_SMELTERY_2, 8);
        input = new ItemStack[] { itemCompressedSmeltery4, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
        
        output = new SlimefunItemStack(SlimefunItems.ELECTRIC_SMELTERY_2, 8);
        input = new ItemStack[] { itemCompressedSmeltery8, null, null, null, null, null, null, null, null };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(input, output);
    }

    @Override
    public void onDisable() {
        // no tasks
    }

    @Override
    public String getBugTrackerURL() {
        return "github.com/LordIdra/CompressedMachines/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
