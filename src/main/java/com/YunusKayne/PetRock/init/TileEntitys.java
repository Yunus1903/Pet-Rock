package com.YunusKayne.PetRock.init;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

import com.YunusKayne.PetRock.blocks.tileentity.petrockCrate;
import com.YunusKayne.PetRock.entity.Tile.petrockCrateEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntitys
{
	//List of TileEntity's
	public static petrockCrate petrockCrate = new petrockCrate(Material.wood, "petrockCrate");

	public static void initTileEntitys()
	{
		//TileEntity Registry's
		registerTileEntity(petrockCrate, petrockCrateEntity.class, "petrockCrate");
	}

	private static void registerTileEntity(BlockContainer block, Class<? extends net.minecraft.tileentity.TileEntity> Entity, String name)
	{	
		GameRegistry.registerBlock(block, name);
		GameRegistry.registerTileEntity(Entity, name);
		OreDictionary.registerOre(name, block);
	}
}
