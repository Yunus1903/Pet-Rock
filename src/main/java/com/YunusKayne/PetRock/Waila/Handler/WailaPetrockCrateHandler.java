package com.YunusKayne.PetRock.Waila.Handler;

import java.util.List;

import com.YunusKayne.PetRock.blocks.tileentity.petrockCrate;
import com.YunusKayne.PetRock.init.Items;
import com.YunusKayne.PetRock.init.TileEntitys;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class WailaPetrockCrateHandler implements IWailaDataProvider
{
	@Override
	public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		return new ItemStack(TileEntitys.petrockCrate);
	}

	@Override
	public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		return currenttip;
	}

	@Override
	public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		currenttip.add(StatCollector.translateToLocal("Waila.Stone.Body"));
		if(!petrockCrate.item1) currenttip.add("- " + Items.canisterLove.getUnlocalizedName());
		if(!petrockCrate.item2) currenttip.add("- " + Items.matterPetrium.getUnlocalizedName());
		return currenttip;
	}

	@Override
	public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		return currenttip;
	}

	@Override
	public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te, NBTTagCompound tag, World world, int x, int y, int z)
	{
		return tag;
	}
}
