package com.wuest.prefab.Config;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

/**
 * This class is the main configuration holder.
 * @author WuesMan
 */
public class WareHouseConfiguration extends StructureConfiguration
{
	private static String dyeColorTag = "dyeColor";
	public EnumDyeColor dyeColor;
	
	public WareHouseConfiguration()
	{
		super();
	}
		
	@Override
	public void Initialize()
	{
		super.Initialize();
		this.houseFacing = EnumFacing.SOUTH;
		this.dyeColor = EnumDyeColor.CYAN;
	}
	
	@Override
	protected void CustomReadFromNBTTag(NBTTagCompound messageTag, StructureConfiguration config)
	{
		if (messageTag.hasKey(WareHouseConfiguration.dyeColorTag))
		{
			((WareHouseConfiguration)config).dyeColor = EnumDyeColor.byMetadata(messageTag.getInteger(WareHouseConfiguration.dyeColorTag));
		}		
	}
	
	public WareHouseConfiguration ReadFromNBTTagCompound(NBTTagCompound messageTag)
	{
		WareHouseConfiguration config = new WareHouseConfiguration();
		
		return (WareHouseConfiguration)super.ReadFromNBTTagCompound(messageTag, config);
	}
	
	@Override
	protected NBTTagCompound CustomWriteToNBTTagCompound(NBTTagCompound tag)
	{
		tag.setInteger(WareHouseConfiguration.dyeColorTag, this.dyeColor.getMetadata());
		
		return tag;
	}
}