package de.fractories.schematics.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Services {

    private final ExecutorService executorService;

    public Services() {
        executorService = Executors.newFixedThreadPool(2);
    }

    public void execute(Runnable runnable) {
        executorService.execute(runnable);
    }

}
