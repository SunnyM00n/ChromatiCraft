/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Biome;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.ForgeDirection;

import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.Base.ChromaDimensionBiome;
import Reika.ChromatiCraft.World.Dimension.ChromaDimensionManager.Biomes;
import Reika.DragonAPI.Libraries.MathSci.ReikaMathLibrary;
import Reika.DragonAPI.Libraries.Rendering.ReikaColorAPI;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StructureBiome extends ChromaDimensionBiome {

	public StructureBiome(int id, String n, Biomes t) {
		super(id, n, t);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public final int getBiomeGrassColor(int x, int y, int z) {
		World world = Minecraft.getMinecraft().theWorld;
		int c = this.getBaseColor(x, y, z);
		if (world == null)
			return c;
		for (int i = 2; i < 6; i++) {
			ForgeDirection dir = ForgeDirection.VALID_DIRECTIONS[i];
			for (int k = 1; k <= 4; k++) {
				int dx = x+dir.offsetX*k;
				int dz = z+dir.offsetZ*k;
				BiomeGenBase b = world.getBiomeGenForCoords(dx, dz);
				if (b != this) {
					return this.getHighlightColor(x, y, z, c);
				}
			}
		}
		double rx = x/4D;
		double rz = z/4D;
		float f = (float)ReikaMathLibrary.normalizeToBounds(grassColor.getValue(rx, rz), 0, 1);
		c = ReikaColorAPI.mixColors(ReikaColorAPI.multiplyChannels(c, 1, 1.5F, 1F), this.getHighlightColor(x, y, z, c), f);
		return c;
	}

	protected int getHighlightColor(int x, int y, int z, int c) {
		return ReikaColorAPI.multiplyChannels(c, 1, 2.5F, 1.5F);
	}

	protected int getBaseColor(int x, int y, int z) {
		return ChromatiCraft.rainbowforest.getBiomeGrassColor(x, y, z);
	}

	@Override
	public int getWaterColorMultiplier() {
		return 0xffffff;
	}

}
