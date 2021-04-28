/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Container;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.item.ItemStack;

import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.GUI.Tile.Inventory.GuiAutoEnchanter;
import Reika.ChromatiCraft.TileEntity.Processing.TileEntityAutoEnchanter;
import Reika.DragonAPI.Base.CoreContainer;
import Reika.DragonAPI.Libraries.IO.ReikaPacketHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerAutoEnchanter extends CoreContainer {

	private TileEntityAutoEnchanter tile;

	public ContainerAutoEnchanter(EntityPlayer player, TileEntityAutoEnchanter te) {
		super(player, te);
		tile = te;

		this.addSlot(0, 80, 35);
		this.addSlot(1, 14, 51);

		this.addPlayerInventoryWithOffset(player, 0, 15);
	}

	@Override
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();

		for (int i = 0; i < crafters.size(); i++)
		{
			ICrafting icrafting = (ICrafting)crafters.get(i);
			icrafting.sendProgressBarUpdate(this, 0, tile.progressTimer);
		}

		ReikaPacketHelper.sendTankSyncPacket(ChromatiCraft.packetChannel, tile, "tank");
	}

	@Override
	public void updateProgressBar(int par1, int par2)
	{
		if (par1 == 0) {
			tile.progressTimer = par2;
		}
	}

	@Override
	public ItemStack slotClick(int ID, int par2, int par3, EntityPlayer ep) {
		ItemStack is = super.slotClick(ID, par2, par3, ep);
		if (tile.worldObj.isRemote) {
			this.updateGui();
		}
		return is;
	}

	@SideOnly(Side.CLIENT)
	private void updateGui() {
		((GuiAutoEnchanter)Minecraft.getMinecraft().currentScreen).initGui();
	}


}
