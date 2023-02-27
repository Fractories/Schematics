package de.fractories.schematics.util;

import org.bukkit.Location;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockArea {

    List<Block> blocks = new ArrayList<>();
    Block[][][] blocksWithLocation;
    public BlockArea(Location first, Location second) {
        for(int x = first.getBlockX(); x < second.getBlockX(); x++) {
            for (int y = first.getBlockY(); y < second.getBlockY(); y++) {
                for (int z = first.getBlockZ(); z < second.getBlockZ(); z++) {
                    blocks.add(first.getWorld().getBlockAt(x, y, z));
                }
            }
        }
        blocksWithLocation = new Block[blocks.size()][blocks.size()][blocks.size()];
        blocks.forEach(block -> blocksWithLocation[block.getX()][block.getY()][block.getZ()] = block);
    }

    public Block[] getInvolvedBlocks() {
        return blocks.toArray(new Block[0]);
    }

    public Block[][][] getBlocksWithLocation() {
        return blocks.toArray(new Block[0][0][0]);
    }

}
