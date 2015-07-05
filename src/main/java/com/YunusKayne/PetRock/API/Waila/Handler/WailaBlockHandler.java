package com.YunusKayne.PetRock.API.Waila.Handler;

import java.util.List;

import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.init.Items;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class WailaBlockHandler implements IWailaDataProvider
{
	private static Block block;
	private static String InfoLine;
	
	public static void RegisterBlockInfo(IWailaRegistrar registrar, Block b, String LocalizedInfoLine)
	{
		block = b;
		InfoLine = LocalizedInfoLine;
		registrar.registerStackProvider(new WailaBlockHandler(), block.getClass());
		registrar.registerHeadProvider(new WailaBlockHandler(), block.getClass());
		registrar.registerBodyProvider(new WailaBlockHandler(), block.getClass());
		registrar.registerTailProvider(new WailaBlockHandler(), block.getClass());
		registrar.registerNBTProvider(new WailaBlockHandler(), block.getClass());
		
		registrar.registerBodyProvider(new WailaBlockHandler(), entityPetRock.class);
	}
	
	@Override
	public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		return new ItemStack(block);
	}

	@Override
	public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		return currenttip;
	}

	@Override
	public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
	{
		currenttip.add(StatCollector.translateToLocal("Waila." + InfoLine));
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
