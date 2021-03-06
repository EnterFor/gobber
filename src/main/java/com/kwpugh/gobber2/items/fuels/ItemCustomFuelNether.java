package com.kwpugh.gobber2.items.fuels;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemCustomFuelNether extends Item
{	
	private int burnTime;
	
	public ItemCustomFuelNether(Properties p_i48487_1_, String name, int burnTime)
	{
	    super(p_i48487_1_);
	    this.setRegistryName(name);
	    this.burnTime = burnTime;
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack)
	{
	    return this.burnTime;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_foo.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_foo.line2", this.burnTime).applyTextStyle(TextFormatting.YELLOW)));
	} 
}