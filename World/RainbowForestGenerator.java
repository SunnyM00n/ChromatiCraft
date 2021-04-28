/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import Reika.ChromatiCraft.Block.Dye.BlockDyeSapling;
import Reika.ChromatiCraft.Registry.ChromaOptions;
import Reika.ChromatiCraft.World.IWG.ColorTreeGenerator;
import Reika.DragonAPI.ModList;
import Reika.DragonAPI.Libraries.Java.ReikaRandomHelper;
import Reika.DragonAPI.Libraries.Registry.ReikaDyeHelper;
import Reika.DragonAPI.Libraries.World.ReikaWorldHelper;
import Reika.DragonAPI.ModInteract.ItemHandlers.ThaumItemHelper;

public class RainbowForestGenerator extends WorldGenerator {

	private static final boolean GENERATE_SMALL_RAINBOW_TREES = true;

	private static final float FERTILE_VINE_CHANCE_FACTOR = 0.12F;//0.1F;

	//private static Simplex3DGenerator colorOffsetNoise;

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		if (ColorTreeGenerator.canGenerateTree(world, x, z) && BlockDyeSapling.canGrowAt(world, x, y, z, true)) {
			//ColorTreeGenerator.growTree(world, x, y, z, 5+random.nextInt(3), random, this.getColor(x, y, z));
			//TreeShaper.getInstance().generateTallTree(world, x, y, z);
			ReikaDyeHelper color = getColor(x, y, z);
			if (random.nextInt(10) == 0) {
				boolean generated = false;
				if (RainbowTreeGenerator.getInstance().checkRainbowTreeSpace(world, x, y, z)) {
					RainbowTreeGenerator.getInstance().generateLargeRainbowTree(world, x, y, z, random);
					generated = true;
					if (ModList.THAUMCRAFT.isLoaded() && ChromaOptions.ETHEREAL.getState()) {
						for (int i = 0; i < 8; i++) {
							int dx = ReikaRandomHelper.getRandomPlusMinus(x, 6);
							int dz = ReikaRandomHelper.getRandomPlusMinus(z, 6);
							while (!world.checkChunksExist(dx, 0, dz, dx, world.provider.getActualHeight(), dz)) {
								dx = ReikaRandomHelper.getRandomPlusMinus(x, 6);
								dz = ReikaRandomHelper.getRandomPlusMinus(z, 6);
							}
							int dy = world.getTopSolidOrLiquidBlock(dx, dz);
							if (ReikaWorldHelper.softBlocks(world, dx, dy, dz)) {
								Block id = ThaumItemHelper.BlockEntry.ETHEREAL.getBlock();
								int meta = ThaumItemHelper.BlockEntry.ETHEREAL.metadata;
								world.setBlock(dx, dy, dz, id, meta, 3);
								world.func_147451_t(dx, dy, dz);
								world.func_147479_m(dx, dy, dz);
							}
						}
					}
				}
				else if (GENERATE_SMALL_RAINBOW_TREES && random.nextInt(5) == 0) {
					generated = RainbowTreeGenerator.getInstance().tryGenerateSmallRainbowTree(world, x, y, z, random);
				}
				if (!generated) {
					TreeShaper.getInstance().generateRandomWeightedTree(world, x, y, z, random, color, false, this.getVineChance(random), FERTILE_VINE_CHANCE_FACTOR);
				}
			}
			else {
				TreeShaper.getInstance().generateRandomWeightedTree(world, x, y, z, random, color, false, this.getVineChance(random), FERTILE_VINE_CHANCE_FACTOR);
			}
			return true;
		}
		return false;
	}

	private float getVineChance(Random rand) {
		return rand.nextInt(5) <= 1 ? 0.6F+rand.nextFloat()*0.4F : 0;
	}

	public static ReikaDyeHelper getColor(/*World world, */int x, int y, int z) {
		/*
		if (colorOffsetNoise == null || colorOffsetNoise.seed != world.getSeed()) {
			colorOffsetNoise = (Simplex3DGenerator)new Simplex3DGenerator(world.getSeed()).setFrequency(1/60D);
		}*/
		int idx = (Math.abs(x/16)+y+Math.abs(z/16));
		//idx += ReikaMathLibrary.normalizeToBounds(colorOffsetNoise.getValue(idx, y, z), 0, 16);
		return ReikaDyeHelper.dyes[(idx+16)%16];
	}

}
