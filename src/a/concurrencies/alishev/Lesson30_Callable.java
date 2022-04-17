package a.concurrencies.alishev;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Lesson30_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting");
                Thread.sleep(3000);
                System.out.println("Finished");

                Random random = new Random();
                int randomValue = random.nextInt();
                System.out.println("randomValue: " + randomValue);
                if (randomValue < 5) {
                    throw new Exception("Bad happened");
                }
                return random.nextInt(10);
            }
        });

        executorService.shutdown();

        try {
            int result = future.get();
            System.out.println("result: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}

class FutureTaskHere {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                return "Hello";
            }
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}

