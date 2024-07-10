package chapter17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {
        MyRunnable[] jobs = new MyRunnable[]{new MyRunnable(), new MyRunnable()};

        //for(MyRunnable j : jobs) {
           //var t = new Thread(j);
           //t.start();
        //}

        ExecutorService executor = Executors.newSingleThreadExecutor();

        for(MyRunnable j : jobs) {
            executor.execute(j);
        }

        executor.shutdown();
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": top of the stack");
        }
    }
}
