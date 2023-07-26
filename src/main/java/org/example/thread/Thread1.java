package org.example.thread;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Start Mahdieh.........");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End Thread.........");

    }
}
