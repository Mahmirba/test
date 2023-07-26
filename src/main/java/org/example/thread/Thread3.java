package org.example.thread;

import java.util.concurrent.Callable;

public class Thread3 implements Callable {

    @Override
    public Object call() throws Exception {

        System.out.println("Start Callable.........");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End Callable.........");
        return "Done1";
    }
}
