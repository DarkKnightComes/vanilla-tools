package com.supertools.items;

import com.supertools.api.util.constant.Constants;
import com.supertools.creativetab.ModCreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

/**
 * Handles simple things that all items need.
 */
public abstract class AbstractHammerSuperTools extends ItemPickaxe
{
    /**
     * The name of the item.
     */
    private final String name;

    /**
     * Sets the name, creative tab, and registers the item.
     *
     * @param name The name of this item
     * @param material the material.
     */
    public AbstractHammerSuperTools(final String name, final ToolMaterial material)
    {
        super(material);
        this.name = name;

        super.setTranslationKey(Constants.MOD_ID.toLowerCase() + "." + this.name);
        setRegistryName(this.name);
        setCreativeTab(ModCreativeTabs.SUPER_TOOLS);
    }

    /**
     * Returns the name of the item.
     *
     * @return Name of the item.
     */
    public final String getName()
    {
        return name;
    }
}
