package com.wuest.prefab.Blocks;

import com.wuest.prefab.ModRegistry;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockHalfGlassSlab extends BlockGlassSlab
{
	@Override
	public boolean isDouble()
	{
		return false;
	}
}
