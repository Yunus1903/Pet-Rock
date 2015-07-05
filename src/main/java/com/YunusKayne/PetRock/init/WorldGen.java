package com.YunusKayne.PetRock.init;

import java.util.Random;

import net.minecraft.client.main.Main;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
        
        switch(world.provider.dimensionId)
        {
        case -1:
                generateInNether(world, random, chunkX*16, chunkZ*16);
                break;
        case 0:
                generateInOverworld(world, random, chunkX*16, chunkZ*16);
                break;
        case 1:
                generateInEnd(world, random, chunkX*16, chunkZ*16);
                break;
        }
	}

	private void generateInOverworld(World world, Random random, int x, int z)
	{
       
        for(int i = 0; i < 30; i++ ) //How many times it spawns in a chunk
        {
                int chunkX = x + random.nextInt(16); //Where it spawns
                int chunkY = random.nextInt(30); //Below number ** it will spawn
                int chunkZ = z + random.nextInt(16); //Where it spawns
               
                (new WorldGenMinable(Blocks.orePetrium, 3)).generate(world, random, chunkX, chunkY, chunkZ); //Chunks of ...
        }
	}

	private void generateInNether(World world, Random random, int x, int z)
	{
       
	}
	
	private void generateInEnd(World world, Random random, int x, int z)
	{
       
	}

}
