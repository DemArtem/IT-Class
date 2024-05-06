package _Java.IT_Class.M27_Multithreading;

import java.util.concurrent.*;

public class ExecutorSingle {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //Из предыдущего приложения
        Callable<String> callable = FutureAndCallable.getCallable();

        System.out.println("Submitting Callable");
        Future<String> future = executorService.submit(callable);
        System.out.println("Retrieve the result of the future");
        System.out.println(future.get());
        System.out.println(Thread.currentThread().getName() + " is finished");

        executorService.shutdown();
    }
}