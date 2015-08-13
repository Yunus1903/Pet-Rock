package com.YunusKayne.PetRock.blocks.tileentity;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;
import com.YunusKayne.PetRock.entity.Tile.petrockCrateEntity;

public class petrockCrate extends BlockContainer
{
	public petrockCrate(Material material, String name)
	{
		super(Material.iron);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.2F); //ToDo
		this.setBlockTextureName(Reference.MOD_ID + ":" + name);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id)
	{
		return new petrockCrateEntity();
	}

	@Override
	public int getRenderType()
	{
		return -1;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public void registerIcons(IIconRegister icon)
	{
		this.blockIcon = icon.registerIcon(Reference.MOD_ID + ":textures/items/matterPetrium.png");
	}
}
