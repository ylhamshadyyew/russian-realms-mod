
package net.mcreator.russianrealms.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.russianrealms.block.BlockWhiteBrick;
import net.mcreator.russianrealms.ElementsRussianRealms;

@ElementsRussianRealms.ModElement.Tag
public class TabRussianrealmsmod extends ElementsRussianRealms.ModElement {
	public TabRussianrealmsmod(ElementsRussianRealms instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabrussianrealmsmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockWhiteBrick.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
