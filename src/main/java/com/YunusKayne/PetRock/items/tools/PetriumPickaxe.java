package com.YunusKayne.PetRock.items.tools;

import java.util.List;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PetriumPickaxe extends ItemPickaxe
{
	
	public PetriumPickaxe(String name, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":" + name);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		int usesRemaining = stack.getMaxDamage() - stack.getItemDamage();
		
		list.add(EnumChatFormatting.GOLD + StatCollector.translateToLocal("PetriumPickaxe.info1"));
		list.add("");
		list.add(StatCollector.translateToLocal("PetriumPickaxe.info2"));
		list.add(StatCollector.translateToLocal("PetriumPickaxe.info3"));
		list.add("");
		list.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal("PetriumPickaxe.info4") + " " + EnumChatFormatting.GRAY + usesRemaining);
	}
}
