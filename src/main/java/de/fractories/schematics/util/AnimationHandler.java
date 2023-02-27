package de.fractories.schematics.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class AnimationHandler {

    private final HashMap<UUID, Animation> animations = new HashMap<>();

    public void addAnimation(Animation... animations) {
        for (Animation animation : animations) {
            this.animations.put(animation.getUuid(), animation);
        }
    }

    public void removeAnimation(Animation animation) {
        this.animations.remove(animation.getUuid());
    }

    public void clearAnimations() {
        this.animations.clear();
    }

    public Animation[] getAnimations() {
        return animations.values().toArray(new Animation[0]);
    }

    public Animation getAnimation(UUID uuid) {
        return animations.get(uuid);
    }

    public Animation[] getAnimation(String name) {
        final List<Animation> animationList = new ArrayList<>();
        animations.forEach((uuid, animation) -> {
            if (animation.getName().equals(name))
                animationList.add(animation);
        });
        return animationList.toArray(new Animation[0]);
    }
}
