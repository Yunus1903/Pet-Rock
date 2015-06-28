package com.YunusKayne.PetRock.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.YunusKayne.PetRock.items.matterPetrium;
import com.YunusKayne.PetRock.items.tools.PetriumPickaxe;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tools {
	
	public static final Item.ToolMaterial Petrium = EnumHelper.addToolMaterial("Petrium", 1, 200, 5.00F, 1.5F, 12);

	public static PetriumPickaxe PetriumPickaxe = new PetriumPickaxe("PetriumPickaxe", Petrium);
	
	public static void initTools() {
		GameRegistry.registerItem(PetriumPickaxe, "PetriumPickaxe");
	}
}
