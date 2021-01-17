package merthew.mod.util;

import merthew.mod.blocks.MachineBase;
import merthew.mod.items.Dagger;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {

	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Reference.MODID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

	public static void init() {
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	public static final RegistryObject<MachineBase> MACHINEBASE = BLOCKS.register("machine_base", MachineBase::new);
	public static final RegistryObject<Item> MACHINEBASE_ITEM = ITEMS.register("machine_base",
			() -> new BlockItem(MACHINEBASE.get(), new Item.Properties().group(Reference.ITEM_GROUP)));

	public static final RegistryObject<Dagger> DAGGER = ITEMS.register("dagger", Dagger::new);
}
