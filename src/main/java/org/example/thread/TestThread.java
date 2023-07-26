package org.example.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        Thread1 myThread1= new Thread1();

//        Thread thread = new Thread(myThread1);
//        thread.start();
//        System.out.println("Main Thread...");
//        thread.join();
//        System.out.println("End Main Thread...");

//        Thread2 thread2= new Thread2();
//        thread2.start();
        FutureTask<String> futureTask = new FutureTask<>(new Thread3());
        Thread thread3 = new Thread(futureTask);

        thread3.start();
        futureTask.cancel(true);
        System.out.println(futureTask.get());
//        thread3.join();
//
//        if (futureTask.isDone())
//            fu

        System.out.println("End Main Thread...");

    }
}
