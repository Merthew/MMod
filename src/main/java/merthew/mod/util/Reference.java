package merthew.mod.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference {
	
	public static final String MODID = "mmod";
	
	public static final ItemGroup ITEM_GROUP = new ItemGroup("Merthew Mod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registry.MACHINEBASE.get());
        }
    };

}
