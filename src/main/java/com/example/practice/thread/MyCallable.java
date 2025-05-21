package com.example.practice.thread;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {

    int result = 1;

    @Override
    public Integer call() {
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Future<Integer> futureTask = executorService.submit(new MyCallable());

            Integer result = futureTask.get();
            System.out.println(result);
            executorService.shutdown();
        }

    }

}
