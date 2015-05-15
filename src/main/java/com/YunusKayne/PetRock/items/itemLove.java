package com.YunusKayne.PetRock.items;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class itemLove extends Item
{
	public itemLove(Material glass, String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName("PetRock:itemLove");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerItemIcons(IIconRegister iconRegister)
	{
	this.itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
	}
}
