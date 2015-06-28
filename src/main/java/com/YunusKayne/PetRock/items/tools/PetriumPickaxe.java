package com.YunusKayne.PetRock.items.tools;

import java.util.List;

import com.YunusKayne.PetRock.creativetab.Tab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PetriumPickaxe extends ItemPickaxe {
	
	public PetriumPickaxe(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("Special abilities :" + "Silk touching glass and crushing");
		list.add(stack.getMaxDamage() - stack.getItemDamage() + " Uses Remaining");
	}
}
