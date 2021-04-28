/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Render.TESR;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import Reika.ChromatiCraft.Base.ChromaRenderBase;
import Reika.ChromatiCraft.Models.ModelItemRift;
import Reika.ChromatiCraft.TileEntity.Transport.TileEntityItemRift;
import Reika.DragonAPI.Interfaces.TileEntity.RenderFetcher;

public class RenderItemRift extends ChromaRenderBase {

	private ModelItemRift model = new ModelItemRift();

	@Override
	public String getImageFileName(RenderFetcher te) {
		return ((TileEntityItemRift)te).isEmitting() ? "itemrift.png" : "itemrift2.png";
	}

	@Override
	public void renderTileEntityAt(TileEntity tile, double par2, double par4, double par6, float par8) {
		TileEntityItemRift te = (TileEntityItemRift)tile;
		GL11.glPushMatrix();
		GL11.glTranslated(par2, par4, par6);

		int rot = 0;
		int rotx = 0;

		GL11.glPushMatrix();
		if (te.isInWorld()) {
			int dx = 0;
			int dz = 0;
			int dy = 1;
			switch(te.getFacing()) {
				case EAST:
					rot = 270;
					dx = 1;
					break;
				case WEST:
					rot = 90;
					dz = 1;
					break;
				case SOUTH:
					rot = 180;
					dx = 1;
					dz = 1;
					break;
				case NORTH:
					rot = 0;
					break;
				case DOWN:
					rotx = 270;
					dy = 0;
					break;
				case UP:
					rotx = 90;
					dy = 1;
					dz = 1;
					break;
				default:
					break;
			}
			GL11.glTranslated(dx, dy, dz);
			GL11.glRotated(rot, 0, 1, 0);
			GL11.glRotated(90, 1, 0, 0);
			GL11.glRotated(rotx, 1, 0, 0);
		}
		this.renderModel(te, model);
		GL11.glPopMatrix();

		//if (MinecraftForgeClient.getRenderPass() == 1 && !te.isEmitting) {
		//	this.renderCenter(te, par2, par4, par6, par8);
		//}
		GL11.glPopMatrix();
	}
	/*
	private void renderCenter(TileEntityItemRift te, double par2, double par4, double par6, float par8) {
		Tessellator v5 = Tessellator.instance;
		Coordinate c = te.getConnection();
		if (c == null)
			return;

		double w = 0.0625;
		int dx = 1+c.xCoord-te.xCoord;
		int dy = 1+c.yCoord-te.yCoord;
		int dz = 1+c.zCoord-te.zCoord;

		ReikaRenderHelper.prepareGeoDraw(true);
		v5.startDrawingQuads();
		v5.setColorRGBA(255, 255, 255, 127);
		v5.addVertex(0, 0.5+w, 0.5-w);
		v5.addVertex(dx, 0.5+w, 0.5-w);
		v5.addVertex(dx, 0.5-w, 0.5-w);
		v5.addVertex(0, 0.5-w, 0.5-w);

		v5.addVertex(0, 0.5-w, 0.5+w);
		v5.addVertex(dx, 0.5-w, 0.5+w);
		v5.addVertex(dx, 0.5+w, 0.5+w);
		v5.addVertex(0, 0.5+w, 0.5+w);


		v5.addVertex(0, 0.5+w, 0.5+w);
		v5.addVertex(dx, 0.5+w, 0.5+w);
		v5.addVertex(dx, 0.5+w, 0.5-w);
		v5.addVertex(0, 0.5+w, 0.5-w);

		v5.addVertex(0, 0.5-w, 0.5-w);
		v5.addVertex(dx, 0.5-w, 0.5-w);
		v5.addVertex(dx, 0.5-w, 0.5+w);
		v5.addVertex(0, 0.5-w, 0.5+w);
		v5.draw();

		v5.startDrawing(GL11.GL_LINE_LOOP);
		v5.setColorRGBA(255, 255, 255, 255);
		v5.addVertex(0, 0.5+w, 0.5-w);
		v5.addVertex(dx, 0.5+w, 0.5-w);
		v5.addVertex(dx, 0.5-w, 0.5-w);
		v5.addVertex(0, 0.5-w, 0.5-w);

		v5.addVertex(0, 0.5-w, 0.5+w);
		v5.addVertex(dx, 0.5-w, 0.5+w);
		v5.addVertex(dx, 0.5+w, 0.5+w);
		v5.addVertex(0, 0.5+w, 0.5+w);


		v5.addVertex(0, 0.5+w, 0.5+w);
		v5.addVertex(dx, 0.5+w, 0.5+w);
		v5.addVertex(dx, 0.5+w, 0.5-w);
		v5.addVertex(0, 0.5+w, 0.5-w);

		v5.addVertex(0, 0.5-w, 0.5-w);
		v5.addVertex(dx, 0.5-w, 0.5-w);
		v5.addVertex(dx, 0.5-w, 0.5+w);
		v5.addVertex(0, 0.5-w, 0.5+w);
		v5.draw();
		ReikaRenderHelper.exitGeoDraw();
	}
	 */
}
