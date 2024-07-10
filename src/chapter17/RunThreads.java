package chapter17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunThreads {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        threadPool.execute(() -> runJob("Job 1"));
        threadPool.execute(() -> runJob("Job 2"));

        threadPool.shutdown();
        boolean finish = threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        if(finish) {
            System.out.println("all jobs are done");
        }

        //threadPool.shutdown();
        //threadPool.shutdownNow();
    }

    public static void runJob(String jobName) {
        for(int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(jobName + " is running on " + threadName);
        }
    }
}
