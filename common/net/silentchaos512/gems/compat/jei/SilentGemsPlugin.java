package net.silentchaos512.gems.compat.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.silentchaos512.gems.api.lib.EnumMaterialGrade;
import net.silentchaos512.gems.item.ModItems;
import net.silentchaos512.gems.lib.Names;

@JEIPlugin
public class SilentGemsPlugin implements IModPlugin {

  public static IJeiHelpers jeiHelper;

  @Override
  public void onRuntimeAvailable(IJeiRuntime arg0) {

    // TODO Auto-generated method stub

  }

  @Override
  public void register(IModRegistry reg) {

    jeiHelper = reg.getJeiHelpers();
    IGuiHelper guiHelper = jeiHelper.getGuiHelper();

    // NBT ignores
    jeiHelper.getNbtIgnoreList().ignoreNbtTagNames(EnumMaterialGrade.NBT_KEY);

    // Descriptions
    String descPrefix = "jei.silentgems.desc.";
    reg.addDescription(new ItemStack(ModItems.gem, 1, OreDictionary.WILDCARD_VALUE),
        descPrefix + Names.GEM);
  }
}
