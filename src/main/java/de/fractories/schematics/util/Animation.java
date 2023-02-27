package de.fractories.schematics.util;

import org.checkerframework.checker.units.qual.A;

import java.util.UUID;

public class Animation {

    private String name;
    private UUID uuid;
    private AnimationRunnable runnable;

    public Animation(UUID uuid, String name, AnimationRunnable runnable) {
        this.uuid = uuid;
        this.name = name;
        this.runnable = runnable;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public void setRunnable(AnimationRunnable runnable) {
        this.runnable = runnable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
