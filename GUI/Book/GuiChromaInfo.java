package Reika.ChromatiCraft.GUI.Book;

import net.minecraft.entity.player.EntityPlayer;
import Reika.ChromatiCraft.Base.GuiBookSection;
import Reika.ChromatiCraft.Registry.ChromaResearch;

public class GuiChromaInfo extends GuiBookSection {

	public GuiChromaInfo(EntityPlayer ep, ChromaResearch r) {
		super(ep, r, 220, 256);
	}

	@Override
	protected int getMaxSubpage() {
		return 0;
	}

	@Override
	protected PageType getGuiLayout() {
		return PageType.PLAIN;
	}

}