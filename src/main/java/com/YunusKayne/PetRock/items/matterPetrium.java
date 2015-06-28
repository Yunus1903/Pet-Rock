package com.YunusKayne.PetRock.items;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;
import com.YunusKayne.PetRock.utility.ChatHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class matterPetrium extends Item
{
	public matterPetrium(String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":" + name);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add(StatCollector.translateToLocal("matterPetrium.info1"));
    }
}
