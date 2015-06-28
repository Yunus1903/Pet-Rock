package com.YunusKayne.PetRock.items.tools;

import java.util.List;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		int usesRemaining = stack.getMaxDamage() - stack.getItemDamage();
		
		list.add("§6" + StatCollector.translateToLocal("PetriumPickaxe.info1"));
		list.add("");
		list.add(StatCollector.translateToLocal("PetriumPickaxe.info2"));
		list.add(StatCollector.translateToLocal("PetriumPickaxe.info3"));
		list.add("");
		list.add("§8" + StatCollector.translateToLocal("PetriumPickaxe.info4") + " §7" + usesRemaining);
	}
}
