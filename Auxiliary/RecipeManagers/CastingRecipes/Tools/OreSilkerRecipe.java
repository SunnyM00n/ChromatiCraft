package Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.Tools;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipe.TempleCastingRecipe;
import Reika.ChromatiCraft.Registry.CrystalElement;

public class OreSilkerRecipe extends TempleCastingRecipe {

	public OreSilkerRecipe(ItemStack out, IRecipe recipe) {
		super(out, recipe);

		this.addRune(CrystalElement.PURPLE, 0, -1, 1);
		this.addRune(CrystalElement.PURPLE, 0, -1, -1);

		this.addRune(CrystalElement.LIME, 1, -1, 0);
		this.addRune(CrystalElement.LIME, -1, -1, 0);
	}

}