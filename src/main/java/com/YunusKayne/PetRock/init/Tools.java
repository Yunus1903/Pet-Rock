package com.YunusKayne.PetRock.init;

import com.YunusKayne.PetRock.client.handler.ConfigHandler;
import com.YunusKayne.PetRock.items.tools.PetriumPickaxe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class Tools
{	
	public static final Item.ToolMaterial Petrium = EnumHelper.addToolMaterial("Petrium", 1, 200, 5.00F, 1.5F, 12);

	public static PetriumPickaxe PetriumPickaxe = new PetriumPickaxe("PetriumPickaxe", Petrium);
	
	public static void initTools()
	{
		if(ConfigHandler.debugMode) registerTool(PetriumPickaxe, "PetriumPickaxe"); //DEBUG
	}
	
	private static void registerTool(Item tool, String name)
	{
		GameRegistry.registerItem(tool, name);
		OreDictionary.registerOre(name, tool);
	}
}
