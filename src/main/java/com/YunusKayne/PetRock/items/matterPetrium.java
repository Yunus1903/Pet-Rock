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

public class matterPetrium extends Item
{
	public matterPetrium(Material snow, String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":matterPetrium");
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
        if(GuiScreen.isShiftKeyDown())
        {
            list.add(StatCollector.translateToLocal("matterPetrium.info1"));
        }
        else
        {
        	list.add(StatCollector.translateToLocal("matterPetrium.info2"));
        }
    }
}
