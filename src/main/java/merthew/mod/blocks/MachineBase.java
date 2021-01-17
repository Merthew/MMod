package merthew.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MachineBase extends Block {

	public MachineBase() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(2.0f)
				.harvestLevel(1));
		// TODO Auto-generated constructor stub
	}
	
	

}
