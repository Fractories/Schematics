package de.fractories.schematics.util;

import de.fractories.schematics.Schematics;

public class AnimationRunnable implements Runnable {

    Scene[] scenes;
    int cancel;
    int speedInMs;

    public AnimationRunnable(Scene... animations) {
        scenes = animations;
    }

    @Override
    public void run() {
        Schematics.getServices().execute(() -> {
            while (cancel != 1) {
                for (Scene scene : scenes) {
                    try {
                        Thread.sleep(speedInMs);
                        System.out.println(scene);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //TODO: animation
                }
            }
        });
    }
}
