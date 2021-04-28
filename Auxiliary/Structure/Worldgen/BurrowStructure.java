package Reika.ChromatiCraft.Auxiliary.Structure.Worldgen;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import Reika.ChromatiCraft.Base.FragmentStructureBase;
import Reika.ChromatiCraft.Block.Worldgen.BlockStructureShield.BlockType;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.DragonAPI.Instantiable.Data.BlockStruct.FilledBlockArray;
import Reika.DragonAPI.Instantiable.Data.Immutable.Coordinate;


public class BurrowStructure extends FragmentStructureBase {

	@Override
	public Coordinate getControllerRelativeLocation() {
		return new Coordinate(-5, -8, -2);
	}

	@Override
	public FilledBlockArray getArray(World world, int x, int y, int z) {
		FilledBlockArray array = new FilledBlockArray(world);

		y -= 11;
		x -= 8;
		z -= 5;

		//Cracking block
		array.setBlock(x+5, y+4, z+3, shield, BlockType.STONE.metadata);

		array.setBlock(x+0, y+2, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+3, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+5, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+5, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+6, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+6, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+6, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+0, y+7, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+1, z+2, shield, 12);
		array.setBlock(x+1, y+1, z+3, shield, 12);
		array.setBlock(x+1, y+1, z+4, shield, 12);
		array.setBlock(x+1, y+2, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+2, z+4, shield, 12);
		array.setBlock(x+1, y+3, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+3, z+3, shield, 11);
		array.setBlock(x+1, y+3, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+4, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+4, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+4, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+5, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+5, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+5, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+5, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+5, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+6, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+6, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+6, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+6, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+7, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+7, z+3, shield, 11);
		array.setBlock(x+1, y+7, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+7, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+1, y+8, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+0, z+2, shield, 12);
		array.setBlock(x+2, y+0, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+0, z+4, shield, 12);
		array.setBlock(x+2, y+1, z+1, shield, 12);
		array.setBlock(x+2, y+1, z+5, shield, 12);
		array.setBlock(x+2, y+2, z+1, shield, 12);
		array.setBlock(x+2, y+2, z+5, shield, 12);
		array.setBlock(x+2, y+3, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+3, z+5, shield, 12);
		array.setBlock(x+2, y+4, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+4, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+4, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+4, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+4, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+5, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+5, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+5, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+5, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+6, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+6, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+6, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+6, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+7, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+7, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+8, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+8, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+2, y+8, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+0, z+2, shield, 12);
		array.setBlock(x+3, y+0, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+0, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+1, z+1, shield, 12);
		array.setBlock(x+3, y+1, z+5, shield, 12);
		array.setBlock(x+3, y+2, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+2, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+3, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+3, z+1, shield, 11);
		array.setBlock(x+3, y+3, z+5, shield, 11);
		array.setBlock(x+3, y+3, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+4, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+4, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+4, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+4, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+4, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+5, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+5, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+6, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+6, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+7, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+7, z+1, shield, 11);
		array.setBlock(x+3, y+7, z+5, shield, 11);
		array.setBlock(x+3, y+7, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+8, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+8, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+8, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+8, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+3, y+8, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+0, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+0, z+3, shield, 12);
		array.setBlock(x+4, y+0, z+4, shield, 12);
		array.setBlock(x+4, y+1, z+1, shield, 12);
		array.setBlock(x+4, y+1, z+5, shield, 12);
		array.setBlock(x+4, y+2, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+2, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+3, z+1, shield, 12);
		array.setBlock(x+4, y+3, z+5, shield, 12);
		array.setBlock(x+4, y+4, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+4, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+4, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+4, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+4, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+5, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+5, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+5, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+5, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+6, z+0, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+6, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+6, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+6, z+6, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+7, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+7, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+8, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+8, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+4, y+8, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+1, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+1, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+1, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+1, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+1, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+2, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+2, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+3, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+3, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+4, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+4, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+5, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+5, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+6, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+6, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+7, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+7, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+8, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+5, y+8, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+2, z+2, shield, 12);
		array.setBlock(x+6, y+2, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+2, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+3, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+3, z+3, shield, 12);
		array.setBlock(x+6, y+3, z+4, shield, 12);
		array.setBlock(x+6, y+4, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+5, z+2, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+5, z+3, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+5, z+4, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+6, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+6, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+7, z+1, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+7, z+5, shield, BlockType.STONE.metadata);
		array.setBlock(x+6, y+8, z+1, Blocks.stone);
		array.setBlock(x+6, y+8, z+5, Blocks.stone);
		array.setBlock(x+7, y+6, z+1, Blocks.stone);
		array.setBlock(x+7, y+6, z+2, Blocks.stone);
		array.setBlock(x+7, y+6, z+3, Blocks.stone);
		array.setBlock(x+7, y+6, z+4, Blocks.stone);
		array.setBlock(x+7, y+7, z+1, Blocks.stone);
		array.setBlock(x+7, y+7, z+5, Blocks.stone);
		array.setBlock(x+7, y+8, z+1, Blocks.stone);
		array.setBlock(x+7, y+8, z+5, Blocks.stone);
		array.setBlock(x+8, y+7, z+2, Blocks.stone);
		array.setBlock(x+8, y+7, z+3, Blocks.stone);
		array.setBlock(x+8, y+7, z+4, Blocks.stone);

		//Covering
		array.setBlock(x+7, y+10, z+5, Blocks.grass);
		array.setBlock(x+7, y+11, z+2, Blocks.grass);
		array.setBlock(x+7, y+11, z+3, Blocks.grass);
		array.setBlock(x+7, y+11, z+4, Blocks.grass);
		array.setBlock(x+8, y+8, z+2, Blocks.dirt);
		array.setBlock(x+8, y+8, z+3, Blocks.dirt);
		array.setBlock(x+8, y+8, z+4, Blocks.dirt);
		array.setBlock(x+8, y+9, z+2, Blocks.dirt);
		array.setBlock(x+8, y+9, z+3, Blocks.grass);
		array.setBlock(x+8, y+9, z+4, Blocks.dirt);
		array.setBlock(x+8, y+10, z+1, Blocks.grass);
		array.setBlock(x+8, y+10, z+2, Blocks.grass);
		array.setBlock(x+8, y+10, z+4, Blocks.grass);
		array.setBlock(x+8, y+10, z+5, Blocks.grass);
		array.setBlock(x+9, y+10, z+1, Blocks.grass);
		array.setBlock(x+9, y+10, z+2, Blocks.grass);
		array.setBlock(x+9, y+10, z+3, Blocks.grass);
		array.setBlock(x+9, y+10, z+4, Blocks.grass);
		array.setBlock(x+9, y+10, z+5, Blocks.grass);
		array.setBlock(x+7, y+9, z+1, Blocks.dirt);
		array.setBlock(x+7, y+9, z+5, Blocks.dirt);
		array.setBlock(x+7, y+10, z+1, Blocks.dirt);
		array.setBlock(x+6, y+9, z+1, Blocks.dirt);
		array.setBlock(x+6, y+9, z+5, Blocks.dirt);
		array.setBlock(x+6, y+10, z+2, Blocks.dirt);
		array.setBlock(x+6, y+10, z+3, Blocks.dirt);
		array.setBlock(x+6, y+10, z+4, Blocks.dirt);
		array.setBlock(x+6, y+11, z+2, Blocks.grass);
		array.setBlock(x+6, y+11, z+3, Blocks.grass);
		array.setBlock(x+6, y+11, z+4, Blocks.grass);
		array.setBlock(x+5, y+9, z+1, Blocks.dirt);
		array.setBlock(x+5, y+9, z+5, Blocks.dirt);
		array.setBlock(x+5, y+10, z+2, Blocks.dirt);
		array.setBlock(x+5, y+10, z+3, Blocks.dirt);
		array.setBlock(x+5, y+10, z+4, Blocks.dirt);
		array.setBlock(x+5, y+11, z+2, Blocks.grass);
		array.setBlock(x+5, y+11, z+3, Blocks.grass);
		array.setBlock(x+5, y+11, z+4, Blocks.grass);
		array.setBlock(x+4, y+9, z+2, Blocks.dirt);
		array.setBlock(x+4, y+9, z+3, Blocks.dirt);
		array.setBlock(x+4, y+9, z+4, Blocks.dirt);

		//ReikaJavaLibrary.pConsole("Running burrow lamp "+this.getCurrentColor()+" on "+Thread.currentThread().getName());
		array.setBlock(x+3, y+1, z+3, ChromaBlocks.LAMP.getBlockInstance(), this.getCurrentColor().ordinal());
		array.setBlock(x+3, y+5, z+3, Blocks.torch, 5);

		//Chests
		array.setBlock(x+3, y+6, z+1, getChestGen(), getChestMeta(ForgeDirection.SOUTH));
		array.setBlock(x+1, y+6, z+3, getChestGen(), getChestMeta(ForgeDirection.EAST));
		array.setBlock(x+3, y+6, z+5, getChestGen(), getChestMeta(ForgeDirection.NORTH));
		array.setBlock(x+3, y+2, z+1, getChestGen(), getChestMeta(ForgeDirection.SOUTH));
		array.setBlock(x+1, y+2, z+3, getChestGen(), getChestMeta(ForgeDirection.EAST));
		array.setBlock(x+3, y+2, z+5, getChestGen(), getChestMeta(ForgeDirection.NORTH));

		//Air
		array.setBlock(x+2, y+1, z+2, Blocks.air);
		array.setBlock(x+2, y+1, z+3, Blocks.air);
		array.setBlock(x+2, y+1, z+4, Blocks.air);
		array.setBlock(x+2, y+2, z+2, Blocks.air);
		array.setBlock(x+2, y+2, z+3, Blocks.air);
		array.setBlock(x+2, y+2, z+4, Blocks.air);
		array.setBlock(x+2, y+3, z+2, Blocks.air);
		array.setBlock(x+2, y+3, z+3, Blocks.air);
		array.setBlock(x+2, y+3, z+4, Blocks.air);
		array.setBlock(x+2, y+5, z+2, Blocks.air);
		array.setBlock(x+2, y+5, z+3, Blocks.air);
		array.setBlock(x+2, y+5, z+4, Blocks.air);
		array.setBlock(x+2, y+6, z+2, Blocks.air);
		array.setBlock(x+2, y+6, z+3, Blocks.air);
		array.setBlock(x+2, y+6, z+4, Blocks.air);
		array.setBlock(x+2, y+7, z+2, Blocks.air);
		array.setBlock(x+2, y+7, z+3, Blocks.air);
		array.setBlock(x+2, y+7, z+4, Blocks.air);
		array.setBlock(x+3, y+1, z+2, Blocks.air);
		array.setBlock(x+3, y+1, z+4, Blocks.air);
		array.setBlock(x+3, y+2, z+2, Blocks.air);
		array.setBlock(x+3, y+2, z+3, Blocks.air);
		array.setBlock(x+3, y+2, z+4, Blocks.air);
		array.setBlock(x+3, y+3, z+2, Blocks.air);
		array.setBlock(x+3, y+3, z+3, Blocks.air);
		array.setBlock(x+3, y+3, z+4, Blocks.air);
		array.setBlock(x+3, y+5, z+2, Blocks.air);
		array.setBlock(x+3, y+5, z+4, Blocks.air);
		array.setBlock(x+3, y+6, z+2, Blocks.air);
		array.setBlock(x+3, y+6, z+3, Blocks.air);
		array.setBlock(x+3, y+6, z+4, Blocks.air);
		array.setBlock(x+3, y+7, z+2, Blocks.air);
		array.setBlock(x+3, y+7, z+3, Blocks.air);
		array.setBlock(x+3, y+7, z+4, Blocks.air);
		array.setBlock(x+4, y+1, z+2, Blocks.air);
		array.setBlock(x+4, y+1, z+3, Blocks.air);
		array.setBlock(x+4, y+1, z+4, Blocks.air);
		array.setBlock(x+4, y+2, z+2, Blocks.air);
		array.setBlock(x+4, y+2, z+3, Blocks.air);
		array.setBlock(x+4, y+2, z+4, Blocks.air);
		array.setBlock(x+4, y+3, z+2, Blocks.air);
		array.setBlock(x+4, y+3, z+3, Blocks.air);
		array.setBlock(x+4, y+3, z+4, Blocks.air);
		array.setBlock(x+4, y+5, z+2, Blocks.air);
		array.setBlock(x+4, y+5, z+3, Blocks.air);
		array.setBlock(x+4, y+5, z+4, Blocks.air);
		array.setBlock(x+4, y+6, z+2, Blocks.air);
		array.setBlock(x+4, y+6, z+3, Blocks.air);
		array.setBlock(x+4, y+6, z+4, Blocks.air);
		array.setBlock(x+4, y+7, z+2, Blocks.air);
		array.setBlock(x+4, y+7, z+3, Blocks.air);
		array.setBlock(x+4, y+7, z+4, Blocks.air);
		array.setBlock(x+5, y+2, z+2, Blocks.air);
		array.setBlock(x+5, y+2, z+3, Blocks.air);
		array.setBlock(x+5, y+2, z+4, Blocks.air);
		array.setBlock(x+5, y+3, z+2, Blocks.air);
		array.setBlock(x+5, y+3, z+3, Blocks.air);
		array.setBlock(x+5, y+3, z+4, Blocks.air);
		array.setBlock(x+5, y+5, z+2, Blocks.air);
		array.setBlock(x+5, y+5, z+3, Blocks.air);
		array.setBlock(x+5, y+5, z+4, Blocks.air);
		array.setBlock(x+5, y+6, z+2, Blocks.air);
		array.setBlock(x+5, y+6, z+3, Blocks.air);
		array.setBlock(x+5, y+6, z+4, Blocks.air);
		array.setBlock(x+5, y+7, z+2, Blocks.air);
		array.setBlock(x+5, y+7, z+3, Blocks.air);
		array.setBlock(x+5, y+7, z+4, Blocks.air);
		array.setBlock(x+5, y+8, z+2, Blocks.air);
		array.setBlock(x+5, y+8, z+3, Blocks.air);
		array.setBlock(x+5, y+8, z+4, Blocks.air);
		array.setBlock(x+5, y+9, z+2, Blocks.air);
		array.setBlock(x+5, y+9, z+3, Blocks.air);
		array.setBlock(x+5, y+9, z+4, Blocks.air);
		array.setBlock(x+6, y+6, z+2, Blocks.air);
		array.setBlock(x+6, y+6, z+3, Blocks.air);
		array.setBlock(x+6, y+6, z+4, Blocks.air);
		array.setBlock(x+6, y+7, z+2, Blocks.air);
		array.setBlock(x+6, y+7, z+3, Blocks.air);
		array.setBlock(x+6, y+7, z+4, Blocks.air);
		array.setBlock(x+6, y+8, z+2, Blocks.air);
		array.setBlock(x+6, y+8, z+3, Blocks.air);
		array.setBlock(x+6, y+8, z+4, Blocks.air);
		array.setBlock(x+6, y+9, z+2, Blocks.air);
		array.setBlock(x+6, y+9, z+3, Blocks.air);
		array.setBlock(x+6, y+9, z+4, Blocks.air);
		array.setBlock(x+7, y+7, z+2, Blocks.air);
		array.setBlock(x+7, y+7, z+3, Blocks.air);
		array.setBlock(x+7, y+7, z+4, Blocks.air);
		array.setBlock(x+7, y+8, z+2, Blocks.air);
		array.setBlock(x+7, y+8, z+3, Blocks.air);
		array.setBlock(x+7, y+8, z+4, Blocks.air);
		array.setBlock(x+7, y+9, z+2, Blocks.air);
		array.setBlock(x+7, y+9, z+3, Blocks.air);
		array.setBlock(x+7, y+9, z+4, Blocks.air);
		array.setBlock(x+7, y+10, z+2, Blocks.air);
		array.setBlock(x+7, y+10, z+3, Blocks.air);
		array.setBlock(x+7, y+10, z+4, Blocks.air);

		//Water pit, if cannot stop it genning under lakes
		//array.setBlock(x+7, y+5, z+3, Blocks.air);
		//array.setBlock(x+7, y+6, z+3, Blocks.air);

		//Entry Blocks
		array.setBlock(x+8, y+10, z+3, Blocks.air);
		array.setBlock(x+8, y+11, z+3, Blocks.air);
		array.setBlock(x+8, y+11, z+2, Blocks.air);
		array.setBlock(x+8, y+11, z+4, Blocks.air);

		return array;
	}

