package merthew.mod.items;

import merthew.mod.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class Dagger extends SwordItem{

	public Dagger() {
		super(ItemTier.IRON, 0, 2, new Item.Properties().maxStackSize(1).group(Reference.ITEM_GROUP));
	}
	
	

}
