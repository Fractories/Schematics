package de.fractories.schematics.util;

import org.bukkit.Location;
import org.bukkit.block.Block;

public class Scene {

    Block[] blocksToChange;

    public Scene(Location first, Location second) {

    }

    public Scene(Block... blocks) {
        blocksToChange = blocks;
    }

    public Block[] getBlocks() {
        return blocksToChange;
    }

}