	public FilledBlockArray getFurnaceRoom(World world, int i, int j, int k) {
		j -= 3;
		k -= 4;

		FilledBlockArray array = new FilledBlockArray(world);

		array.setBlock(i + 1, j + 2, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 2, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 2, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 3, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 3, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 3, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 4, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 4, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 4, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 1, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 1, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 1, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 2, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 3, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 4, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 4, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 4, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 5, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 5, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 5, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 2, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 2, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 2, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 3, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 3, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 3, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 4, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 4, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 4, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 5, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 5, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 5, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 5, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 3, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 3, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 4, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 4, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 5, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 5, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 5, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 5, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 3, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 3, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 4, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 4, k + 10, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 5, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 5, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 5, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 5, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 9, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 4, k + 6, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 4, k + 7, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 4, k + 8, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 4, k + 9, shield, BlockType.STONE.metadata);

		array.setBlock(i + 2, j + 2, k + 6, shield, BlockType.CRACK.metadata); //cracks
		array.setBlock(i + 2, j + 3, k + 6, shield, BlockType.CRACK.metadata);

		array.setBlock(i + 4, j + 3, k + 6, Blocks.furnace, 3);
		array.setBlock(i + 5, j + 3, k + 6, Blocks.furnace, 3);

		placeHeatLamp(i + 5, j + 4, k + 6); //heat lamps
		placeHeatLamp(i + 4, j + 4, k + 6);

		array.setBlock(i + 2, j + 2, k + 8, Blocks.torch, 5);
		array.setBlock(i + 5, j + 3, k + 8, Blocks.torch, 5);

		array.setBlock(i + 5, j + 3, k + 7, Blocks.air);
		array.setBlock(i + 5, j + 3, k + 9, Blocks.air);
		array.setBlock(i + 5, j + 4, k + 7, Blocks.air);
		array.setBlock(i + 5, j + 4, k + 8, Blocks.air);
		array.setBlock(i + 5, j + 4, k + 9, Blocks.air);
		array.setBlock(i + 2, j + 2, k + 7, Blocks.air);
		array.setBlock(i + 2, j + 2, k + 9, Blocks.air);
		array.setBlock(i + 2, j + 3, k + 7, Blocks.air);
		array.setBlock(i + 2, j + 3, k + 8, Blocks.air);
		array.setBlock(i + 2, j + 3, k + 9, Blocks.air);
		array.setBlock(i + 2, j + 4, k + 8, Blocks.air);
		array.setBlock(i + 2, j + 4, k + 9, Blocks.air);
		array.setBlock(i + 3, j + 2, k + 8, Blocks.air);
		array.setBlock(i + 3, j + 2, k + 9, Blocks.air);
		array.setBlock(i + 3, j + 3, k + 8, Blocks.air);
		array.setBlock(i + 3, j + 3, k + 9, Blocks.air);
		array.setBlock(i + 3, j + 4, k + 8, Blocks.air);
		array.setBlock(i + 3, j + 4, k + 9, Blocks.air);
		array.setBlock(i + 4, j + 3, k + 7, Blocks.air);
		array.setBlock(i + 4, j + 3, k + 8, Blocks.air);
		array.setBlock(i + 4, j + 3, k + 9, Blocks.air);
		array.setBlock(i + 4, j + 4, k + 7, Blocks.air);
		array.setBlock(i + 4, j + 4, k + 8, Blocks.air);
		array.setBlock(i + 4, j + 4, k + 9, Blocks.air);
	}

