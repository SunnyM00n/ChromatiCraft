/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Auxiliary;

import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.IIcon;

import org.lwjgl.opengl.GL11;

import Reika.ChromatiCraft.Magic.RuneShape;
import Reika.ChromatiCraft.Magic.RuneShape.RuneViewer;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.ChromatiCraft.Registry.ChromaTiles;
import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.DragonAPI.Instantiable.Data.Coordinate;
import Reika.DragonAPI.Libraries.IO.ReikaTextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RuneShapeRenderer {

	public static final RuneShapeRenderer instance = new RuneShapeRenderer();

	private final RenderBlocks render = new RenderBlocks();
	private final RenderItem itemrender = new RenderItem();

	private RuneShapeRenderer() {

	}

	public void render(RuneShape s, int x, int y) {
		this.render(s.getView(), x, y);
	}

	public void render(RuneViewer s, int midx, int midy) {
		Map<Coordinate, CrystalElement> map = s.getRunes();
		GL11.glPushMatrix();

		/*
		int dy = 16;//50;
		int dx = 16;
		int dz = dx/2;
		/*
		for (int i = -5; i <= 5; i++) {
			for (int k = -5; k <= 5; k++) {
				int px = midx-8+i*dx+k*dx;
				int py = midy-8-i*dz+k*dz-50;
				ReikaGuiAPI.instance.drawItemStack(itemrender, new ItemStack(ChromaBlocks.PYLONSTRUCT.getBlockInstance(), 1, 0), px, py);
			}
		}*//*
		for (Coordinate c : map.keySet()) {
			CrystalElement e = map.get(c);
			int meta = e.ordinal();
			int px = midx-8+c.xCoord*dx+c.zCoord*dx;
			int py = midy-8-c.xCoord*dz+c.zCoord*dz-c.yCoord*dy;
			//render.renderBlockAsItem(ChromaBlocks.RUNE.getBlockInstance(), meta, 1);
			ReikaGuiAPI.instance.drawItemStack(itemrender, new ItemStack(ChromaBlocks.RUNE.getBlockInstance(), 1, meta), px, py);
		}
		 */
		ReikaTextureHelper.bindTerrainTexture();
		Tessellator v5 = Tessellator.instance;
		int w = 16;
		int dx = midx-w/2;
		int dy = midy-w/2;
		int y = s.getMinY()+(int)((System.currentTimeMillis()/5000)%s.getSizeY());
		v5.startDrawingQuads();
		for (int x = -5; x <= 5; x++) {
			for (int z = -5; z <= 5; z++) {
				IIcon ico = ChromaBlocks.PYLONSTRUCT.getBlockInstance().getIcon(0, 0);
				CrystalElement e = map.get(new Coordinate(x, y, z));
				if (e != null)
					ico = e.getBlockRune();

				if (x == 0 && z == 0) {
					ico = ChromaTiles.TABLE.getBlock().getIcon(1, ChromaTiles.TABLE.getBlockMetadata());
				}

				float u = ico.getMinU();
				float v = ico.getMinV();
				float du = ico.getMaxU();
				float dv = ico.getMaxV();

				v5.addVertexWithUV(dx+x*w, dy+(z+1)*w, 0, u, dv);
				v5.addVertexWithUV(dx+(x+1)*w, dy+(z+1)*w, 0, du, dv);
				v5.addVertexWithUV(dx+(x+1)*w, dy+z*w, 0, du, v);
				v5.addVertexWithUV(dx+x*w, dy+z*w, 0, u, v);
			}
		}

		for (Coordinate c : map.keySet()) {
			if (c.yCoord == y) {
				CrystalElement e = map.get(c);
				IIcon ico = e.getFaceRune();

				int x = c.xCoord;
				int z = c.zCoord;

				float u = ico.getMinU();
				float v = ico.getMinV();
				float du = ico.getMaxU();
				float dv = ico.getMaxV();

				v5.addVertexWithUV(dx+x*w, dy+(z+1)*w, 0, u, dv);
				v5.addVertexWithUV(dx+(x+1)*w, dy+(z+1)*w, 0, du, dv);
				v5.addVertexWithUV(dx+(x+1)*w, dy+z*w, 0, du, v);
				v5.addVertexWithUV(dx+x*w, dy+z*w, 0, u, v);
			}
		}
		v5.draw();

		if (!map.isEmpty())
			Minecraft.getMinecraft().fontRenderer.drawString("y="+y, midx+93, midy-4, 0x000000);

		GL11.glPopMatrix();
	}

}
