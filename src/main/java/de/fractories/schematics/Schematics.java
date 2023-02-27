package de.fractories.schematics;

import de.fractories.schematics.util.Services;
import org.bukkit.plugin.java.JavaPlugin;

public class Schematics extends JavaPlugin {

    private static Services services;

    @Override
    public void onEnable() {
        services = new Services();
    }

    public static Services getServices() {
        return services;
    }
}
