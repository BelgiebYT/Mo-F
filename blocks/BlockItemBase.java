package com.belgieyt.morefeatures.blocks;


import com.belgieyt.morefeatures.MoreFeatures;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS));
    }
}