	public FilledBlockArray getLootRoom(World world, int i, int j, int k) {
		j -= 3;
		k -= 4;

		FilledBlockArray array = new FilledBlockArray(world);

		array.setBlock(i + 1, j + 2, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 1, j + 3, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 1, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 1, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 2, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 3, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 4, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 2, j + 4, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 1, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 2, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 2, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 3, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 3, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 4, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 4, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 3, j + 4, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 0, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 0, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 0, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 0, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 1, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 1, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 1, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 1, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 2, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 3, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 3, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 3, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 3, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 4, j + 4, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 0, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 0, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 0, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 0, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 1, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 1, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 2, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 3, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 3, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 3, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 3, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 5, j + 4, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 0, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 0, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 0, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 0, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 1, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 1, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 2, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 2, k + 5, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 0, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 3, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 6, j + 4, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 1, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 1, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 1, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 1, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 2, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 2, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 2, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 2, k + 4, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 3, k + 1, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 3, k + 2, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 3, k + 3, shield, BlockType.STONE.metadata);
		array.setBlock(i + 7, j + 3, k + 4, shield, BlockType.STONE.metadata);

		array.setBlock(i + 2, j + 2, k + 2, shield, BlockType.CRACK.metadata); //cracks
		array.setBlock(i + 2, j + 3, k + 2, shield, BlockType.CRACK.metadata);

		array.setBlock(i + 3, j + 4, k + 6, shield, BlockType.CRACK.metadata); //crack to expose chest

		array.setBlock(i + 3, j + 4, k + 5, Blocks.chest, 3); //key holder

		placeDoor(i + 5, j + 1, k + 2); //door
		placeDoor(i + 5, j + 2, k + 2);
		placeDoor(i + 6, j + 1, k + 2);
		placeDoor(i + 6, j + 2, k + 2);

		array.setBlock(i + 6, j + 1, k + 4, this.getChestGen(), 2); //chests
		array.setBlock(i + 5, j + 1, k + 4, getChestGen(), 2);

		array.setBlock(i + 3, j + 2, k + 1, Blocks.torch, 5);
		array.setBlock(i + 6, j + 1, k + 3, Blocks.torch, 5);

		array.setBlock(i + 2, j + 2, k + 1, Blocks.air);
		array.setBlock(i + 3, j + 3, k + 1, Blocks.air);
		array.setBlock(i + 2, j + 3, k + 1, Blocks.air);
		array.setBlock(i + 4, j + 1, k + 1, Blocks.air);
		array.setBlock(i + 4, j + 2, k + 1, Blocks.air);
		array.setBlock(i + 4, j + 3, k + 1, Blocks.air);
		array.setBlock(i + 5, j + 1, k + 1, Blocks.air);
		array.setBlock(i + 5, j + 1, k + 3, Blocks.air);
		array.setBlock(i + 5, j + 2, k + 1, Blocks.air);
		array.setBlock(i + 5, j + 2, k + 3, Blocks.air);
		array.setBlock(i + 5, j + 2, k + 4, Blocks.air);
		array.setBlock(i + 5, j + 3, k + 1, Blocks.air);
		array.setBlock(i + 6, j + 1, k + 1, Blocks.air);
		array.setBlock(i + 6, j + 2, k + 1, Blocks.air);
		array.setBlock(i + 6, j + 2, k + 3, Blocks.air);
		array.setBlock(i + 6, j + 2, k + 4, Blocks.air);
		array.setBlock(i + 6, j + 3, k + 1, Blocks.air);

		return array;
	}

	@Override
	public int getStructureVersion() {
		return 0;
	}

}
